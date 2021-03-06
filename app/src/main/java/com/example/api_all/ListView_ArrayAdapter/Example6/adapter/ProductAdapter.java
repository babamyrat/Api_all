package com.example.api_all.ListView_ArrayAdapter.Example6.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.api_all.ListView_ArrayAdapter.Example6.model.Product;
import com.example.api_all.R;

import java.util.ArrayList;

public class ProductAdapter extends ArrayAdapter<Product> {
    private LayoutInflater inflater;
    private int layout;
    private ArrayList<Product> productList;

    public ProductAdapter(Context context, int resource, ArrayList<Product> products) {
        super(context, resource, products);
        this.inflater = LayoutInflater.from(context);
        this.layout = resource;
        this.productList = products;
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        final ViewHolder viewHolder;
        if(convertView==null){
            convertView = inflater.inflate(this.layout, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        final Product product = productList.get(position);

        viewHolder.nameView.setText(product.getName());
        viewHolder.countView.setText(product.getCount() + " " + product.getUnit());

        viewHolder.removeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = product.getCount()-1;
                if(count<0) count=0;
                product.setCount(count);
                viewHolder.countView.setText(count + " " + product.getUnit());
            }
        });
        viewHolder.addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = product.getCount()+1;
                product.setCount(count);
                viewHolder.countView.setText(count + " " + product.getUnit());
            }
        });

        return convertView;
    }
    private class ViewHolder {
        final Button addButton, removeButton;
        final TextView nameView, countView;
        ViewHolder(View view){
            addButton = (Button) view.findViewById(R.id.addButton);
            removeButton = (Button) view.findViewById(R.id.removeButton);
            nameView = (TextView) view.findViewById(R.id.nameView);
            countView = (TextView) view.findViewById(R.id.countView);
        }
    }
}
