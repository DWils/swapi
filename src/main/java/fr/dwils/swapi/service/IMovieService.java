package fr.dwils.swapi.service;

import fr.dwils.swapi.dto.response.MovieResponse;

import java.util.List;

public interface IMovieService {
    List<MovieResponse> searchMoviesByTitles(List<String> titles);
}

