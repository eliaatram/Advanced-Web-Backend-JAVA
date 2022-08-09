package com.example.advancedweb.service;

import com.example.advancedweb.datamodel.Movies;
import com.example.advancedweb.payloads.request.MovieRequest;
import com.example.advancedweb.payloads.response.MessageResponse;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MovieService {
    MessageResponse createMovie(MovieRequest movieRequest);
    void deleteMovie(Integer movieId);
    Movies getASingleMovie(Integer movieId);
    List<Movies> getAllMovies();
}