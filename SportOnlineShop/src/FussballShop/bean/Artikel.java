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
		String html = "";
		html += "<form action ='./FussbaelleSeiteAppl.jsp' method ='get'>"
		+"<div class='cool'>" 
		+"<input type='hidden' name= 'artikelnummer' value= '" + this.anr + "' > "
		+"<input type='hidden' name= 'artikelname' value= '" + this.aname + "' > " 
		+"<div class= 'titel'> "+ this.aname + "</div>" 
		+"<div class= 'buttons'>"
		+"<input class='btn' type= 'submit' name= 'ware' value= 'in den Warenkorb'>" 
		+ "<br>"
		+ "<input class='btn1' type= 'submit' name= 'bestellung' value= 'bestellen'>"
		+ "</div>"
		+ " <br> "
		+"<input type='hidden' name= 'artikelpreis' value= '" + this.preis + "' > " 
		+ "<div class='b'>"+ this.preis + " EUR " +"</div>" 
	    + "<div class= 'bild'>"+ "<img src= '../img1/ImgBälle/" + this.anr+ ".jpg' />" + "</div>" 
		+ "</div>"  
		+ "</form>"
		+"<br>\n" ; 
				
		System.out.println(html);
		return html;
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


