package FussballShop.bean;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import de.hwg_lu.bw.jdbc.PostgreSQLAccess;


public class FussballToGoBean {
	
	Vector <Artikel> FussballSeiteArtikel ;

	public FussballToGoBean() throws SQLException {
		this.FussballSeiteArtikel= new Vector<Artikel>() ; 
		this.getHtmlFromFussballSeiteArtikel() ; 
		
	}
	
	public String getHtmlFromArtikel(){
		String html = "";
		for(Artikel oneArtikel : FussballSeiteArtikel){
			html += oneArtikel.toKaestchen() ;
		}
		return html;
	}
	
	
	public void getHtmlFromFussballSeiteArtikel() throws SQLException {
		String sql= "SELECT anr, aname, preis FROM fussbaelleseite" ; 
		System.out.println(sql);
	    Connection dbConn= new PostgreSQLAccess().getConnection() ; 
	    ResultSet dbRes= dbConn.createStatement().executeQuery(sql) ;
	    
	    while(dbRes.next()) {
	    	int anr = dbRes.getInt("anr") ; 
	    	String aname= dbRes.getString("aname") ; 
	    	double preis= dbRes.getDouble("preis") ; 
	    	
	    	Artikel myArtikel= new Artikel(anr, aname, preis) ; 
	    	
	    	FussballSeiteArtikel.add(myArtikel) ; 
	    }
	}

}



