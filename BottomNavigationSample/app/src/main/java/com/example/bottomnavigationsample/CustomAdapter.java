package com.example.bottomnavigationsample;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends BaseAdapter {
    ArrayList<Diet> diets = new ArrayList<>();
    Context context;

    public CustomAdapter(ArrayList<Diet> diets, Context context){
        this.diets = diets;
        this.context = context; //hangi mainactivityde çalıştığını belirtir.
    }

    @Override
    public int getCount() {
        return diets.size();
    }

    @Override
    public Object getItem(int position) {
        return diets.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = View.inflate(context,R.layout.row_music_fragment,null);

        ImageView imageView = view.findViewById(R.id.imageView);
        TextView foodName = (TextView)view.findViewById(R.id.textView3);
        TextView totalCalorite = (TextView)view.findViewById(R.id.textView2);

        imageView.setImageResource(diets.get(position).foodPicture);
        foodName.setText(diets.get(position).foodName);
        totalCalorite.setText(diets.get(position).totalCalorite);

        return view;

    }
}
