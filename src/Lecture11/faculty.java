package Lecture11;
/**
 * faculty
 */
public class faculty {

    String name;
    private static int numOfFaculty;
    final int rollNumber;

    //This is the constructor called when the object is created.
    faculty(String name,int rollNumber){
        System.out.println(this);
        this.name = name;
        this.rollNumber = rollNumber;
        numOfFaculty++;
    }

    //To be accessed by class, so we make it as static.
    public static int getNumFaculty(){
        return numOfFaculty;
    }

}