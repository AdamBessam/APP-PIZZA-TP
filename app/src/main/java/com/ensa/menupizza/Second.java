package com.ensa.menupizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.ensa.menupizza.beans.Produit;
import com.ensa.menupizza.service.ProduitService;

import java.util.List;

public class Second extends AppCompatActivity {
    private ImageView image;
    private TextView description;
    private TextView ingredients;
    private TextView nom;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        image = findViewById(R.id.image);
        description = findViewById(R.id.description);
        nom = findViewById(R.id.nom);
        ingredients = findViewById(R.id.ingredients);
        back=findViewById(R.id.back);


        Intent intent = getIntent();
        if (intent != null) {
            int id = intent.getIntExtra("id", -1);
            List<Produit> listePizza = (List<Produit>) intent.getSerializableExtra("listePizza");


            if (listePizza != null) {

                ProduitService produitService = new ProduitService(listePizza);
                Produit produit = produitService.findByid(id);


                if (produit != null) {

                    image.setImageResource(produit.getPhoto());
                    nom.setText(produit.getNom());
                    description.setText(produit.getDescription());
                    ingredients.setText(produit.getDetailsIngred());
                }
            }
        }
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intente=new Intent(Second.this,ListPizzaActivity.class);
                startActivity(intente);
                finish();

            }
        });




    }

}
