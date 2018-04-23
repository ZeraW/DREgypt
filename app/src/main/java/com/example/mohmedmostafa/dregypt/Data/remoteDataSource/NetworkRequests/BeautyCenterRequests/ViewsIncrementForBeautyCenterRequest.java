package com.example.mohmedmostafa.dregypt.Data.remoteDataSource.NetworkRequests.BeautyCenterRequests;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.Response;
import com.example.mohmedmostafa.dregypt.Data.remoteDataSource.VolleyLIbUtils;
import com.example.mohmedmostafa.dregypt.utils.Constants;

import java.util.HashMap;

/**
 * Created by mohmed mostafa on 23/04/2018.
 */

public class ViewsIncrementForBeautyCenterRequest {

    VolleyLIbUtils volleyLIbUtils;
    String url;
    int methodId;

    public ViewsIncrementForBeautyCenterRequest(Context context, int user_id, int id, Response.Listener<String> listener, Response.ErrorListener errorListener){
        setValues(user_id , id);
        volleyLIbUtils=new VolleyLIbUtils(context,methodId,url,listener,errorListener);
    }
    private void setValues(int user_id,int id){
        url= Constants.basicUrl+"/beauty-centers/"+id+"/users/"+user_id+"/view";
        methodId= Request.Method.POST;
    }

    public void setBody(HashMap body){
        volleyLIbUtils.setParams(body);
    }

    public void start(){
        volleyLIbUtils.start();
    }
}
