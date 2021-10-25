package test.java.bts;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

public class Resultmastertest {
	@Test
	public void test() throws SQLException,ClassNotFoundException{ 
		ResultmasterDAO dao = new ResultmasterDAO();
		List<Resultmaster>list = dao.findAll();
		
		for(Resultmaster resultmaster:list) {
			System.out.print(resultmaster.getId() + " " + resultmaster.getResultmaster());
		}
	}	
}
