package com.example.parks3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.CountDownTimer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.volley.toolbox.JsonObjectRequest;

public class TestFragment extends Fragment {

    Fragment fragment=ExploreFragment.newInstance();
    FragmentTransaction transaction;

    public TestFragment() {
        // Required empty public constructor
    }

    public static TestFragment newInstance() {
        TestFragment fragment = new TestFragment();
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
        return inflater.inflate(R.layout.fragment_test, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        CountDownTimer countDownTimer=new CountDownTimer(10000,10000) {
            @Override
            public void onTick(long l) {

            }

            @Override
            public void onFinish() {
                Log.d("MYTAG", "onFinish: inside onFInish");
                transaction= getParentFragmentManager().beginTransaction();
                transaction.setCustomAnimations(R.anim.animation_enter_from_left,R.anim.anim_exit_to_right)
                        .replace(R.id.main_activity_frame_layout,fragment)
                        .addToBackStack(null)
                        .commit();
            }
        }.start();



    }

}