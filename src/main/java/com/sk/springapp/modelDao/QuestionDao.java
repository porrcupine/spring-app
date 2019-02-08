package com.sk.springapp.modelDao;

import com.sk.springapp.dto.Question;

import java.util.List;

/**
 * @author Sergey Kuzhel
 */
public interface QuestionDao {
    List<Question> makeQuestions();
}
