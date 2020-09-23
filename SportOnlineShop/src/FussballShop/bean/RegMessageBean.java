package FussballShop.bean;

public class RegMessageBean {
	
	String Message ;
	String Message2; 

	public RegMessageBean() {
		this.setStandardMessage();
	}
	
	
	
	public void setStandardMessage() {
		this.Message="Sie können sich registrieren" ; 
	}
	
	public void setRegistrierenSuccesful(String userid) {
		this.Message="Benutzer " + userid + " wurde erfolgreich registriert";
	}
	
	public void setAlreadExists(String userid) {
		this.Message="Benutzer " + userid + " existiert bereits"; 
	}
	
	public void setAnError() {
		this.Message="Es ist ein Fehler aufgetreten" ; 
	}
	

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}
	
	public String getRegMessageHtml(){
		String html = "";
		html += "<h2>" + this.getMessage() + "</h2>";
		
		return html;
	}
	
	

}
