package com.example.laboratorio05

import android.app.Application
import com.example.laboratorio05.data.model.movies
import com.example.laboratorio05.data.repositories.MovieRepository

class MovieReviewerApplication: Application() {
    val movieRepository: MovieRepository by lazy {
        MovieRepository(movies)
    }
}