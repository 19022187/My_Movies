package sg.edu.rp.c346.id19022187.mymovies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Movie;
import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<MovieList> alMovie;
    CustomAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.listViewMovie);
        alMovie = new ArrayList<>();
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2014, 11, 15);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2015, 5, 15);
        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(2020, 6, 15);
        MovieList item1 = new MovieList("The Avengers", 2012, "pg13", "Action | Sci-Fi",
                calendar1, "Golden Village - Bishan",
                "Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army.");
        alMovie.add(item1);
        MovieList item2 = new MovieList("Planes", 2013, "pg", "Animation | Comedy",
                calendar2, "Cathay - AMK Hub", "A crop-dusting plane with a fear of heights lives his dream of competing in a famous around-the-world aerial race.");
        alMovie.add(item2);
        MovieList item3 = new MovieList("Sonic The Hedgehog", 2020, "pg", "Action | Adventure | Comedy",
                calendar3, "Cathay - AMK Hub", "Sonic, an extraterrestrial blue hedgehog who can run at supersonic speeds, finds himself sought after by a tribe of echidnas for his power.");
        alMovie.add(item3);

        caMovie = new CustomAdapter(this, R.layout.row, alMovie);
        lvMovie.setAdapter(caMovie);

        lvMovie.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MovieList current = alMovie.get(position);
                Intent i = new Intent(getApplicationContext(), MovieDetailsActivity.class);
                i.putExtra("Cmovie", current);
                i.putExtra("date", current.getWatched_on());
                startActivity(i);

            }
        });
    }

}