package com.example.madmeditation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Onboarding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.SignInAcc:
                NextActivity(Login.class, false);
                break;
            case R.id.RegTextView:
                NextActivity(Register.class, false);
                break;
        }
    }
    public void NextActivity(Class NameClass, Boolean CloseAct){
        Intent intent = new Intent(this, NameClass);
        startActivity(intent);
        if(CloseAct == true)
            finish();
    }
}