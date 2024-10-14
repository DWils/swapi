package fr.dwils.swapi.mapper;

import fr.dwils.swapi.dto.response.CharacterResponse;
import fr.dwils.swapi.dto.response.MovieResponse;
import fr.dwils.swapi.model.Character;
import fr.dwils.swapi.model.Movie;
import fr.dwils.swapi.service.IMovieService;

import java.util.List;
import java.util.stream.Collectors;

public class CharacterMapper {

    private final IMovieService movieService;

    public CharacterMapper(IMovieService movieService) {
        this.movieService = movieService;
    }

    public static CharacterResponse toCharacterResponse(Character character) {
        CharacterResponse response = new CharacterResponse();
        response.setName(character.getName());
        response.setHeight(character.getHeight());
        response.setMass(character.getMass());
        response.setHairColor(character.getHairColor());
        response.setSkinColor(character.getSkinColor());
        response.setEyeColor(character.getEyeColor());
        response.setBirthYear(character.getBirthYear());
        response.setGender(character.getGender());
        response.setHomeworldName(character.getHomeworld() != null ? character.getHomeworld().getName() : null);


        List<MovieResponse> movieResponses = character.getMovieTitles().stream() // Assurez-vous que getMovieTitles() retourne une liste de String
                .map(title -> movieService.searchMovieByTitles(title)) // Appel au service pour obtenir MovieResponse
                .collect(Collectors.toList());

        return response;
    }

    private static MovieResponse toMovieResponse(Movie movie) {
        MovieResponse movieResponse = new MovieResponse();
        movieResponse.setTitle(movie.getTitle());
        movieResponse.setOriginalTitle(movie.getOriginalTitle());
        movieResponse.setPosterPath(movie.getPosterPath());
        movieResponse.setBackdropPath(movie.getBackdropPath());
        movieResponse.setOverview(movie.getOverview());
        return movieResponse;
    }
}

