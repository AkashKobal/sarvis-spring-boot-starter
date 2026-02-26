package io.github.akashkobal.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "sarvis")
public class SarvisProperties {

    /**
     * Sarvam API key used by Sarvis internally
     */
    private String apiKey;

    /**
     * Sarvam base URL
     */
    private String baseUrl = "https://api.sarvam.ai/v1";

    /**
     * Default Sarvam model
     */
    private String model = "sarvam-m";

    public SarvisProperties() {}

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}