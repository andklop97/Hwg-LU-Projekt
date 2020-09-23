package FussballShop.bean;


import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;


import de.hwg_lu.bw.jdbc.PostgreSQLAccess;



public class FussballToGoBean {
	
	Vector <Artikel> FussballSeiteArtikel ;
	Vector<Artikel> FussballschuheArtikel ; 
	Vector<Artikel> TrikotArtikel ; 
	Vector<Artikel> DTrikotArtikel ; 
	Vector<Artikel> DSchuheArtikel ; 
	Vector<Artikel> DTrainArtikel ; 
	Vector<Artikel> DeutschArtikel ;
	Vector<Artikel> ItalArtikel ; 
	Vector<Artikel> FrankArtikel ;
	Vector<Artikel> EngArtikel ; 
	Vector<Artikel> SpanArtikel ; 
	Vector<Artikel> NikeArtikel ; 
	Vector<Artikel> AdidasArtikel ;
	Vector<Artikel> PumaArtikel  ;
	Vector<Artikel> HStutzenArtikel ;
	Vector<Artikel> KFussballArtikel ; 
	Vector<Artikel> KSchuheArtikel ; 
	Vector<Artikel> KFanArtikel ; 
	Vector<Artikel> KTorwartArtikel  ; 
	Vector<Artikel> WarenkorbArtikel ; 
	

	public FussballToGoBean() throws SQLException {
		this.FussballSeiteArtikel= new Vector<Artikel>() ; 
		this.FussballschuheArtikel = new Vector<Artikel>(); 
		this.TrikotArtikel= new Vector<Artikel>();
		this.DTrikotArtikel= new Vector<Artikel>();
		this.DSchuheArtikel= new Vector<Artikel>() ; 
		this.DTrainArtikel= new Vector<Artikel>() ; 
		this.DeutschArtikel= new Vector<Artikel>() ; 
		this.ItalArtikel = new Vector<Artikel>(); 
		this.FrankArtikel = new Vector<Artikel>();
		this.EngArtikel = new Vector<Artikel>() ; 
		this.SpanArtikel = new Vector<Artikel>() ; 
		this.NikeArtikel = new Vector<Artikel>();
		this.AdidasArtikel = new Vector<Artikel>() ;
		this.PumaArtikel = new Vector<Artikel>(); 
		this.HStutzenArtikel= new Vector<Artikel>();
		this.KFussballArtikel= new Vector<Artikel>();
		this.KSchuheArtikel= new Vector<Artikel>();
		this.KFanArtikel= new Vector<Artikel>();
		this.KTorwartArtikel= new Vector<Artikel>(); 
		this.WarenkorbArtikel= new Vector<Artikel>(); 
		
		this.getFromFussballSeite();
		this.getFussballschuheSeite();
		this.getTrikotSeite();
		this.getDTrikotSeite();
		this.getDSchuheSeite();
		this.getDTrainSeite();
		this.getDeutschSeite(); 
		this.getItalSeite();
		this.getFrankSeite();
		this.getEngSeite();
		this.getSpanSeite();
		this.getNikeSeite();
		this.getAdidasSeite();
		this.getPumaSeite();
		this.getHStutzenSeite();
		this.getKFussbaelleSeite();
		this.getKSchuheSeite();
		this.getKFanSeite();
		this.getKTorwartSeite();
		this.getShowWarenkorb();
	}
	
	
	public String getHtmlFromWarenkorb(){
		String html = "";
		for(Artikel oneArtikel : WarenkorbArtikel){
			html += oneArtikel.toWarenkorb();
		}
		return html;
	}
	
	
	public String getHtmlFromKTorwart(){
		String html = "";
		for(Artikel oneArtikel : KTorwartArtikel){
			html += oneArtikel.toKTorwart();
		}
		return html;
	}
	
	
	
