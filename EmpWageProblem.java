//UC-11 :- Aility to manage employee wage for multiple companies using INTERFACE approach.
public class EmpWageProblem implements interface_companyEmpWage{
	/*Constant Variables.*/
    final int isFullTime = 2;
    final int isPartTime = 1;
    
    int num_Of_Companies = 0;
    // initializing array
    CompanyEmpWage[] companyEmpWageArray = new CompanyEmpWage[5];
    
    
    // adding company details into an array
   public void addCompanyEmpWage(String company_name, int totalWorkDays, int maxHrsPMonth, int empRatePHr) {
	   companyEmpWageArray[num_Of_Companies] = new CompanyEmpWage(company_name, totalWorkDays, maxHrsPMonth, empRatePHr);
	   num_Of_Companies++;
   } 
    
   //setting total employee wage in an array for multiple companies.
   public void computation_of_emp_wage() {
	   for(int i = 0; i < num_Of_Companies; i++) {
		   companyEmpWageArray[i].setTotalEmpWage(computation_of_emp_wage(companyEmpWageArray[i]));
		   System.out.println(companyEmpWageArray[i]);
	   }
   } 

   // calculation of total employee wage
   public int computation_of_emp_wage(CompanyEmpWage companyEmpWage) {

      /*Temporary Variables */
      int empHrs = 0;
      int empWage = 0;
      
      int totalEmpHrs = 0;
      int numOfDays = 0;

      /* Finding employee is present or absent */
      while (totalEmpHrs <= companyEmpWage.maxHrsPMonth && numOfDays < companyEmpWage.totalWorkDays ) {
         numOfDays++;
         int empCheck = (int) Math.floor(Math.random()*3);
         switch (empCheck) {
            case isFullTime:
               empHrs = 8;
               break;
            case isPartTime:
               empHrs = 4;
               break;
            default:
               empHrs = 0;
            }
      /* Calculate employee total wage */
         totalEmpHrs += empHrs;
         empWage = totalEmpHrs * companyEmpWage.empRatePHr;
         companyEmpWage.totalEmpWage = companyEmpWage.totalEmpWage + empWage;
      }
      return companyEmpWage.totalEmpWage; //returning total employee wage
   }
}
