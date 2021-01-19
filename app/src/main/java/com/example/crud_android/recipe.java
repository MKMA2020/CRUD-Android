package com.example.crud_android;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class recipe extends AppCompatActivity {

    TextView txt_recipeName = null,
            txt_creator = null,
            txt_calories = null,
            txt_type = null,
            txt_ingredientList = null,
            txt_steps = null;
    ImageView img_load = null,
            img_verificado = null,
            img_noVerificado = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        /*
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
         */

        txt_recipeName = findViewById(R.id.txt_recipeName);
        txt_creator = findViewById(R.id.txt_creator);
        txt_calories = findViewById(R.id.txt_calories);
        txt_type = findViewById(R.id.txt_type);
        txt_ingredientList = findViewById(R.id.txt_ingredientList);
        txt_steps = findViewById(R.id.txt_steps);

        img_load = findViewById(R.id.img_load);
        img_verificado = findViewById(R.id.img_verificado);
        img_noVerificado = findViewById(R.id.img_noVerificado);

        img_verificado.setVisibility(View.INVISIBLE);
        img_noVerificado.setVisibility(View.INVISIBLE);

        displayRecipe(recipeCreator, recipeCalories, recipeType, recipeVerified, recipeIngredients, recipeSteps);
    }

    private void displayRecipe(String recipeName, String recipeCreator, String recipeCalories, String recipeType, Boolean recipeVerified, String recipeIngredients, String recipeSteps){
        txt_recipeName.setText(recipeName);
        txt_creator.setText(recipeCreator);
        txt_calories.setText(recipeCalories);
        txt_type.setText(recipeType);
        if (recipeVerified){
            img_verificado.setVisibility(View.VISIBLE);
        }else{
            img_noVerificado.setVisibility(View.VISIBLE);
        }
        img_load.setVisibility(View.INVISIBLE);
        txt_ingredientList.setText(recipeIngredients);
        txt_steps.setText(recipeSteps);
    }
}
