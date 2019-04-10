package com.example.androiduygulamaprojesi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    ArrayList<Friends> friends = new ArrayList<Friends>();
    Context context;

    public CustomAdapter(ArrayList<Friends> friends, Context context){
        this.friends = friends;
        this.context = context;
    }


    @Override
    public int getCount() {
        return friends.size();
    }

    @Override
    public Object getItem(int position) {
        return friends.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = View.inflate(context,R.layout.row_listview_friends,null);

        ImageView imageView = view.findViewById(R.id.imageView);
        TextView name = (TextView)view.findViewById(R.id.textView3);
        TextView username = (TextView)view.findViewById(R.id.textView2);

        imageView.setImageResource(friends.get(position).photo);
        name.setText(friends.get(position).name);
        username.setText(friends.get(position).username);

        return view;
    }
}
