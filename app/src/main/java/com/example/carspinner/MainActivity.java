package com.example.carspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spcar,spmodel;
    String selmodel;
    TextView t1,t2;
    Button b1,b2,b3,b4,b5;
    String car[],MarutisuzukiModel[],TataModel[],MahindraModel[],AudiModel[],HondaModel[];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spcar = findViewById(R.id.spcar);
        spmodel = findViewById(R.id.spmodel);
        t1 = findViewById(R.id.tx1);
        t2 = findViewById(R.id.tx2);
        b1 = findViewById(R.id.maruti);
        b2 = findViewById(R.id.tata);
        b3 = findViewById(R.id.mahindra);
        b4 = findViewById(R.id.audi);
        b5 = findViewById(R.id.honda);

        car = getResources().getStringArray(R.array.Car);
        MarutisuzukiModel = getResources().getStringArray(R.array.marutisuzukiModel);
        TataModel = getResources().getStringArray(R.array.TataModel);
        MahindraModel = getResources().getStringArray(R.array.MahindraModel);
        AudiModel = getResources().getStringArray(R.array.AudiModel);
        HondaModel = getResources().getStringArray(R.array.HondaModel);

        ArrayAdapter<String> adtcar = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,car);
        ArrayAdapter<String> adtMaruti = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,MarutisuzukiModel);
        ArrayAdapter<String> adtTata = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,TataModel);
        ArrayAdapter<String> adtMahindar = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,MahindraModel);
        ArrayAdapter<String> adtAudi = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,AudiModel);
        ArrayAdapter<String> adtHonda = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item,HondaModel);
        spcar.setAdapter(adtcar);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i1 = new Intent(MainActivity.this,MainActivity2.class);
                i1.putExtra("Image",0);
                startActivity(i1);
            }
        });
        spcar.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selcar = car[i];
                if (i==0){
                    spmodel.setAdapter(adtMaruti);
                    spmodel.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @SuppressLint("ResourceAsColor")
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            t1.setText(selcar);
                            t2.setText(MarutisuzukiModel[i]);

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                else if (i==1){
                    spmodel.setAdapter(adtTata);
                    spmodel.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            t1.setText(selcar);
                            t2.setText(TataModel[i]);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                else if (i==2){
                    spmodel.setAdapter(adtMahindar);
                    spmodel.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            t1.setText(selcar);
                            t2.setText(MahindraModel[i]);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
               else if (i==3){
                    spmodel.setAdapter(adtAudi);
                    spmodel.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            t1.setText(selcar);
                            t2.setText(AudiModel[i]);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
                else {
                    spmodel.setAdapter(adtHonda);
                    spmodel.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            t1.setText(selcar);
                            t2.setText(HondaModel[i]);
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });
    }
}