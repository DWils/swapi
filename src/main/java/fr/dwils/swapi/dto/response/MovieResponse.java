package fr.dwils.swapi.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MovieResponse {
    private Long id;
    private String title;
    private String originalTitle;
    private String posterPath;
    private String backdropPath;
    private String overview;
}
