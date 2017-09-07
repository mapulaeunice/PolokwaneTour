package com.example.codetribe.polokwanetour;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class SecondShopping extends AppCompatActivity {
    private Information info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        Intent intent =getIntent();

        info =(Information) intent.getSerializableExtra("info");



        TextView name = (TextView)findViewById(R.id.name) ;

        TextView contact = (TextView)findViewById(R.id.contact) ;

        TextView adress = (TextView)findViewById(R.id.adress) ;

        TextView description =(TextView)findViewById(R.id.description);
        ImageView img = (ImageView)findViewById(R.id.img) ;

        name.setText(info.getName());
        description.setText(info.getDescription());
        adress.setText(info.getAddress());
        contact.setText(info.getContacts());

        Picasso.with(SecondShopping.this).load(info.getUrl()).fit().into(img);








        final Toolbar toolbar = (Toolbar) findViewById(R.id.MyToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapse_toolbar);
        collapsingToolbarLayout.setTitle("My Toolbar");

        Context context = this;
        collapsingToolbarLayout.setContentScrimColor(ContextCompat.getColor(context,R.color.colorAccent));
    }
}
