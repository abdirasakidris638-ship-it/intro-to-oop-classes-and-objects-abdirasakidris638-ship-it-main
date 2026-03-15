
public class Main {
    public static void main(String[] args) {
  // Create two Student objects
        Student student1 = new Student("Alice Johnson", 1001);
        Student student2 = new Student("Bob Smith", 1002);
        
        // Print their names
        System.out.println("Student 1: " + student1.getName());
        System.out.println("Student 2: " + student2.getName());
        
        // Optional: Test setters
        student1.setName("Alice Williams");
        System.out.println("Updated Student 1: " + student1.getName());
    }
}
