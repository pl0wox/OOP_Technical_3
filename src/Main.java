import java.util.Scanner;

/*
interface Comparison{
    static void IsGreater(){

    }
    static void IsLesser(){

    }
    static void isEqual(){

    }
}

 */

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();
        Person[] person = {student,teacher};
        boolean running_main = true;

        while (running_main) {
            menu();
            switch (choice()) {
                case 1:
                    boolean running;
                    do {
                        student.addPerson();
                        running = userContinue();
                    } while (running);
                    break;
                case 2:
                    student.showPerson();
                    break;

                case 3:
                    do {
                        teacher.addPerson();
                        running = userContinue();
                    } while (running);
                    break;
                case 4:
                    teacher.showPerson();
                    break;
                case 5:
                    for(Person x : person){
                        x.showPerson();
                    }
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    running_main = false;
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }

        }

    }

    static void menu() {
        System.out.println("============");
        System.out.println("   MENU");
        System.out.println("============\n");
        System.out.println("[1] Add Student");
        System.out.println("[2] Show Student");
        System.out.println("----------------");
        System.out.println("[3] Add Teacher");
        System.out.println("[4] Show Teacher");
        System.out.println("----------------");
        System.out.println("[5] Show All Persons");
        System.out.println("[6] Exit Program");
    }


    static int choice() {
        Scanner in = new Scanner(System.in);
        boolean running = true;
        int c = 0;
        while (running) {
            System.out.print("\nPlease enter your choice: ");
            if (in.hasNextInt()) {
                c = in.nextInt();
                running = false;
            } else {
                System.out.println("Numerical Inputs only!");
                in.next();
            }
        }
        return c;
    }

    static boolean userContinue() {
        Scanner in = new Scanner(System.in);
        boolean c = true;
        boolean running = true;
        do {
            System.out.print("Do you want to continue? y/n : ");
            String choice = in.nextLine();
            if (choice.contains("y") || choice.contains("Y")) {
                running = false;
            } else if (choice.contains("n") || choice.contains("N")) {
                System.out.println("Returning to Main Menu");
                running = false;
                c = false;
            } else {
                System.out.println("Invalid Choice");
            }
        } while (running);
        return c;
    }

}

