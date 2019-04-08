package com.myform.webform.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String questionText;

    @Enumerated(value = EnumType.STRING)
    private QuestionType questionType;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "question")
    private Set<PossibleAnswer> possibleAnswers;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "question")
    private Set<Answer> answers;

    @ManyToOne
    private WebForm webForm;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public Set<PossibleAnswer> getPossibleAnswers() {
        return possibleAnswers;
    }

    public void setPossibleAnswers(Set<PossibleAnswer> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    public WebForm getWebForm() {
        return webForm;
    }

    public void setWebForm(WebForm webForm) {
        this.webForm = webForm;
    }

    public Set<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(Set<Answer> answers) {
        this.answers = answers;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }
}
