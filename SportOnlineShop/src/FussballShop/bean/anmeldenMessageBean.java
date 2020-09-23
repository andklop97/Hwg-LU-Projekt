package FussballShop.bean;

public class anmeldenMessageBean {
	
	String Message ; 

	public anmeldenMessageBean() {
		this.setStandardMessage();
	}
	
	public void setStandardMessage() {
		this.Message="Bitte melden Sie sich an" ; 
	}
	
	
	public void setLoginSuccessful() {
		this.Message="Sie wurden erfolgreich angemeldet"; 
	}
	
	public void setLoginFailed() {
		this.Message="Der Username oder das Passwort wurde falsch eingegeben" ; 
	}
	
	public void setAnyError() {
		this.Message="Ein unerwarteter Fehler ist aufgetreten"  ; 
	}
	

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}
	
	public String getAnMessageHtml(){
		String html = "";
		html += "<h2>" + this.getMessage() + "</h2>";
		
		return html;
	}
	
	

}
