package com.exemple.profedam.aboutrobots2016;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RobotsActivity extends AppCompatActivity implements View.OnClickListener {

    private int numeroVeces = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robots);

        Button btnNoTocar = (Button) findViewById(R.id.btnnotocar);
        btnNoTocar.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {



        if (v.getId()==R.id.btnnotocar)
        {
            Button btnNoTocar = (Button) v;
            numeroVeces ++;
            if (numeroVeces == 1) {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText(R.string.TextView2);
                btnNoTocar.setText(R.string.Button2);
            }
            else {
                //Para ocultar un botón
                btnNoTocar.setVisibility(View.INVISIBLE);
            }


        }
//Para ocultar un botón





    }
}
