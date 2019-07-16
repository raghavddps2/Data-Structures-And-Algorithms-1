package Lecture11;

/**
 * student
 */
public class student {

    int age;
    String name;
    String usn;
    double fees;

    public student(int age,String name,String usn,double fees){

        this.age = age;
        this.name = name;
        this.usn = usn;
        this.fees = fees;
    }

    public void print(){
        System.out.println("Age: "+age);
        System.out.println("Name: "+name);
        System.out.println("USN "+usn);
        System.out.println("Fees "+fees);
    }

}