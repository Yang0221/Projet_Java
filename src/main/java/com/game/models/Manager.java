package com.game.models;

import com.game.models.resources.Resource;
import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Building> buildings;
    private List<Resource> resources;

    public Manager() {
        buildings = new ArrayList<>();
        resources = new ArrayList<>();
        // Initialize buildings and resources as per your game requirements
    }

    public void addBuilding(Building building) {
        buildings.add(building);
    }

    public void removeBuilding(Building building) {
        buildings.remove(building);
    }

    public void addWorker(Building building) {
        if (building.getCurrentWorkers() < building.getMaxWorkers()) {
            building.setCurrentWorkers(building.getCurrentWorkers() + 1);
        }
    }

    public void removeWorker(Building building) {
        if (building.getCurrentWorkers() > 0) {
            building.setCurrentWorkers(building.getCurrentWorkers() - 1);
        }
    }

    public void update() {
        // Implement resource production and consumption logic here
        // Update the game state
    }
}
