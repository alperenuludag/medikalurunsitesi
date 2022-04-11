/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author mehmet
 */
public class Kategori {
    private Long kategori_id;
    private String kategori_adi;

    public Kategori() {
    }

    public Kategori(Long kategori_id, String kategori_adi) {
        this.kategori_id = kategori_id;
        this.kategori_adi = kategori_adi;
    }

    public Long getKategori_id() {
        return kategori_id;
    }

    public void setKategori_id(Long kategori_id) {
        this.kategori_id = kategori_id;
    }

    public String getKategori_adi() {
        return kategori_adi;
    }

    public void setKategori_adi(String kategori_adi) {
        this.kategori_adi = kategori_adi;
    }
    
    
    
}
