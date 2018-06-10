package com.example.hrish.moviestage1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.hrish.moviestage1.Model.MovieDetails;
import com.example.hrish.moviestage1.Utils.JsonUtil;
import com.example.hrish.moviestage1.Utils.ReadJsonFromAPI;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    Boolean ArrangeMovieBy = true;
    JSONObject movieobject;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

/*        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
                 //   PopulateMovie(ArrangeMovieBy);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        switch (item.getItemId()) {
            case R.id.Most_Popular:
                //ArrangeMovieBy = true;
                movieobject = RetriveJsonFromAPI(ArrangeMovieBy);
                    ParseJson(movieobject);
                    return true;
            case R.id.Top_Rated:
               // ArrangeMovieBy = false;
                movieobject = RetriveJsonFromAPI(ArrangeMovieBy);
                    ParseJson(movieobject);

                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }

    public JSONObject RetriveJsonFromAPI(Boolean ArrangeMovieBy) {

           return new ReadJsonFromAPI().doInBackground(ArrangeMovieBy);
             }
    public void ParseJson (JSONObject MovieJason) {
      //  MovieDetails[] movieDetails = JsonUtil.ParseMovieJason(MovieJason);

    }

    }
