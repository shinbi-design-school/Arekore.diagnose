package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.entity.Question;
import util.DbUtil;

public class QuestionDAO {
     
public List<Question> findAll() throws SQLException,ClassNotFoundException{
		
		//取り出すsqlのセット
		String sql ="SELECT * FROM question";
		//データのリスト化
		List <Question>list = new ArrayList<Question>();
		//BDへの接続
		Connection connection = DbUtil.connect();
		//帰ってきたデータの異常を確認
		Statement statement = connection.createStatement();
		//sqlから指定したSELECT文を習得
		ResultSet resultSet = statement.executeQuery(sql);
		
		while(resultSet.next()) {
			Question question = new Question();
			
			question.setId(resultSet.getInt("Id"));
			question.setShindan(resultSet.getString("Shindan"));
			question.setQuestion(resultSet.getString("Question"));
			
			list.add(question);
		}
		resultSet.close();
		statement.close();
		connection.close();
		return list;
	}
}
