	public class PTE extends EmployeeInfo {
		
		// Attributes
		
		private double hourlyWage;
		private double hoursPerWeek;
		private double weeksPerYear;
	
		// Constructors
	
		public PTE(int eN, String fN, String lN, int g, int wL, double dR, double hW, double hPW, double wPY) {
		super (eN, fN, lN, g, wL, dR);
		hourlyWage = hW;
		hoursPerWeek = hPW;
		weeksPerYear = wPY;
		}
		
		// Methods
		public double getHourlyWage() {
			return hourlyWage;
		}
		public void setHourlyWage(int hourlyWage) {
			this.hourlyWage = hourlyWage;
		}
                
                public double getHoursPerWeek() {
			return hoursPerWeek;
		}
		public void setHoursPerWeek(int hoursPerWeek) {
			this.hoursPerWeek = hoursPerWeek;
		}
                
                public double getWeeksPerYear() {
			return weeksPerYear;
		}
		public void setWeeksPerYear(int weeksPerYear) {
			this.weeksPerYear = weeksPerYear;
		}
                
		public double calcAnnualGrossIncome() {
			return (hourlyWage*hoursPerWeek*weeksPerYear);
		}
		
		public double calcAnnualNetIncome() {
			return ((hourlyWage*hoursPerWeek*weeksPerYear)*(1-getDeductionsRate()));
		}
	}