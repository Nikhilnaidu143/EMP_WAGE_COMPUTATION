// UC-9 :- Ability to save total wage for each company.

public class EmpWageProblem {
	/*Constant Variables.*/
    final int isFullTime = 2;
    final int isPartTime = 1;
    
    final String company_name;
    final int totalWorkDays;
    final int maxHrsPMonth; 
    final int empRatePHr;
    
    int totalEmpWage;
    
   public EmpWageProblem(String company_name, int totalWorkDays, int maxHrsPMonth, int empRatePHr) {
		this.company_name = company_name;
		this.totalWorkDays = totalWorkDays;
		this.maxHrsPMonth = maxHrsPMonth;
		this.empRatePHr = empRatePHr;
	}

   public int computation_of_emp_wage() {

      /*Temporary Variables */
      int empHrs = 0;
      int empWage = 0;
      
      int totalEmpHrs = 0;
      int numOfDays = 0;

      /* Finding employee is present or absent */
      while (totalEmpHrs <= maxHrsPMonth && numOfDays < totalWorkDays ) {
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
         empWage = totalEmpHrs * empRatePHr;
         totalEmpWage = totalEmpWage + empWage;
      }
      return totalEmpWage;
   }
   
   @Override
   public String toString() {
	   return company_name + " employee total wage :- " + totalEmpWage;
   }
}
