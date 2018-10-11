package com.example.geps.kalbiddat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editangka1, editangka2;
    TextView txtHasil;
    Button btnLuasPersegi,btnKelPersegi,btnLuasSegitiga,btnKelSegitiga,btnLuasLingkaran,btnKelLingkaran;
    double angka1, angka2,hasil;
    Integer type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editangka1 = (EditText) findViewById(R.id.txtangka1);
        editangka2 = (EditText) findViewById(R.id.txtangka2);
        txtHasil = (TextView) findViewById(R.id.txtHasil);
        btnLuasPersegi = (Button) findViewById(R.id.btnLpersegi);
        btnKelPersegi = (Button) findViewById(R.id.btnKpersegi);
        btnLuasSegitiga = (Button) findViewById(R.id.btnLsegitiga);
        btnKelSegitiga = (Button) findViewById(R.id.btnKsegitiga);
        btnLuasLingkaran = (Button) findViewById(R.id.btnLlingkaran);
        btnKelLingkaran = (Button) findViewById(R.id.btnKlingkaran);

        btnLuasPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                type = 1;
                hitung(type);
            }
        });

        btnKelPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                type = 2;
                hitung(type);
            }
        });

        btnLuasSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                type = 3;
                hitung(type);
            }
        });

        btnKelSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                type = 4;
                hitung(type);
            }
        });

        btnLuasLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                type = 5;
                hitung(type);
            }
        });

        btnKelLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                type = 6;
                hitung(type);
            }
        });

    }

    public void hitung(int type){
        double val1 = Double.parseDouble(editangka1.getText().toString());
        double val2 = Double.parseDouble(editangka2.getText().toString());

        if(type ==1){
            hasil=val1*val2;
        }
        else if (type == 2){
            hasil = 2*(val1+val2);
        }
        else if(type==3){
            hasil= (val1*val2)/2;
        }
        else if(type==4){
            double hypo = Math.sqrt(Math.pow(val1,2)+ Math.pow(val2,2));
            hasil = val1+val2+hypo;
        }
        else if(type == 5){
            hasil = Math.PI * Math.pow((val1/2),2);
        }
        else if(type==6){
            hasil= Math.PI*val1;
        }

        txtHasil.setText(Double.toString(hasil));


    }



}
