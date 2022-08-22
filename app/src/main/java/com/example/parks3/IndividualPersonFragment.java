package com.example.parks3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.parks3.adapters.RecyclerViewAdapterIndividualPark;

public class IndividualPersonFragment extends Fragment {

    private int positionOfClickedImage;
    private RecyclerView recyclerView;

    public IndividualPersonFragment() {
        // Required empty public constructor
    }

    public static IndividualPersonFragment newInstance() {
        IndividualPersonFragment fragment = new IndividualPersonFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_individual_person, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle bundle=this.getArguments();
        positionOfClickedImage=bundle.getInt("position");
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerView=view.findViewById(R.id.individualPark_recyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);
//        recyclerView.setAdapter(new RecyclerViewAdapterIndividualPark(MainActivity.personDummyArrayList,positionOfClickedImage));

    }
}