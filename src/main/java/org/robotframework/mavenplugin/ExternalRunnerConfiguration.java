package org.robotframework.mavenplugin;


import java.util.Map;

public class ExternalRunnerConfiguration {

    /**
     * Environment variables for the new runner process.
     */
    private Map<String, String> environmentVariables;

    public Map<String, String> getEnvironmentVariables() {
        return environmentVariables;
    }
}