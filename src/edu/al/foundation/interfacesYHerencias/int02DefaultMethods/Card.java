package edu.al.foundation.interfacesYHerencias.int02DefaultMethods;

public interface Card extends Comparable<Card> {
    public enum Suit{
        DIAMONDS(1, "Diamonds"),
        CLUBS(1, "Clubs"),
        HEARTS(1, "Hearts"),
        SPADES(1, "Spades");

        private final int value;
        private final String text;

        Suit(int value, String text){
            this.value = value;
            this.text = text;
        }

        public int value(){return value;}
        public String text(){return text;}
    }

    public enum Rank{
        DEUCE  (2 , "Two"  ),
        THREE  (3 , "Three"), 
        FOUR   (4 , "Four" ), 
        FIVE   (5 , "Five" ), 
        SIX    (6 , "Six"  ), 
        SEVEN  (7 , "Seven"),
        EIGHT  (8 , "Eight"), 
        NINE   (9 , "Nine" ), 
        TEN    (10, "Ten"  ), 
        JACK   (11, "Jack" ),
        QUEEN  (12, "Queen"), 
        KING   (13, "King" ),
        ACE    (14, "Ace"  );

        //Estas declaraciones extras 
        //hay que entenderlas pues en la documentación oficial de Oracle
        //no hay mayor detalle. Y esto hace que se puede usar el método
        //getRank() más abajo utilizado
        //-->
        private final int value;
        private final String text;

        Rank(int value, String text) {
            this.value = value;
            this.text = text;
        }
        
        public int value() {return value;}
        public String text() {return text;}
        //<--
        
    }

    public Card.Suit getSuit();
    public Card.Rank getRank();
    
}
