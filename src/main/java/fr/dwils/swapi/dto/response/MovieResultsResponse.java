package fr.dwils.swapi.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class MovieResultsResponse {
    @JsonProperty("page")
    private Integer page;

    @JsonProperty("total_results")
    private Integer totalResults;

    @JsonProperty("total_pages")
    private Integer totalPages;

    @JsonProperty("results")
    private List<MovieResponse> results; // Liste de MovieResponse
}

