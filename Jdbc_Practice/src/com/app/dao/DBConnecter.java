package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnecter {
	public static Connection getConnection() {
		// Connection 객체 초기
		Connection conn = null;

		try {
			// 오라클 사용자 이름
			String userName = "hr";
			// 오라클 비밀번호
			String userPassword = "1234";
			// 오라클 주소
			String url = "jdbc:oracle:thin:@localhost:1521:XE";

			// 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDrvier");
			// Connection 객체를 드라이버매니저를 통해 얻어온다
			conn = DriverManager.getConnection(url, userName, userPassword);
			System.out.println("연결 성공!!");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("연결 정보 오류!");
			e.printStackTrace();
		}
		return conn;
	}
}
