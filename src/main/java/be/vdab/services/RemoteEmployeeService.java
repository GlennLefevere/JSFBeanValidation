package be.vdab.services;

import java.rmi.Remote;
import java.rmi.RemoteException;

import be.vdab.entities.Employee;

public interface RemoteEmployeeService extends Remote{
	public Employee findOne(long id) throws RemoteException;
}
