package fr.dwils.swapi.service.impl;

import fr.dwils.swapi.model.Starship;
import fr.dwils.swapi.repository.StarshipRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StarshipService {

    private final StarshipRepository starshipRepository;

    public StarshipService(StarshipRepository starshipRepository) {
        this.starshipRepository = starshipRepository;
    }

    public List<Starship> getAllStarships() {
        return starshipRepository.findAll();
    }

    public Starship getStarshipById(Long id) {
        return starshipRepository.findById(id).orElse(null);
    }

    public Starship saveStarship(Starship starship) {
        return starshipRepository.save(starship);
    }

    public void deleteStarship(Long id) {
        starshipRepository.deleteById(id);
    }
}

