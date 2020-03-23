package com.example.myapplication;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class customAdapter extends BaseAdapter {

    List<String> items;
    List<Integer> itemPics;
    Context context;

    public customAdapter(List<String> items, List<Integer> itemPics, Context context) {
        super();
        this.items = items;
        this.itemPics = itemPics;
        this.context = context;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View adapterView;
        if (convertView == null){
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            adapterView = layoutInflater.inflate(R.layout.layout, parent, false);
        }else {
            adapterView = convertView;
        }
        TextView textViewItem = (TextView)adapterView.findViewById(R.id.places);
        textViewItem.setText(items.get(position));
        textViewItem.setGravity(Gravity.CENTER_VERTICAL);
        Drawable img = parent.getResources().getDrawable(itemPics.get(position));
        img.setBounds(0,0,60,60);
        textViewItem.setCompoundDrawables(img,null,null,null);
        textViewItem.setCompoundDrawablePadding(8);
        return adapterView;
    }
}
