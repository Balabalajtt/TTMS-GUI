package repository.pojo;

import javafx.collections.ObservableList;

public class Movie {
    public String movieName;
    public String imgUrl;
    public String introduce;
    public ObservableList<String> scheduler;


    public Movie(String movieName, String imgUrl, String introduce, ObservableList<String> scheduler) {
        this.movieName = movieName;
        this.imgUrl = imgUrl;
        this.introduce = introduce;
        this.scheduler = scheduler;
    }
}
