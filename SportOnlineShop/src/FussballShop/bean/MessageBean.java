package FussballShop.bean;

public class MessageBean {

	
	String message ; 
	public MessageBean() {
		
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setBestellt () {
		message = "Artikel wurde erfolgreich bestellt" ; 
	}
	
	public String getMessageHtml(){
		String html = "";
		html += "<h3>" + this.getMessage() + "</h3>";
		
		return html;
	}

}
