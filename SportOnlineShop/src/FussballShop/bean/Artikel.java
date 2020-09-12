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
	
	public String toKTorwart() {
		String html = "";
		html += "<form action ='KTorwartApp.jsp' method ='get'>"
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
	    + "<div class= 'bild'>"+ "<img src= '../ImgKinderTorwart/" + this.anr+ ".jpg' />" + "</div>" 
		+ "</div>"  
		+ "</form>"
		+"<br>\n" ; 
				
		System.out.println(html);
		return html;
	}
	
	
	public String toKFan() {
		String html = "";
		html += "<form action ='KFanApp.jsp' method ='get'>"
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
	    + "<div class= 'bild'>"+ "<img src= '../ImgKinderTrikot/" + this.anr+ ".jpg' />" + "</div>" 
		+ "</div>"  
		+ "</form>"
		+"<br>\n" ; 
				
		System.out.println(html);
		return html;
	}
	
	
	
	public String toKSchuhe() {
		String html = "";
		html += "<form action ='KSchuheApp.jsp' method ='get'>"
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
	    + "<div class= 'bild'>"+ "<img src= '../ImgKinderSchuhe/" + this.anr+ ".jpg' />" + "</div>" 
		+ "</div>"  
		+ "</form>"
		+"<br>\n" ; 
				
		System.out.println(html);
		return html;
	}
	
	
	
	public String toKFussball() {
		String html = "";
		html += "<form action ='KFussbaelleApp.jsp' method ='get'>"
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
	    + "<div class= 'bild'>"+ "<img src= '../ImgBälleKinder/" + this.anr+ ".jpg' />" + "</div>" 
		+ "</div>"  
		+ "</form>"
		+"<br>\n" ; 
				
		System.out.println(html);
		return html;
	}
	
	
	
	public String toHStutzen() {
		String html = "";
		html += "<form action ='HStutzenAppl.jsp' method ='get'>"
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
	    + "<div class= 'bild'>"+ "<img src= '../ImgStützen/" + this.anr+ ".jpg' />" + "</div>" 
		+ "</div>"  
		+ "</form>"
		+"<br>\n" ; 
				
		System.out.println(html);
		return html;
	}
	
	
	public String toHFussball() {
		String html = "";
		html += "<form action ='HFussballApp.jsp' method ='get'>"
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
	    + "<div class= 'bild'>"+ "<img src= '../ImgBlle/" + this.anr+ ".jpg' />" + "</div>" 
		+ "</div>"  
		+ "</form>"
		+"<br>\n" ; 
				
		System.out.println(html);
		return html;
	}
	
	
	public String toPuma() {
		String html = "";
		html += "<form action ='PumaAppl.jsp' method ='get'>"
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
	    + "<div class= 'bild'>"+ "<img src= '../ImgPumaSchuhe/" + this.anr+ ".jpg' />" + "</div>" 
		+ "</div>"  
		+ "</form>"
		+"<br>\n" ; 
				
		System.out.println(html);
		return html;
	}
	
	
	public String toAdidas() {
		String html = "";
		html += "<form action ='adidasAppl.jsp' method ='get'>"
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
	    + "<div class= 'bild'>"+ "<img src= '../ImgadidasSchuhe/" + this.anr+ ".jpg' />" + "</div>" 
		+ "</div>"  
		+ "</form>"
		+"<br>\n" ; 
				
		System.out.println(html);
		return html;
	}
	
	
	
	public String toNike() {
		String html = "";
		html += "<form action ='NikeAppl.jsp' method ='get'>"
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
	    + "<div class= 'bild'>"+ "<img src= '../ImgNikeSchuhe/" + this.anr+ ".jpg' />" + "</div>" 
		+ "</div>"  
		+ "</form>"
		+"<br>\n" ; 
				
		System.out.println(html);
		return html;
	}
	
	
	public String toSpan() {
		String html = "";
		html += "<form action ='SpanAppl.jsp' method ='get'>"
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
	    + "<div class= 'bild'>"+ "<img src= '../ImgSpanien/" + this.anr+ ".jpg' />" + "</div>" 
		+ "</div>"  
		+ "</form>"
		+"<br>\n" ; 
				
		System.out.println(html);
		return html;
	}
	
	
	public String toEng() {
		String html = "";
		html += "<form action ='EngAppl.jsp' method ='get'>"
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
	    + "<div class= 'bild'>"+ "<img src= '../ImgEngland/" + this.anr+ ".jpg' />" + "</div>" 
		+ "</div>"  
		+ "</form>"
		+"<br>\n" ; 
				
		System.out.println(html);
		return html;
	}
	
	
	
	public String toFrank() {
		String html = "";
		html += "<form action ='FrankAppl.jsp' method ='get'>"
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
	    + "<div class= 'bild'>"+ "<img src= '../ImgFrankreich/" + this.anr+ ".jpg' />" + "</div>" 
		+ "</div>"  
		+ "</form>"
		+"<br>\n" ; 
				
		System.out.println(html);
		return html;
	}
	
	
	
	public String toItal() {
		String html = "";
		html += "<form action ='ItalAppl.jsp' method ='get'>"
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
	    + "<div class= 'bild'>"+ "<img src= '../ImgItalien/" + this.anr+ ".jpg' />" + "</div>" 
		+ "</div>"  
		+ "</form>"
		+"<br>\n" ; 
				
		System.out.println(html);
		return html;
	}
	
	
	public String toDeutsch() {
		String html = "";
		html += "<form action ='DeutschAppl.jsp' method ='get'>"
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
	    + "<div class= 'bild'>"+ "<img src= '../ImgDeutschland/" + this.anr+ ".jpg' />" + "</div>" 
		+ "</div>"  
		+ "</form>"
		+"<br>\n" ; 
				
		System.out.println(html);
		return html;
	}
	
	
	public String toDTrain() {
		String html = "";
		html += "<form action ='DtrainAppl.jsp' method ='get'>"
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
	    + "<div class= 'bild'>"+ "<img src= '../ImgD/" + this.anr+ ".jpg' />" + "</div>" 
		+ "</div>"  
		+ "</form>"
		+"<br>\n" ; 
				
		System.out.println(html);
		return html;
	}
	
	
	public String toDSchuhe() {
		String html = "";
		html += "<form action ='DSchuheAppl.jsp' method ='get'>"
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
	    + "<div class= 'bild'>"+ "<img src= '../ImgDamenSchuhe/" + this.anr+ ".jpg' />" + "</div>" 
		+ "</div>"  
		+ "</form>"
		+"<br>\n" ; 
				
		System.out.println(html);
		return html;
	}
	
	
	public String toDTrikot() {
		String html = "";
		html += "<form action ='DTrikotAppl.jsp' method ='get'>"
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
	    + "<div class= 'bild'>"+ "<img src= '../ImgDamenTrikot/" + this.anr+ ".jpg' />" + "</div>" 
		+ "</div>"  
		+ "</form>"
		+"<br>\n" ; 
				
		System.out.println(html);
		return html;
	}
	
	
	public String toTrikot() {
		String html = "";
		html += "<form action ='./FussballschuheSeiteAppl.jsp' method ='get'>"
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
	    + "<div class= 'bild'>"+ "<img src= '../ImgTrikotVorschau/" + this.anr+ ".jpg' />" + "</div>" 
		+ "</div>"  
		+ "</form>"
		+"<br>\n" ; 
				
		System.out.println(html);
		return html;
	}
	
	
	public String toFussballschuhe() {
		String html = "";
		html += "<form action ='./FussballschuheSeiteAppl.jsp' method ='get'>"
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
	    + "<div class= 'bild'>"+ "<img src= '../ImgSchuheVorschau/" + this.anr+ ".jpg' />" + "</div>" 
		+ "</div>"  
		+ "</form>"
		+"<br>\n" ; 
				
		System.out.println(html);
		return html;
	}
	
	public String toFussbaelle() {
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
	    + "<div class= 'bild'>"+ "<img src= '../ImgBlle/" + this.anr+ ".jpg' />" + "</div>" 
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


