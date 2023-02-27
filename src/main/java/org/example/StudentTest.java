package org.example;
import org.example.Student;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;
public class StudentTest {
    public static void main(String[] args) {
        int choice;
        String name;
        int age;
        double gpa;
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Logger logger = Logger.getLogger("com.api.jar");
        while (true) {
            logger.info("\n1)GET NAME,AGE,GPA FROM STUDENT \n2)SORT OPERATION ON GPA\n3) DISPLAY STUDENT DETAILS \n4)EXIT");
            logger.info("Choose any one of the option in the above: ");
            choice = sc.nextInt();
            if (choice == 1) {
                logger.info("ENTER THE NAME:");
                name = sc.next();
                logger.info("ENTER THE AGE: ");
                age = sc.nextInt();
                logger.info("ENTER THE GPA 1 TO 10: ");
                gpa = sc.nextDouble();
                Student st = new Student();
                st.setname(name);
                st.setage(age);
                st.setgpa(gpa);
                list.add(st);
            } else if (choice == 2) {
                list.sort((o1, o2) -> Double.compare(o2.getgpa(), o1.getgpa()));
            } else if (choice == 3) {
                for (Student studentData : list) {
                    logger.info(studentData.getname() + " " + studentData.getage() + " " + studentData.getgpa());
                }
            } else if (choice == 4) {
                break;
            }
        }
    }
}