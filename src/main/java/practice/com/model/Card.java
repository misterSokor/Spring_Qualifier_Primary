package practice.com.model;

public class Card {
    private String cardNumber;
    private CardType cardType;

    public enum CardType {
        USUAL, GOLD
    }

    public Card(String cardNumber, CardType cardType) {
        this.cardNumber = cardNumber;
        this.cardType = cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return "Card{" +
               "cardNumber='" + cardNumber + '\'' +
               ", card type='" + cardType + '\'' +
               '}';
    }
}
