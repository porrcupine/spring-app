package com.sk.springapp.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Sergey Kuzhel
 */
@Component
@ConfigurationProperties("application")
@Getter
@Setter
public class ApplicationSettings {
    private String version;
    private boolean loadMockData;
}
