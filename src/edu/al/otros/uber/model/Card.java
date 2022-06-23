package edu.al.otros.uber.model;

public class Card extends Payment{
    Integer numberCard;
    String dateCard;
    String cvv;
    
    public Card(Integer id, Integer numberCard, String dateCard, String cvv) {
        super(id);
        this.cvv = cvv;
        this.dateCard = dateCard;
        this.numberCard = numberCard;
    }
    
}