	public String getHtmlFromKFan(){
		String html = "";
		for(Artikel oneArtikel : KFanArtikel){
			html += oneArtikel.toKFan();
		}
		return html;
	}
	
	
	public String getHtmlFromKSchuhe(){
		String html = "";
		for(Artikel oneArtikel : KSchuheArtikel){
			html += oneArtikel.toKSchuhe();
		}
		return html;
	}
	
	
	
	public String getHtmlFromKFussbaelle(){
		String html = "";
		for(Artikel oneArtikel : KFussballArtikel){
			html += oneArtikel.toKFussball();
		}
		return html;
	}
	
	
	public String getHtmlFromHStutzen(){
		String html = "";
		for(Artikel oneArtikel : HStutzenArtikel){
			html += oneArtikel.toHStutzen();
		}
		return html;
	}
	
	
	public String getHtmlFromHFussball(){
		String html = "";
		for(Artikel oneArtikel : FussballSeiteArtikel){
			html += oneArtikel.toHFussball();
		}
		return html;
	}
	
	
	
	public String getHtmlFromPuma(){
		String html = "";
		for(Artikel oneArtikel : PumaArtikel){
			html += oneArtikel.toPuma();
		}
		return html;
	}
	
	
	public String getHtmlFromAdidas(){
		String html = "";
		for(Artikel oneArtikel : AdidasArtikel){
			html += oneArtikel.toAdidas();
		}
		return html;
	}
	
	public String getHtmlFromNike(){
		String html = "";
		for(Artikel oneArtikel : NikeArtikel){
			html += oneArtikel.toNike();
		}
		return html;
	}
	
	
	public String getHtmlFromSpan(){
		String html = "";
		for(Artikel oneArtikel : SpanArtikel){
			html += oneArtikel.toSpan();
		}
		return html;
	}
	
	
	public String getHtmlFromEng(){
		String html = "";
		for(Artikel oneArtikel : EngArtikel){
			html += oneArtikel.toEng();
		}
		return html;
	}
	
	
	public String getHtmlFromFrank(){
		String html = "";
		for(Artikel oneArtikel : FrankArtikel){
			html += oneArtikel.toFrank();
		}
		return html;
	}
	
	
	
	public String getHtmlFromItal(){
		String html = "";
		for(Artikel oneArtikel : ItalArtikel){
			html += oneArtikel.toItal();
		}
		return html;
	}
	
	public String getHtmlFromDeutsch(){
		String html = "";
		for(Artikel oneArtikel : DeutschArtikel){
			html += oneArtikel.toDeutsch();
		}
		return html;
	}
	
	
	public String getHtmlFromDTrainseite(){
		String html = "";
		for(Artikel oneArtikel : DTrainArtikel){
			html += oneArtikel.toDTrain();
		}
		return html;
	}
	
	
	public String getHtmlFromDSchuheseite(){
		String html = "";
		for(Artikel oneArtikel : DSchuheArtikel){
			html += oneArtikel.toDSchuhe();
		}
		return html;
	}
	
	
	public String getHtmlFromDTrikotseite(){
		String html = "";
		for(Artikel oneArtikel : DTrikotArtikel){
			html += oneArtikel.toDTrikot();
		}
		return html;
	}
	
	
	public String getHtmlFromTrikotseite(){
		String html = "";
		for(Artikel oneArtikel : TrikotArtikel){
			html += oneArtikel.toTrikot();
		}
		return html;
	}
	
	public String getHtmlFromFussballschuhe(){
		String html = "";
		for(Artikel oneArtikel : FussballschuheArtikel){
			html += oneArtikel.toFussballschuhe();
		}
		return html;
	}
	
	
	public String getHtmlFromFussballseite(){
		String html = "";
		for(Artikel oneArtikel : FussballSeiteArtikel){
			html += oneArtikel.toFussbaelle() ;
		}
		return html;
	}
	
	
	public boolean deleteFromWarenkorb(int wkid) throws SQLException {
		String sql="delete from warenkorb where wkid= ?" ; 
		System.out.println(sql);
		Connection dbConn= new PostgreSQLAccess().getConnection() ; 
		PreparedStatement prep = dbConn.prepareStatement(sql) ; 
		prep.setInt(1, wkid);
	    int erfolgreich = prep.executeUpdate(); 
	    
	    if(erfolgreich==1) {
	    	return true ;
	    } else return false ; 
		
		
		
	}
	
	
		
	
	
