package be.vdab.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import be.vdab.entities.City;

public interface CityDAO extends JpaRepository<City, Long> {

}
