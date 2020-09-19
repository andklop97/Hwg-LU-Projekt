package FussballShop.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 

import de.hwg_lu.bw.jdbc.NoConnectionException;
import de.hwg_lu.bw.jdbc.PostgreSQLAccess;

public class RegBean {

	public RegBean() throws NoConnectionException {
		// TODO Auto-generated constructor stub
		Dbconn=new PostgreSQLAccess().getConnection();
	}
	 String userid;
     String password;
    
     String email;
      
     
     
	Connection Dbconn;
	
	
	
	
	
	
	public boolean checkAccountExists() throws SQLException {
		String sql="Select userid FROM account WHERE userid= ?";
		System.out.println(sql);
		PreparedStatement myStat = this.Dbconn.prepareStatement(sql);
		myStat.setString(1, this.getUserid());
		ResultSet dbRes= myStat.executeQuery();
		return dbRes.next();
		
	}
	
	

	

	
	public void insertAccountNoCheck() throws SQLException {
		String sql="INSERT INTO account " + 
	"(  USERID, EMAIL ,PASSWORD) " + 
				"VALUES (?,?,?)";
		System.out.println(sql);
		
		PreparedStatement myStat=this.Dbconn.prepareStatement(sql);
	     myStat.setString(1, this.getUserid());  
	     myStat.setString(3, this.getPassword());
	     myStat.setString(2, this.getEmail());
	     myStat.executeUpdate();
	}
	
	
	public void prepareAttributesForDB() {
		
		if(userid.length()>16) userid= userid.substring(0, 16);
		if(password.length()>32) password=password.substring(0, 32);
		
		if(email.length()>256) email=email.substring(0, 256);
		
		
	}
	
	public boolean insertAccountIfNotExists() throws SQLException{
		this.prepareAttributesForDB();
		
	if(!this.checkAccountExists()) {
		this.insertAccountNoCheck();
		return true;
	}
	else return false;
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
   

	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}
