package FussballShop.bean;

public class MessageBean {

	
	String message ; 
	//String message2;
	public MessageBean() {
		this.setStandardMessage();
	
	}
	
	
	
	public void setStandardMessage () {
		message = "Sie kÃ¶nnen etwas bestellen oder in den Warenkorb legen"
				+". Viel SpaÃŸ beim Shoppen!"; 
	}
	
	
	public void setLoginSuccessful() {
		message="Sie können jetzt bestellen";
		message2="d";
	}
	public String setLoginFailed() {
		String html="";
		message="<h2>" + "Ihre Anwendung ist fehlgeschlagen" + "</h2> \n";
		message2="<h4>" + "Bitte versuchen es noch einmal" + "</h4> \n";
		html+=message + message2;
		return html;
		
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

	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
<<<<<<< HEAD
	public String getMessage2() {
		return message2;
	}



	public void setMessage2(String message2) {
		this.message2 = message2;
	}



	public String setRegistrierenSuccesful(String userid) {
		String html="";
		this.message="Benutzer " + userid + " wurde erfolgreich registriert";
	this.message2="Sie können sich jetzt anmelden";
	html+= "<h3>" + this.message+ "<br>" + this.message2 +"</h3>";
	return html;
	}
	
	public void setAlreadExists(String userid) {
		this.message="Benutzer " + userid + " existiert bereits";
		this.message2="Bitte wählen Sie einen anderen Username";
		
	}
	public void setAnError() {
		this.message="Es ist ein Fehler aufgetreten ";
		this.message2="Bitte wenden Sie sich an Ihren administrator";
		
	}
=======
>>>>>>> branch 'master' of https://github.com/andklop97/Hwg-LU-Projekt.git
	
	public String getMessageHtml(){
		String html = "";
		html += "<h3>" + this.getMessage() + "</h3>";
		
		return html;
	}
	

}
