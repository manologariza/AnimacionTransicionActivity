package com.example.dell.animaciontransicionactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

       public void forwardZoom(View button)
    {
        startActivity(new Intent(this, SecondActivity.class));
        overridePendingTransition(R.anim.zoom_forward_in, R.anim.zoom_forward_out);
    }

    public void left(View button)
    {
        startActivity(new Intent(this, SecondActivity.class));
        overridePendingTransition(R.anim.left_in, R.anim.left_out);
    }

    public void fade(View button)
    {
        startActivity(new Intent(this, SecondActivity.class));
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    public void byDefault(View button)
    {
        //En este caso no utilizamos método overridePendingTransition ya que queremos que haga la animación por defecto
        startActivity(new Intent(this, SecondActivity.class));

        //Se parecerá a left_in-left_out (los hacemos diferentes por ejemplo cambiando el tiempo de la transición)
    }

    public void oblicuo(View button)
    {
        startActivity(new Intent(this, SecondActivity.class));
        overridePendingTransition(R.anim.oblicuo_in, R.anim.oblicuo_out);


    }
}
