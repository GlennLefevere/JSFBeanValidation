package be.vdab.services;

import java.rmi.Remote;
import java.rmi.RemoteException;

import be.vdab.entities.Employee;
 /**
  * Service die via rmi een werknemer kan versturen
  * @author cursist
  *
  */
public interface RemoteEmployeeService extends Remote{
	/**
	 * haalt een werknemer op uit de database aan de hand van het id
	 * @param id van de werknemer
	 * @return een werknemer object
	 * @throws RemoteException Een exception die optreed vanuit rmi
	 */
	public Employee findOne(long id) throws RemoteException;
}
