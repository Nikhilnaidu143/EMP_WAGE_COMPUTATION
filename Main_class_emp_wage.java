// main class for UC-7

class Main_class_emp_wage {
   public static void main(String[] args) {
		System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM.\n");
      EmpWageProblem obj = new EmpWageProblem();

		// calling method for company-1
      obj.computation_of_emp_wage("BridgeLabz" , 20 , 100 , 40);

		// calling method for company-2
      obj.computation_of_emp_wage("Tech-Mahindra" , 22 , 90 , 30);

		// calling method for company-3
      obj.computation_of_emp_wage("Infosys" , 28 , 110 , 20);
   }
}
