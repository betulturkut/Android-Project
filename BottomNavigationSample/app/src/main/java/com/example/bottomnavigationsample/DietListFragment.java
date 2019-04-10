package com.example.bottomnavigationsample;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class DietListFragment extends Fragment {
    ArrayList<Diet> diets = new ArrayList<Diet>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_music, null);

        diets.add(new Diet(R.mipmap.ic_launcher,"Yumurta,peynir,zeytin","5000C"));
        diets.add((new Diet(R.mipmap.ic_launcher,"Mevsim yeşillikleri salata","2000C")));
        diets.add(new Diet(R.mipmap.ic_launcher,"Badem,fındık,ceviz","4000C"));
        diets.add(new Diet(R.mipmap.ic_launcher,"Kivi,çilek,muz","1000C"));

        CustomAdapter customAdapter = new CustomAdapter(diets,getContext());

        ListView listView = (ListView)view.findViewById(R.id.listView);
        listView.setAdapter(customAdapter);

        return view;
    }
}
