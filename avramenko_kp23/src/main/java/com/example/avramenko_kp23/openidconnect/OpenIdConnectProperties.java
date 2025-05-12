package com.example.avramenko_kp23.openidconnect;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "openidconnect")
public class OpenIdConnectProperties {
    private String openIdConnectEndpoint;
    private String openIdConnectClientId;
    private String openIdConnectClientSecret;

    public String getOpenIdConnectEndpoint() {
        return openIdConnectEndpoint;
    }

    public void setOpenIdConnectEndpoint(String openIdConnectEndpoint) {
        this.openIdConnectEndpoint = openIdConnectEndpoint;
    }

    public String getOpenIdConnectClientId() {
        return openIdConnectClientId;
    }

    public void setOpenIdConnectClientId(String openIdConnectClientId) {
        this.openIdConnectClientId = openIdConnectClientId;
    }

    public String getOpenIdConnectClientSecret() {
        return openIdConnectClientSecret;
    }

    public void setOpenIdConnectClientSecret(String openIdConnectClientSecret) {
        this.openIdConnectClientSecret = openIdConnectClientSecret;
    }
}
