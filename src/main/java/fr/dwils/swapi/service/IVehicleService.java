package fr.dwils.swapi.service;

import fr.dwils.swapi.model.Vehicle;

import java.util.List;

public interface IVehicleService {
    List<Vehicle> getAllVehicles();

    Vehicle getVehicleById(Long id);

    Vehicle saveVehicle(Vehicle vehicle);

    void deleteVehicle(Long id);
}
