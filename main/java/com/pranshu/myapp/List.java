package com.pranshu.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;

public class List extends AppCompatActivity {
   ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        lv=findViewById(R.id.list);
        final String values[]={"java","kotlin","python","golang","ruby","scala"};
        ArrayAdapter arrayadapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1, Arrays.asList(values));
        lv.setAdapter(arrayadapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Intent intent =new Intent(List.this,Scala.class);
               startActivity(intent);
            }
        });
    }
}
