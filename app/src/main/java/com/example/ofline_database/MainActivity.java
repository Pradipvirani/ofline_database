package com.example.ofline_database;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,number;
    Button add,update,delete,view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add=findViewById(R.id.add_btn);
        update=findViewById(R.id.update_btn);
        delete=findViewById(R.id.delete_btn);
        view=findViewById(R.id.view_btn);
        name=findViewById(R.id.ed_name_txt);
        number=findViewById(R.id.ed_number_txt);
    }
}