package lesson_a.task_1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder("Alex").setLastName("Fox").setAge(36).build();
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());
    }
}
