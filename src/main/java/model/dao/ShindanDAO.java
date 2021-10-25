package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.entity.Shindan;
import util.DbUtil;

public class ShindanDAO {
     
public List<Shindan> findAll() throws SQLException,ClassNotFoundException{
		
		//取り出すsqlのセット
		String sql ="SELECT * FROM question";
		//データのリスト化
		List <Shindan>list = new ArrayList<Shindan>();
		//BDへの接続
		Connection connection = DbUtil.connect();
		//帰ってきたデータの異常を確認
		Statement statement = connection.createStatement();
		//sqlから指定したSELECT文を習得
		ResultSet resultSet = statement.executeQuery(sql);
		
		while(resultSet.next()) {
			Shindan shindan = new Shindan();
			
			shindan.setId(resultSet.getInt("Id"));
			shindan.setShindan(resultSet.getString("Shindan"));
			
			list.add(shindan);
		}
		resultSet.close();
		statement.close();
		connection.close();
		return list;
	}
}
