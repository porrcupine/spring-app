package com.sk.springapp.service;

import com.sk.springapp.dto.Person;

public interface PersonService {

    Person getByName(String name, String surname);
}
