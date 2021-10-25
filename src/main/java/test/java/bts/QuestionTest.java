package test.java.bts;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import model.dao.QuestionDAO;
import model.entity.Question;

public class Questiontest {
	@Test
	public void test() throws SQLException,ClassNotFoundException{ 
		QuestionDAO dao = new QuestionDAO();
		List<Question>list = dao.findAll();
		
		for(Question question:list) {
			System.out.print(question.getId() + " " + question.getQuestion());
		}
	}	
}
