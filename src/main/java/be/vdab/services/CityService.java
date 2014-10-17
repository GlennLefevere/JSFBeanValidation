package be.vdab.services;

import java.util.List;

import be.vdab.entities.City;

public interface CityService {
	public List<City> findAll();
	public City findOne(Long cityId);
}
