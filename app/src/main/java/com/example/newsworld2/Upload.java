package com.example.newsworld2;

import android.net.Uri;

public class Upload {
    String mImageUrl;
    public Upload(){

    }
    public Upload(String url){
        mImageUrl = url;
    }
    public String getmImageUrl(){
        return mImageUrl;
    }
    public void setmImageUrl(String url){
        mImageUrl = url;
    }
}
