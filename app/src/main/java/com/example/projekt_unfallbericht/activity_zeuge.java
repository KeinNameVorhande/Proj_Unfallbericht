package com.example.projekt_unfallbericht;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class activity_zeuge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zeuge);


        findViewById(R.id.plainTextVorname);
        findViewById(R.id.plainTextNachname);
        findViewById(R.id.plainTextOrt);
        findViewById(R.id.plainTextStrasse);
        findViewById(R.id.plainTextNummer);



    }
    public void btnCancel(View view){
        Intent intent = new Intent(this, newActivity.class);
        startActivity(intent);

    }


    public void btnOk(View view){

    }


    public void btnDelete(View view){




    }
}