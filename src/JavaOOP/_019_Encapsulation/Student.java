package JavaOOP._019_Encapsulation;

public class Student {

    private String name;
    private String lastName;
    private int age;
    private int yearOfCourse;
    private String course;
    private int nameCounter = 0;


    Student(String name, String lastName, int age, int yearOfCourse, String course){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.yearOfCourse = yearOfCourse;
        this.course = course;
    }
    String getName(){
        nameCounter++;
        return this.name;
    }
    String getLastName(){
        return this.lastName;
    }
    int getAge(){
        return this.age;
    }
    int getYearOfCourse(){
        return this.yearOfCourse;
    }
    String getCourse(){
        return this.course;
    }
    void setName(String name){
        if(name.matches(".*\\d.*")){
            System.out.println("Invalid name");
        }else {
            this.name = name;
        }
    }
    void setLastName(String lastName){
        if(lastName.matches(".*\\d.*")){
            System.out.println("Invalid last name");
        }else {
            this.lastName = lastName;
        }
    }
    void setAge(int age){
        if(age < 0){
            System.out.println("Invalid value of age");
        }else{
            this.age = age;
        }
    }
    void setYearOfCourse(int yearOfCourse){
        if(yearOfCourse < 1 || yearOfCourse > 5){
            System.out.println("Invalid value of year of course");
        }else{
            this.yearOfCourse = yearOfCourse;
        }
    }

    void setCourse(String course){
        this.course = course;
    }
    public void printStudent(){
        System.out.println("Student{" +
                "\nname = " + name +
                "\nage = " + age + "\n" +
                "}");
    }
    int getNameCounter(){
        return this.nameCounter;
    }


}