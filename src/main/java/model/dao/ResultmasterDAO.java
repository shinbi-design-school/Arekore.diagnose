package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.entity.Question;
import model.entity.Resultmaster;
import util.DbUtil;

public class ResultmasterDAO {
     
public List<Resultmaster> findAll() throws SQLException,ClassNotFoundException{
		
		//取り出すsqlのセット
		String sql ="SELECT * FROM resultmaster";
		//データのリスト化
		List <Resultmaster>list = new ArrayList<Resultmaster>();
		//BDへの接続
		Connection connection = DbUtil.connect();
		//帰ってきたデータの異常を確認
		Statement statement = connection.createStatement();
		//sqlから指定したSELECT文を習得
		ResultSet resultSet = statement.executeQuery(sql);
		
		while(resultSet.next()) {
			Question question = new Question();
			
			question.setId(resultSet.getInt("Id"));
			question.setShindanId(resultSet.getInt("shindanId"));
			question.setResultmaster(resultSet.getString("Resultmaster"));
			
			list.add(question);
		}
		resultSet.close();
		statement.close();
		connection.close();
		return list;
	}
}
