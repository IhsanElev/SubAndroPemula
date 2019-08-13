package com.miftahul.beasiswa.submision;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailData extends AppCompatActivity {
    TextView nameTXT,usernameTXT;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);

        nameTXT=findViewById(R.id.nama_karakter);
        usernameTXT=findViewById(R.id.isi);
        img=findViewById(R.id.gambar);

        Intent i=getIntent();
        String image=i.getStringExtra("image");
        String name=i.getStringExtra("name");
        String isi=i.getStringExtra("isi");


        nameTXT.setText(name);
        usernameTXT.setText(isi);

        Glide.with(this)
                .load(image)
                .apply(new RequestOptions().override(1200,800))
                .into(img);
    }

}

