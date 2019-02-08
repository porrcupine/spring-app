package com.sk.springapp.service.impl;

import com.sk.springapp.configuration.ApplicationSettings;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Sergey Kuzhel
 */
@Service
@Getter
@Setter
public class MockDataLoader {
    private final boolean loadMockData;

    @Autowired
    public MockDataLoader(ApplicationSettings settings) {
        this.loadMockData = settings.isLoadMockData();
    }

}
