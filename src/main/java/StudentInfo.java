
public class StudentInfo {
	
	


    // Attributes
    
    public int studentNumber;
    public String firstName;
    public String lastName;
    public int age;
    //public StudentInfo next;  // null unless pointing to the next student in the linked list.
    
    
    // Constructors
    
    public StudentInfo(int sN, String fN, String lN) {
        studentNumber = sN;
        firstName = fN;
        lastName = lN;
        //next = null; // By default don't point to any other student.
    }
    
    
    // Methods
    
    public void setStudentNumber(int sN) {
        if (sN < 0) {
            studentNumber = -1; // Set all neg student numbers as -1
        }
        else {
            studentNumber = sN;
        }
    }
    
    public int getStudentNumber() {
        return(studentNumber);
    }


}
