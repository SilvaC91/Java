package JavaOOP_Advanced._11_Records__ternary_operator__BigInteger;

public record Person(String name, int age, String address) {

    @Override
    public String toString(){
        String string =   ("Name= " + this.name +
                           " Age= " + String.valueOf(this.age) +
                           " Address= " + this.address);
        return string;
    }
}
