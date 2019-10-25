package com.shilpa;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Questions {

	int questionId;
	String question;
	 List<String> answers;
	
	public Questions(){
		
	}
	

	public List<String> getAnswers() {
		return answers;
	}


	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}


	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	
	public void displayInfo(){  
	    System.out.println("question id:"+questionId);  
	    System.out.println("question name:"+question);  
	    System.out.println("Answers for questions");  
	    for (String ans : answers) {
			System.out.println(ans);
		}

	}
}
