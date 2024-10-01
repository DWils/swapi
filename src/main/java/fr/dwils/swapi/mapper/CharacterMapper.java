package fr.dwils.swapi.mapper;

import fr.dwils.swapi.dto.response.CharacterResponse;
import fr.dwils.swapi.model.Character;

public class CharacterMapper {

    public static CharacterResponse toCharacterResponse(Character character) {
        CharacterResponse response = new CharacterResponse();
        response.setName(character.getName());
        response.setHeight(character.getHeight());
        response.setMass(character.getMass());
        response.setHairColor(character.getHairColor());
        response.setSkinColor(character.getSkinColor());
        response.setEyeColor(character.getEyeColor());
        response.setBirthYear(character.getBirthYear());
        response.setGender(character.getGender());
        response.setHomeworldName(character.getHomeworld() != null ? character.getHomeworld().getName() : null);
        return response;
    }
}
