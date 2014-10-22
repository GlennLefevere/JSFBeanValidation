package be.vdab.services;

import java.util.List;

import be.vdab.entities.City;

/**
 * Service voor het ophalen van steden uit de database
 * @author cursist
 *
 */
public interface CityService {
	/**
	 * Ophalen van alle steden uit de database
	 * @return
	 */
	public List<City> findAll();
	/**
	 * Een specifieke stad uit de database halen
	 * @param cityId het id van de stad die opgehaald moet worden
	 * @return
	 */
	public City findOne(Long cityId);
}
