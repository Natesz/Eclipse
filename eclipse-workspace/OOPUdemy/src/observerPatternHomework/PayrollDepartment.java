package observerPatternHomework;

public class PayrollDepartment implements IObserver{
	public void callMe(Employee employee, String msg) {
		System.out.println("Payroll department ertesitve");
		System.out.println(msg + " " + employee.getName());
	}
}
