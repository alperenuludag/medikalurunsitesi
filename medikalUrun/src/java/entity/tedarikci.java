/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author mehmet
 */
public class tedarikci {
    private Long tedarikci_id;
    private String tedarikci_adsoyad;
    private String tedarikci_adres;
    private String tedarikci_telno;

    public tedarikci() {
    }

    public tedarikci(Long tedarikci_id, String tedarikci_adsoyad, String tedarikci_adres, String tedarikci_telno) {
        this.tedarikci_id = tedarikci_id;
        this.tedarikci_adsoyad = tedarikci_adsoyad;
        this.tedarikci_adres = tedarikci_adres;
        this.tedarikci_telno = tedarikci_telno;
    }

    public Long getTedarikci_id() {
        return tedarikci_id;
    }

    public void setTedarikci_id(Long tedarikci_id) {
        this.tedarikci_id = tedarikci_id;
    }

    public String getTedarikci_adsoyad() {
        return tedarikci_adsoyad;
    }

    public void setTedarikci_adsoyad(String tedarikci_adsoyad) {
        this.tedarikci_adsoyad = tedarikci_adsoyad;
    }

    public String getTedarikci_adres() {
        return tedarikci_adres;
    }

    public void setTedarikci_adres(String tedarikci_adres) {
        this.tedarikci_adres = tedarikci_adres;
    }

    public String getTedarikci_telno() {
        return tedarikci_telno;
    }

    public void setTedarikci_telno(String tedarikci_telno) {
        this.tedarikci_telno = tedarikci_telno;
    }
    
    
}
