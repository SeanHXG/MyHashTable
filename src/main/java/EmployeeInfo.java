
public class EmployeeInfo {
	
	
    // Attributes
    
    private int empNumber;
    private String firstName;
    private String lastName;
    private int gender;
    private int workLocation;
    private double deductionsRate;
        
    
    // Constructors
    
    public EmployeeInfo() {
    }
    
    public EmployeeInfo(int eN, String fN, String lN, int g, int wL, double dR) {
        empNumber = eN;
        setFirstName(fN);
        setLastName(lN);
        setGender(g);
        setWorkLocation(wL);
        setDeductionsRate(dR);
    }
    
    // Methods
    
    public void setEmpNumber(int sN) {
        if (sN < 0) {
        	empNumber = -1; // Set all neg student numbers as -1
        }
        else {
        	empNumber = sN;
        }
    }
    public int getEmpNumber() {
        return(empNumber);
    }
    
    
	public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
	
		
	public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
	
		
	public int getGender() {
			return gender;
		}
		public void setGender(int gender) {
			this.gender = gender;
		}
	
		
	public int getWorkLocation() {
			return workLocation;
		}
		public void setWorkLocation(int workLocation) {
			this.workLocation = workLocation;
		}
	
		
	public double getDeductionsRate() {
			return deductionsRate;
		}
		public void setDeductionsRate(double deductionsRate) {
			this.deductionsRate = deductionsRate;
		}
}