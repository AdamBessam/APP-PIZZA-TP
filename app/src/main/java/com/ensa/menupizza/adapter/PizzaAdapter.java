package com.ensa.menupizza.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ensa.menupizza.R;
import com.ensa.menupizza.beans.Produit;
import java.util.List;

public class PizzaAdapter extends BaseAdapter {
    private List<Produit> produits;
    private LayoutInflater inflater;

    public PizzaAdapter(List<Produit> produits, Activity activity) {
        this.produits = produits;
        this.inflater =(LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return produits.size();
    }

    @Override
    public Object getItem(int position) {
        return produits.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null)
                 convertView=inflater.inflate(R.layout.item,null);
        TextView nom=convertView.findViewById(R.id.nom);
        TextView time=convertView.findViewById(R.id.time);
        TextView nbrIngredient=convertView.findViewById(R.id.nbrIngredient);
        ImageView image=convertView.findViewById(R.id.image);
        TextView id=convertView.findViewById(R.id.idd);
        id.setText(produits.get(position).getId()+"");

        nom.setText(produits.get(position).getNom());
        time.setText(produits.get(position).getDuree()+"");
        nbrIngredient.setText(produits.get(position).getNbrIngredients()+"");
        image.setImageResource(produits.get(position).getPhoto());
        return convertView;




    }
}
