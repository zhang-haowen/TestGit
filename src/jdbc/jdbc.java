package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		//�������ݿ�
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/shengchanshixi?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC",
					"root",
					"123456"
					);
			//��ȡSTATEMENT,ͨ��statement��ȡsql���
			Statement statement = connection.createStatement();
			statement.execute("INSERT INTO student (name,age,school_name) VALUE('jdbc',20,'�ӱ���ó��ѧ')");
			//�ر�����
			statement.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        		
	}

}
