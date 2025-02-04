import java.util.Scanner;
public class Student {
    int roll;
    String name;
//    void display(){
//        System.out.println();
//        System.out.println();
//
//    }
    Student(int roll, String name){
        this.roll=roll;
        this.name=name;
        System.out.println(roll);
        System.out.println(name);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student arr[];
        arr = new Student[3];
        arr[0] = new Student(18, "Mith");

    }

}