	public void getShowWarenkorb() throws SQLException {
		String sql= "SELECT wkid, anr, aname, preis FROM Warenkorb" ; 
		System.out.println(sql);
	    Connection dbConn= new PostgreSQLAccess().getConnection() ; 
	    ResultSet dbRes= dbConn.createStatement().executeQuery(sql) ;
	    
	    
	    while(dbRes.next()) {
	    	int anr = dbRes.getInt("anr") ; 
	    	String aname= dbRes.getString("aname") ; 
	    	double preis= dbRes.getDouble("preis") ;
	    	int wkid = dbRes.getInt("wkid") ; 
	    	
	    	Artikel myArtikel= new Artikel(anr, aname, preis, wkid) ; 
	    	
	    	WarenkorbArtikel.add(myArtikel); 
	    }
	}
	
	
public boolean addWarenkorb (int anr, String aname, BigDecimal preis) throws SQLException {
		
		String sql="insert into warenkorb (anr, aname, preis) values( ?, ?, ?) " ; 
		System.out.println(sql);
		Connection dbConn= new PostgreSQLAccess().getConnection() ; 
		PreparedStatement prep = dbConn.prepareStatement(sql) ; 
		prep.setInt(1, anr);
		prep.setString(2, aname);
		prep.setBigDecimal(3, preis) ;
		int erfolgreich = prep.executeUpdate(); 
		
		if(erfolgreich==1) {
			return true ; 
		}
		else return false ; 
		
	}
	
	
	
	
   public boolean addBestellung (int anr, String aname, BigDecimal preis) throws SQLException {
		
		String sql="insert into bestellung (anr, aname, preis) values( ?, ?, ?) " ; 
		System.out.println(sql);
		Connection dbConn= new PostgreSQLAccess().getConnection() ; 
		PreparedStatement prep = dbConn.prepareStatement(sql) ; 
		prep.setInt(1, anr);
		prep.setString(2, aname);
		prep.setBigDecimal(3, preis) ;
		int erfolgreich = prep.executeUpdate(); 
		
		if(erfolgreich==1) {
			return true ; 
		}
		else return false ; 
		
	}
   
   
   
   
   public void getKTorwartSeite() throws SQLException {
		String sql= "SELECT anr, aname, preis FROM kindertorwarthandschuhe" ; 
		System.out.println(sql);
	    Connection dbConn= new PostgreSQLAccess().getConnection() ; 
	    ResultSet dbRes= dbConn.createStatement().executeQuery(sql) ;
	    
	    
	    while(dbRes.next()) {
	    	int anr = dbRes.getInt("anr") ; 
	    	String aname= dbRes.getString("aname") ; 
	    	double preis= dbRes.getDouble("preis") ; 
	    	
	    	Artikel myArtikel= new Artikel(anr, aname, preis) ; 
	    	
	    	KTorwartArtikel.add(myArtikel); 
	    }
	}
   
   
   
