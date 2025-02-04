import java.util.Scanner;
public class Student {
    int roll;
    String name;
    Student(int roll, String name){
        this.roll=roll;
        this.name=name;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student arr[];
        arr = new Student[3];
        arr[0] = new Student(18, "Saad");
        arr[1] = new Student(19, "Saad ka bhai");
        arr[2] = new Student(121, "Shizuka");
        for(int i=0; i<3; i++){
            System.out.println("name:"+ arr[i].name);
            System.out.println("roll no.: "+ arr[i].roll);
        }
    }
}
