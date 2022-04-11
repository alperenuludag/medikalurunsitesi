/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dao.DBConnection;
import entity.urun;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class urunDAO extends DBConnection {
    public void create(urun c){
        try{
            Statement st=this.getConnection().createStatement();
            String query="insert into urun (urun_id,urun_adi,urun_foto,urun_acıklama,urun_fiyat,urun_stok) values"
                    + "('"+c.getUrun_id()+"','"+c.getUrun_adi()+"','"+c.getUrun_foto()+"','"+c.getUrun_acıklama()+"','"+c.getUrun_fiyat()+"','"+c.getUrun_stok()+"')";
            st.executeQuery(query);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void update(urun c){
        try{
            Statement st=this.getConnection().createStatement();
            String query="update urun set urun_id='"+c.getUrun_id()+"',urun_adi='"+c.getUrun_adi()+"',urun_foto='"+c.getUrun_foto()+"',urun_acıklama='"+c.getUrun_acıklama()+"',urun_fiyat='"+c.getUrun_fiyat()+"',urun_stok='"+c.getUrun_stok();
            st.executeQuery(query);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void delete(urun c){
        try{
            Statement st=this.getConnection().createStatement();
            String query="delete from urun where urun_id="+c.getUrun_id();
            st.executeQuery(query);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
  public List<urun> getList(){
        List<urun> list=new ArrayList<>();
        try{
            Statement st=this.getConnection().createStatement();
            String query="select * from urun";
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                list.add(new urun(rs.getLong("urun_id"),rs.getString("urun_adi"),rs.getString("urun_foto"),rs.getString("urun_acıklama"),rs.getString("urun_fiyat"),rs.getLong("urun_stok")));
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return list;
        
    }
  public urun findById(int id){
        urun c=null;
        try{
            Statement st=this.getConnection().createStatement();
            String query="select * from urun where urun_id="+id;
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                c=new urun(rs.getLong("urun_id"),rs.getString("urun_adi"),rs.getString("urun_foto"),rs.getString("urun_acıklama"),rs.getString("kategori_fiyat"),rs.getLong("urun_stok"));
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return c;
    }
}
