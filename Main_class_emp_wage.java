class Main_class_emp_wage {
	public static void main(String[] args) {
	   System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM.\n");
	   
	   // creating object of EmpWageProblem class.
	   EmpWageProblem obj = new EmpWageProblem();
	   
	   // adding companies into an array
	   obj.addCompanyEmpWage("BridgeLabz", 20, 100, 40);
	   obj.addCompanyEmpWage("Tech-Mahindra", 22, 90, 30);
	   obj.addCompanyEmpWage("Infosys", 25, 80, 20);
	   
	   obj.computation_of_emp_wage(); //calling method for computation.
	   
	}
}
