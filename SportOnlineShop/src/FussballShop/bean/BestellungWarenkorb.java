package FussballShop.bean;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import de.hwg_lu.bw.jdbc.PostgreSQLAccess;

public class BestellungWarenkorb {
	
	public void addBestellung (int anr, String aname, BigDecimal preis) throws SQLException {
		
		String sql="insert into bestellung (anr, aname, preis) values( ?, ?, ?) " ; 
		System.out.println(sql);
		Connection dbConn= new PostgreSQLAccess().getConnection() ; 
		PreparedStatement prep = dbConn.prepareStatement(sql) ; 
		prep.setInt(1, anr);
		prep.setString(2, aname);
		prep.setBigDecimal(3, preis) ;
		prep.executeUpdate();
		
		
	}

}
