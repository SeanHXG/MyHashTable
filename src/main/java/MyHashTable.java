//Sean Guan 706067

import java.util.*;
//Imports the util package for use in the subsequent code


public class MyHashTable {
	
	// ATTRIBUTES

	// buckets is an array of ArrayList.  Each item in an ArrayList is a EmployeeInfo
	// object holding a reference value pointing to a employee.

	private ArrayList<EmployeeInfo>[] buckets;

	
	// CONSTRUCTOR

	public MyHashTable(int howManyBuckets) {
		// Construct the hash table (open hashing/closed addressing) as an array of howManyBuckets ArrayLists.

		// Instantiate buckets as an array to have an ArrayList as each element of the array.
		buckets = new ArrayList[howManyBuckets];

		// For each element in the array, instantiate its ArrayList.
		for (int i = 0; i < howManyBuckets; i++) {
			buckets[i] = new ArrayList();  // Instantiate the ArrayList for bucket i.
		}
	}


	// METHODS

	public int calcBucket(int empNumber) {
		return(empNumber % buckets.length);
		//Returns the remainder when dividing empNumber by the number of buckets in the hash table
	}


	public void addToTable(EmployeeInfo theEmployee) {
		// Add the employee referenced by theEmployee to the hash table.
		int whichBucket = 0;
		whichBucket = calcBucket(theEmployee.getEmpNumber());
		//initialize the variable whichBucket with the integer 0, then set whichBucket with the function calcBucket
		buckets[whichBucket].add(theEmployee);
		//Places the employee who is being added to the hash table into a bucket based on the remainder of their employee number being divided by the number of buckets in the hash table
		}
		

	public EmployeeInfo removeFromTable(int empNumber) {
		// Remove that employee from the hash table and return the reference value for that employee.
		// Return null if that employee isn't in the table.
		int whichBucket = -1;
		whichBucket = calcBucket(empNumber);
		//initialize the variable whichBucket with the integer -1, then set whichBucket with the function calcBucket
		int numInBucket = buckets[whichBucket].size();
		//initialize the variable numInBucket with the size of whichBucket
		int employeePosition = -1;
		//initialize the variable employeePosition with the integer -1
		for (int i=0; i<numInBucket; i++) {
			EmployeeInfo currentEmployee = buckets[whichBucket].get(i); 
			if (currentEmployee.getEmpNumber() == empNumber) {
				employeePosition = i;
			}
		}
		if (employeePosition != -1) {
			EmployeeInfo tempEmployee = buckets[whichBucket].get(employeePosition);
			buckets[whichBucket].remove(employeePosition);
			return tempEmployee;
		}
		else {
			return null;
		}
	}

	
	public EmployeeInfo getFromTable(int empNumber) {
		// Return the reference value for that employee, return null if employee isn't in the table.
		int whichBucket = -1;
		whichBucket = calcBucket(empNumber);
		int numInBucket = buckets[whichBucket].size();
		int employeePosition = -1;
		for (int i=0; i<numInBucket; i++) {
			EmployeeInfo currentEmployee = buckets[whichBucket].get(i); 
			if (currentEmployee.getEmpNumber() == empNumber) {
				employeePosition = i;
			}
		}
		if (employeePosition != -1) {
			return buckets[whichBucket].get(employeePosition);
		}
		else {
			return null;
		}
	}
	

	public boolean isInTable(int empNumber) {
		// Return true if that employee is in the hash table, false otherwise.
		int whichBucket = -1;
		whichBucket = calcBucket(empNumber);
		int numInBucket = buckets[whichBucket].size();
		int employeePosition = -1;
		for (int i=0; i<numInBucket; i++) {
			EmployeeInfo currentEmployee = buckets[whichBucket].get(i); 
			if (currentEmployee.getEmpNumber() == empNumber) {
				employeePosition = i;
			}
		}
		if (employeePosition != -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void displayList() {
		int numOfBuckets = buckets.length;
		for (int n=0; n<numOfBuckets; n++) {
			int numInBucket = buckets[n].size();
			if (numInBucket == 0) {
				System.out.println ("There's nothing in bucket " + n + ".");
			}
			else {
			for (int i=0; i<numInBucket; i++) {
				if (i!=0) {
				System.out.print(", " + buckets[n].get(i).getEmpNumber());
				}
				else {
				System.out.print("Bucket " + n + ": " + buckets[n].get(i).getEmpNumber());
				}
			}
		System.out.println();
		}
		}
	}
}