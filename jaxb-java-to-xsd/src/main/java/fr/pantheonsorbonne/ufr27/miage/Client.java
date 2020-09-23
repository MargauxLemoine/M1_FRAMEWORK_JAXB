package fr.pantheonsorbonne.ufr27.miage;

import javax.xml.bind.annotation.XmlElement;

public class Client {
	
	@XmlElement(name = "fname")
	String fname;
	
	@XmlElement(name = "lname")
	String lname;
	
	@XmlElement(name = "personneMorale")
	String personneMorale;
	
	@XmlElement(name = "zipCode")
	String zipCode;
	
	@XmlElement(name = "addresse")
	String addresse;
	
	public String getAddresse() {
		return fname;
		
	}

	public String getFname() {
		return fname;
		
	}
	
	public String getLname() {
		return fname;
		
	}
	
	public String getPersonneMorale() {
		return fname;
		
	}
	
	public String getZipCode() {
		return fname;
		
	}
	

}
