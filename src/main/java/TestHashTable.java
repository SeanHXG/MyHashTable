
public class TestHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyHashTable theHT = new MyHashTable(10);  // Use 10 buckets for this hash table.
		
		
		EmployeeInfo removedEmployee;
		
		FTE someFTE;
		PTE somePTE;
		
		FTE removedFTE;
		PTE removedPTE;
		
		
		// Employee number, first name, last name, gender, work location, deductions rate,
		// annual salary.
		someFTE = new FTE(123456, "Bugs", "Bunny", 0, 0, 0.25, 60000.00);
		theHT.addToTable(someFTE);
		
		// Employee number, first name, last name, gender, work location, deductions rate,
		// hourly wage, hours per week, weeks per year.
		somePTE = new PTE(111111, "Daffy", "Duck", 0, 3, 0.15, 5.0, 10.0, 15.0);
		theHT.addToTable(somePTE);
		
		removedEmployee = theHT.removeFromTable(123456);
		if (removedEmployee != null) {
			if (removedEmployee instanceof FTE) {
				removedFTE = (FTE) removedEmployee;
				System.out.println("Emp number of removed employee is " + Integer.toString(removedFTE.getEmpNumber()));
				System.out.println("Annual salary of removed employee is " + Double.toString(removedFTE.calcAnnualGrossIncome()));
			}
			if (removedEmployee instanceof PTE) {
				removedPTE = (PTE) removedEmployee;
				System.out.println("Removed employee is part time");
				System.out.println("Emp number of removed employee is " + Integer.toString(removedPTE .getEmpNumber()));
				System.out.println("Annual salary of removed employee is " + Double.toString(removedPTE.calcAnnualGrossIncome()));
			}
		}
		else {
			System.out.println("Could not find that employee in the table!");
		}
		
		removedEmployee = theHT.removeFromTable(111111);
		if (removedEmployee != null) {
			if (removedEmployee instanceof FTE) {
				removedFTE = (FTE) removedEmployee;
				System.out.println("Emp number of removed employee is " + Integer.toString(removedFTE.getEmpNumber()));
				System.out.println("Annual salary of removed employee is " + Double.toString(removedFTE.calcAnnualGrossIncome()));
			}
			if (removedEmployee instanceof PTE) {
				removedPTE = (PTE) removedEmployee;
				System.out.println("Removed employee is part time");
				System.out.println("Emp number of removed employee is " + Integer.toString(removedPTE .getEmpNumber()));
				System.out.println("Annual salary of removed employee is " + Double.toString(removedPTE.calcAnnualGrossIncome()));
			}
		}
		else {
			System.out.println("Could not find that employee in the table!");
		}
		
	}  // end main

}
