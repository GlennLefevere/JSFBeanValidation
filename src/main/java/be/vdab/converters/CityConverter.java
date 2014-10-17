package be.vdab.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import be.vdab.dao.CityDAO;
import be.vdab.entities.City;

@Component
public class CityConverter implements Converter{
	private final CityDAO cityDAO;

	@Autowired
	public CityConverter(CityDAO cityDAO) {
		this.cityDAO = cityDAO;
	}

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		return cityDAO.findOne(Long.parseLong(value));
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		return Long.toString(((City) value).getId());
	}

}
