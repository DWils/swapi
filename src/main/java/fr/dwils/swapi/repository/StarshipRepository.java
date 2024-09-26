package fr.dwils.swapi.repository;

import fr.dwils.swapi.model.Starship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StarshipRepository extends JpaRepository<Starship, Long> {
    // Méthodes spécifiques à Starship
}
