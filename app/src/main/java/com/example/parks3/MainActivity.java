package com.example.parks3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;

import com.example.parks3.adapters.RecyclerViewAdapterStates;
import com.example.parks3.data.DummyRepository;
import com.example.parks3.model.ExploreViewModel;
import com.example.parks3.model.SearchPark;

import org.json.JSONException;

public class MainActivity extends AppCompatActivity {
    public static int heightPixels, widthPixels;
    Fragment mainActivityFragment;
    SearchPark.ParkState parkState= SearchPark.ParkState.Delhi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DummyRepository dummyRepository=DummyRepository.newInstance(this);
        try {
            dummyRepository.sortActivities();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        DisplayMetrics displayMetrics=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        heightPixels=displayMetrics.heightPixels;
        widthPixels=displayMetrics.widthPixels;

        mainActivityFragment=MainActivityFragment.newInstance();
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_activity_frame_layout,mainActivityFragment)
                .commit();



    }
}