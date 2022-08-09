package com.example.advancedweb.web;

import com.example.advancedweb.datamodel.Movies;
import com.example.advancedweb.payloads.request.MovieRequest;
import com.example.advancedweb.payloads.response.MessageResponse;
import com.example.advancedweb.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    MovieService movieService;

    @PostMapping("/add")
    public ResponseEntity<MessageResponse> addMovie(@RequestBody MovieRequest movie) {
        MessageResponse newMovie = movieService.createMovie(movie);
        return new ResponseEntity<>(newMovie, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteMovie(@PathVariable("id") Integer id) {
        movieService.deleteMovie(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Movies>> getAllMovies () {
        List<Movies> movies = movieService.getAllMovies();
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Movies> getMovieById (@PathVariable("id") Integer id) {
        Movies movie = movieService.getASingleMovie(id);
        return new ResponseEntity<>(movie, HttpStatus.OK);
    }
}

