class EmployeeStatic {

    int empId;
    String empName;
    double salary;

    // Static variable (shared by all objects)
    static String companyName = "ABC Institute";

    // Constructor
    EmployeeStatic(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println("Company Name: " + companyName);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {

        // Creating multiple objects
        EmployeeStatic e1 = new EmployeeStatic(101, "Amit", 50000);
        EmployeeStatic e2 = new EmployeeStatic(102, "Rahul", 60000);

        // Display details
        e1.displayDetails();
        e2.displayDetails();
    }
}
