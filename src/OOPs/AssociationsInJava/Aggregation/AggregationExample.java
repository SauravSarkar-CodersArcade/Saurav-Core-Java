package OOPs.AssociationsInJava.Aggregation;
class Library {
    String name;
    Library(String name){
        this.name = name;
    }
}
class Student {
    String name;
    Library library;
    Student(String name, Library library){
        this.name = name;
        this.library = library;
    }
    void showDetails(){
        System.out.println(name + " uses the " + library.name + " for studies.");
    }
}
public class AggregationExample {
    public static void main(String[] args) {
        Library library = new Library("Central Library");
        Student student = new Student("Saurav", library);
        student.showDetails();
    }
}
