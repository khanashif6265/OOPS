public class Constructor {
     public static void main(String[] args) {
        Student s1 = new Student("Ashif");
       // System.out.println(s1.name);

     }
    
}
class Student {
    String name;
    int roll;
    Student(String name){
        System.out.println("Constructor is called...");
    }
}
