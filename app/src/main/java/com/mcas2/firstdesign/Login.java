package com.mcas2.firstdesign;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView alert =findViewById(R.id.alertDialog);


        ImageView background = findViewById(R.id.backgroundSplash);
        background.setAlpha(0.9f);
       // Glide.with(this)
          //      .load("https://images.unsplash.com/photo-1599811392833-a39014faf967?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
           //     .transition(DrawableTransitionOptions.withCrossFade(1000))
           //     .centerCrop()
             //   .into(background);
    }
}