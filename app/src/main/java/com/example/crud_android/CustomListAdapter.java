package com.example.crud_android;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter {
    private final Activity context;
    private final String[] recipeName/* = {"aaa", "bbb", "ccc"}*/,
            recipeCreator/* = {"aaa", "bbb", "ccc"}*/;
    private final Boolean[] verified/* = {true, false, true}*/;

    public CustomListAdapter(Activity context, String[] recipeNameParam,
                             String[] recipeCreatorParam, Boolean[] verifiedParam){
        super(context, R.layout.recipe_list_layout, recipeNameParam);

        this.context = context;
        this.recipeName = recipeNameParam;
        this.recipeCreator = recipeCreatorParam;
        this.verified = verifiedParam;
    }

    public View getView(int cont, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View row = inflater.inflate(R.layout.recipe_list_layout, null, true);

        TextView txt_name = (TextView)
                row.findViewById(R.id.txt_rowName),
        txt_creator = (TextView) row.findViewById(R.id.txt_rowCreator);
        ImageView img_rowVerified = (ImageView)
                row.findViewById(R.id.img_rowVerified),
                img_rowNotVerified = (ImageView)
                        row.findViewById(R.id.img_rowNotVerified),
                img_rowNotLoaded = (ImageView)
                        row.findViewById(R.id.img_rowNotLoaded);

        img_rowNotVerified.setVisibility(View.INVISIBLE);
        img_rowVerified.setVisibility(View.INVISIBLE);

        txt_name.setText(recipeName[cont]);
        txt_creator.setText(recipeCreator[cont]);
        if (verified[cont]){
            img_rowNotLoaded.setVisibility(View.INVISIBLE);
            img_rowVerified.setVisibility(View.VISIBLE);
        }else{
            img_rowNotLoaded.setVisibility(View.INVISIBLE);
            img_rowNotVerified.setVisibility(View.VISIBLE);
        }

        return row;
    }
}
