package com.example.parks3;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.airbnb.lottie.L;
import com.example.parks3.adapters.RecyclerViewAdapterExploreFavouriteParks;
import com.example.parks3.adapters.RecyclerViewAdapterExploreVisitedParks;
import com.example.parks3.adapters.RecyclerViewAdapterStates;
import com.example.parks3.adapters.RecyclerViewExploreEventsAdapter;
import com.example.parks3.data.DummyRepository;
import com.example.parks3.model.Events;
import com.example.parks3.model.ExploreViewModel;
import com.example.parks3.model.ExploreViewModelFactory;
import com.example.parks3.model.Park;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ExploreFragment extends Fragment implements OnMyItemClickListener {

    private RecyclerView recyclerViewFavouriteParks, recyclerViewVisitedParks, recyclerViewStates;

    private ConstraintLayout constraintLayout;
    public static final int bottomSheetHeight= (int) Math.round(MainActivity.heightPixels*0.8);
    private BottomSheetBehavior bottomSheetBehavior;
    private Button buttonOpenIndividualFragment,buttonOpenTestFragment;
    private int positionOfClickedImage;
    private ExploreViewModel exploreViewModel;
    private RecyclerViewAdapterExploreFavouriteParks recyclerViewAdapterExploreFavouriteParks;
    private RecyclerViewAdapterStates recyclerViewAdapterStates;
    private RecyclerViewExploreEventsAdapter recyclerViewExploreEventsAdapter;
    private RecyclerView recyclerViewEvents;
    private List<Events> events;
    private Context context;


    public ExploreFragment() {
        // Required empty public constructor
    }


    public static ExploreFragment newInstance() {
        ExploreFragment fragment = new ExploreFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        DummyRepository dummyRepository=DummyRepository.newInstance();
//        try {
//            dummyRepository.sortActivities();
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_explore, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        int bottomSheetHeight= (int) Math.round(MainActivity.heightPixels*0.8);




        exploreViewModel =new ViewModelProvider(this,new ExploreViewModelFactory(getActivity()))
                .get(ExploreViewModel.class );
        if(exploreViewModel==null)
        Log.d("MYTAG2", "onViewCreated: exploreViewModel is= null");
        exploreViewModel.requestDataFromApi();
        exploreViewModel.getParksList().observe(getViewLifecycleOwner(), new Observer<List<Park>>() {
            @Override
            public void onChanged(List<Park> parks) {
                Log.d("MYTAG", "onChanged: "+exploreViewModel.getParksList().getValue().size());
            }
        });

        exploreViewModel.getFavouriteParks().observe(getViewLifecycleOwner(), new Observer<List<Park>>() {
            @Override
            public void onChanged(List<Park> parks) {
                Log.d("MYTAG2", "onChanged: "+parks);
                recyclerViewAdapterExploreFavouriteParks.notifyDataSetChanged();
            }
        });

        List<Events> dummyEventsList= null;
        try {
            dummyEventsList = exploreViewModel.requestDataFromDummyRepository();
            Log.d("MYTAG2", "onViewCreated: inside explore dummyEventlist size="+dummyEventsList.size());
        } catch (JSONException e) {
            e.printStackTrace();
        }




        //
        LinearLayoutManager linearLayoutManagerFavouriteParks=new LinearLayoutManager(getActivity());
        linearLayoutManagerFavouriteParks.setOrientation(LinearLayoutManager.HORIZONTAL);
        LinearLayoutManager linearLayoutManagerVisitedParks=new LinearLayoutManager(getActivity());
        linearLayoutManagerVisitedParks.setOrientation(RecyclerView.HORIZONTAL);

        constraintLayout=view.findViewById(R.id.explore_bottomSheet_constraintLayout);
        constraintLayout.setMaxHeight(bottomSheetHeight);
        buttonOpenIndividualFragment=view.findViewById(R.id.explore_bottomSheet_button_openIndividualFragment);
        buttonOpenTestFragment=view.findViewById(R.id.explore_bottomSheet_button_openTestFragment);
        recyclerViewFavouriteParks=view.findViewById(R.id.explore_recyclerView_favouriteParks);

        ArrayList<Integer> stateImages=new ArrayList<>();
        Integer stateNewYork=R.drawable.states_new_york;
        Integer stateCalifornia=R.drawable.states_california;
        Integer stateMassachusetts=R.drawable.states_massachusetts;
        Integer stateHawaii=R.drawable.states_hawaii;
        stateImages.add(stateCalifornia);
        stateImages.add(stateNewYork);
        stateImages.add(stateHawaii);
        stateImages.add(stateMassachusetts);

        recyclerViewEvents=view.findViewById(R.id.exploreFragment_recyclerView_events);
        LinearLayoutManager linearLayoutManagerRecyclerViewEvents=new LinearLayoutManager(getActivity());
        linearLayoutManagerRecyclerViewEvents.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerViewExploreEventsAdapter=new RecyclerViewExploreEventsAdapter(dummyEventsList);
        recyclerViewEvents.setLayoutManager(linearLayoutManagerRecyclerViewEvents);
        recyclerViewEvents.setAdapter(recyclerViewExploreEventsAdapter);

        recyclerViewStates=view.findViewById(R.id.exploreFragment_recyclerView_states);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerViewAdapterStates=new RecyclerViewAdapterStates(stateImages);
        recyclerViewStates.setLayoutManager(linearLayoutManager);
        recyclerViewStates.setAdapter(recyclerViewAdapterStates);

        recyclerViewFavouriteParks.setLayoutManager(linearLayoutManagerFavouriteParks);
        recyclerViewAdapterExploreFavouriteParks=new RecyclerViewAdapterExploreFavouriteParks(exploreViewModel.getFavouriteParks().getValue());
        recyclerViewFavouriteParks.setAdapter(recyclerViewAdapterExploreFavouriteParks);

        recyclerViewVisitedParks=view.findViewById(R.id.explore_recyclerView_visitedParks);
        recyclerViewVisitedParks.setLayoutManager(linearLayoutManagerVisitedParks);
        recyclerViewVisitedParks.setAdapter(new RecyclerViewAdapterExploreVisitedParks());



        bottomSheetBehavior=BottomSheetBehavior.from(constraintLayout);
        bottomSheetBehavior.setPeekHeight(-5);
        bottomSheetBehavior.setHideable(false);

        buttonOpenIndividualFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putInt("position",positionOfClickedImage);
                Fragment fragment=IndividualPersonFragment.newInstance();
                fragment.setArguments(bundle);
                FragmentTransaction transaction= getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.main_activity_frame_layout,fragment)
                        .addToBackStack(null)
                        .commit();
            }
        });

        buttonOpenTestFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment=TestFragment.newInstance();
                FragmentTransaction transaction= getParentFragmentManager().beginTransaction();
                transaction.setCustomAnimations(R.anim.animation_enter_from_left,R.anim.anim_exit_to_right)
                        .replace(R.id.main_activity_frame_layout,fragment)
                        .addToBackStack(null)
                        .commit();
            }
        });

        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);

    }

    @Override
    public void onItemClick(View view, int position) {
        positionOfClickedImage=position;
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
    }
}