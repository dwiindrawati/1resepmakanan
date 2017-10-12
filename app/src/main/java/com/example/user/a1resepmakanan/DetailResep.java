package com.example.user.a1resepmakanan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailResep extends AppCompatActivity {
    ImageView img;
    TextView detail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_resep);
        img =(ImageView) findViewById(R.id.gambar);
        detail = (TextView) findViewById(R.id.detailresep);
        Intent obj2 = getIntent();

        String title = obj2.getStringExtra("lay2");
        getSupportActionBar().setTitle(title);
        int imgg = obj2.getIntExtra("lay21",0);
        img.setImageResource(imgg);
        String detailresp = obj2.getStringExtra("lay22");
        detail.setText(detailresp);




    }
}
