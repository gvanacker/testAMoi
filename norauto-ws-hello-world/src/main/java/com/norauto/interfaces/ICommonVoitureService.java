package com.norauto.interfaces;

import java.util.List;

import com.norauto.front.bo.Voiture;

public interface ICommonVoitureService {

	public List<Voiture> getListVoitures();

	public Voiture getVoiture(String paramMarque);
}
