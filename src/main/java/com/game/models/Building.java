package com.game.models;

public class Building {
    private String name;
    private int initialWorkers;
    private int currentWorkers;
    private int maxWorkers;
    private int productionRate;
    private int constructionCost;
    private int constructionTime;
    private int minResidents;
    private int maxResidents;

    public Building(String name, int initialWorkers, int maxWorkers, int productionRate,
                    int constructionCost, int constructionTime, int minResidents, int maxResidents) {
        this.name = name;
        this.initialWorkers = initialWorkers;
        this.currentWorkers = initialWorkers;
        this.maxWorkers = maxWorkers;
        this.productionRate = productionRate;
        this.constructionCost = constructionCost;
        this.constructionTime = constructionTime;
        this.minResidents = minResidents;
        this.maxResidents = maxResidents;
    }

    public String getName() {
        return name;
    }

    public int getInitialWorkers() {
        return initialWorkers;
    }

    public int getCurrentWorkers() {
        return currentWorkers;
    }

    public void setCurrentWorkers(int currentWorkers) {
        this.currentWorkers = currentWorkers;
    }

    public int getMaxWorkers() {
        return maxWorkers;
    }

    public int getProductionRate() {
        return productionRate;
    }

    public int getConstructionCost() {
        return constructionCost;
    }

    public int getConstructionTime() {
        return constructionTime;
    }

    public int getMinResidents() {
        return minResidents;
    }

    public int getMaxResidents() {
        return maxResidents;
    }
}

