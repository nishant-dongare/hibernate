package dn.java.one2one;

public class One2One {

  Question question = new Question();

  public One2One() {

    question.setText("What is the meaning of life?");

    Answer a1 = new Answer();
    a1.setText("The answer is 1.");
    a1.setQuestion(question);

    question.setAnswer(a1);

  }

  public Question getQuestion() {
    return question;
  }

}
