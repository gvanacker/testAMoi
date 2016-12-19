package com.norauto.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.norauto.front.bo.Voiture;
import com.norauto.interfaces.ICommonVoitureService;

@Service
public class CommonVoitureService implements ICommonVoitureService {

	@Override
	public List<Voiture> getListVoitures() {

		List<Voiture> listeVoiture = new ArrayList<Voiture>();

		listeVoiture.add(new Voiture("AUDI", "A3"));
		listeVoiture.add(new Voiture("AUDI", "A4"));
		listeVoiture.add(new Voiture("BMW", "Serie 1"));
		listeVoiture.add(new Voiture("Peugeot", "207"));
		listeVoiture.add(new Voiture("Peugeot", "206"));
		listeVoiture.add(new Voiture("Peugeot", "208"));
		listeVoiture.add(new Voiture("RENAULT", "MEGANE"));
		listeVoiture.add(new Voiture("RENAULT", "CLIO"));
		listeVoiture.add(new Voiture("CITROEN", "C3"));
		return listeVoiture;
	}

	@Override
	public Voiture getVoiture(String paramMarque) {
		return new Voiture(paramMarque, "A3-XXX");
	}

}
