package sg.edu.rp.c346.id19022187.mymovies;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Calendar;

class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<MovieList> alMovieList;

    public CustomAdapter(Context context, int resource, ArrayList<MovieList> objects){
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        alMovieList = objects;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvTitle = rowView.findViewById(R.id.textViewName);
        TextView tvYear = rowView.findViewById(R.id.textViewYear);
        TextView tvGenre = rowView.findViewById(R.id.textViewGenre);
        ImageView ivRating = rowView.findViewById(R.id.imageViewRating);

        MovieList currentItem = alMovieList.get(position);
        tvYear.setText(currentItem.getYear() + "");
        tvGenre.setText(currentItem.getGenre());

        if (currentItem.getYear() == Calendar.getInstance().get(Calendar.YEAR)) {
            tvTitle.setText(currentItem.getTitle());
            tvTitle.setTextColor(Color.parseColor("#ff1e00"));
        } else {
            tvTitle.setText(currentItem.getTitle());
        }

        if (currentItem.getRated().equalsIgnoreCase("g")){
            ivRating.setImageResource(R.drawable.rating_g);
        }
        else if (currentItem.getRated().equalsIgnoreCase("pg")){
            ivRating.setImageResource(R.drawable.rating_pg);
        }
        else if (currentItem.getRated().equalsIgnoreCase("pg13")){
            ivRating.setImageResource(R.drawable.rating_pg13);
        }
        else if (currentItem.getRated().equalsIgnoreCase("nc16")){
            ivRating.setImageResource(R.drawable.rating_nc16);
        }
        else if (currentItem.getRated().equalsIgnoreCase("m18")){
            ivRating.setImageResource(R.drawable.rating_m18);
        }
        else {
            ivRating.setImageResource(R.drawable.rating_r21);
        }

        return rowView;
    }
}
