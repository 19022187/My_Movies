package sg.edu.rp.c346.id19022187.mymovies;

import java.io.Serializable;
import java.util.Calendar;

public class MovieList implements Serializable {
    private String title;
    private int year;
    private String rated;
    private String genre;
    private Calendar watched_on;
    private String in_theatre;
    private String description;

    public MovieList(String title, int year, String rated, String genre, Calendar watched_on, String in_theatre, String description) {
        this.title = title;
        this.year = year;
        this.rated = rated;
        this.genre = genre;
        this.watched_on = watched_on;
        this.in_theatre = in_theatre;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Calendar getWatched_on() {
        return watched_on;
    }

    public void setWatched_on(Calendar watched_on) {
        this.watched_on = watched_on;
    }

    public String getIn_theatre() {
        return in_theatre;
    }

    public void setIn_theatre(String in_theatre) {
        this.in_theatre = in_theatre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        String str = "Watch on: " + watched_on.get(Calendar.DAY_OF_MONTH) + "/" + (watched_on.get(Calendar.MONTH) + 1) + "/" + watched_on.get(Calendar.YEAR);
        return str;
    }

}
