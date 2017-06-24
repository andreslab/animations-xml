package com.example.macbookpro.animaciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imagen;
    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagen = (ImageView)findViewById(R.id.imagen);
        boton = (Button)findViewById(R.id.boton);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //translateAnimate();
                //rotateAnimate();
                //scaleAnimate();
                //contraccionAnimate();
                appearAniamte();
            }
        });
    }

    public void translateAnimate(){
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.translation);
        animation.setFillAfter(true); //el objeto se quedará en la ultima posicion de la animacion
        imagen.startAnimation(animation);
    }

    public void rotateAnimate(){
        Animation a = AnimationUtils.loadAnimation(this, R.anim.rotate);
        imagen.startAnimation(a);
    }

    public void scaleAnimate(){
        Animation a = AnimationUtils.loadAnimation(this, R.anim.scale);
        imagen.startAnimation(a);
    }

    public void contraccionAnimate(){
        Animation a = AnimationUtils.loadAnimation(this, R.anim.contraccion);
        imagen.startAnimation(a);
    }

    public void appearAniamte(){
        Animation a = AnimationUtils.loadAnimation(this, R.anim.appear);
        imagen.startAnimation(a);
    }
}
