package com.pranshu.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
     Button b;
     EditText name,email,pass;
     RadioButton r1,r2;
     RadioGroup r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button);
        email=findViewById(R.id.editText2);
        pass=findViewById(R.id.editText3);
        name=findViewById(R.id.editText);
        r1=findViewById(R.id.radioButton8);
        r2=findViewById(R.id.radioButton7);
        r=findViewById(R.id.radioGroup);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gender="";
                if(r1.isChecked()){
                    gender="female";
                }else{gender="male";}

                final String nam=name.getText().toString();
                final String e=email.getText().toString();
                final String pas=pass.getText().toString();
                int i=r.getCheckedRadioButtonId();
                RadioButton t=r.findViewById(i);
              Toast.makeText(MainActivity.this,nam+"\n"+e+"\n"+pas+"\n"+t.getText().toString(),Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity.this,ShowData.class);
                intent.putExtra("name",nam);
                intent.putExtra("gender",gender);
                startActivity(intent);



            }
        });



    }
}
