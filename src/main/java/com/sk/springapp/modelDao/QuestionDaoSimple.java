package com.sk.springapp.modelDao;

import org.springframework.stereotype.Repository;
import com.sk.springapp.dto.Question;
import com.sk.springapp.service.FileService;
import com.sk.springapp.service.impl.CsvServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergey Kuzhel
 */
@Repository("questionDao")
public class QuestionDaoSimple implements QuestionDao {

    public List<Question> makeQuestions() {
        List<Question> questions = new ArrayList();
        FileService fileService = new CsvServiceImpl();
        for (String q : fileService.read()) {
            questions.add(new Question(q));
        }
        return questions;
    }
}
