package com.example.sajan.jsonparsingexample.Rest.Model.Response;

import java.util.ArrayList;

/**
 * Created by Sajan on 20-Jun-16.
 */
public class MovieDetails {

    private String budget;
    private Boolean adult;
    private String backdrop_path;
    private String belongs_to_collection;

    private String homepage;
    private Integer id;
    private String imdb_id;
    private String original_language;
    private String original_title;
    private String overview;
    private Float popularity;

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public Boolean getAdult() {
        return adult;
    }

    public void setAdult(Boolean adult) {
        this.adult = adult;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public String getBelongs_to_collection() {
        return belongs_to_collection;
    }

    public void setBelongs_to_collection(String belongs_to_collection) {
        this.belongs_to_collection = belongs_to_collection;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImdb_id() {
        return imdb_id;
    }

    public void setImdb_id(String imdb_id) {
        this.imdb_id = imdb_id;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public Float getPopularity() {
        return popularity;
    }

    public void setPopularity(Float popularity) {
        this.popularity = popularity;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public Integer getRevenue() {
        return revenue;
    }

    public void setRevenue(Integer revenue) {
        this.revenue = revenue;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getVideo() {
        return video;
    }

    public void setVideo(Boolean video) {
        this.video = video;
    }

    public String getVote_average() {
        return vote_average;
    }

    public void setVote_average(String vote_average) {
        this.vote_average = vote_average;
    }

    public Float getVote_count() {
        return vote_count;
    }

    public void setVote_count(Float vote_count) {
        this.vote_count = vote_count;
    }

    public ArrayList<Genre> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<Genre> genres) {
        this.genres = genres;
    }

    public ArrayList<ProductionCompany> getProductionCompanyList() {
        return productionCompanyList;
    }

    public void setProductionCompanyList(ArrayList<ProductionCompany> productionCompanyList) {
        this.productionCompanyList = productionCompanyList;
    }

    public ArrayList<ProductionCountry> getProductionCountryList() {
        return productionCountryList;
    }

    public void setProductionCountryList(ArrayList<ProductionCountry> productionCountryList) {
        this.productionCountryList = productionCountryList;
    }

    public ArrayList<SpokenLanguage> getSpokenLanguageList() {
        return spokenLanguageList;
    }

    public void setSpokenLanguageList(ArrayList<SpokenLanguage> spokenLanguageList) {
        this.spokenLanguageList = spokenLanguageList;
    }

    private String poster_path;
    private String release_date;
    private Integer revenue;
    private Integer runtime;
    private String status;
    private String tagline;
    private String title;
    private Boolean video;
    private String vote_average;
    private Float vote_count;

    private ArrayList<Genre> genres = new ArrayList<Genre>();
    private ArrayList<ProductionCompany> productionCompanyList = new ArrayList<ProductionCompany>();
    private ArrayList<ProductionCountry> productionCountryList = new ArrayList<ProductionCountry>();
    private ArrayList<SpokenLanguage> spokenLanguageList = new ArrayList<SpokenLanguage>();






}