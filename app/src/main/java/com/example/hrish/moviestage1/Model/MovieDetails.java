package com.example.hrish.moviestage1.Model;

public class MovieDetails {

    private String Rating;
    private String Popularity;
    private String Image_Path;
    private String Overview;
    private String Title;
    private String Release_Date;

    public MovieDetails() {
    }

    public MovieDetails(String rating, String popularity, String image_Path, String overview, String title, String release_Date) {
        Rating = rating;
        Popularity = popularity;
        Image_Path = image_Path;
        Overview = overview;
        Title = title;
        Release_Date = release_Date;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    public void setPopularity(String popularity) {
        Popularity = popularity;
    }

    public void setImage_Path(String image_Path) {
        Image_Path = image_Path;
    }

    public void setOverview(String overview) {
        Overview = overview;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setRelease_Date(String release_Date) {
        Release_Date = release_Date;
    }


    public String getRating() {
        return Rating;
    }

    public String getPopularity() {
        return Popularity;
    }

    public String getImage_Path() {
        return Image_Path;
    }

    public String getOverview() {
        return Overview;
    }

    public String getTitle() {
        return Title;
    }

    public String getRelease_Date() {
        return Release_Date;
    }

}
