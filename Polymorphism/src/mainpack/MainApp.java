package mainpack;

abstract class Employee {
	public void netsalary() {
		System.out.println("employee salary");
	}
}

class Intern extends Employee {
	public void netSalary() {
		System.out.println("intern stipend");
	}

}

class Confirmed extends Employee {
	public void netSalary() {
		System.out.println("confirmed employees salary");
	}
public void transport(){
	System.out.println(" transport");
}
}

class Finance {
	public void processSalary(Employee emp) {
		emp.netsalary();
		if(emp instanceof Confirmed ){
			Confirmed conf= (Confirmed) emp;
			conf.transport();
		}
		System.out.println("contract employees salary");
	}


class HR {
	public Employee recruit(String empType) {
		if (empType.equals("I")) {
			return new Intern();
		} else if (empType.equals("C"))
		{
			return new Confirmed();
		}
		return null;
	}
}

public class MainApp {
	
	public  void main(String[] args)
	{
		HR hr = new HR();
		Employee employee = hr.recruit("C");
		if (employee != null) {
			employee.netsalary();
		}
		employee = hr.recruit("I");

		if (employee != null) {
			employee.netsalary();
		}
	}
}}

