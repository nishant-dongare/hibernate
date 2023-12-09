package dn.java.one2many;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question125 {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String text;

  @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Answer125> answer;

  public Question125(Long id, String text, List<Answer125> answer) {
    this.id = id;
    this.text = text;
    this.answer = answer;
  }

  public Question125() {
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

  public List<Answer125> getAnswer() {
    return answer;
  }

  public void setAnswer(List<Answer125> list) {
    this.answer = list;
  }

}