   public void getKFanSeite() throws SQLException {
		String sql= "SELECT anr, aname, preis FROM kindertrikots" ; 
		System.out.println(sql);
	    Connection dbConn= new PostgreSQLAccess().getConnection() ; 
	    ResultSet dbRes= dbConn.createStatement().executeQuery(sql) ;
	    
	    
	    while(dbRes.next()) {
	    	int anr = dbRes.getInt("anr") ; 
	    	String aname= dbRes.getString("aname") ; 
	    	double preis= dbRes.getDouble("preis") ; 
	    	
	    	Artikel myArtikel= new Artikel(anr, aname, preis) ; 
	    	
	    	KFanArtikel.add(myArtikel); 
	    }
	}
  
   
   
   
   public void getKSchuheSeite() throws SQLException {
		String sql= "SELECT anr, aname, preis FROM kinderschuhe" ; 
		System.out.println(sql);
	    Connection dbConn= new PostgreSQLAccess().getConnection() ; 
	    ResultSet dbRes= dbConn.createStatement().executeQuery(sql) ;
	    
	    
	    while(dbRes.next()) {
	    	int anr = dbRes.getInt("anr") ; 
	    	String aname= dbRes.getString("aname") ; 
	    	double preis= dbRes.getDouble("preis") ; 
	    	
	    	Artikel myArtikel= new Artikel(anr, aname, preis) ; 
	    	
	    	KSchuheArtikel.add(myArtikel); 
	    }
	}
   
   
   
   
   public void getKFussbaelleSeite() throws SQLException {
		String sql= "SELECT anr, aname, preis FROM kinderfussball" ; 
		System.out.println(sql);
	    Connection dbConn= new PostgreSQLAccess().getConnection() ; 
	    ResultSet dbRes= dbConn.createStatement().executeQuery(sql) ;
	    
	    
	    while(dbRes.next()) {
	    	int anr = dbRes.getInt("anr") ; 
	    	String aname= dbRes.getString("aname") ; 
	    	double preis= dbRes.getDouble("preis") ; 
	    	
	    	Artikel myArtikel= new Artikel(anr, aname, preis) ; 
	    	
	    	KFussballArtikel.add(myArtikel); 
	    }
	}
  
   
   
   public void getHStutzenSeite() throws SQLException {
		String sql= "SELECT anr, aname, preis FROM herrenschutz" ; 
		System.out.println(sql);
	    Connection dbConn= new PostgreSQLAccess().getConnection() ; 
	    ResultSet dbRes= dbConn.createStatement().executeQuery(sql) ;
	    
	    
	    while(dbRes.next()) {
	    	int anr = dbRes.getInt("anr") ; 
	    	String aname= dbRes.getString("aname") ; 
	    	double preis= dbRes.getDouble("preis") ; 
	    	
	    	Artikel myArtikel= new Artikel(anr, aname, preis) ; 
	    	
	    	HStutzenArtikel.add(myArtikel); 
	    }
	}
   
   
   
   public void getPumaSeite() throws SQLException {
		String sql= "SELECT anr, aname, preis FROM pumaschuhe" ; 
		System.out.println(sql);
	    Connection dbConn= new PostgreSQLAccess().getConnection() ; 
	    ResultSet dbRes= dbConn.createStatement().executeQuery(sql) ;
	    
	    
	    while(dbRes.next()) {
	    	int anr = dbRes.getInt("anr") ; 
	    	String aname= dbRes.getString("aname") ; 
	    	double preis= dbRes.getDouble("preis") ; 
	    	
	    	Artikel myArtikel= new Artikel(anr, aname, preis) ; 
	    	
	    	PumaArtikel.add(myArtikel); 
	    }
	}
   
   
   
   
   public void getAdidasSeite() throws SQLException {
		String sql= "SELECT anr, aname, preis FROM adidasschuhe" ; 
		System.out.println(sql);
	    Connection dbConn= new PostgreSQLAccess().getConnection() ; 
	    ResultSet dbRes= dbConn.createStatement().executeQuery(sql) ;
	    
	    
	    while(dbRes.next()) {
	    	int anr = dbRes.getInt("anr") ; 
	    	String aname= dbRes.getString("aname") ; 
	    	double preis= dbRes.getDouble("preis") ; 
	    	
	    	Artikel myArtikel= new Artikel(anr, aname, preis) ; 
	    	
	    	AdidasArtikel.add(myArtikel); 
	    }
	}
   
   
   public void getNikeSeite() throws SQLException {
		String sql= "SELECT anr, aname, preis FROM nikeschuhe" ; 
		System.out.println(sql);
	    Connection dbConn= new PostgreSQLAccess().getConnection() ; 
	    ResultSet dbRes= dbConn.createStatement().executeQuery(sql) ;
	    
	    
	    while(dbRes.next()) {
	    	int anr = dbRes.getInt("anr") ; 
	    	String aname= dbRes.getString("aname") ; 
	    	double preis= dbRes.getDouble("preis") ; 
	    	
	    	Artikel myArtikel= new Artikel(anr, aname, preis) ; 
	    	
	    	NikeArtikel.add(myArtikel); 
	    }
	}
   
   
   
