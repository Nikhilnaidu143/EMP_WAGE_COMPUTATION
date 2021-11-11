// UC-8:- calculate wages for multiple companies.
public class EmpWageProblem {
   public void computation_of_emp_wage(String company_name , int totalWorkDays , int maxHrsPMonth , int empRatePHr) {

      /*Constant Variables.*/
      final int isFullTime = 2;
      final int isPartTime = 1;

      /*Temporary Variables */
      int empHrs = 0;
      int empWage = 0;
      int totalEmpWage = 0;
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
      System.out.println(company_name + " employee total wage :- " + totalEmpWage + "\n");
   }
}
