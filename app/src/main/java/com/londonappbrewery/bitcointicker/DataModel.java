package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Ahmed_Alarbed on 11/27/2017.
 */

public class DataModel {
    private String askPrice;

    public static DataModel fromJson(JSONObject jsonObject){
        try{
        DataModel dataModel = new DataModel();
        dataModel.askPrice = jsonObject.getString("ask").toString();

            return dataModel;
        }
        catch (JSONException e){
            e.printStackTrace();
            return null;
        }
    }

    public String getAskPrice() {
        return askPrice;
    }
}
