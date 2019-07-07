package com.example.myfirebase;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText ename,eage,ephone;
    Button btnsave, btnclear,btnlist;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ename=(EditText) findViewById(R.id.name);
        eage = (EditText) findViewById(R.id.age);
        ephone = (EditText) findViewById(R.id.phone);
        btnsave = (Button) findViewById(R.id.submit);
        btnclear = (Button) findViewById(R.id.clear);
        btnlist = (Button) findViewById(R.id.list_data);
        final Details details = new Details();

        final DatabaseReference myRef = database.getReference("Details");

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int l_age = Integer.parseInt(eage.getText().toString().trim());
                Long l_phone = Long.parseLong(ephone.getText().toString().trim());


                details.setName(ename.getText().toString().trim());
                details.setAge(l_age);
                details.setMobile(l_phone);

                myRef.push().setValue(details);

                Toast.makeText(MainActivity.this,"Data Inserted Successfully", Toast.LENGTH_SHORT).show();

            }
        });

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            ename.getText().clear();
            ephone.getText().clear();
            eage.getText().clear();

            }
        });

    }
}
