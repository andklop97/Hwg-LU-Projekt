//package de.hwg_lu.bw.jdbc;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class AppInstallAccountTable {
////	JAR-File nicht vergessen!
////	https://jdbc.postgresql.org/download.html
//	
//	Connection dbConn; // ist erst mal null :-(
//	
//	public static void main(String[] args) throws SQLException {
//		AppInstallAccountTable myAppl = new AppInstallAccountTable();
//		myAppl.dbConn = new PostgreSQLAccess().getConnection();
//		myAppl.installAccountTable();
//	}
//	
//	public void installAccountTable() throws SQLException{
////		System.out.println(this.dbConn);
////		this.dropAccountTable();
////		this.createAccountTable();
////		this.deleteAllAccounts();
////		this.insertAccountsHardCoded();
////		this.insertOneAccountPrepared();
////		this.insertManyAccountsPrepared();
//		this.showAllAccounts();
//	}
//	
//	public void showAllAccounts() throws SQLException{
//		String sql = "select userid, password, active, admin, username, email from account";
//		System.out.println(sql);
//		Statement stat = this.dbConn.createStatement();
//		ResultSet dbRes = stat.executeQuery(sql);
//		while(dbRes.next()){
//			String userid   = dbRes.getString("userid");
////			String userid   = dbRes.getString(1); w�rde auch gehen
//			String password = dbRes.getString("password").trim();
//			String active   = dbRes.getString("active");
//			String admin    = dbRes.getString("admin");
//			String username = dbRes.getString("username");
//			String email    = dbRes.getString("email");
//			//lesen
//			//schreiben
//			System.out.print(userid);
//			System.out.print(password);
//			System.out.print(active);
//			System.out.print(admin);
//			System.out.print(username);
//			System.out.println(email);
//		}
//	}
//
//	public void deleteAllAccounts() throws SQLException{
//		String sql = "DELETE FROM account";
//		System.out.println(sql);
//		this.dbConn.createStatement().executeUpdate(sql);
//		System.out.println("Tabelle account wurde erfolgreich geleert");
//	}
//	public void insertManyAccountsPrepared() throws SQLException{
//		String sql = "insert into account "
//				+ "(userid, password, active, admin, username, email) "
//				+ "values "
//				+ "(?, ?, ?, ?, ?, ?)";
//		System.out.println(sql);
//		PreparedStatement prep = this.dbConn.prepareStatement(sql);
//		for(int accNum = 4; accNum <= 6; accNum++){
//			prep.setString(1, "testus" + accNum);
//			prep.setString(2, "geheim");
//			prep.setString(3, "Y");
//			prep.setString(4, "N");
//			prep.setString(5, "Testuser " + accNum);
//			prep.setString(6, "testus" + accNum + "@test.de");
//			prep.executeUpdate();
//			System.out.println("testus" + accNum + " erfolgreich angelegt");
//		}
//	}
//	public void insertOneAccountPrepared() throws SQLException{
//		String sql = "insert into account "
//				+ "(userid, password, active, admin, username, email) "
//				+ "values "
//				+ "(?, ?, ?, ?, ?, ?)";
//		System.out.println(sql);
//		PreparedStatement prep = this.dbConn.prepareStatement(sql);
//		
//		prep.setString(1, "testus3");
//		prep.setString(2, "geheim");
//		prep.setString(3, "Y");
//		prep.setString(4, "N");
//		prep.setString(5, "Testuser 3");
//		prep.setString(6, "testus3@test.de");
//		prep.executeUpdate();
//		System.out.println("testus3 erfolgreich angelegt");
//		
//	}
//	public void insertAccountsHardCoded() throws SQLException{
//		String sql = "insert into account "
//				+ "(userid, password, active, admin, username, email) "
//				+ "values "
//				+ "('testus1', 'geheim', 'Y', 'N', 'Testuser 1123456', 'testus1@test.de'),"
//				+ "('testus2', 'geheim', 'Y', 'N', 'Testuser 2', 'testus2@test.de')";
//		System.out.println(sql);
//		Statement myStat = this.dbConn.createStatement();
//		int numOfRowsAffected = myStat.executeUpdate(sql);
//		System.out.println(numOfRowsAffected);
//		System.out.println("testus1 und testus2 erfolgreich angelegt");
//	}
//	public void dropAccountTable() throws SQLException{
//		String sql = "drop table account";
//		System.out.println(sql);
//		this.dbConn.createStatement().executeUpdate(sql);
//		System.out.println("Tabelle account wurde erfolgreich gedropped");
//	}
//	public void createAccountTable() throws SQLException{
//		String sql = "create table account("
//					+    "userid    char(16)     not null primary key  ,"
//					+ 	 "password  char(32)     not null              ,"
//					+ 	 "active    char(1)      not null default 'Y'  ,"
//					+ 	 "admin     char(1)      not null default 'N'  ,"
//					+	 "username  varchar(512)                       ,"
//					+	 "email     varchar(256)"
//					+ " )";
//		System.out.println(sql);
//		Statement myStat = this.dbConn.createStatement();
//		myStat.executeUpdate(sql);
//		System.out.println("Tabelle account wurde erfolgreich angelegt");
//		
//	}
//
//}
