package fr.dwils.swapi.service.impl;


import fr.dwils.swapi.dto.response.MovieResponse;
import fr.dwils.swapi.dto.response.MovieResultsResponse; // DTO pour gérer la réponse
import fr.dwils.swapi.service.IMovieService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class MovieService implements IMovieService {

    private final RestTemplate restTemplate;

    @Value("${tmdb.api.key}")
    private String apiKey;

    public MovieService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<MovieResponse> searchMoviesByTitles(List<String> titles) {
        return titles.stream()
                .map(this::searchMovieByTitle)
                .toList();
    }

    private MovieResponse searchMovieByTitle(String title) {
        String url = "https://api.themoviedb.org/3/search/movie?api_key=" + apiKey + "&query=" + title;

        // Appel API TMDB
        MovieResultsResponse resultsResponse = restTemplate.getForObject(url, MovieResultsResponse.class);

        // Gérer la réponse ici
        if (resultsResponse != null && resultsResponse.getResults() != null && !resultsResponse.getResults().isEmpty()) {
            return resultsResponse.getResults().get(0); // Renvoie le premier résultat
        }

        return null; // Ou gérer le cas où aucun film n'est trouvé
    }
}

