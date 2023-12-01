package com.mcas2.firstdesign;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class Login extends AppCompatActivity {
    TextView animName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        animName = findViewById(R.id.appNameLogin);
        TextView animUsername = findViewById(R.id.editTextLogin);

        animHikers();

        View alertPassword = LayoutInflater.from(Login.this).inflate(R.layout.dialog_forgot_password, null);

        TextView alert =findViewById(R.id.alertDialog);
        alert.setPaintFlags(alert.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        alert.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        AlertDialog.Builder alerta = new AlertDialog.Builder(Login.this);
        alerta.setMessage("¿Haz olvidado tu contraseña?")
                .setCancelable(false)
                .setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        animHikers();
                        dialogInterface.cancel();
                            }
                      });
                AlertDialog title = alerta.create();
                title.show();
                }
            });

        animName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animHikers();
            }
        });




        ImageView background = findViewById(R.id.backgroundSplash);


       Glide.with(this)
               .load("https://images.unsplash.com/photo-1505506874110-6a7a69069a08?q=80&w=1974&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
               .transition(DrawableTransitionOptions.withCrossFade(500))
               .centerCrop()
               .into(background);



    }
    public void animHikers(){
        Animation fadeAnimation = AnimationUtils.loadAnimation(Login.this, R.anim.translate_login);
        animName.startAnimation(fadeAnimation);
    }

}