package OOPs.AssociationsInJava.Composition;

public class Cat {
    private String name;
    // pet cat belongs to the owner/Human
    private Human owner;

    public Cat(String name, Human owner){
        this.name = name;
        this.owner = owner;
    }
    public String toString(){
        return String.format("My name is %s & I belong to %s", name, owner);
    }
}
