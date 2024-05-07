package Constructors;

public class main {
    public static void main(String[] args) {
//        student student = new student("Abu",21,"Montfort",330D);
         student student1 = new student();
         System.out.println("DEBUG");
         student1.name="Abu1";
         student1.age=21;
         student1.school="Santhome";
         student1.fees=2123;
        System.out.println(student1);

    }
}
