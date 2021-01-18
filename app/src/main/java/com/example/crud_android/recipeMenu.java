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

        //TODO Llenar o no userToSearch.

        /*CustomListAdapter adapter = new CustomListAdapter(this, recipeName,
                recipeCreator, verified);*/

        list_recipeList = findViewById(R.id.list_recipeList);
        //list_recipeList.setAdapter(adapter);

        //TODO Add onItemClickListener
    }

    private void fillItem(String recipeName, String userName, Boolean verified){


    }
}
