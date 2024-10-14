package fr.dwils.swapi.service.impl;


import fr.dwils.swapi.dto.response.CharacterResponse;
import fr.dwils.swapi.dto.response.MovieResponse;
import fr.dwils.swapi.mapper.CharacterMapper;
import fr.dwils.swapi.model.Character;
import fr.dwils.swapi.repository.CharacterRepository;
import fr.dwils.swapi.service.ICharacterService;
import fr.dwils.swapi.service.IMovieService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CharacterService implements ICharacterService {

    private final IMovieService movieService;
    private final CharacterRepository characterRepository;

    public CharacterService(IMovieService movieService, CharacterRepository characterRepository) {
        this.movieService = movieService;
        this.characterRepository = characterRepository;
    }

    @Override
    public List<CharacterResponse> getAllCharacter() {
        // Votre logique pour récupérer les personnages
        List<Character> characters = characterRepository.findAll(); // Remplacez par votre méthode de récupération des personnages

        return characters.stream()
                .map(character -> {
                    CharacterResponse response = CharacterMapper.toCharacterResponse(character);
                    // Ici, vous pouvez appeler movieService.searchMoviesByTitles pour obtenir les films
                    List<MovieResponse> movies = movieService.searchMoviesByTitles(character.getMovieTitles());
                    response.setMovies(movies);
                    return response;
                })
                .collect(Collectors.toList());
    }
}

