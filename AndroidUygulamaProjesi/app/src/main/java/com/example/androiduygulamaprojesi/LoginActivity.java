package com.example.androiduygulamaprojesi;

import android.app.assist.AssistStructure;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;

public class LoginActivity extends AppCompatActivity {

    EditText kulaniciAdi;
    EditText sifre;
    Button giris;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        kulaniciAdi = findViewById(R.id.kullaniciAdiEdit);
        sifre = findViewById(R.id.sifreEdit);
        giris = findViewById(R.id.girisButton);

        giris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                intent.putExtra("sifre",sifre.getText().toString());
                intent.putExtra("kuladi",kulaniciAdi.getText().toString());
                startActivity(intent);
            }
        });
    }
}
