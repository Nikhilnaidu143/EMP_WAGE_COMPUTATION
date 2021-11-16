class Main_class_emp_wage {
	public static void main(String[] args) {
	   System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM.\n");
	   
	   // company-1
	   EmpWageProblem BridgeLabz = new EmpWageProblem("BrideLabz" , 20 , 100 , 40);
	   BridgeLabz.computation_of_emp_wage();
	   
	   System.out.println(BridgeLabz + "\n");
	   
	   //company-2
	   EmpWageProblem TechMahindra = new EmpWageProblem("Tech-Mahindra", 22 , 90 , 30);
	   TechMahindra.computation_of_emp_wage();
	   
	   System.out.println(TechMahindra + "\n");
	   
	   //company-3
	   EmpWageProblem Infosys = new EmpWageProblem("Infosys", 22 , 90 , 30);
	   Infosys.computation_of_emp_wage();
	   
	   System.out.println(Infosys + "\n");	   
	}
}
