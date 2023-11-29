package com.game.models.resources;

import com.game.util.ConfigurationManager;
import java.util.HashMap;
import java.util.Map;

public class ResourceManager {
    private ConfigurationManager configManager = new ConfigurationManager();
    private Map<String, Resource> resources = new HashMap<>();

    public ResourceManager() {
        initializeResources();
    }

    private void initializeResources() {
        resources.put("Gold", createResource("Gold"));
        resources.put("Food", createResource("Food"));
        resources.put("Wood", createResource("Wood"));
        resources.put("Stone", createResource("Stone"));
        resources.put("Coal", createResource("Coal"));
        resources.put("Iron", createResource("Iron"));
        resources.put("Steel", createResource("Steel"));
        resources.put("Cement", createResource("Cement"));
        resources.put("Lumber", createResource("Lumber"));
        resources.put("Tools", createResource("Tools"));
    }

    private Resource createResource(String resourceName) {
        int initialAmount = configManager.getInitialAmount(resourceName);
        return new Resource(resourceName, initialAmount);
    }

    public void addResource(String resourceName) {

    }
}