   public void getSpanSeite() throws SQLException {
		String sql= "SELECT anr, aname, preis FROM spanientrikot" ; 
		System.out.println(sql);
	    Connection dbConn= new PostgreSQLAccess().getConnection() ; 
	    ResultSet dbRes= dbConn.createStatement().executeQuery(sql) ;
	    
	    
	    while(dbRes.next()) {
	    	int anr = dbRes.getInt("anr") ; 
	    	String aname= dbRes.getString("aname") ; 
	    	double preis= dbRes.getDouble("preis") ; 
	    	
	    	Artikel myArtikel= new Artikel(anr, aname, preis) ; 
	    	
	    	SpanArtikel.add(myArtikel); 
	    }
	}
   
   
   public void getEngSeite() throws SQLException {
		String sql= "SELECT anr, aname, preis FROM englandtrikot" ; 
		System.out.println(sql);
	    Connection dbConn= new PostgreSQLAccess().getConnection() ; 
	    ResultSet dbRes= dbConn.createStatement().executeQuery(sql) ;
	    
	    
	    while(dbRes.next()) {
	    	int anr = dbRes.getInt("anr") ; 
	    	String aname= dbRes.getString("aname") ; 
	    	double preis= dbRes.getDouble("preis") ; 
	    	
	    	Artikel myArtikel= new Artikel(anr, aname, preis) ; 
	    	
	    	EngArtikel.add(myArtikel); 
	    }
	}
   
   
   public void getFrankSeite() throws SQLException {
		String sql= "SELECT anr, aname, preis FROM frankreichtrikot" ; 
		System.out.println(sql);
	    Connection dbConn= new PostgreSQLAccess().getConnection() ; 
	    ResultSet dbRes= dbConn.createStatement().executeQuery(sql) ;
	    
	    
	    while(dbRes.next()) {
	    	int anr = dbRes.getInt("anr") ; 
	    	String aname= dbRes.getString("aname") ; 
	    	double preis= dbRes.getDouble("preis") ; 
	    	
	    	Artikel myArtikel= new Artikel(anr, aname, preis) ; 
	    	
	    	FrankArtikel.add(myArtikel); 
	    }
	}
   
   
   
   public void getItalSeite() throws SQLException {
		String sql= "SELECT anr, aname, preis FROM italientrikot" ; 
		System.out.println(sql);
	    Connection dbConn= new PostgreSQLAccess().getConnection() ; 
	    ResultSet dbRes= dbConn.createStatement().executeQuery(sql) ;
	    
	    
	    while(dbRes.next()) {
	    	int anr = dbRes.getInt("anr") ; 
	    	String aname= dbRes.getString("aname") ; 
	    	double preis= dbRes.getDouble("preis") ; 
	    	
	    	Artikel myArtikel= new Artikel(anr, aname, preis) ; 
	    	
	    	ItalArtikel.add(myArtikel); 
	    }
	}
  
   
   
   public void getDeutschSeite() throws SQLException {
		String sql= "SELECT anr, aname, preis FROM deutschlandtrikot" ; 
		System.out.println(sql);
	    Connection dbConn= new PostgreSQLAccess().getConnection() ; 
	    ResultSet dbRes= dbConn.createStatement().executeQuery(sql) ;
	    
	    
	    while(dbRes.next()) {
	    	int anr = dbRes.getInt("anr") ; 
	    	String aname= dbRes.getString("aname") ; 
	    	double preis= dbRes.getDouble("preis") ; 
	    	
	    	Artikel myArtikel= new Artikel(anr, aname, preis) ; 
	    	
	    	DeutschArtikel.add(myArtikel); 
	    }
	}
   
   
   
