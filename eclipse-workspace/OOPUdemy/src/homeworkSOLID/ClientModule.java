package homeworkSOLID;

public class ClientModule {
	public static void main(String args[]) {
		Employee doki = new Employee(0, "doki", null, false);
		ClientModule.hireNewEmployee(doki);
		
		ClientModule.printEmployeeReport(doki, FormatType.CSV);
	}
	
	public static void hireNewEmployee(Employee employee) {
		EmployeeDAO empDAO = new EmployeeDAO();
		empDAO.saveEmployee(employee);
	}
	
	public static void terminateNewEmployee(Employee employee) {
		EmployeeDAO empDAO = new EmployeeDAO();
		empDAO.deleteEmployee(employee);
	}
	
	public static void printEmployeeReport(Employee employee, FormatType formatType) {
		EmployeeReportFormatter employeeReportFormatter = new EmployeeReportFormatter(employee, formatType);
		System.out.println(employeeReportFormatter.getFormattedEmployee());
	}
}
