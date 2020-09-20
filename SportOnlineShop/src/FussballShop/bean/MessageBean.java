package FussballShop.bean;

public class MessageBean {

	
	String message ; 
	String message2;
	public MessageBean() {
		this.setStandardMessage();
	
	}
	
	
	
	public void setStandardMessage () {
		message = "Sie können etwas bestellen oder in den Warenkorb legen"
				+". Viel Spaß beim Shoppen!"; 
	}
	
	public void setNull(){
	
	}
	
	
	
	public void setBestellt () {
		message = "Artikel wurde erfolgreich bestellt" ; 
	}
	
	public void setWarenkorb () {
		message = "Artikel wurde erfolgreich in den Warenkorb gelegt" ; 
	}

	
	public void setEntfernt() {
		message= "Das Produkt wurde erfolgreich aus dem Warenkorb entfernt" ; 
	}
	

	public void SetUser(){
		message="Konto erfolgreich erstellt";
	}

	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	public String getMessage2() {
		return message2;
	}



	public void setMessage2(String message2) {
		this.message2 = message2;
	}



	public String setRegistrierenSuccesful(String userid) {
		String html="";
		this.message="Benutzer " + userid + " wurde erfolgreich registriert";
	this.message2="Sie k�nnen sich jetzt anmelden";
	html+= "<h3>" + this.message+ "<br>" + this.message2 +"</h3>";
	return html;
	}
	
	public void setAlreadExists(String userid) {
		this.message="Benutzer " + userid + " existiert bereits";
		this.message2="Bitte w�hlen Sie einen anderen Username";
		
	}
	public void setAnError(String userid) {
		this.message="Es ist ein Fehler aufgetreten ";
		this.message2="Bitte wenden Sie sich an Ihren administrator";
		
	}
	
	public String getMessageHtml(){
		String html = "";
		html += "<h3>" + this.getMessage() + "<br>" + this.getMessage2() + "</h3>";
		
		return html;
	}
	

}
