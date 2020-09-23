package fr.pantheonsorbonne.ufr27.miage;

import javax.xml.bind.annotation.XmlElement;

public class Article {
	
	@XmlElement(name = "denomination")
	String denomination;
	
	@XmlElement(name = "prixUnitaire")
	double prixUnitaire;
	
	public String getDenomination() {
		
		return denomination;
		
	}
	
public double getPrixUnitaire() {
		
		return prixUnitaire;
		
	}

}
