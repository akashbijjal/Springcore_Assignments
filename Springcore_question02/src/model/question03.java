package model;

import java.util.List;
import java.util.Map;

public class question03 {
	private int questionid;
	private String question;
	private Map<Integer, String> answer;
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
	public Map<Integer, String> getAnswer() {
		return answer;
	}
	public void setAnswer(Map<Integer, String> answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "question03 [questionid=" + questionid + ", question=" + question + ", answer=" + answer + "]";
	}
	public void question03()
	{
		System.out.println(getQuestionid()+" "+getQuestion()+" "+getAnswer());
	}
	
	
	
}
