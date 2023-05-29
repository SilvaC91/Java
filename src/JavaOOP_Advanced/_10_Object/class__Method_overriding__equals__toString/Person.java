package JavaOOP_Advanced._10_Object.class__Method_overriding__equals__toString;

public class Person {

    private String name,address;
    private int age;

    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getage(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getaddress(){
        return this.address;
    }
    public void setaddress(String address){
        this.address = address;
    }


    @Override
    public String toString(){
        return "Meal{" +
                "name= " + this.name +
                ", age= " + this.age +
                ", address= " + this.address +
                "}";
    }

    @Override
    public int hashCode(){
        int hashCode = this.name.hashCode() + this.age + this.address.hashCode();
        return hashCode;
    }
}
