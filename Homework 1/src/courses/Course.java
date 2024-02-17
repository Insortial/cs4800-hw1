package courses;

public class Course {
    private String name;
    private Instructor[] classInstructor;

    private Textbook[] classTextbook;

    public Course(String name)
    {
        this.name = name;
        this.classInstructor = new Instructor[]{new Instructor("Nima", "Davarpanah", "3-2636"), new Instructor("Josh", "Bevet", "2-2637")};
        this.classTextbook = new Textbook[]{new Textbook("Clean Code", "Robert Martin", "Prentice Hall"), new Textbook("Dirty Code", "Mobert Rartin", "Hrentice Pall")};
    }

    public void printCourseInfo()
    {
        System.out.println("Course Name: " + name);
        for(int i = 0; i < 2; i++)
        {
            System.out.println("Instructor: " + classInstructor[i].getFirstName() + " " + classInstructor[i].getLastName());
            System.out.println("Textbook Title: " + classTextbook[i].getTitle());
            System.out.println("Textbook Author: " + classTextbook[i].getAuthor());
            System.out.println();
        }
    }

}
