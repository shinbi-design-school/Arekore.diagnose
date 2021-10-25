package test.java.bts;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import model.dao.ShindanDAO;
import model.entity.Shindan;

public class Shindantest {
	@Test
	public void test() throws SQLException,ClassNotFoundException{ 
		ShindanDAO dao = new ShindanDAO();
		List<Shindan>list = dao.findAll();
		
		for(Shindan shindan:list) {
			System.out.print(Shindan.getId() + " " + shindan.getShindan());
		}
	}	
}
