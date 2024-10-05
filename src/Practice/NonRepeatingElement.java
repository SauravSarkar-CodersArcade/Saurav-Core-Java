package Practice;
enum TrafficSignal {
    RED, GREEN, ORANGE
}
class NonRepeatingElement {
    public static void main(String[] args) {
        // enum_name var_name = enum_name.value;
        TrafficSignal l1 = TrafficSignal.GREEN;
        TrafficSignal l2 = TrafficSignal.ORANGE;
        TrafficSignal l3 = TrafficSignal.RED;
        System.out.println("The signal is: " + l1);
    }
}
