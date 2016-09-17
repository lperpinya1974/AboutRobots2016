package com.exemple.profedam.aboutrobots2016;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RobotsActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robots);

        Button btnNoTocar = (Button) findViewById(R.id.btnnotocar);
        btnNoTocar.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

       int numeroVeces = 0;



        if (v.getId()==R.id.btnnotocar)
        {
            Button btnNoTocar = (Button) v;
            numeroVeces ++;
            if (numeroVeces == 1) {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Parece que los humanos no son muy inteligentes");
                btnNoTocar.setText("Que No me toques!!!!!!!!!");
            }
            else {
                //Para ocultar un botón
                btnNoTocar.setVisibility(View.INVISIBLE);
            }


        }
//Para ocultar un botón





    }
}
