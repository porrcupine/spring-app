package com.sk.springapp.shell;

import com.sk.springapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

/**
 * @author Sergey Kuzhel
 */
@ShellComponent
public class QuestionCommands {
    private QuestionService questionService;

    @Autowired
    public QuestionCommands(QuestionService questionService) {
        this.questionService = questionServi   ce;
    }

    @ShellMethod("ask questions")
    public void ask() {
        questionService.askQuestions();
    }

    @ShellMethod("show answers")
    public void show() {
        questionService.showAnswers();
    }

    @ShellMethod("clear answers")
    public void cl() {
        questionService.clearAnswers();
    }


}
