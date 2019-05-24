package observerPatternHomework;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	Employee kitti = new Employee("Kitti");
	Employee anna = new Employee("Anna");
	Employee vili = new Employee("Vili");
	
	public List<Employee> generateEmployees(){
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(kitti);
		list.add(anna);
		list.add(vili);
		
		return list;
	}
}
