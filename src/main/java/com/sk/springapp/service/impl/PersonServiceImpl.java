package com.sk.springapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sk.springapp.dto.Person;
import com.sk.springapp.modelDao.PersonDao;
import com.sk.springapp.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

    private PersonDao dao;

    @Autowired
    public PersonServiceImpl(PersonDao dao) {
        this.dao = dao;
    }

//    public void setDao(PersonDao modelDao) {
//        this.modelDao = modelDao;
//    }

    public Person getByName(String name, String surname) {
        return dao.findByName(name, surname);
    }
}
