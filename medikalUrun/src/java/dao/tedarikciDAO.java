/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.tedarikci;
import dao.DBConnection;
import entity.urun;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class tedarikciDAO extends DBConnection {
    public void create(tedarikci c){
        try{
            Statement st=this.getConnection().createStatement();
            String query="insert into tedarikci (tedarikci_id,tedarikci_adsoyad,tedarikci_adres,tedarikci_telno"
                    + "('"+c.getTedarikci_id()+"','"+c.getTedarikci_adsoyad()+"','"+c.getTedarikci_adres()+"','"+c.getTedarikci_telno()+"')";
            st.executeQuery(query);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void update(tedarikci c){
        try{
            Statement st=this.getConnection().createStatement();
            String query="update tedarikci set tedarikci_id='"+c.getTedarikci_id()+"',tedarikci_adsoyad='"+c.getTedarikci_adsoyad()+"',tedarikci_adres='"+c.getTedarikci_adres()+"',tedarikci_telno='"+c.getTedarikci_telno();
            st.executeQuery(query);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void delete(tedarikci c){
        try{
            Statement st=this.getConnection().createStatement();
            String query="delete from tedarikci where tedarikci_id="+c.getTedarikci_id();
            st.executeQuery(query);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
  public List<tedarikci> getList(){
        List<tedarikci> list=new ArrayList<>();
        try{
            Statement st=this.getConnection().createStatement();
            String query="select * from tedarikci";
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                list.add(new tedarikci(rs.getLong("tedarikci_id"),rs.getString("tedarikci_adsoyad"),rs.getString("tedarikci_adres"),rs.getString("tedarikci_telno")));
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return list;
        
    }
  public tedarikci findById(int id){
        tedarikci c=null;
        try{
            Statement st=this.getConnection().createStatement();
            String query="select * from tedarikci where tedarikci_id="+id;
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                c=new tedarikci(rs.getLong("tedarikci_id"),rs.getString("tedarikci_adsoyad"),rs.getString("tedarikci_adres"),rs.getString("tedarikci_telno"));
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return c;
    }
}
