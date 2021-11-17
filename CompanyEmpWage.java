// creating interface 
interface interface_companyEmpWage {
	
	// declaring methods
	public abstract void addCompanyEmpWage(String company_name, int totalWorkDays, int maxHrsPMonth, int empRatePHr);

	public void computation_of_emp_wage();
	
	public void getTotalWage(String company);  // UC-14 :- declared method to get total wage when company queried.
	
} 

public class CompanyEmpWage {
	// constant variables
	final String company_name;
    final int totalWorkDays;
    final int maxHrsPMonth; 
    final int empRatePHr;
    
    int totalEmpWage;

    // initialising constructors
	public CompanyEmpWage(String company_name, int totalWorkDays, int maxHrsPMonth, int empRatePHr) {
		super();
		this.company_name = company_name;
		this.totalWorkDays = totalWorkDays;
		this.maxHrsPMonth = maxHrsPMonth;
		this.empRatePHr = empRatePHr;
	}

	// initialising getter and setter for totalEmpWage variable
	public int getTotalEmpWage() {
		return totalEmpWage;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
    
	// overriding toString method to return in required string format.
	@Override
	public String toString() {
		return "\n" + company_name + " employee total wage :- " + totalEmpWage + "\n" 
				+ "-------------------------------------------------------------------" + "\n";
	}
}
