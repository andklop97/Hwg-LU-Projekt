package FussballShop.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import de.hwg_lu.bw.jdbc.NoConnectionException;
import de.hwg_lu.bw.jdbc.PostgreSQLAccess;

public class anmeldenBean {
	String userid;
	String password;
	boolean isLoggedIn;
	Connection dbcon;
	public anmeldenBean() throws NoConnectionException {
		// TODO Auto-generated constructor stub
		this.password="";
		this.userid="";
		this.isLoggedIn=false;
		this.dbcon= new PostgreSQLAccess().getConnection();
	}

	public boolean checkUseridPassword() throws SQLException {
		String sql="Select userid from account where userid= ? and password= ?";
		System.out.println(sql);
		PreparedStatement prep=this.dbcon.prepareStatement(sql);
		prep.setString(1, this.userid);
		prep.setString(2, this.password);
		ResultSet ret= prep.executeQuery();
		return ret.next();
		
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isLoggedIn() {
		return isLoggedIn;
	}
	public void setLoggedIn(boolean isLoggedIn) {
		this.isLoggedIn = isLoggedIn;
	}
}
