package com.sk.springapp;

import com.sk.springapp.configuration.ApplicationSettings;
import com.sk.springapp.service.impl.MockDataLoader;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringAppApplicationTests {

    @Autowired
    private ApplicationSettings settings;

    @Autowired
    private MockDataLoader mockDataLoader;

    @Test
	public void contextLoads() {
        String s = "TEST";
        System.out.println(s);
        Assert.assertTrue(!s.isEmpty());
	}

	@Test
    public void appSettingsTest() {
	    Assert.assertTrue(settings.isLoadMockData());
	    Assert.assertEquals(settings.getVersion(), "1.0");
    }

    @Test
    public void mockDataLoaderTest() {
        Assert.assertNotNull(mockDataLoader.isLoadMockData());
    }

}

