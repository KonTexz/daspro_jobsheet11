import java.util.Arrays;

public class Numbers_29 {
    public static void main(String[] args) {
        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];
        myNumbers[0] = new int[7];
        int[][] salinan = myNumbers;
        salinan[0][0] = 99;
        System.out.println(myNumbers[0][0]);
        System.out.println(myNumbers.length);
        System.out.println(myNumbers[0].length);
        int[][] klon = myNumbers.clone();
        klon[0][0] = 77;
        System.out.println("Setelah klon[0][0] = 77, myNumbers[0][0] = " + myNumbers[0][0]);

        int[][] dalam = new int[myNumbers.length][];
        for (int i = 0; i < myNumbers.length; i++) {
            dalam[i] = myNumbers[i].clone();
        }
        dalam[0][1] = 55;
        System.out.println("Setelah dalam[0][1] = 55, myNumbers[0][1] = " + myNumbers[0][1]);
        System.out.println(Arrays.deepToString(dalam));
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }
        System.out.println(Arrays.deepToString(myNumbers));
        for (int i = 0; i < myNumbers.length; i++) {
           System.out.println("Panjang baris ke-" + (i + 1) + ": " + myNumbers[i].length);
        }
    }
}