package com.example.dell.animaciontransicionactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void zoomBack(View button)
    {
        startActivity(new Intent(this, MainActivity.class));
        overridePendingTransition(R.anim.zoom_back_in, R.anim.zoom_back_out);
    }

    public void fade(View button)
    {
        startActivity(new Intent(this, MainActivity.class));
        overridePendingTransition(R.anim.fade_in2, R.anim.fade_out2);
    }

    public void right(View button)
    {
        startActivity(new Intent(this, MainActivity.class));
        overridePendingTransition(R.anim.right_in, R.anim.right_out);
    }

    public void back(View button)
    {
        //No utilizamos ningún efecto de transición adicional sino que usamos el que hace el sistema por defecto
        super.onBackPressed();

        //Se parecerá a right_in-right_out (los hacemos diferenetes por ejemplo cambiando el tiempo de la transición)

    }
}
