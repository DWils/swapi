package fr.dwils.swapi.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Starship extends Vehicle {

    private String hyperdriveRating;
    private String mglt; // MGLT: Distance parcourue par heure en mégalight par un vaisseau
}
