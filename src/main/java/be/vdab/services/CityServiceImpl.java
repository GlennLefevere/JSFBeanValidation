package be.vdab.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import be.vdab.dao.CityDAO;
import be.vdab.entities.City;

@Service
public class CityServiceImpl implements CityService{
	private final CityDAO cityDAO;

	@Autowired
	public CityServiceImpl(CityDAO cityDAO) {
		this.cityDAO = cityDAO;
	}

	@Override
	public List<City> findAll() {
		return cityDAO.findAll();
	}

}
