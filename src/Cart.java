import java.util.Scanner;

public class Cart {
    Scanner scan = new Scanner(System.in);
    static int fraga;

    /**
     * @param length antal tröjor och slipsar
     * @return varukorg i en array
     */
    public static int[] basket(int length) {
        return new int[length];
    }

    /**
     * TRÖJOR
     *
     * @param plusShirts anropar arrayen newCart
     * @param shirts     antal tröjor
     * @param price      sparas i arrayen newCart
     */
    public static void addShirts(int[] plusShirts, int shirts, int price) {
        for (int i = 0; i < shirts; i++) {
            plusShirts[i] = price;
        }
    }

    /**
     * SLIPSAR
     *
     * @param plusTies anropar newCart igen
     * @param plusOne  börjar +1 på tröjorna så ingenting skrivs över på antalet tröjor
     * @param ties     antal slipsar
     * @param price    sparas i arrayen newCart
     */
    public static void addTies(int[] plusTies, int plusOne, int ties, int price) {
        for (int i = plusOne; i < (plusOne + ties); i++) {
            plusTies[i] = price;
        }
    }


    /**
     * @param cart   anropar den fyllda varukorgen
     * @param length antal items i varukorgen
     * @return totala summan av priset av det som ligger i varukorgen
     */
    public static int totalSum(int[] cart, int length) {
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum = sum + cart[i];
        }

        return sum;
    }

    /**
     * Kör om programmet eller avsluta det
     * med hjälp av switch.
     */
    public String fraga() {
        while (true) {
            try {
                System.out.println("\nVill du köra om programmet?\n \t1 = JA \n \t2 = NEJ, AVSLUTA");
                fraga = scan.nextInt();
                if (fraga == 1 || fraga == 2)
                    break;
            } catch (Exception e) {
                scan.next();
                System.out.println("Du får endast välja '1' eller '2'. Försök igen");
            }
        }

        switch (fraga) {
            case 1:
                break;
            case 2:
                System.exit(0);
        }
        return null;
    }
}