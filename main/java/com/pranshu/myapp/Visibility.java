package com.pranshu.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Visibility extends AppCompatActivity {
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visibility);

        b1=findViewById(R.id.button2);
        b2=findViewById(R.id.button3);
        b3=findViewById(R.id.button3);
    }
    public void btnclicked(View v){
        b1.setVisibility(View.INVISIBLE);
        b2.setVisibility(View.VISIBLE);

    }
    public void btn(View v){
        Intent inte=new Intent(Visibility.this,Seekbar.class);
        startActivity(inte);}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.example_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_setting:
                Intent intent=new Intent(Visibility.this,List.class);
                startActivity(intent);
                 return true;
            case R.id.about:Toast.makeText(this,"my name is pranshu",Toast.LENGTH_LONG).show();
                 return true;
            case R.id.contact:Toast.makeText(this,"contact me",Toast.LENGTH_LONG).show();
                 return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
