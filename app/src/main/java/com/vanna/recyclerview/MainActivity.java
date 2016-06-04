package com.vanna.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import jp.wasabeef.recyclerview.adapters.AlphaInAnimationAdapter;
import jp.wasabeef.recyclerview.adapters.ScaleInAnimationAdapter;
import jp.wasabeef.recyclerview.animators.SlideInLeftAnimator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setItemAnimator(new SlideInLeftAnimator());

//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
//        recyclerView.setLayoutManager(linearLayoutManager);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(), 1);
        recyclerView.setLayoutManager(gridLayoutManager);

        ArrayList<Movie> movies = new ArrayList<>();
        Movie movie = new Movie("X-Men", "Action", "2016");
        Movie movie2 = new Movie("Captain America", "Action", "2016");

        movies.add(movie);
        movies.add(movie2);
        movies.add(new Movie("Captain America 1", "Action", "2016"));
        movies.add(new Movie("Captain America 11", "Action", "2016"));
        movies.add(new Movie("Captain America 12", "Action", "2016"));
        movies.add(new Movie("Captain America 13", "Action", "2016"));
        movies.add(new Movie("Captain America 14", "Action", "2016"));
        movies.add(new Movie("Captain America 15", "Action", "2016"));
        movies.add(new Movie("Captain America 16", "Action", "2016"));
        movies.add(new Movie("Captain America 17", "Action", "2016"));
        movies.add(new Movie("Captain America 18", "Action", "2016"));
        movies.add(new Movie("Captain America 19", "Action", "2016"));
        movies.add(new Movie("Captain America 20", "Action", "2016"));
        movies.add(new Movie("Captain America 21", "Action", "2016"));



        MoviesAdapter moviesAdapter = new MoviesAdapter(movies);
        ScaleInAnimationAdapter alphaInAnimationAdapter =
                new ScaleInAnimationAdapter(moviesAdapter);
        recyclerView.setAdapter(alphaInAnimationAdapter);

    }
}
