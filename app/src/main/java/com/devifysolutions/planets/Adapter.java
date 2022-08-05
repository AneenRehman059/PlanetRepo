package com.devifysolutions.planets;

import static android.view.Gravity.CENTER;
import static android.view.Gravity.END;
import static android.view.Gravity.START;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.viewHolder> {

    ArrayList<Model> list;
    Context context;

    public Adapter(ArrayList<Model> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_rv, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        Model model = list.get(position);

        holder.imageView.setImageResource(model.getPic());
        holder.textView.setText(model.getText());

        switch (position) {
            case 0:
                if (position %2 == 0){
                    holder.textView.setGravity(CENTER);
                    holder.imageView.setVisibility(View.VISIBLE);
                }
                else {
                    holder.textView.setGravity(END);
                    holder.imageView.setVisibility(View.GONE);
                }
                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "Jupiter", Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            case 1:
                if (position %2 == 0){
                    holder.textView.setGravity(START);
                    holder.imageView.setVisibility(View.VISIBLE);
                }
                else {
                    holder.imageView.setVisibility(View.GONE);
                    holder.textView.setVisibility(View.GONE);
                }

                break;

            case 2:
                if (position %2 == 0){
                    holder.imageView.setVisibility(View.GONE);
                }
                else {
                    holder.imageView.setVisibility(View.VISIBLE);
                    holder.textView.setGravity(END);
                }
                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "Venus", Toast.LENGTH_SHORT).show();
                    }
                });

                break;

            case 3:
                if (position %2 == 0){
                    holder.textView.setGravity(START);
                }
                else {
                    holder.textView.setGravity(CENTER);
                }
                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "Earth", Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            case 4:
                if (position %2 == 0){
                    holder.imageView.setVisibility(View.VISIBLE);
                    holder.textView.setGravity(CENTER);
                }

                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "Saturn", Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            case 5:
                if (position %2 == 0){
                    holder.imageView.setVisibility(View.VISIBLE);
                    holder.textView.setGravity(START);
                }
                else {
                    holder.imageView.setVisibility(View.GONE);
                    holder.textView.setVisibility(View.GONE);
                }
                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "Uranus", Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            case 6:
                if (position %2 == 0){
                    holder.imageView.setVisibility(View.GONE);
                    holder.textView.setVisibility(View.GONE);
                }
                else {
                    holder.imageView.setVisibility(View.VISIBLE);
                    holder.textView.setGravity(END);
                }
                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "Neptune", Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            case 7:
                if (position %2 == 0){
                    holder.imageView.setVisibility(View.GONE);
                    holder.textView.setGravity(START);
                }
                else {
                    holder.imageView.setVisibility(View.VISIBLE);
                    holder.textView.setGravity(CENTER);
                }
                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "Jupiter", Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            case 8:
                if (position %2 == 0){
                    holder.textView.setGravity(CENTER);
                }
                else {
                    holder.textView.setGravity(END);
                }
                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "Mercury", Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            case 9:
                if (position %2 == 0){
                    holder.imageView.setVisibility(View.VISIBLE);
                    holder.textView.setGravity(START);
                }
                else {
                    holder.textView.setVisibility(View.GONE);
                    holder.imageView.setVisibility(View.GONE);
                }
                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "Venus", Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            case 10:
                if (position %2 == 0){
                    holder.textView.setVisibility(View.GONE);
                    holder.imageView.setVisibility(View.GONE);
                }
                else {
                    holder.textView.setGravity(CENTER);
                    holder.imageView.setVisibility(View.VISIBLE);
                }
                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "Venus", Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            case 11:
                if (position %2 == 0){
                    holder.textView.setGravity(START);

                }
                else {
                    holder.textView.setGravity(END);
                }
                holder.textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "Venus", Toast.LENGTH_SHORT).show();
                    }
                });
                break;
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        LinearLayout linearLayout;
        ImageView imageView;
        TextView textView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            linearLayout = itemView.findViewById(R.id.linearLayout);
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);

            if (getAdapterPosition()%2 == 0){

            }

        }
    }
}

