package JavaEnums;

enum Level {
    LOW,
    HIGH,
    MEDIUM
}
public class EnumSwitchDemo {
    public static void main(String[] args) {
        Level var1 = Level.MEDIUM;

        switch (var1) {
            case HIGH -> System.out.println("High Priority");
            case LOW -> System.out.println("Low Priority");
            case MEDIUM -> System.out.println("Medium Priority");
            default -> System.out.println("Invalid Priority");
        }
    }
}
