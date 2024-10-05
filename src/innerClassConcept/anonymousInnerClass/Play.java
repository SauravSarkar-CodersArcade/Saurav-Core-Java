package innerClassConcept.anonymousInnerClass;

public interface Play {
    void game();
}
class AnonymousInterface{
    public static void main(String[] args) {
        Play p = new Play() {
            @Override
            public void game() {
                System.out.println("Cricket");
            }
        };
        p.game();
    }
}