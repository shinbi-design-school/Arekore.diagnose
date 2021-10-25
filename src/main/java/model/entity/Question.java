package model.entity;

public class Question {
	private int Id;
	private int ShindanId;
	private String Question;
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getShindanId() {
		return ShindanId;
	}
	public void setShindanId(int shindanId) {
		ShindanId = shindanId;
	}
	
	

}
