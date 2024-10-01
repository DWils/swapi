package fr.dwils.swapi.service.impl;


import fr.dwils.swapi.dto.response.CharacterResponse;
import fr.dwils.swapi.mapper.CharacterMapper;
import fr.dwils.swapi.model.Character;
import fr.dwils.swapi.repository.CharacterRepository;
import fr.dwils.swapi.service.ICharacterService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CharacterService implements ICharacterService {

    private  final CharacterRepository characterRepository;

    CharacterService(CharacterRepository characterRepository){
        this.characterRepository = characterRepository;
    }

    // Récupérer tous les personnages et les convertir en CharacterResponse
    @Override
    public List<CharacterResponse> getAllCharacter() {
        List<Character> characters = characterRepository.findAll();
        return characters.stream()
                .map(CharacterMapper::toCharacterResponse)
                .collect(Collectors.toList());
    }

}
