/* UC-2:- Calculate daily employee wage */
public class empWageProblem {
        public static void main(String[] args) {
                /* Displaying welcome message in masterbranch. */
                System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM.\n");

                /*Constant Variables.*/
                int isPresent = 1;
                int empRatePHr = 20;

                /*Temporary Variables */
                int empHrs = 0;
                int empWage = 0;

                /* Finding employee is present or absent */
                double empCheck = Math.floor(Math.random()*10%2);
                if(empCheck == isPresent) {
                        empHrs = 8;
                }
                else {
                        empHrs = 0;
                }
                /* Calculate employee daily wage */
                empWage = empHrs * empRatePHr;
                System.out.println("EMPLOYEE DAILY WAGE :- " + empWage + "\n");
        }
}

