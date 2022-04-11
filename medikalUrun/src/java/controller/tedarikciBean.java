/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package controller;



import dao.tedarikciDAO;
import entity.tedarikci;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;
@Named(value = "tedarikciBean")
@SessionScoped
public class tedarikciBean implements Serializable {

    private tedarikci entity;
    private tedarikciDAO dao;
    private List<tedarikci> list;

    public void create() {
        this.getDao().create(entity);
        entity = new tedarikci();
    }

    public void update() {
        this.getDao().update(entity);
        entity = new tedarikci();
    }

    public void delete(tedarikci c) {
        this.getDao().delete(c);
        entity = new tedarikci();
    }

    public void clear() {
        entity = new tedarikci();
    }

    public String getName(int id) {
        tedarikci c = this.getDao().findById(id);
        return c.getTedarikci_adsoyad();
    }

    public tedarikci getEntity() {
        if (entity == null) {
            entity = new tedarikci();
        }
        return entity;
    }

    public void setEntity(tedarikci entity) {
        this.entity = entity;
    }

    public tedarikciDAO getDao() {
        if (dao == null) {
            dao = new tedarikciDAO();
        }
        return dao;
    }

    public void setDao(tedarikciDAO dao) {
        this.dao = dao;
    }

    public List<tedarikci> getList() {
        this.list = this.getDao().getList();
        return list;
    }

    public void setList(List<tedarikci> list) {
        this.list = list;
    }

    public tedarikciBean(tedarikci entity, tedarikciDAO dao, List<tedarikci> list) {
        this.entity = entity;
        this.dao = dao;
        this.list = list;
    }
    
    
    public tedarikciBean() {
    }
    
}
