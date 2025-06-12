import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    // list of cards
    List<Card> cards = new ArrayList<>();

    // constructor
    public Deck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"Two", "Three", "Four", "Five", "Six", "Seven", 
                          "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};

        // makes a full 52-card deck
        for (String suit : suits) {
            for (int i = 0; i < ranks.length; i++) {
                cards.add(new Card(i + 2, ranks[i] + " of " + suit));
            }
        }
    }

    // shuffle the deck
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // draw a card
    public Card draw() {
        return cards.remove(0);
    }
}