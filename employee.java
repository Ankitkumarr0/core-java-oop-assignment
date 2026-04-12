class employee {

    int empId;
    String empName;
    double salary;

    // Constructor
    employee(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("employee ID: " + empId);
        System.out.println("employee Name: " + empName);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        // Object initialization using constructor
        employee e1 = new employee(101, "Amit", 50000);

        // Display details
        e1.displayDetails();
    }
}
