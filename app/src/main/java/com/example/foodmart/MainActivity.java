package com.example.foodmart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        Button button=findViewById(R.id.add_new);
        button.setOnClickListener(new View.OnClickListener() {
            /**
             * Goes to Login Page by Clicking this

             */
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,log_in_or_Sign.class );
                startActivity(intent);
                finish();
            }
        });

    }
}