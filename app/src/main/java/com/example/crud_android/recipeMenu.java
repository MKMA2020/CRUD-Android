package com.example.crud_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.ListView;

public class recipeMenu extends AppCompatActivity {

    ListView list_recipeList = null;
    String userToSearch = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_menu);

        list_recipeList = findViewById(R.id.list_recipeList);

        //TODO Llenar o no userToSearch.
        if(userToSearch != null){
            //TODO filtrar por usuario recibido.
        }
    }

    private void fillItem(String recipeName, String userName, Boolean verified){


    }
}
