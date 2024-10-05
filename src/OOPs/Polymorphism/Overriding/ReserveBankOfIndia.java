package OOPs.Polymorphism.Overriding;

public class ReserveBankOfIndia {
    int rateOfInterest(){return 5;}
}
class ICICI extends ReserveBankOfIndia {
    int rateOfInterest() { return 6; }
}
class AXIS extends ReserveBankOfIndia {
    int rateOfInterest() {return 7;}
}
class HDFC extends ReserveBankOfIndia {
    int rateOfInterest() {return 8;}
}
// HackerRank  PrepInsta JavaTPoint
class BankingExample {
    public static void main(String[] args) {
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();
        HDFC hdfc = new HDFC();

        System.out.println("The ROI of ICICI bank is: " + icici.rateOfInterest() + "%");
        System.out.println("The ROI of AXIS bank is: " + axis.rateOfInterest() + "%");
        System.out.println("The ROI of HDFC bank is: " + hdfc.rateOfInterest() + "%");
    }
}
