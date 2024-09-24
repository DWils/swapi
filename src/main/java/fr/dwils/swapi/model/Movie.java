package fr.dwils.swapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Movie {
    private Long id;
    private String title;

    @JsonProperty("original_title")
    private String originalTitle;

    @JsonProperty("release_date")
    private String releaseDate;

    private String overview;

    @JsonProperty("poster_path")
    private String posterPath;

    @JsonProperty("backdrop_path")
    private String backdropPath;

    @JsonProperty("vote_average")
    private Double voteAverage;

    @JsonProperty("vote_count")
    private Integer voteCount;

    @JsonProperty("genre_ids")
    private List<Integer> genreIds;

    @JsonProperty("imdb_id")
    private String imdbId;

    private Boolean adult;

    @JsonProperty("original_language")
    private String originalLanguage;

    private Double popularity;
}
