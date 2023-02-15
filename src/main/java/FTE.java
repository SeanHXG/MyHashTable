	public class FTE extends EmployeeInfo {

			
		// Attributes
			
		private double yearlySalary;
	
		// Constructors
	
		public FTE(int eN, String fN, String lN, int g, int wL, double dR, double yS) {
	    super (eN, fN, lN, g, wL, dR);
	    yearlySalary = yS;
		}
		
		// Methods
                
                public double getYearlySalary() {
			return yearlySalary;
		}
		public void setYearlySalary(int yearlySalary) {
			this.yearlySalary = yearlySalary;
		}
		
		public double calcAnnualGrossIncome() {
		return (yearlySalary);
		}
		public double calcAnnualNetIncome() {
			return (yearlySalary*(1-getDeductionsRate()));
		}
	}