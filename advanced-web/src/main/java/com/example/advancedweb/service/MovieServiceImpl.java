package com.example.advancedweb.service;

import com.example.advancedweb.datamodel.Movies;
import com.example.advancedweb.exceptions.ResourceNotFoundException;
import com.example.advancedweb.payloads.request.MovieRequest;
import com.example.advancedweb.payloads.response.MessageResponse;
import com.example.advancedweb.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Override
    public MessageResponse createMovie(MovieRequest movieRequest) {
        Movies newMovie = new Movies();

        newMovie.setTitle(movieRequest.getTitle());
        newMovie.setAuthor(movieRequest.getAuthor());
        newMovie.setOverview(movieRequest.getOverview());
        newMovie.setType(movieRequest.getType());
        newMovie.setPoster(movieRequest.getPoster());
        newMovie.setBackdrop_poster(movieRequest.getBackdrop_poster());
        newMovie.setRelease_date(movieRequest.getRelease_date());

        movieRepository.save(newMovie);
        return new MessageResponse("New Movie created successfully");

    }

    @Override
    public void deleteMovie(Integer movieId) throws ResourceNotFoundException {
        if (movieRepository.getReferenceById(movieId).getMovie_id().equals(movieId)){
            movieRepository.deleteById(movieId);
        }
        else throw new ResourceNotFoundException("Movie", "movie_id", movieId);
    }

    @Override
    public Movies getASingleMovie(Integer movieId) throws ResourceNotFoundException {
        return movieRepository.findById(movieId).orElseThrow(() -> new ResourceNotFoundException("Movie", "movie_id",
                movieId));
    }

    @Override
    public List<Movies> getAllMovies() {
        return movieRepository.findAll();
    }
}
