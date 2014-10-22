package be.vdab.rmi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

import be.vdab.services.RemoteEmployeeService;

/**
 * Het creëren van de rmi server kant
 * @author cursist
 *
 */
@Configuration
public class CreateRMIBeans {
	private RemoteEmployeeService remoteEmployeeService;
	//private SpringBeanFacesELResolver resolver;
	
	@Autowired
	public void setRemoteEmployeeService(RemoteEmployeeService remoteEmployeeService) {
		this.remoteEmployeeService = remoteEmployeeService;
	}

	@Bean 
	RmiServiceExporter rmiServiceExporter() {
		RmiServiceExporter exporter = new RmiServiceExporter();
		exporter.setServiceName("remoteEmployeeService");
		exporter.setService(remoteEmployeeService);
		exporter.setServiceInterface(RemoteEmployeeService.class);
		exporter.setRegistryPort(1099);
		//FacesContext.getCurrentInstance().getApplication().addELResolver(resolver);
		return exporter;
	}
	
	

}