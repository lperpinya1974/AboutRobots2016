package com.exemple.profedam.aboutrobots2016;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class RobotsActivity extends AppCompatActivity implements View.OnClickListener {

    private int numeroVeces = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robots);

        Button btnNoTocar = (Button) findViewById(R.id.btnnotocar);
        ImageButton btnExit = (ImageButton) findViewById(R.id.btnexit);
        btnNoTocar.setOnClickListener(this);
        btnExit.setOnClickListener(this);

        // Si no es la primera vez que se ejecuta OnCreate hay que recuperar el valor de numeroVeces

        if (savedInstanceState != null) {
            this.numeroVeces = savedInstanceState.getInt("numeroVeces");
        }
        actualizarPantalla();


    }

    @Override
    public void onClick(View v) {


/* Comprobamos primero que botón se ha pulsado
*/
/* Comentario para subir */

        if (v.getId() == R.id.btnnotocar) {
            numeroVeces++;
           // Log.i("numeroVeces", "numeroVeces = " + numeroVeces);
            actualizarPantalla();
        }
        if (v.getId() == R.id.btnexit) {
            finish();
        }

    }

    public void actualizarPantalla()


    {

        TextView textView = (TextView) findViewById(R.id.textView);
        Button btnNoTocar = (Button) findViewById(R.id.btnnotocar);
        ImageView imageRobot = (ImageView) findViewById(R.id.imageView);

        if (numeroVeces == 0) {
            textView.setText(R.string.texto_inicial);
            btnNoTocar.setText(R.string.btn_inicial);
            imageRobot.setImageResource(R.mipmap.robot);
            // Log.i ("0", "numeroVeces = 0");
            }


            if (numeroVeces == 1) {

                textView.setText(R.string.texto_intermedio);
                btnNoTocar.setText(R.string.btn_intermedio);
                imageRobot.setImageResource(R.mipmap.robot_enfadado);

                //  Log.i("1", "numeroVeces = 1");


            }
            if (numeroVeces == 2) {
                //Para ocultar un botón
                btnNoTocar.setVisibility(View.INVISIBLE);

                //   Log.i("2", "numeroVeces = 2");
            }

        }

        @Override
        protected void onSaveInstanceState (Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("numeroVeces", this.numeroVeces);
    }
    }















