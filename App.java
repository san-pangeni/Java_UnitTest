public class App {

    public static void main(String[] args) {

        // setup the game
        Deck deck = new Deck();
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        deck.shuffle();

        // deal cards
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }
        
        // play the game
        for (int i = 0; i < 26; i++) {
            // flip cards
            Card card1 = player1.flip();
            Card card2 = player2.flip();

            // compare cards
            if (card1.getValue() > card2.getValue()) {
                player1.incrementScore();
            } else if (card2.getValue() > card1.getValue()) {
                player2.incrementScore();
            }
        }

        // show final score
        System.out.println("Final Score");
        System.out.println(player1.getName() + ": " + player1.getScore());
        System.out.println(player2.getName() + ": " + player2.getScore());

        // declare winner
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " is the winner!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.getName() + " is the winner!");
        } else {
            System.out.println("It's a Draw!");
        }
    }
}