package fr.dwils.swapi.repository;

import fr.dwils.swapi.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    // Méthodes spécifiques à Vehicle
}

