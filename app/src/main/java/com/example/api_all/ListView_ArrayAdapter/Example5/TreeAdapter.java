package com.example.api_all.ListView_ArrayAdapter.Example5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.api_all.R;

import java.util.List;

public class TreeAdapter  extends ArrayAdapter<TreeModel>{
    private LayoutInflater inflater;
    private int layout;
    private List<TreeModel> states;

    public TreeAdapter(Context context, int resource, List<TreeModel> states) {
        super(context, resource, states);
        this.states = states;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(this.layout, parent, false);

        ImageView flagView = view.findViewById(R.id.imageView5);
        TextView nameView = view.findViewById(R.id.textView5);
        TextView capitalView =  view.findViewById(R.id.textView5_2);

        TreeModel treeModel = states.get(position);

        flagView.setImageResource(treeModel.getFlagResource());
        nameView.setText(treeModel.getName());
        capitalView.setText(treeModel.getCapital());

      return view;
    }

}
