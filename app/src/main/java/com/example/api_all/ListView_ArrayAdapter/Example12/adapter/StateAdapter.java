package com.example.api_all.ListView_ArrayAdapter.Example12.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.api_all.ListView_ArrayAdapter.Example12.model.State;
import com.example.api_all.R;

import java.util.List;

public class StateAdapter extends RecyclerView.Adapter<StateAdapter.MyViewHolder> {
    private Context context;
    private List<State> states;

    public StateAdapter(Context context, List<State> states) {
        this.context = context;
        this.states = states;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
       View view = inflater.inflate(R.layout.recycler_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
    State state = states.get(position);
    holder.flagView.setImageResource(state.getFlagResource());
    holder.nameView.setText(state.getName());
    holder.capitalView.setText(state.getCapital());
    }

    @Override
    public int getItemCount() {
        return states.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView flagView;
        TextView nameView, capitalView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            flagView = itemView.findViewById(R.id.imgFlag);
            nameView = itemView.findViewById(R.id.txtName);
            capitalView = itemView.findViewById(R.id.txtCapital);

        }
    }
}
