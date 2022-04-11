/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.KategoriDAO;
import entity.Kategori;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author mehmet
 */
@Named(value = "kategoriBean")
@SessionScoped
public class KategoriBean implements Serializable {

    private Kategori entity;
    private KategoriDAO dao;
    private List<Kategori> list;

    public KategoriBean() {

    }

    public void create() {
        this.getDao().create(entity);
        entity = new Kategori();
    }

    public void update() {
        this.getDao().update(entity);
        entity = new Kategori();
    }

    public void delete(Kategori c) {
        this.getDao().delete(c);
        entity = new Kategori();
    }

    public void clear() {
        entity = new Kategori();
    }

    public String getName(int id) {
        Kategori c = this.getDao().findById(id);
        return c.getKategori_adi();
    }

    public Kategori getEntity() {
        if (entity == null) {
            entity = new Kategori();
        }
        return entity;
    }

    public void setEntity(Kategori entity) {
        this.entity = entity;
    }

    public KategoriDAO getDao() {
        if (dao == null) {
            dao = new KategoriDAO();
        }
        return dao;
    }

    public void setDao(KategoriDAO dao) {
        this.dao = dao;
    }

    public List<Kategori> getList() {
        this.list = this.getDao().getList();
        return list;
    }

    public void setList(List<Kategori> list) {
        this.list = list;
    }

    public KategoriBean(Kategori entity, KategoriDAO dao, List<Kategori> list) {
        this.entity = entity;
        this.dao = dao;
        this.list = list;
    }

}
