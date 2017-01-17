package JavaInterfaces;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 * Created by arpit on 16/1/17.
 */
public interface Deck {

    List<Card> getCards();
    Deck deckFactory();
    int size();
    void addCard(Card card);
    void addCards(List<Card> cards);
    void addDeck(Deck deck);
    void shuffle();
    void sort();
    void sort(Comparator<Card> c);
    String deckToString();

    Map<Integer,Deck> deal(int players, int numberofCards) throws IllegalArgumentException;
}
