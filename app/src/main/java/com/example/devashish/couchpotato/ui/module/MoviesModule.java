package com.example.devashish.couchpotato.ui.module;

import com.example.devashish.couchpotato.ApplicationModule;
import com.example.devashish.couchpotato.ui.fragment.FavoredMoviesFragment;
import com.example.devashish.couchpotato.ui.fragment.MovieFragment;
import com.example.devashish.couchpotato.ui.fragment.SortedMoviesFragment;

import dagger.Module;

@Module(
        injects = {
                SortedMoviesFragment.class,
                FavoredMoviesFragment.class,
                MovieFragment.class
        },
        addsTo = ApplicationModule.class
)
public final class MoviesModule {}
