package com.sk.springapp.modelDao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import com.sk.springapp.dto.Person;

@Repository("personDao")
public class PersonDaoSimple implements PersonDao {
    private int defaultAge;

    @Value("28")
    public void setDefaultAge(int defaultAge) {
        this.defaultAge = defaultAge;
    }

    public Person findByName(String name, String surname) {
        return new Person(name, surname, defaultAge);
    }

}
