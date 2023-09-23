package com.example.foodmart;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class log_in_or_Sign extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_or_sign);
        Button button=findViewById(R.id.login_button);
        Button button1=findViewById(R.id.signup_button);
        getSupportActionBar().hide();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#cc3e43"));
        }

        button.setOnClickListener(new View.OnClickListener() {
            /**
             * Goes to Login Page by Clicking this
             * @param view
             */
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(log_in_or_Sign.this,LogInPage.class );
                startActivity(intent);
                finish();
            }
        });




    }

}