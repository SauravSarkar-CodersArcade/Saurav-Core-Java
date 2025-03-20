public class VIT {
    static void zigzag1(int cols){
        for (int r=1; r<=3; r++){
            for(int c=1; c<=cols; c++){
                if((r+c)%4 == 0 || (r==2 && c%4 == 0)){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void zigzag2(int cols){
        for (int r=1; r<=3; r++){
            for(int c=1; c<=cols; c++){
                if((r== 1 && c%4 == 3) ||
                   (r==2 && c%2 == 0) ||
                   (r==3 && c%4 == 1)){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        for (int r=0; r<6; r++){
//            for (int c = 0; c<7; c++){
//                if(r==0 && c%3 != 0 ||
//                 r == 1 && c%3 == 0 ||
//                r-c == 2 || r+c == 8){
//                    System.out.print(" * ");
//                }else{
//                    System.out.print("   ");
//                }
//            }
//            System.out.println();
//        }
        zigzag1(9);
        zigzag2(13);
    }
}
