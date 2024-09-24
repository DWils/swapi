package fr.dwils.swapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Species {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String classification;
    private String designation;
    private String averageHeight;
    private String averageLifespan;
    private String eyeColors;
    private String hairColors;
    private String skinColors;
    private String language;

    @ManyToOne
    @JoinColumn(name = "homeworld_id")
    private Planet homeworld;

    @ManyToMany(mappedBy = "species")
    private List<Character> people;
}
