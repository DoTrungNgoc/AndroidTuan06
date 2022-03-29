package com.example.tiki_layout;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.List;

public class ShoesAdapter extends BaseAdapter {
    private Context context;
    private int idLayout;
    private List<Shoes> list;

    public ShoesAdapter(Context context, int idLayout, List<Shoes> list) {
        this.context = context;
        this.idLayout = idLayout;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(parent.getContext()).inflate(idLayout,parent,false);
        }
        Shoes shoes = list.get(position);
        ImageView img = convertView.findViewById(R.id.imageItem);
        TextView txt = convertView.findViewById(R.id.textViewDescription);

        img.setImageResource(shoes.getImg());
        txt.setText(shoes.getDescription());

        return convertView;
    }
}
