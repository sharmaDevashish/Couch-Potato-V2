package com.example.devashish.couchpotato.data.repository;

import com.example.devashish.couchpotato.data.api.Sort;
import com.example.devashish.couchpotato.data.model.Movie;
import com.example.devashish.couchpotato.data.model.Review;
import com.example.devashish.couchpotato.data.model.Video;

import java.util.List;
import java.util.Set;

import rx.Observable;


public interface MoviesRepository {

    Observable<List<Movie>> discoverMovies(Sort sort, int page);

    Observable<List<Movie>> savedMovies();

    Observable<Set<Long>> savedMovieIds();

    void saveMovie(Movie movie);

    void deleteMovie(Movie movie);

    Observable<List<Video>> videos(long movieId);

    Observable<List<Review>> reviews(long movieId);

}
