package com.example.parks3.util;

import java.util.HashMap;

public class Util {

    private static String baseUrl="https://developer.nps.gov/api/v1/";
    private static String apiKey="api_key=sbqXigbqjbO6kcHGdJ8voIDKkeE6KEUUkA82TrAB";
    private static String parksApiLink="https://developer.nps.gov/api/v1/parks?parkCode=acad&api_key=sbqXigbqjbO6kcHGdJ8voIDKkeE6KEUUkA82TrAB";

    public static String getParksApiLink(ApiQuerry querry,int start,CodeType codeType,String code){
        String parksApiLink=baseUrl+querry+"?start="+start+codeType+"="+code+"&"+apiKey;
        return parksApiLink;
    }

}



