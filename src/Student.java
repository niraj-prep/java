package Assignment;

public class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }

    public static void main(String[] args) {

        Student s = new Student(101, "Niraj");

        System.out.println(s);
    }
}
