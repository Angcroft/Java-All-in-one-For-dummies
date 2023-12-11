public class EnumTest {
    //  ¡Con enum puedes hacer un tipo de variable personalizado que tiene un set
    //  limitado de valores posibles!
    public enum CardSuit {HEARTS, SPADES, CLUBS, DIAMONDS}
    public static void main(String[] args) {
        CardSuit suit;
        suit = CardSuit.HEARTS;
        System.out.println("The suit is " + suit + ".");
    }
}
