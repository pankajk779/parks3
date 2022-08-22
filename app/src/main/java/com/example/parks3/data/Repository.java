package com.example.parks3.data;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.parks3.controller.MySingleton;
import com.example.parks3.model.Images;
import com.example.parks3.model.Park;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private static Repository instance;
    private MutableLiveData<List<Park>> parkListFromApi=new MutableLiveData<>();
    private MutableLiveData<List<Park>> favouriteParksList=new MutableLiveData<>();

    private Repository(){
    }

    public static Repository getInstance(){
        if(instance==null){
            instance=new Repository();
        }
        return instance;
    }

    public MutableLiveData<List<Park>> getParks(){
        getParksFromApi();

        MutableLiveData<List<Park>> data=new MutableLiveData<>();
        data=parkListFromApi;

        return data;
    }

    public MutableLiveData<List<Park>> getFavouriteParks(){
        setFavouriteParks();
        return favouriteParksList;
    }

    private void getParksFromApi(){

        JsonObjectRequest jsonObjectRequest=new JsonObjectRequest(Request.Method.GET, "https://developer.nps.gov/api/v1/parks?parkCode=&api_key=sbqXigbqjbO6kcHGdJ8voIDKkeE6KEUUkA82TrAB", null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                        try {
                            JSONArray jsonArray=response.getJSONArray("data");
                            List<Park> parks=new ArrayList<>();
                            for(int i=0;i<jsonArray.length();i++){
                                Park park=new Park();
                                JSONObject jsonObject=jsonArray.getJSONObject(i);
                                park.setFullName(jsonObject.getString("fullName"));

                                parks.add(park);


                            }
                            parkListFromApi.setValue(parks);



                        } catch (JSONException e) {
                            e.printStackTrace();
                            Log.d("MYTAG", "onResponse: error is-"+e.toString());
                        }


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("MYTAG", "onErrorResponse: error is-"+error.toString());
            }
        });

//            MySingleton.getInstance().addToRequestQueue(jsonObjectRequest);
    }

    private void setFavouriteParks(){
        ArrayList<Park> parkList=new ArrayList<>();

        Park park1=new Park();
        ArrayList<Images> imagesPark1=new ArrayList<>();
        Images imagePark1=new Images();
        park1.setName("Boston");
        park1.setParkCode("bost");
        park1.setStates("MA");
        park1.setDesignation("National Historical Park");
        imagePark1.setUrl("https://www.nps.gov/common/uploads/structured_data/9698669F-1DD8-B71B-0BAF19BCD480270D.jpg");
        park1.setImages(imagesPark1);
        parkList.add(park1);


        Park park2=new Park();
        List<Images> imagesPark2=new ArrayList<>();
        Images imagePark2=new Images();
        park2.setName("Brices Cross Roads");
        park2.setParkCode("brcr");
        park2.setStates("MS");
        park2.setDesignation("National Battlefield Site");
        imagePark2.setUrl("https://www.nps.gov/common/uploads/structured_data/3C844204-1DD8-B71B-0BF8D1D53809C1E1.jpg");
        park2.setImages(imagesPark2);
        parkList.add(park2);

        Park park3=new Park();
        List<Images> imagesPark3=new ArrayList<>();
        Images imagePark3=new Images();
        park3.setName("Brown v. Board of Education");
        park3.setParkCode("brvb");
        park3.setStates("MS");
        park3.setDesignation("National Historical Park");
        imagePark3.setUrl("https://www.nps.gov/common/uploads/structured_data/3C8422BD-1DD8-B71B-0BB53F08D10856B9.jpg");
        park3.setImages(imagesPark3);
        parkList.add(park3);

        Park park4=new Park();
        List<Images> imagesPark4=new ArrayList<>();
        Images imagePark4=new Images();
        park4.setName("Bryce Canyon");
        park4.setParkCode("brca");
        park4.setStates("UT");
        park4.setDesignation("National Park");
        imagePark4.setUrl("https://www.nps.gov/common/uploads/structured_data/61F08520-E14F-18F2-BF5F3D89482631BD.jpg");
        park4.setImages(imagesPark4);
        parkList.add(park4);

        Park park5=new Park();
        List<Images> imagesPark5=new ArrayList<>();
        Images imagePark5=new Images();
        park5.setName("Abraham Lincoln Birthplace");
        park5.setParkCode("abli");
        park5.setStates("KY");
        park5.setDesignation("National Historical Park");
        imagePark5.setUrl("https://www.nps.gov/common/uploads/structured_data/3C861078-1DD8-B71B-0B774A242EF6A706.jpg");
        park5.setImages(imagesPark5);
        parkList.add(park5);

        Park park6=new Park();
        List<Images> imagesPark6=new ArrayList<>();
        Images imagePark6=new Images();
        park6.setName("Acadia");
        park6.setParkCode("acad");
        park6.setStates("ME");
        park6.setDesignation("National Park");
        imagePark6.setUrl("https://www.nps.gov/common/uploads/structured_data/3C7B45AE-1DD8-B71B-0B7EE131C7DFC2F5.jpg");
        park6.setImages(imagesPark6);
        parkList.add(park6);

        Park park7=new Park();
        List<Images> imagesPark7=new ArrayList<>();
        Images imagePark7=new Images();
        park7.setName("Adams");
        park7.setParkCode("adam");
        park7.setStates("MA");
        park7.setDesignation("National Historical Park");
        imagePark7.setUrl("https://www.nps.gov/common/uploads/structured_data/3C7C7416-1DD8-B71B-0B1B30D0827F7C74.jpg");
        park7.setImages(imagesPark7);
        parkList.add(park7);

        Park park8=new Park();
        List<Images> imagesPark8=new ArrayList<>();
        Images imagePark8=new Images();
        park8.setName("African American Civil War Memorial");
        park8.setParkCode("afam");
        park8.setStates("DC");
        park8.setDesignation("");
        imagePark8.setUrl("https://www.nps.gov/common/uploads/structured_data/3C816B50-1DD8-B71B-0BF380049FB6B6A2.jpg");
        park8.setImages(imagesPark8);
        parkList.add(park8);

        Park park9=new Park();
        ArrayList<Images> imagesPark9=new ArrayList<>();
        Images imagePark9=new Images();
        park9.setName("African Burial Ground");
        park9.setParkCode("afbg");
        park9.setStates("NY");
        park9.setDesignation("National Monument");
        imagePark9.setUrl("https://www.nps.gov/common/uploads/structured_data/3C8554EA-1DD8-B71B-0BE6FF3BF04C18B8.jpg");
        park9.setImages(imagesPark9);
        parkList.add(park9);

        Park park10=new Park();
        List<Images> imagesPark10=new ArrayList<>();
        Images imagePark10=new Images();
        park10.setName("Agate Fossil Beds");
        park10.setParkCode("agfo");
        park10.setStates("NE");
        park10.setDesignation("National Monument");
        imagePark10.setUrl("https://www.nps.gov/common/uploads/structured_data/3C7A058F-1DD8-B71B-0B188ED102F7285F.jpg");
        park10.setImages(imagesPark10);
        parkList.add(park10);

        favouriteParksList.setValue(parkList);
    }

}
