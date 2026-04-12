// Parent Class
class Student {
    int rollNo;
    String name;

    void getStudentDetails(int r, String n) {
        rollNo = r;
        name = n;
    }

    void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

// Child Class
class CollegeStudent extends Student {
    String collegeName;

    void getCollegeDetails(String c) {
        collegeName = c;
    }

    void displayCollegeStudent() {
        displayStudent(); // Parent method call
        System.out.println("College Name: " + collegeName);
    }

    public static void main(String[] args) {

        CollegeStudent cs = new CollegeStudent();

        cs.getStudentDetails(101, "Rahul");
        cs.getCollegeDetails("ABC College");

        cs.displayCollegeStudent();
    }
}
