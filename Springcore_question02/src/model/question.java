package model;

import java.util.List;

public class question {
	
private int questionid;
private String question;
private List<String> answer;
public int getQuestionid() {
	return questionid;
}
public void setQuestionid(int questionid) {
	this.questionid = questionid;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public List<String> getAnswer() {
	return answer;
}
public void setAnswer(List<String> answer) {
	this.answer = answer;
}
@Override
public String toString() {
	return "question [questionid=" + questionid + ", question=" + question + ", answer=" + answer + "]";
}

public void question()
{
	System.out.println(getQuestionid()+" "+getQuestion()+" "+ getAnswer());
}






}
