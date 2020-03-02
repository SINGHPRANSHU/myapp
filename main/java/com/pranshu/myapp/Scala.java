package com.pranshu.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class Scala extends AppCompatActivity {
    ListView lv;

    public static int[] progImages={R.drawable.ic_mark,R.drawable.ic_icon};
    public  String[] progTexts={"object","polymorphism"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scala);
        lv=findViewById(R.id.lv1);
        final String values[]={"object","polymorphism"};
        ArrayAdapter arrayadapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1, Arrays.asList(values));
        lv.setAdapter(arrayadapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              Toast.makeText(Scala.this,"clicked",Toast.LENGTH_LONG).show();
            }
        });

    }
}
