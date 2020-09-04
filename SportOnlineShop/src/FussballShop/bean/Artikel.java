package FussballShop.bean;

public class Artikel {
	
	int anr; 
	String aname; 
	double preis; 
	
	
	public Artikel () {
		super() ;  
	}
	
	
	public Artikel (int anr, String aname, double preis) {
		super(); 
		this.anr= anr ; 
		this.aname= aname ; 
		this.preis= preis ; 
	}
	
	
	
	
	public String toKaestchen() {
		String html = "";
		html += "<div class='cool'>" + this.aname 
		+"<div class= 'buttons'>"
		+"<input class='btn' type= 'submit' name= 'ware' value= 'in den Warenkorb'>" 
		+ "<input class='btn' type= 'submit' name= 'bestellung' value= 'bestellen'>"
		+ "</div>"
		+ " <br> "
		+ this.preis + " EUR " 
	    
		+ "<img src= '../imgFussbaelle/" + this.anr+ ".jpg' />"
		+ "</div>"  + "<br>\n" ; 
				
		System.out.println(html);
		return html;
	}
	
	public String toAname () {
		String html = ""; 
		html+= ""+ this.aname ; 
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
	
	
	public String toString() {
		return "Artikel : Artikelnummer "+ this.anr + "Artikelname "+ this.aname + " Preis " + this.preis ; 
	}
	
	
	
	

}


