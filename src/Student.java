import java.util.Scanner;
import java.util.*;

public class Student extends Person{
    private double grade;
    public static List<Student> studentList = new ArrayList<>();

    public void setGrade(double grade){
        this.grade = grade;
    }
    public double getGrade(){
        return grade;
    }

    @Override
    public void addPerson(){
        Student student = new Student();
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        int studentCounter = (studentList.size() + 1);
        boolean running = true;
        System.out.println("\nStudent #" + studentCounter);
        System.out.print("Student Name: ");
        student.setName(in.nextLine());

        while(running) {
            System.out.print("Student Age: ");
            if(in.hasNextInt()) {
                student.setAge(in.nextInt());
                running = false;
            }
            else {
                System.out.println("Please enter a Numerical Value");
                in.next();
            }
        }
        System.out.print("Student Gender: ");
        student.setGender(in.next());

        running = true;
        while(running) {
            System.out.print("Student Grade: ");
            if(in.hasNextDouble()) {
                student.setGrade(in.nextDouble());
                running = false;
            }
            else {
                System.out.println("Please enter a Numerical Value");
                in.next();
            }
        }

        studentList.add(student);    // add student object to student LIST
    }

    @Override
    public void showPerson(){
        if(studentList.isEmpty()){
            System.out.println("No Students Registered!");
        }
        else{
        System.out.println("\n\nDisplaying Students...\n");
        for(int i = 0; i < studentList.size(); i++){
            System.out.println("Student [" + (i + 1) +"]: ");
            System.out.println("Name: " + studentList.get(i).getName());
            System.out.println("Age: " + studentList.get(i).getAge());
            System.out.println("Gender: " + studentList.get(i).getGender());
            System.out.println("Grade: " + studentList.get(i).getGrade());
            System.out.println("------------------------");
            }
        }
    }


}
