package dn.java.one2many;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Answer125 {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String text;

  @ManyToOne
  @JoinColumn(name = "question_id")
  private Question125 question;

  public Answer125(Long id, String text, Question125 question) {
    this.id = id;
    this.text = text;
    this.question = question;
  }

  public Answer125() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Question125 getQuestion() {
    return question;
  }

  public void setQuestion(Question125 question) {
    this.question = question;
  }

}
