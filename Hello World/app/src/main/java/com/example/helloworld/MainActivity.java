package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btnClick(View view){
        TextView helloText = findViewById(R.id.txtMessage);
        EditText inputName = findViewById(R.id.inputName);
        helloText.setText("Hello " + inputName.getText()); // dalam bentuk string
        // dalam bentuk tdk string tapi msih bsa jalan , bedanya tdak bsa di dalam var string
//        helloText.setText(inputName.getText()); --> bertipe EditText
    }
}