package test.java.bts;

import java.awt.Choice;
import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import model.dao.ChoiceDAO;

public class Choicetest {
	@Test
	public void test() throws SQLException,ClassNotFoundException{ 
		ChoiceDAO dao = new ChoiceDAO();
		List<Choice>list = dao.findAll();
		
		for(Choice choice:list) {
			System.out.print(choice.getId() + " " + choice.getChoice());
		}
	}	
}
	
