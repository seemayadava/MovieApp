package com.example.hrish.moviestage1.Utils;
import android.os.AsyncTask;
import android.util.Log;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ReadJsonFromAPI extends AsyncTask<Boolean,Void, JSONObject>{

    String APIurl;

    @Override
    public JSONObject doInBackground(Boolean... ArrangeMovieBy) {
        try {
            if (ArrangeMovieBy[0] == true) {
                APIurl = "http://api.themoviedb.org/3/discover/movie?sort_by=popularity.desc&api_key=*****";
            } else {

                APIurl = "http://api.themoviedb.org/3/discover/movie?sort_by=vote_average.desc&vote_count.desc&api_key=*****";
            }
            URL url=new URL(APIurl);
            //StringBuilder stringBuilder=new StringBuilder();
            StringBuffer text = new StringBuffer();
             String line;
            HttpURLConnection urlConnection=(HttpURLConnection)url.openConnection();
            urlConnection.connect();
            InputStreamReader in = new InputStreamReader((InputStream) urlConnection.getContent());
            BufferedReader buff = new BufferedReader(in);
          //  String line;
            while ( (line =  buff.readLine()) != null) {
                text.append(line + "\n");
            }
                buff.close();

            return new JSONObject(text.toString());
        }
        catch(Exception e){
            Log.e("ERROR",e.getMessage(),e);
            return null;
        }
    }

    @Override
    protected void onPreExecute() {
        //display progress dialog.

    }


    }

