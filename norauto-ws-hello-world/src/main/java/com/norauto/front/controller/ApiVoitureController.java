package com.norauto.front.controller;

import java.util.List;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.norauto.front.bo.ErrorInfo;
import com.norauto.front.bo.Voiture;
import com.norauto.front.exception.NorautoException;
import com.norauto.interfaces.ICommonVoitureService;

@Controller
@RequestMapping("/api/vehicle")
public class ApiVoitureController {

	@Autowired
	ICommonVoitureService commonVoitureService;

	static final Logger logger = Logger.getLogger(ApiVoitureController.class);

	// PROCEDURE D ENREGISTREMENT DES DONNES DE PNEUS
	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseBody
	public List<Voiture> getAllVehicle(HttpServletRequest request, HttpServletResponse response) throws NorautoException {

		return commonVoitureService.getListVoitures();
	}

	// PROCEDURE D ENREGISTREMENT DES DONNES DE PNEUS
	@RequestMapping(value = "/{paramMarque}", method = RequestMethod.GET)
	@ResponseBody
	public Voiture getVehicle(HttpServletRequest request, HttpServletResponse response, @PathVariable("paramMarque") String paramMarque) throws NorautoException {

		return commonVoitureService.getVoiture(paramMarque);
	}

	// Gestion des retours d'erreur en JSON
	@ExceptionHandler(NorautoException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ResponseBody
	public ErrorInfo handlenorautoException(HttpServletRequest req, NorautoException ex) {
		StringTokenizer st = new StringTokenizer(ex.getMessage(), "||");
		String code = st.nextElement().toString();
		String message = st.nextElement().toString();
		return new ErrorInfo(code, message);
	}

}
