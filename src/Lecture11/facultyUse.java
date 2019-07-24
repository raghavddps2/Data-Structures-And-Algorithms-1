package Lecture11;
/**
 * facultyUse
 */
public class facultyUse {

    public static void main(String[] args) {
        
        faculty f1 = new faculty("Nidhi Agarwal",100);
        faculty f2 = new faculty("Ankush Singla", 101);

        System.out.println(f1.name+": RollNumber: "+f1.rollNumber);
        System.out.println(f2.name+": RollNumber: "+f2.rollNumber);
        System.out.println(faculty.getNumFaculty()); //This will give the number of faculty.
    }
}