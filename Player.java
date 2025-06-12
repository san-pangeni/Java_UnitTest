import java.util.ArrayList;
import java.util.List;

public class Player {

private List<Card> hand = new ArrayList<>();
private int score;
private String name;

// player constructor
public Player(String name) {
    this.name = name;
    this.score = 0; // score starts at 0
}

// flips top card
public Card flip() {
    return hand.remove(0);
}

// draws a card and adds to hand
public void draw(Deck deck) {
    hand.add(deck.draw());
}

// adds 1 to score
public void incrementScore() {
    this.score++;
}

// get score
public int getScore() {
    return this.score;
}

// get name
public String getName() {
    return this.name;
}
}