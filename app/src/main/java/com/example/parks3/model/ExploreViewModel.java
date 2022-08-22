package com.example.parks3.model;

import android.content.Context;
import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.parks3.data.DummyRepository;
import com.example.parks3.data.Repository;

import org.json.JSONException;

import java.util.List;

public class ExploreViewModel extends ViewModel {

    public MutableLiveData<List<Park>> parkList=new MutableLiveData<>();
    public MutableLiveData<List<Park>> favouriteParkList=new MutableLiveData<>();
    private Repository repository;
    private DummyRepository dummyRepository;
    private Context context;

    public ExploreViewModel(Context context) {
        this.context=context;
    }

    public List<Events> requestDataFromDummyRepository() throws JSONException {
        if(dummyRepository==null){
            dummyRepository=DummyRepository.newInstance(context);
        }
        return dummyRepository.setDummyEvents();
    }

    public void requestDataFromApi(){
        if(repository!=null){
            return;
        }
        repository=Repository.getInstance();
        parkList=repository.getParks();
        favouriteParkList=repository.getFavouriteParks();
        Log.d("MYTAG", "requestDataFromApi: "+repository.getFavouriteParks().getValue());
    }

    public LiveData<List<Park>> getParksList(){
        return parkList;
    }

    public LiveData<List<Park>> getFavouriteParks(){
        return favouriteParkList;
    }

}
