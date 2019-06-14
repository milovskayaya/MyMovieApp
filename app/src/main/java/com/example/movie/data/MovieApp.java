package com.example.movie.data;

import android.app.Application;
import com.example.movie.data.Repository;

public class MovieApp extends Application {
    private Repository repository;
    // нужен для вызова репозитория тогда, когда контекст не возможно дать, поэтому контекстом берется приложение
    @Override
    public void onCreate() {
        super.onCreate();
        repository = new Repository(this);
    }

    public Repository getRepository() {
        return repository;
    }

}