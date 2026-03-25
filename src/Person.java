package Assignment;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge()     { return age; }

    @Override
    public String toString() {
        return "Person { name='" + name + "', age=" + age + " }";
    }

    public static void main(String[] args) {

        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Bob",   25);

        System.out.println(p1);
        System.out.println(p2);
    }
}
