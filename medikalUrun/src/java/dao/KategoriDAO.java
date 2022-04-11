/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dao.DBConnection;
import entity.Kategori;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class KategoriDAO extends DBConnection {
    public void create(Kategori c){
        try{
            Statement st=this.getConnection().createStatement();
            String query="insert into kategoriler (kategori_id,kategori_adi) values"
                    + "('"+c.getKategori_id()+"','"+c.getKategori_adi()+"')";
            st.executeQuery(query);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void update(Kategori c){
        try{
            Statement st=this.getConnection().createStatement();
            String query="update kategoriler set kategori_id='"+c.getKategori_id()+"', kategori_adi='"+c.getKategori_adi();
            st.executeQuery(query);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void delete(Kategori c){
        try{
            Statement st=this.getConnection().createStatement();
            String query="delete from kategoriler where kategori_id="+c.getKategori_id();
            st.executeQuery(query);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
  public List<Kategori> getList(){
        List<Kategori> list=new ArrayList<>();
        try{
            Statement st=this.getConnection().createStatement();
            String query="select * from kategoriler";
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                list.add(new Kategori(rs.getLong("kategori_id"),rs.getString("kategori_adi")));
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return list;
        
    }
  public Kategori findById(int id){
        Kategori c=null;
        try{
            Statement st=this.getConnection().createStatement();
            String query="select * from kategoriler where kategori_id="+id;
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                c=new Kategori(rs.getLong("kategori_id"),rs.getString("kategori_adi"));
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return c;
    }
  
}
