package com.example.saryoto.uploadimage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HalamanAwal extends AppCompatActivity implements View.OnClickListener {

    private Button buttonChoose;
    private Button buttonUpload;
    private Button buttonView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_awal);

        buttonChoose = (Button) findViewById(R.id.buttonChoose);
        buttonUpload = (Button) findViewById(R.id.buttonUpload);
        buttonView = (Button) findViewById(R.id.buttonViewImage);


        buttonChoose.setOnClickListener(this);
        buttonUpload.setOnClickListener(this);
        buttonView.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v == buttonChoose) {
            lokal();
        }

        if(v == buttonUpload){
            server();
        }

        if(v == buttonView){
            serverLokal();
        }
    }

    private void lokal() {
        startActivity(new Intent(this, PhotoIntentActivity.class));
    }
    private void server() {
        startActivity(new Intent(this, MainActivity.class));
    }

    private void serverLokal() {
        startActivity(new Intent(this, ServerLokal.class));
    }
}
