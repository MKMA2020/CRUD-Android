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
    private final String[] recipeName,
            recipeCreator;
    private final Boolean[] verified;

    public CustomListAdapter(Activity context, String[] recipeNameParam,
                             String[] recipeCreatorParam, Boolean[] verifiedParam){
        super(context, R.layout.recipe_list_layout, recipeNameParam);

        this.context = context;
        this.recipeName = recipeNameParam;
        this.recipeCreator = recipeCreatorParam;
        this.verified = verifiedParam;
    }

    public View getView(int position, View view, ViewGroup parent){
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

        //TODO seguir: https://appsandbiscuits.com/listview-tutorial-android-12-ccef4ead27cc

    }
}
