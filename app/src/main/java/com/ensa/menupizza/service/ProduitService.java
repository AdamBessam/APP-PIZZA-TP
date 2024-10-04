package com.ensa.menupizza.service;
import com.ensa.menupizza.beans.Produit;
import com.ensa.menupizza.dao.iDao;

import java.util.ArrayList;
import java.util.List;
public class ProduitService implements iDao<Produit>{
    private List<Produit> produits;

    public ProduitService(List<Produit> produits) {
        this.produits =produits;
    }
    public ProduitService() {
        this.produits =new ArrayList<>();
    }

    public boolean create(Produit o){
        return produits.add(o);
    }
    public boolean delete(Produit o){
        return produits.remove(o);
    }

    public boolean update(Produit o){
        for(int i=0;i<produits.size();i++){
            if(produits.get(i).getId()==o.getId()){
                produits.set(i,o);
                return true;

            }
        }
        return false;
    }
    public List<Produit> findall(){
        return new ArrayList<>(produits);
    }
    public Produit findByid(int id){
        for(Produit produit:produits){
            if(produit.getId()==id){
                return produit;
            }
        }
        return null;
    }
}
