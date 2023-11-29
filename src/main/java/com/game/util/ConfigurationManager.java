package com.game.util;

import com.game.models.resources.Resource;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ConfigurationManager {
    private static final String CONFIG_FILE = "config.properties";
    private Properties properties;
    private ArrayList<String> buildingPropertiesName = new ArrayList<String>(Arrays.asList("initialResidents", "initialWorkers", "constructionCost", "constructionMaterials", "consumption", "production", "constructionTime", "foodConsumption"));

    public ConfigurationManager() {
        loadConfig();
    }

    private void loadConfig() {
        properties = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream(CONFIG_FILE)) {
            if (input == null) {
                System.out.println("Sorry, unable to find " + CONFIG_FILE);
                return;
            }
            properties.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getInitialAmount(String resourceName) {
        String propertyKey = "initial" + resourceName + "Amount";
        return Integer.parseInt(properties.getProperty(propertyKey, "0"));
    }

    public Map<String, String> getBuildingProperties(String buildingName) {
        Map<String, String> buildingProperties = new HashMap<>();
        for (String propertyName : buildingPropertiesName) {
            buildingProperties.put(propertyName, properties.getProperty(buildingName + "." + propertyName));
        }
        return buildingProperties;
    }

}
