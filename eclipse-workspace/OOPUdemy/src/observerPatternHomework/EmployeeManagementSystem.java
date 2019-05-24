package observerPatternHomework;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem implements ISubject{
	Employee employee;
	String msg;
	
	private EmployeeDAO employeeDAO;
	
	List<IObserver> observers;
	List<Employee> employees;
	
	public EmployeeManagementSystem() {
		
		observers = new ArrayList<IObserver>();
		employeeDAO = new EmployeeDAO();
		employees = employeeDAO.generateEmployees();
	}
	
	public void registerObserver(IObserver observer) {
		observers.add(observer);
	}
	
	public void removeObserver(IObserver observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() {
		for(IObserver department: observers) {
			department.callMe(employee,msg);
		}
	}
	
	public void hireNewEmployee(Employee employee) {
		this.employee=employee;
		msg = "New employee: ";
		employees.add(employee);
		notifyObservers();
	}
}
