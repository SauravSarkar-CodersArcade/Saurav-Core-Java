package innerClassConcept.anonymousInnerClass;

abstract class Human {
    abstract void play();
}
class AnonymousInner {
    public static void main(String[] args) {
        Human h = new Human() {
            @Override
            void play() {
                System.out.println("Football");
            }
        };
        h.play();
    }
}
