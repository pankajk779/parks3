package com.example.parks3.adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.parks3.R;
import com.example.parks3.model.Events;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewExploreEventsAdapter extends RecyclerView.Adapter<RecyclerViewExploreEventsAdapter.ViewHolder> {
    private List<Events> eventsList=new ArrayList<>();

    public RecyclerViewExploreEventsAdapter(List<Events> eventsList) {
        Log.d("MYTAG2", "RecyclerViewExploreEventsAdapter: eventsList size="+eventsList.size());
        this.eventsList=eventsList;
    }

    @NonNull
    @Override
    public RecyclerViewExploreEventsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.explore_events_recycler_view_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewExploreEventsAdapter.ViewHolder holder, int position) {
        Log.d("MYTAG2", "onBindViewHolder: eventlist size= "+eventsList.size());
        holder.eventTitle.setText(eventsList.get(position).getTitle());
        holder.eventTime.setText(eventsList.get(position).getTimes().get(0).getTimestart());
    }

    @Override
    public int getItemCount() {
        Log.d("MYTAG2", "getItemCount: eventlist size is="+eventsList.size());
        return 10;

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView eventLocation, eventDate, eventMonth,eventTitle,eventTime;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            eventLocation=itemView.findViewById(R.id.exploreFragment_textView_events_recyclerView_row_eventLocation);
            eventDate=itemView.findViewById(R.id.exploreFragment_textView_recyclerView_events_date);
            eventMonth=itemView.findViewById(R.id.exploreFragment_textView_recyclerView_events_month);
            eventTime=itemView.findViewById(R.id.exploreFragment_textView_recyclerView_events_eventTime);
            eventTitle=itemView.findViewById(R.id.exploreFragment_textView_recyclerView_events_eventTitle);

        }

    }
}
