public class Student {
      // 1. Private fields (Encapsulation)
    private String name;
    private int studentId;
    
    // 2. Constructor - initializes the fields
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }
        // 3. Getter for name
    public String getName() {
        return name;
    }
    
    // 4. Setter for name
    public void setName(String name) {
        this.name = name;
    }
    
    // 5. Getter for studentId
    public int getStudentId() {
        return studentId;
    }
    
    // 6. Setter for studentId
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
