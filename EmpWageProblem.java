/* UC-4:- Solve using switch case statementt. */
public class EmpWageProblem {
   public static void main(String[] args) {
      /* Displaying welcome message in masterbranch. */
      System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM.\n");

      /*Constant Variables.*/
      final int isFullTime = 2;
      final int isPartTime = 1;
      final int empRatePHr = 20;

      /*Temporary Variables */
      int empHrs = 0;
      int empWage = 0;

      /* Finding employee is present or absent */
      int empCheck = (int) Math.floor(Math.random()*3);
      switch (empCheck) {
         case isFullTime:
            empHrs = 8;
            System.out.println("FULLTIME EMPLOYEE... ");
            break;
         case isPartTime:
            empHrs = 4;
            System.out.println("PARTTIME EMPLOYEE... ");
            break;
         default:
            empHrs = 0;
            System.out.println("EMPLOYEE IS ABSENT... ");
         }
      /* Calculate employee daily wage */
      empWage = empHrs * empRatePHr;
      System.out.println("EMPLOYEE DAILY WAGE :- " + empWage + "\n");
   }
}

