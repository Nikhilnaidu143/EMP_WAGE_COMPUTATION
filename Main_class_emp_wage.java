//main class for UC-13

class Main_class_emp_wage {
	public static void main(String[] args) {
	   System.out.println("--------WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM----------\n");
	   
	   interface_companyEmpWage object = new EmpWageProblem(); //creating object of sub class and reference of super class(interface).
	   
	   // adding companies into an array
	   object.addCompanyEmpWage("BridgeLabz", 20, 100, 40);
	   object.addCompanyEmpWage("Tech-Mahindra", 20, 90, 30);
	   object.addCompanyEmpWage("Infosys", 20, 80, 20);
	   
	   object.computation_of_emp_wage(); //calling method for computation
	   
	   
	   // uc-14:- get total wage when queried by company
	   object.getTotalWage("BridgeLabz");
	}
}
