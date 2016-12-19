package com.norauto.front.bo;

import lombok.Data;

@Data
public class Voiture {
	private String marque;
	private String modele;

	public Voiture(String paramMarque, String paramModele) {
		this.marque = paramMarque;
		this.modele = paramModele;
	}
}
