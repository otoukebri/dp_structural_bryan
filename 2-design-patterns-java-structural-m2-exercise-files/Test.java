import java.util.List;

public class Test {

	public static void main(String[] args) {
		EmployeeClient client = new EmployeeClient();
		
		List<Employee> employees = client.getEmployeeList();
		
		System.out.println(employees);
	}
}

