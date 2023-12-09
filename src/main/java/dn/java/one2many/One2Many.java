package dn.java.one2many;

import java.util.List;

public class One2Many {

  Question125 question = new Question125();

  public One2Many() {

    question.setText("What is the meaning of life?");

    Answer125 a1 = new Answer125();
    a1.setText("The answer is 1.");
    a1.setQuestion(question);

    Answer125 a2 = new Answer125();
    a2.setText("The answer is 2.");
    a2.setQuestion(question);

    Answer125 a3 = new Answer125();
    a3.setText("The answer is 3.");
    a3.setQuestion(question);

    Answer125 a4 = new Answer125();
    a4.setText("The answer is 4.");
    a4.setQuestion(question);

    question.setAnswer(List.of(a1, a2, a3, a4));

  }

  public Question125 getQuestion() {
    return question;
  }

}
