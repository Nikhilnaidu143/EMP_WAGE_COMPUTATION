/*UC-5:-  CALCULATE WAGES FOR A MONTH */
public class EmpWageProblem {
   public static void main(String[] args) {
      /* Displaying welcome message in masterbranch. */
      System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM.\n");

      /*Constant Variables.*/
      final int isFullTime = 2;
      final int isPartTime = 1;
      final int empRatePHr = 20;
      final int totalWorkDays = 20;

      /*Temporary Variables */
      int empHrs = 0;
      int empWage = 0;
      int totalEmpWage = 0;

      /* Finding employee is present or absent */
      for(int day=1; day<=totalWorkDays; day++) {
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
         empWage = empHrs * empRatePHr;
         totalEmpWage = totalEmpWage + empWage;
         System.out.println("EMPLOYEE day-" + day + " income :- " + empWage);
      }
      System.out.println("\nEMPLOYEE TOTAL WAGE :- " + totalEmpWage + "\n");
   }
}


