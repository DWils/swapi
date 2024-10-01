package fr.dwils.swapi.controller;

import fr.dwils.swapi.dto.response.CharacterResponse;
import fr.dwils.swapi.service.ICharacterService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api/character")
public class CharacterController {

    private final ICharacterService characterService;

    public CharacterController(ICharacterService characterService){
        this.characterService = characterService;
    }

    @GetMapping
    public ResponseEntity<List<CharacterResponse>> getAllCharacters() {
        List<CharacterResponse> characters = characterService.getAllCharacter();
        return ResponseEntity.ok(characters);
    }

}
