//main class for UC-12

class Main_class_emp_wage {
	public static void main(String[] args) {
	   System.out.println("--------WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM----------\n");
	   
	   interface_companyEmpWage object = new EmpWageProblem(); //creating object of sub class and reference of super class(interface).
	   
	   // adding companies into an array
	   object.addCompanyEmpWage("BridgeLabz", 20, 100, 40);
	   object.addCompanyEmpWage("Tech-Mahindra", 22, 90, 30);
	   object.addCompanyEmpWage("Infosys", 25, 80, 20);
	   
	   object.computation_of_emp_wage(); //calling method for computation.
	   
	}
}
