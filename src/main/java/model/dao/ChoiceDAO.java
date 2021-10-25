package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.entity.Choice;
import util.DbUtil;

public class ChoiceDAO {
public List<Choice> findAll() throws SQLException,ClassNotFoundException{
		
		//取り出すsqlのセット
		String sql ="SELECT * FROM choice";
		//データのリスト化
		List <Choice>list = new ArrayList<Choice>();
		//BDへの接続
		Connection connection = DbUtil.connect();
		//帰ってきたデータの異常を確認
		Statement statement = connection.createStatement();
		//sqlから指定したSELECT文を習得
		ResultSet resultSet = statement.executeQuery(sql);
		
		while(resultSet.next()) {
			Choice choice = new Choice();
			
			choice.setId(resultSet.getInt("Id"));
			choice.setShindan(resultSet.getString("shindan"));
			choice.setQuestion(resultSet.getString("Question"));
			
			list.add(choice);
		}
		resultSet.close();
		statement.close();
		connection.close();
		return list;
	}
}


}
