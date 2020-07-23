package sg.edu.rp.c346.id19022187.mymovies;

import android.content.Intent;
import android.graphics.Movie;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MovieDetailsActivity extends AppCompatActivity {

    TextView tvTitle, tvYear, tvGenre, tvDesc, tvWatchOn, tvTheatre;
    ImageView iv, ivStar7, ivStar6, ivStar5, ivStar4, ivStar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);

        Intent i = getIntent();
        MovieList Cmovie = (MovieList)i.getSerializableExtra("Cmovie");
        String date = i.getStringExtra("date");

        tvTitle = findViewById(R.id.tvTitle);
        tvYear = findViewById(R.id.tvYear);
        tvGenre = findViewById(R.id.tvGenre);
        tvDesc = findViewById(R.id.tvDesc);
        tvWatchOn = findViewById(R.id.tvWatchedOn);
        tvTheatre = findViewById(R.id.tvTheatre);
        iv = findViewById(R.id.iv);
        ivStar7 = findViewById(R.id.imageView7);
        ivStar6 = findViewById(R.id.imageView6);
        ivStar5 = findViewById(R.id.imageView5);
        ivStar4 = findViewById(R.id.imageView4);
        ivStar3 = findViewById(R.id.imageView3);

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        if (Cmovie.getRated().equalsIgnoreCase("g")){
            iv.setImageResource(R.drawable.rating_g);
        }
        else if (Cmovie.getRated().equalsIgnoreCase("pg")){
            iv.setImageResource(R.drawable.rating_pg);
        }
        else if (Cmovie.getRated().equalsIgnoreCase("pg13")){
            iv.setImageResource(R.drawable.rating_pg13);
        }
        else if (Cmovie.getRated().equalsIgnoreCase("nc16")){
            iv.setImageResource(R.drawable.rating_nc16);
        }
        else if (Cmovie.getRated().equalsIgnoreCase("m18")){
            iv.setImageResource(R.drawable.rating_m18);
        }
        else {
            iv.setImageResource(R.drawable.rating_r21);
        }

        tvTitle.setText(Cmovie.getTitle());
        tvYear.setText(Cmovie.getYear() + " - ");
        tvGenre.setText(Cmovie.getGenre());
        tvDesc.setText(Cmovie.getDescription());
        tvWatchOn.setText(Cmovie.toString());
        tvTheatre.setText(Cmovie.getIn_theatre());

        if (Cmovie.getTitle().equalsIgnoreCase("The Avengers")) {
            ivStar7.setImageResource(android.R.drawable.btn_star_big_off);
        }
        else if (Cmovie.getTitle().equalsIgnoreCase("Planes")) {
            ivStar7.setImageResource(android.R.drawable.btn_star_big_off);
            ivStar6.setImageResource(android.R.drawable.btn_star_big_off);
            ivStar5.setImageResource(android.R.drawable.btn_star_big_off);
        }
        else {
            ivStar7.setImageResource(android.R.drawable.btn_star_big_off);
            ivStar6.setImageResource(android.R.drawable.btn_star_big_off);
            ivStar5.setImageResource(android.R.drawable.btn_star_big_off);
            ivStar4.setImageResource(android.R.drawable.btn_star_big_off);
            ivStar3.setImageResource(android.R.drawable.btn_star_big_off);
        }

    }
}
