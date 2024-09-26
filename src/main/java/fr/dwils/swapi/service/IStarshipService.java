package fr.dwils.swapi.service;

import fr.dwils.swapi.model.Starship;
import fr.dwils.swapi.repository.StarshipRepository;

import java.util.List;

public interface IStarshipService {

    List<Starship> getAllStarships();

    Starship getStarshipById(Long id);

    Starship saveStarship(Starship starship);

    void deleteStarship(Long id);

}
