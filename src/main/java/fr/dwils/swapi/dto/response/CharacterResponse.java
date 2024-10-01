package fr.dwils.swapi.dto.response;

import lombok.Data;

import java.util.UUID;

@Data
public class CharacterResponse {
    private UUID characterId;
    private String name;
    private int height;
    private int mass;
    private String hairColor;
    private String skinColor;
    private String eyeColor;
    private String birthYear;
    private String gender;
    private String homeworldName;  // Remplacer la relation par un nom simple
}
