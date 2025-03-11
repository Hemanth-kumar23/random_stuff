
import java.util.Scanner;

public class random {

    int english;
    int Hindi;
    int maths;
    int soicial_science;
    int science;

    void add() {
        int sum = english + Hindi + maths + soicial_science + science;
        double percentage = (sum / 500.0) * 100;

        String grade;
        if (percentage >= 90) {
            grade = ("A+");
        } else if (percentage >= 80) {
            grade = ("A");
        } else if (percentage >= 70) {
            grade = ("B");
        } else if (percentage >= 60) {
            grade = ("C");
        } else {
            grade = ("fail");
        }
        System.out.println("total marks are :" + " " + sum + " " + "out of 500");
        System.out.println("percentage of student :" + percentage);
        System.out.println("Grade of this student is : " + grade);

    }
}

class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter ur english marks : ");
        int english = sc.nextInt();
        System.out.print("enter ur hindi marks : ");
        int Hindi = sc.nextInt();
        System.out.print("Enter ur maths marks : ");
        int maths = sc.nextInt();
        System.out.print("Enter ur social science : ");
        int soicial_science = sc.nextInt();
        System.out.print("Enter ur sience marks : ");
        int science = sc.nextInt();

        random obj = new random();
        obj.english = english;
        obj.Hindi = Hindi;
        obj.maths = maths;
        obj.soicial_science = soicial_science;
        obj.science = science;
        obj.add();

    }
}
