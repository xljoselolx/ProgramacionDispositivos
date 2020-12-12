package com.ljoselol.infogram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ljoselol.infogram.view.ContainerActivity;
import com.ljoselol.infogram.view.CreateAccountActivity;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void goCreateAccount(View view){
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);

    }

    public void login(View view) {
    Intent intent = new Intent(this, ContainerActivity.class);
    startActivity(intent);
    }

}