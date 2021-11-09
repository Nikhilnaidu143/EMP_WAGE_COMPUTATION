
/* UC-1 check employee is present or absent.*/
public class EmpWageProblem {
        public static void main(String[] args) {
                /* Displaying welcome message in masterbranch. */
                System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM.\n");

                int isPresent = 1;
                                         /*employee check */
                double empCheck = Math.floor(Math.random()*10%2);

                if(empCheck == isPresent) {
                        System.out.println("EMPLOYEE IS PRESENT.");
                }
                else {
                        System.out.println("EMPLOYEE IS ABSENT.");
                }
        }
}