   public void getDTrainSeite() throws SQLException {
		String sql= "SELECT anr, aname, preis FROM damentrainingskleidung" ; 
		System.out.println(sql);
	    Connection dbConn= new PostgreSQLAccess().getConnection() ; 
	    ResultSet dbRes= dbConn.createStatement().executeQuery(sql) ;
	    
	    
	    while(dbRes.next()) {
	    	int anr = dbRes.getInt("anr") ; 
	    	String aname= dbRes.getString("aname") ; 
	    	double preis= dbRes.getDouble("preis") ; 
	    	
	    	Artikel myArtikel= new Artikel(anr, aname, preis) ; 
	    	
	    	DTrainArtikel.add(myArtikel); 
	    }
	}
   
   
   
   public void getDSchuheSeite() throws SQLException {
		String sql= "SELECT anr, aname, preis FROM damenschuhe" ; 
		System.out.println(sql);
	    Connection dbConn= new PostgreSQLAccess().getConnection() ; 
	    ResultSet dbRes= dbConn.createStatement().executeQuery(sql) ;
	    
	    
	    while(dbRes.next()) {
	    	int anr = dbRes.getInt("anr") ; 
	    	String aname= dbRes.getString("aname") ; 
	    	double preis= dbRes.getDouble("preis") ; 
	    	
	    	Artikel myArtikel= new Artikel(anr, aname, preis) ; 
	    	
	    	DSchuheArtikel.add(myArtikel); 
	    }
	}
   
	
   public void getDTrikotSeite() throws SQLException {
		String sql= "SELECT anr, aname, preis FROM frauentrikot" ; 
		System.out.println(sql);
	    Connection dbConn= new PostgreSQLAccess().getConnection() ; 
	    ResultSet dbRes= dbConn.createStatement().executeQuery(sql) ;
	    
	    
	    while(dbRes.next()) {
	    	int anr = dbRes.getInt("anr") ; 
	    	String aname= dbRes.getString("aname") ; 
	    	double preis= dbRes.getDouble("preis") ; 
	    	
	    	Artikel myArtikel= new Artikel(anr, aname, preis) ; 
	    	
	    	DTrikotArtikel.add(myArtikel); 
	    }
	}
   
	
   public void getTrikotSeite() throws SQLException {
		String sql= "SELECT anr, aname, preis FROM trikotseite" ; 
		System.out.println(sql);
	    Connection dbConn= new PostgreSQLAccess().getConnection() ; 
	    ResultSet dbRes= dbConn.createStatement().executeQuery(sql) ;
	    
	    
	    while(dbRes.next()) {
	    	int anr = dbRes.getInt("anr") ; 
	    	String aname= dbRes.getString("aname") ; 
	    	double preis= dbRes.getDouble("preis") ; 
	    	
	    	Artikel myArtikel= new Artikel(anr, aname, preis) ; 
	    	
	    	TrikotArtikel.add(myArtikel); 
	    }
	}
   
	
   public void getFussballschuheSeite() throws SQLException {
		String sql= "SELECT anr, aname, preis FROM fussballschuheseite" ; 
		System.out.println(sql);
	    Connection dbConn= new PostgreSQLAccess().getConnection() ; 
	    ResultSet dbRes= dbConn.createStatement().executeQuery(sql) ;
	    
	    
	    while(dbRes.next()) {
	    	int anr = dbRes.getInt("anr") ; 
	    	String aname= dbRes.getString("aname") ; 
	    	double preis= dbRes.getDouble("preis") ; 
	    	
	    	Artikel myArtikel= new Artikel(anr, aname, preis) ; 
	    	
	    	FussballschuheArtikel.add(myArtikel); 
	    }
	}
	
	
	
	
	
	
	public void getFromFussballSeite() throws SQLException {
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



