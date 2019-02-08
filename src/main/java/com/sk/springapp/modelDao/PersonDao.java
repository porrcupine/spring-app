package com.sk.springapp.modelDao;

import com.sk.springapp.dto.Person;

public interface PersonDao {

    Person findByName(String name, String surname);
}
