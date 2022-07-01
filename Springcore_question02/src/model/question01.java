package model;

import java.util.List;
import java.util.Set;

public class question01 {
	private int questionid;
	private String question;
	private Set<String> answer;
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
	public Set<String> getAnswer() {
		return answer;
	}
	public void setAnswer(Set<String> answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "question01 [questionid=" + questionid + ", question=" + question + ", answer=" + answer + "]";
	}
	
	public void question01()
	{
		System.out.println(getQuestionid()+" "+getQuestion()+" "+getAnswer());
	}
	
}
