package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc02 {

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
			String sql = "select * from student where school_name like ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//设置参数
			preparedStatement.setString(1, "%经贸%");
			//执行查询操作
			//executeQuery执行查询
			ResultSet rs = preparedStatement.executeQuery();
			//ResultSet通过迭代器进行遍历
			while (rs.next()) {
				System.out.print(rs.getString("name")+" ");
				System.out.print(rs.getInt("age")+" ");
				System.out.print(rs.getString("school_name")+" ");
				System.out.print("\n");
			}
			//关闭连接
			rs.close();
			preparedStatement.close();
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        		
	}

}
