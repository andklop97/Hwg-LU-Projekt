package FussballShop.bean;

public class Artikel {
	
	int anr; 
	String aname; 
	double preis; 
	
	public Artikel (int anr, String aname, double preis) {
		super(); 
		this.anr= anr ; 
		this.aname= aname ; 
		this.preis= preis ; 
	}
	
	
	public String toKaestchen() {
	String html=  "" ;
	html+= " " + this.anr + " "+ this.aname+ " " + this.preis ; 
	System.out.println(html);
	return html ; 
	}
	
	

	public int getAnr() {
		return anr;
	}

	public void setAnr(int anr) {
		this.anr = anr;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}
	
	
	
	

}


