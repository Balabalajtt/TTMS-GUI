package repository;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import repository.pojo.Movie;

import java.util.ArrayList;

public class MovieData {

    public static ObservableList<String> observableList = FXCollections.observableArrayList();
    public static ArrayList<Movie> movieList = new ArrayList<>();

    static {
        observableList.add("3月20日 10:00 七厅 29.9");
        observableList.add("3月20日 10:00 七厅 29.9");
        observableList.add("3月20日 10:00 七厅 29.9");
        observableList.add("3月20日 10:00 七厅 29.9");
        observableList.add("3月20日 10:00 七厅 29.9");
        observableList.add("3月20日 10:00 七厅 29.9");
        observableList.add("3月20日 10:00 七厅 29.9");
        observableList.add("3月20日 10:00 七厅 29.9");
        observableList.add("3月20日 10:00 七厅 29.9");
        observableList.add("3月20日 10:00 七厅 29.9");
        observableList.add("3月20日 10:00 七厅 29.9");
        observableList.add("3月20日 10:00 七厅 29.9");
        observableList.add("3月20日 10:00 七厅 29.9");
        observableList.add("3月20日 10:00 七厅 29.9");
        observableList.add("3月20日 10:00 七厅 29.9");
        observableList.add("3月20日 10:00 七厅 29.9");
        observableList.add("3月20日 10:00 七厅 29.9");
        observableList.add("3月20日 10:00 七厅 29.9");
        observableList.add("3月20日 10:00 七厅 29.9");
        observableList.add("3月20日 10:00 七厅 29.9");
        observableList.add("3月20日 10:00 七厅 29.9");
        observableList.add("3月20日 10:00 七厅 29.9");
        observableList.add("3月20日 10:00 七厅 29.9");
        observableList.add("3月20日 10:00 七厅 29.9");
        observableList.add("3月20日 10:00 七厅 29.9");

        movieList.add(new Movie(
                "水形物语",
                "https://img.alicdn.com/bao/uploaded/i1/TB1tW9DceuSBuNjSsplXXbe8pXa_.jpg_300x300.jpg",
                "Balabala",
                observableList));
        movieList.add(new Movie(
                "古墓丽影",
                "https://img.alicdn.com/bao/uploaded/i2/TB1BIUyXuySBuNjy1zdXXXPxFXa_.jpg_300x300.jpg",
                "Balabala",
                observableList));
        movieList.add(new Movie(
                "水形物语",
                "https://img.alicdn.com/bao/uploaded/i1/TB1tW9DceuSBuNjSsplXXbe8pXa_.jpg_300x300.jpg",
                "Balabala",
                observableList));
        movieList.add(new Movie(
                "水形物语",
                "https://img.alicdn.com/bao/uploaded/i1/TB1tW9DceuSBuNjSsplXXbe8pXa_.jpg_300x300.jpg",
                "Balabala",
                observableList));
    }

}
