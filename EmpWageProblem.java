import java.util.ArrayList;

// UC-14 :- Ability to get total employee wage when queried by company. 
public class EmpWageProblem implements interface_companyEmpWage{
	/*Constant Variables.*/
    final int isFullTime = 2;
    final int isPartTime = 1;
    
    // initializing array
    static ArrayList<CompanyEmpWage> companyEmpWageArray = new ArrayList<CompanyEmpWage>();
    
    
    // adding company details into an array
   public void addCompanyEmpWage(String company_name, int totalWorkDays, int maxHrsPMonth, int empRatePHr) {
	  
	   CompanyEmpWage CompanyEmpWage = new CompanyEmpWage(company_name, totalWorkDays, maxHrsPMonth, empRatePHr);
	   companyEmpWageArray.add(CompanyEmpWage);
   }  
    
   //setting total employee wage in an array for multiple companies.
   public void computation_of_emp_wage() {
	   for(int i = 0; i < companyEmpWageArray.size(); i++) {
		 CompanyEmpWage companyEmpWage = companyEmpWageArray.get(i);
		 companyEmpWage.setTotalEmpWage(this.computation_of_emp_wage(companyEmpWage));
		 System.out.println(companyEmpWage);
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
       
         // UC-13 :- storing daily wage along with total wage.
         System.out.println(companyEmpWage.company_name + " DAY-" + numOfDays + " wage:- " + empWage + " and employee hours :- " + empHrs);   
      }
      return companyEmpWage.totalEmpWage; //returning total employee wage
   }
   
   
   // UC-14 :- Ability to get total wage when queried by company.
   public void getTotalWage(String company_name) {
	   for(int i = 0; i < companyEmpWageArray.size(); i++) {
		  String name = companyEmpWageArray.get(i).company_name;
		   if(name.equals(company_name)) {
			 int totalWage = companyEmpWageArray.get(i).totalEmpWage;
			 System.out.println(company_name + " employee total wage :- " + totalWage);
			 break;  
		   }
		   else {
			   continue;
		   }
	   }
   }
}
