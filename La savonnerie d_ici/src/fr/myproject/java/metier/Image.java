package fr.myproject.java;

public class Image {
	
	private String Url;

	
	
//	Constructor
	
	public Image(String url) {
		super();
		Url = url;
	}
	

	
	// Getters and setters	
	
	public void setUrl(String url){
		Url = url;
	}

	public String getUrl() {
		return Url;
	}
	
	
	
}
