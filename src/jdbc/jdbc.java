package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		//链接数据库
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/shengchanshixi?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC",
					"root",
					"123456"
					);
			//获取STATEMENT,通过statement获取sql语句
			Statement statement = connection.createStatement();
			statement.execute("INSERT INTO student (name,age,school_name) VALUE('jdbc',20,'河北经贸大学')");
			//关闭连接
			statement.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        		
	}

}
