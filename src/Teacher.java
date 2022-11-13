import java.util.*;

public class Teacher extends Person {
    private int salary;
    public static List<Teacher> teacherList = new ArrayList<>();

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void addPerson() {
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        Teacher teacher = new Teacher();
        int teacherCounter = (teacherList.size() + 1);
        boolean running = true;
        System.out.println("\nTeacher #" + teacherCounter);
        System.out.print("Teacher Name: ");
        teacher.setName(in.nextLine());

        while(running) {
            System.out.print("Teacher Age: ");
            if(in.hasNextInt()) {
                teacher.setAge(in.nextInt());
                running = false;
            }
            else {
                System.out.println("Please enter a Numerical Value");
                in.next();
            }
        }
        System.out.print("Teacher Gender: ");
        teacher.setGender(in.next());

        running = true;
        while(running) {
            System.out.print("Teacher Salary: ");
            if(in.hasNextInt()) {
                teacher.setSalary(in.nextInt());
                running = false;
            }
            else {
                System.out.println("Please enter a Numerical Value");
                in.next();
            }
        }

        teacherList.add(teacher); // add student object to student LIST
    }

    @Override
    public void showPerson() {
        if (teacherList.isEmpty()) {
            System.out.println("No Teachers Registered!");
        } else {
            System.out.println("Displaying Teachers...\n");

            for (int i = 0; i < teacherList.size(); i++) {
                System.out.println("Teacher [" + (i + 1) + "]: ");
                System.out.println("Name: " + teacherList.get(i).getName());
                System.out.println("Age: " + teacherList.get(i).getAge());
                System.out.println("Gender: " + teacherList.get(i).getGender());
                System.out.println("Salary: " + teacherList.get(i).getSalary());
                System.out.println("------------------------");
            }
        }
    }
}
