package com.sk.springapp;

import com.sk.springapp.dto.Person;
import com.sk.springapp.service.PersonService;
import com.sk.springapp.service.QuestionService;
import org.springframework.context.ApplicationContext;

/**
 * @author Sergey Kuzhel
 */

//TODO VERY VERY BAD PRACTICE
public class CmdApplicationRunner {

    public CmdApplicationRunner(ApplicationContext ctx) {
        PersonService ps = ctx.getBean(PersonService.class);
        QuestionService qs = ctx.getBean(QuestionService.class);
        Person ivan = ps.getByName("ivan", "petrov");
		System.out.println("name: " + ivan.getName() + " surname: " + ivan.getSurname() + " age: " + ivan.getAge());
		qs.askQuestions();
		qs.showAnswers();
    }
}
