package JavaOOP._018_Constructors;

public class Student {

    String name;
    int age;

    Student(String name, int age){
        System.out.println("Constructing");
        this.name = name;
        this.age = age;
        System.out.println("Constructed");

    }
    public void printStudent(){
        System.out.println("Student{" +
                "\nname = " + name +
                "\nage = " + age + "\n" +
                "}");
    }
    Student(String name) {
        this.name = name;
    }
    Student(int age) {
        this.age = age;
    }
    Student(){

    }

}
