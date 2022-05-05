
package blackjack;


  public class Card {

    private int  suit;
    private int rank;
    private int value;
    
            Card ( int s, int r , int v)
            {
                this.suit=s;
                this.rank=r;
                this.value=v;
            }
            
            Card (Card c){
                this.suit=c.suit;
                this.rank=c.rank;
                this.value=c.value;
            }

    public Card() {
    }

    
    public void setSuit(int suit) {
        this.suit = suit;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setValue(int value) {
        this.value = value;
    }
            
            
            

    public int getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

    public int getValue() {
        return value;
    }


}
