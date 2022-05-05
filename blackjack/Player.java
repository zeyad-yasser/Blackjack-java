
package blackjack;


public class Player
{
    
    public String name;
    public int Score;    
    private int CardCnt;
    public Card player_Cards[] = new Card[11];
    
   
    public Player(){}
    
    

    public Player(String name)
    {
        this.name = name;
    }

  
     
 
    public void add_card(Card card)
    {
        if (CardCnt<11)
        {
            player_Cards[CardCnt] = card;
            
            CardCnt++;
            
             this.Score+=card.getValue();
        }
        
        
        
    }  

    public void setName(String name) {   this.name = name;}
     
    

    public void setCardCnt(int CardCnt) { this.CardCnt = CardCnt;}
    
        

    public void setPlayer_Cards(Card[] player_Cards) {this.player_Cards = player_Cards;}
    
}
