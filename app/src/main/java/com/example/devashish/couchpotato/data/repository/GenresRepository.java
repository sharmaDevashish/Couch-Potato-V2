package com.example.devashish.couchpotato.data.repository;

import com.example.devashish.couchpotato.data.model.Genre;

import java.util.List;
import java.util.Map;
import java.util.Set;

import rx.Observable;


/**
 * A facade for which Fragments and Activities can use to
 * get the data needed to display without understanding
 * how the data is retrieved
 *
 * @see GenresRepositoryImpl
 */
public interface GenresRepository {

    Observable<Map<Integer, Genre>> genres();

}
