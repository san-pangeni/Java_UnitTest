public class Card {

    private int value;
    private String name;

    // makes a card
    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    }

    // getters
    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    // prints card info
    public void describe() {
        System.out.println(this.name);
    }
}