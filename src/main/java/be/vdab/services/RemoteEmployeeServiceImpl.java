package be.vdab.services;

import java.rmi.RemoteException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import be.vdab.dao.EmployeeDAO;
import be.vdab.entities.Employee;

@Service
@Transactional(readOnly = true)
public class RemoteEmployeeServiceImpl implements RemoteEmployeeService {
	private EmployeeDAO employeeDAO;

	@Autowired
	public RemoteEmployeeServiceImpl(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@Override
	public Employee findOne(long id) throws RemoteException {
		return employeeDAO.findOne(id);
	}

}
