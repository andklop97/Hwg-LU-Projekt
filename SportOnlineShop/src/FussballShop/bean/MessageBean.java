package FussballShop.bean;

public class MessageBean {

	
	String message ; 
	
	public MessageBean() {
		setStandardMessage ();
	}
	
	
	
	public void setStandardMessage () {
		message = "Sie können etwas bestellen oder in den Warenkorb legen"
				+". Viel Spaß beim Shoppen"; 
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

	
	
	
	public String getMessageHtml(){
		String html = "";
		html += "<h3>" + this.getMessage() + "</h3>";
		
		return html;
	}

}
