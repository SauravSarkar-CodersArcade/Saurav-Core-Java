package OOPs.Polymorphism.ObjectClassFunctions;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);
        System.out.println(person.toString());

        Point point1 = new Point(5, 10);
        Point point2 = new Point(5, 10);
        System.out.println(point1.equals(point2));

        Book book1 = new Book("Title", "Author");
        Book book2 = new Book("Title", "Author");
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
    }
}

