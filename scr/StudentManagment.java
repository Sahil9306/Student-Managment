import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private int age;
    private String brach;
    private double fees;

    public Student(int id, String name, int age, String brach , double fees) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.fees = fees;
        this.brach = brach;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String  getBrach(){
        return brach;
    }
    public void setBrach(String brach){
        this.brach = brach ;
    }
    public double getFees() {
        return fees;
    }
    public void setFees(double fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + ", Fees=" + fees + ",Class ="+ brach +"]";
    }
}

class StudentManagementSystem {
    private ArrayList<Student> student = new ArrayList<Student>();

    public void addStudent(Student e) {
        student.add(e);
    }

    public void removeStudent(int id) {
        for (int i = 0; i < student.size(); i++) {
            Student e = student.get(i);
            if (e.getId() == id) {
                student.remove(i);
                break;
            }
        }
    }

    public void displayStudent() {
        for (Student e : student) {
            System.out.println(e);
        }
    }
}

public class StudentManagment {
    public static void main(String[] args) {
        StudentManagementSystem ems = new StudentManagementSystem();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Student Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the Class:");
                    String Class = sc.nextLine();
                    System.out.print("Enter Student fees: ");
                    double fees = sc.nextDouble();
                    sc.nextLine();
                    Student e = new Student(id, name, age, Class ,fees);
                    ems.addStudent(e);
                    System.out.println("Student added successfully!");
                    break;
                case 2:
                    System.out.print("Enter Student ID to remove: ");
                    int removeId = sc.nextInt();
                    sc.nextLine();
                    ems.removeStudent(removeId);
                    System.out.println("Student removed successfully!");
                    break;
                case 3:
                    System.out.println("List of Student:");
                    ems.displayStudent();
                    break;
                case 4:
                    System.out.println("Exiting Student Management System...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
        sc.close();
    }
}
