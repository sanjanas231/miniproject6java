import java.util.Scanner;
class Person{
    String name;
    int age;
    void getPersonDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Name: ");
        name=sc.nextLine();
        System.out.print("Enter Age: ");
        age=sc.nextInt();
    }
}
class Student extends Person{
    int roll,m1,m2,m3;
    void getStudent(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Rollno: ");
        roll=sc.nextInt();
        System.out.print("Enter Mark1: ");
        m1=sc.nextInt();
        System.out.print("Enter Mark2: ");
        m2=sc.nextInt();
        System.out.print("Enter Mark3: ");
        m3=sc.nextInt();
    }
    double calavg(){
        return (m1+m2+m3)/3.0;
    }
    double calper(){
        return ((m1+m2+m3)/300.00)*100;
    }
    void display(){
        System.out.println("\nStudent Details");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Rollno: "+roll);
        System.out.println("Mark1: "+m1);
        System.out.println("Mark2: "+m2);
        System.out.println("Mark3: "+m3);
        System.out.println("Average: "+calavg());
        System.out.println("Percentage: "+calper());
    }
}
public class stud{
    public static void main(String args[]){
        Student s[]=new Student[3];
        for(int i=0;i<3;i++){
            System.out.println("Details for Student "+(i+1));
            s[i]=new Student();
            s[i].getPersonDetails();
            s[i].getStudent();
        }
        System.out.println("==== ALL STUDENT DETAILS ====");
        for(int i=0;i<3;i++){
            s[i].display();
        }
    }
}