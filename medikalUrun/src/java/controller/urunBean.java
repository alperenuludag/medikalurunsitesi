/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;

import dao.urunDAO;
import entity.urun;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named(value = "urunBean")
@SessionScoped
public class urunBean implements Serializable {

    private urun entity;
    private urunDAO dao;
    private List<urun> list;

    public void create() {
        this.getDao().create(entity);
        entity = new urun();
    }

    public void update() {
        this.getDao().update(entity);
        entity = new urun();
    }

    public void delete(urun c) {
        this.getDao().delete(c);
        entity = new urun();
    }

    public void clear() {
        entity = new urun();
    }

    public String getName(int id) {
        urun c = this.getDao().findById(id);
        return c.getUrun_adi();
    }

    public urun getEntity() {
        if (entity == null) {
            entity = new urun();
        }
        return entity;
    }

    public void setEntity(urun entity) {
        this.entity = entity;
    }

    public urunDAO getDao() {
        if (dao == null) {
            dao = new urunDAO();
        }
        return dao;
    }

    public void setDao(urunDAO dao) {
        this.dao = dao;
    }

    public List<urun> getList() {
        this.list = this.getDao().getList();
        return list;
    }

    public void setList(List<urun> list) {
        this.list = list;
    }

    public urunBean(urun entity, urunDAO dao, List<urun> list) {
        this.entity = entity;
        this.dao = dao;
        this.list = list;
    }
    
    public urunBean() {
    }
    
}
