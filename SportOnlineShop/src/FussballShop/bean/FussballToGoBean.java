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
	
	
	
	
	
	
	
//	public void fetchArtikelName(int anr) throws SQLException {
//		String sql= "SELECT * FROM fussbaelleseite WHERE anr =" + anr +" " ; 
//		System.out.println(sql);
//	    Connection dbConn= new PostgreSQLAccess().getConnection() ; 
//	    PreparedStatement prep = dbConn.prepareStatement(sql); 
//	    prep.setInt(1, anr);
//	    ResultSet dbRes= prep.executeQuery() ; 
//	    
//	    Artikel a= new Artikel() ;
//	    
//	    int anrr = dbRes.getInt("anr") ; 
//    	String aname= dbRes.getString("aname") ;
//	    
//	    
//	    while(dbRes.next()) {
//	    	 a.setAnr(anrr);
//	    	 a.setAname(aname);
//	
//	    }	
//	    
//			  
//	}
	
	
	
	
	
	
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
	    	
	    	FussballSeiteArtikel.add(myArtikel); 
	    }
	}
	
	

}



