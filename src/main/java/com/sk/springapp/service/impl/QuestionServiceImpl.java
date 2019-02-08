package com.sk.springapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sk.springapp.dto.Question;
import com.sk.springapp.modelDao.QuestionDao;
import com.sk.springapp.service.QuestionService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Sergey Kuzhel
 */
@Service
public class QuestionServiceImpl implements QuestionService {
    private  List<Question> questions;
    private  QuestionDao dao;
    private  List<String> answers = new ArrayList<String>() ;

    @Autowired
    public QuestionServiceImpl(QuestionDao questionDao) {
        this.dao = questionDao;
    }

    public void askAnswers() {
        System.out.println("Hello give us a couple of answers");
        Scanner sc = new Scanner(System.in);
        String answer;
        questions = dao.makeQuestions();
        for (Question q : questions) {
            System.out.println(q.getText());
            answer = sc.nextLine();
            answers.add(answer);
        }
        sc.close();
    }

    public void showAnswers() {
        System.out.println("test result: ");
        System.out.println(answers);
    }
}
