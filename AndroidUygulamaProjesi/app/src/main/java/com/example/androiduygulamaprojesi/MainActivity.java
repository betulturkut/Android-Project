package com.example.androiduygulamaprojesi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView kullaniciAdi;
    TextView sifre;

    Button profile;
    Button friends;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kullaniciAdi = (TextView)findViewById(R.id.kuladiget);
        sifre = (TextView)findViewById(R.id.sifreget);
        profile = (Button) findViewById(R.id.profilButton) ;
        friends = (Button) findViewById(R.id.friendsButton) ;

        kullaniciAdi.setText(getIntent().getExtras().getString("kuladi"));
        sifre.setText(getIntent().getExtras().getString("sifre"));


        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ProfilActivity.class);
                intent.putExtra("kuladi",kullaniciAdi.getText().toString());
                startActivity(intent);
            }
        });

        friends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FriendsActivity.class);
                startActivity(intent);
            }
        });

    }
}
