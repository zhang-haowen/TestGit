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
		//�������ݿ�
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {
			Connection connection = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/shengchanshixi?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC",
					"root",
					"123456"
					);
			//��ȡSTATEMENT,ͨ��statement��ȡsql���
			String sql = "select * from student where school_name like ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			//���ò���
			preparedStatement.setString(1, "%��ó%");
			//ִ�в�ѯ����
			//executeQueryִ�в�ѯ
			ResultSet rs = preparedStatement.executeQuery();
			//ResultSetͨ�����������б���
			while (rs.next()) {
				System.out.print(rs.getString("name")+" ");
				System.out.print(rs.getInt("age")+" ");
				System.out.print(rs.getString("school_name")+" ");
				System.out.print("\n");
			}
			//�ر�����
			rs.close();
			preparedStatement.close();
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        		
	}

}
