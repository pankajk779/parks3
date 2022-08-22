package com.example.parks3.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.RecyclerView;

import com.example.parks3.R;
import com.squareup.picasso.Picasso;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RecyclerViewAdapterStates extends RecyclerView.Adapter<RecyclerViewAdapterStates.ViewModel> {

    private ArrayList<Integer> stateImages=new ArrayList<>();
    private ArrayList<String> stateNames=new ArrayList<>();

    public RecyclerViewAdapterStates(ArrayList<Integer> stateImages) {
        this.stateImages=stateImages;
        String NewYork="New York";
        String California="California";
        String Massachusetts="Massachusetts";
        String Hawaii="Hawaii";
        stateNames.add(California);
        stateNames.add(NewYork);
        stateNames.add(Hawaii);
        stateNames.add(Massachusetts);



    }

    @NonNull
    @Override
    public RecyclerViewAdapterStates.ViewModel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new ViewModel(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.explore_states_recycler_view_row,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapterStates.ViewModel holder, int position) {

        Picasso.get().load(stateImages.get(position))
                .into(holder.imageView);
        holder.stateName.setText(stateNames.get(position));
    }

    @Override
    public int getItemCount() {
        return stateImages.size();
    }

    public class ViewModel extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView stateName;

        public ViewModel(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.explore_imageView_recyclerView_states_stateImage_row);
            stateName=itemView.findViewById(R.id.explore_textView_recyclerView_states_row_stateName);
        }
    }
}
