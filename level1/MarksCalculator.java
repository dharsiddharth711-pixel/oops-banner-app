public class MarksCalculator {
    public static void main(String[] args) {
        int mM = 94; //out of 100
        int pM = 95; //out of 100
        int cM = 96; //out of 100
        int tS = 3;
        int tM = mM + pM + cM;
        double aM = (double) tM / tS;
        System.out.println("Sam's average mark in PCM is " + aM);
    }
}