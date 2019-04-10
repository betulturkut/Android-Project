package com.example.androiduygulamaprojesi;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class FriendsActivity extends AppCompatActivity {

    ArrayList<Friends> friends = new ArrayList<Friends>();

    Button ekle;
    ListView listView;
    EditText arkadasAdi;
    EditText kullaniciAdi;
    TextView listviewisim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends);

        listView = (ListView) findViewById(R.id.listView);
        ekle = (Button) findViewById(R.id.AddFriend);

        arkadasAdi = (EditText) findViewById(R.id.arkadasAdi);
        kullaniciAdi = (EditText) findViewById(R.id.kullaniciAdi);

        CustomAdapter customAdapter = new CustomAdapter(friends,this);
        listView.setAdapter(customAdapter);

        friends.add(new Friends(R.mipmap.ic_launcher,"Ayşe Kubaş","@ayseKubas"));
        friends.add(new Friends(R.mipmap.ic_launcher,"Melike Şahin","@melikeSahin"));
        friends.add(new Friends(R.mipmap.ic_launcher,"Aslı Seçkin","@asliSeckin"));
        friends.add(new Friends(R.mipmap.ic_launcher,"Sinem Durmaz","@sinemDurmaz"));
        friends.add(new Friends(R.mipmap.ic_launcher,"Miraç Aydın","@miracAydin"));

        ekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                friends.add(new Friends(R.mipmap.ic_launcher, arkadasAdi.getText().toString(),kullaniciAdi.getText().toString()));
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(FriendsActivity.this,ProfilActivity.class);
                startActivity(intent);

            }
        });
    }
}
