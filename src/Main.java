import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ChristmasShirts christmasShirts = new ChristmasShirts();
        FunnyTies funnyties = new FunnyTies();
        Cart cart = new Cart();


        System.out.println("\nTJÄNA PENGAR TILL DIN FÖRENING");
        System.out.println("SÄLJ ROLIGA TRÖJOR OCH SLIPSAR MED JULMOTIV FRÅN SANTA CLAUS AB");

        /**
         * While-loop gör det möjligt att köra om hela programmet i slutet om man vill.
         */
        while (true) {

            /**
             * Initierar klasserna ChristmasShirts och FunnyTies med data från antal och pris.
             * Try/catch om man skriver in ogiltig data.
             */
            System.out.println("\nAnge antal jultröjor du sålt: ");
            while (true) {
                try {
                    christmasShirts.quantity = scan.nextInt();
                    break;
                } catch (Exception e) {
                    scan.next();
                    System.out.println("Nu är du ute och cyklar. Vi jobbar endast med heltal i våra system. Försök igen.");
                    System.out.println("Ange antal jultröjor du sålt: ");
                }
            }
            System.out.println("Ange priset för en jultröja: ");

            while (true) {
                try {
                    christmasShirts.priceShirts = scan.nextInt();
                    break;
                } catch (Exception e) {
                    scan.next();
                    System.out.println("Nu är du ute och cyklar. Vi jobbar endast med heltal i våra system. Försök igen.");
                    System.out.println("Ange priset för en jultröja: ");
                }
            }

            System.out.println("Ange antal julslipsar du sålt: ");

            while (true) {
                try {
                    funnyties.quantity = scan.nextInt();
                    break;
                } catch (Exception e) {
                    scan.next();
                    System.out.println("Nu är du ute och cyklar. Vi jobbar endast med heltal i våra system. Försök igen.");
                    System.out.println("Ange antal julslipsar du sålt: ");
                }
            }

            System.out.println("Ange priset för en julslips: ");

            while (true) {
                try {
                    funnyties.priceTies = scan.nextInt();
                    break;
                } catch (Exception e) {
                    scan.next();
                    System.out.println("Nu är du ute och cyklar. Vi jobbar endast med heltal i våra system. Försök igen.");
                    System.out.println("Ange priset för en julslips: ");
                }
            }

            /**
             * Skapar en newCart och lägger i både tröjor och slipsar.
             * Räknar ut värdet av allt och skickar tillbaka resultatet.
             */
            int amount = christmasShirts.quantity + funnyties.quantity;

            int[] newCart = Cart.basket(amount);

            Cart.addShirts(newCart, christmasShirts.quantity, christmasShirts.priceShirts);

            Cart.addTies(newCart, christmasShirts.quantity, funnyties.quantity, funnyties.priceTies);

            int cartFullPrice = Cart.totalSum(newCart, newCart.length);


            System.out.println("Grattis! Du har sålt " + christmasShirts.quantity + " st jultröjor och " + funnyties.quantity + " st julslipsar" +
                    "\nPriset för en jultröja är " + christmasShirts.priceShirts + " kr." +
                    "\nPriset för en julslips är " + funnyties.priceTies + " kr." +
                    "\nTotalt har du sålt för " + cartFullPrice + " kr." +
                    "\nSANTA CLAUS AB behåller 50% av den totala summan." +
                    "\nDu har tjänat " + cartFullPrice / 2 + " kr");


            cart.fraga();
        }

    }
}