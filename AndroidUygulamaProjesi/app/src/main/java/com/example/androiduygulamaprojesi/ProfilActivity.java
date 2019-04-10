package com.example.androiduygulamaprojesi;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.TextView;

import java.util.ArrayList;

public class ProfilActivity extends AppCompatActivity {

    ArrayList<String> lesson = new ArrayList<>();

    final int CAMERA_CAPTURE = 100;

    EditText lessonEntry;
    Button lessonAdd;
    ListView listView;
    ImageButton picture;
    TextView username;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        lessonEntry = (EditText) findViewById(R.id.dersgirdi);
        lessonAdd = (Button) findViewById(R.id.ekleButton);
        listView = (ListView) findViewById(R.id.listView);
        picture = (ImageButton) findViewById(R.id.resim);
        username = (TextView) findViewById(R.id.ad);

        username.setText(getIntent().getExtras().getString("kuladi"));

        lesson.add("Görsel Programlamaya Giriş");
        lesson.add("Algoritma Analizi ve Veri Yapıları");
        lesson.add("Gömülü Sistemler");


        final ArrayAdapter<String> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,
                android.R.id.text1, lesson);
        listView.setAdapter(listAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        lessonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                lesson.add(new String(lessonEntry.getText().toString()));
            }
        });

        picture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, CAMERA_CAPTURE);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != RESULT_OK)
            return;
        switch (requestCode){
            case CAMERA_CAPTURE:
                Bundle extras = data.getExtras();
                picture.setImageBitmap((Bitmap)extras.get("data"));
                break;
        }
    }

}