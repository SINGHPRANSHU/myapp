package com.pranshu.myapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main4Activity extends AppCompatActivity {
    Button ba,bb,bc;
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        ba=findViewById(R.id.button7);
        bb=findViewById(R.id.button8);
        bc=findViewById(R.id.button9);


        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ba.setText("prasnhu");
            }
        });
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bb.setText("000000");
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 View view= LayoutInflater.from(Main4Activity.this).inflate(R.layout.activity_conform,null);
                e1=view.findViewById(R.id.editText4);
                e2=view.findViewById(R.id.editText5);

                AlertDialog.Builder builder=new AlertDialog.Builder(Main4Activity.this);
                builder.setMessage("Login here");
                builder.setView(view);

                builder.setPositiveButton("Login", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String u=e1.getText().toString();
                        String p=e2.getText().toString();
                        if(u.equals("pranshu") && p.equals("pranshu")){
                        bc.setText("1000");}
                        else {bc.setText("0");}
                    }
                });
                builder.setNegativeButton("Cancel",null);
                builder.setCancelable(false);
                AlertDialog alert =builder.create();
                alert.show();

            }
        });
    }
    @Override
    public void onBackPressed(){
        AlertDialog.Builder builder=new AlertDialog.Builder(Main4Activity.this);
        builder.setTitle("are you sure");
        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
               Main4Activity.super.onBackPressed();


            }
        });
        builder.setNegativeButton("no",null);
        AlertDialog alert =builder.create();
        alert.show();
    }
}
