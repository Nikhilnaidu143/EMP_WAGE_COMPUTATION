/*UC-3:- Added parttime employee and calculated wage */
public class EmpWageProblem {
  public static void main(String[] args) {
	 	/* Displaying welcome message in masterbranch. */
	  System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM.\n");

    /*Constant Variables.*/
    int isFullTime = 2;
    int isPartTime = 1;
    int empRatePHr = 20;

		/*	Temporary variables */
		int empHrs = 0;
		int empWage = 0;


    double empCheck = Math.floor(Math.random()*3);
    if(empCheck == isFullTime) {
      empHrs = 8;
      System.out.println("FULLTIME EMPLOYEE... ");
   	}
    else if (empCheck == isPartTime) {
      empHrs = 4;
      System.out.println("PARTTIME EMPLOYEE... ");
  	}
    else{
      empHrs = 0;
      System.out.println("EMPLOYEE IS ABSENT... ");
    }
    /* Calculate employee daily wage */
    empWage = empHrs * empRatePHr;
    System.out.println("EMPLOYEE DAILY WAGE :- " + empWage + "\n");
	}
}

