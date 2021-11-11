// UC-7:-Refactor the Code to write a Class Method to Compute employee wage.
public class EmpWageProblem {
   public void computation_of_emp_wage() {
      /* Displaying welcome message in masterbranch. */
      System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM.\n");

      /*Constant Variables.*/
      final int isFullTime = 2;
      final int isPartTime = 1;
      final int empRatePHr = 20;
      final int totalWorkDays = 20;
      final int maxHrsPMonth = 100;

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
         System.out.println("EMPLOYEE day-" + numOfDays + " income :- " + empWage);
      }
      System.out.println("\nEMPLOYEE TOTAL WAGE :- " + totalEmpWage + "\n");
   }
}
