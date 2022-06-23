package edu.al.foundation.interfacesYHerencias.int02DefaultMethods;

import javax.swing.text.PlainDocument;

public class PlayingCard implements Card{

    private Card.Rank rank;
    private Card.Suit suit;



    
    public PlayingCard(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public int compareTo(Card o) {
        //Porque se hace una resta?: puede ser 0, -1 ó < 1
        return this.hashCode() - o.hashCode();
    }

    @Override
    public Suit getSuit() {
        return suit;
    }

    @Override
    public Rank getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "PlayingCard [rank=" + rank.text() + "de  suit=" + suit.text() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        /*
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        */    
        if (obj instanceof Card){
            if (((Card)obj).getRank() == this.rank 
                && ((Card)obj).getSuit() == this.suit){
                return true;                    
            }else{
                return false;
            }
        }else{
            return false;
        }
        /*
        PlayingCard other = (PlayingCard) obj;
        if (rank != other.rank)
            return false;
        if (suit != other.suit)
            return false;
        return true;
        */
    }

    @Override
    public int hashCode() {
        return ((suit.value()-1)*13)+rank.value();
    }
    
    public static void main(String[] args) {
        new PlayingCard(Rank.ACE, Suit.CLUBS);
    }
    
}
