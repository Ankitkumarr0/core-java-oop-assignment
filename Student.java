// Student class
class Student {
    int rollNo;
    String name;
    float marks;

    // Method to display student details
    void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    // Main method
    public static void main(String[] args) {
        // Object creation
        Student s1 = new Student();

        // Assign values
        s1.rollNo = 101;
        s1.name = "Rahul";
        s1.marks = 85.5f;

        // Display details
        s1.displayDetails();
    }
}