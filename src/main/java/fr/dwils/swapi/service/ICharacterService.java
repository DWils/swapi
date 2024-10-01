package fr.dwils.swapi.service;

import fr.dwils.swapi.dto.response.CharacterResponse;
import fr.dwils.swapi.model.Vehicle;

import java.util.List;

public interface ICharacterService {

    List<CharacterResponse> getAllCharacter();
}
