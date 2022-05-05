package blackjack;

import java.util.*;

public class Game 
{

    public Player players[] = new Player[4];
    public Card GAME_CARDS[] = new Card[52];
    public int P_HighScores[] = new int[4];
    static public int HighScore = -1;
    Scanner input = new Scanner(System.in);

    public void Gnerate_Cards()
    {
        int z = 0;
        for (int i = 0; i < 4; i++)
        {

            for (int ii = 0; ii <= 12; ii++) 
            {
                int value;
                if (ii < 9) 
                {
                    value = ii + 1;
                    Card card = new Card(i, ii, value);
                    GAME_CARDS[z] = card;
                    z++;
                } 
                
                 else     
                {
                    value = 10;
                    Card card = new Card(i, ii, value);
                    GAME_CARDS[z] = card;

                    z++;
                }

            }
        }

    }

    public Card DrawFunction() 
    {

        /*    
            Another implimntaion OF Draw function 
            do{

              int NULL_MAKER=rand.nextInt(52);
              card = GAME_CARDS [NULL_MAKER];
              GAME_CARDS[NULL_MAKER] =null;
              }while(card == null);

               return card;  
      
          }
         */
        
        Random rand = new Random();
        Card card = null;
        while (true) 
        {

            int NULL_MAKER = rand.nextInt(52);
            if (GAME_CARDS[NULL_MAKER] != null)
            {

                Card obj = new Card(GAME_CARDS[NULL_MAKER]);
                GAME_CARDS[NULL_MAKER] = null;
                return obj;

            }

        }
    }

    public void playerINFO() 
    {

        for (int i = 0; i < 3; i++)
        {

                System.out.println("Please Enter The Name OF Player no " + (i + 1));

                String ss = input.next();

                players[i] = new Player();
                players[i].setName(ss);

                players[i].add_card(DrawFunction());
                players[i].add_card(DrawFunction());
          }

        players[3] = new Player("The Dealer");
        players[3].add_card(DrawFunction());
        players[3].add_card(DrawFunction());
    }

    public void updateMaximam() 
    {
        for (int i = 0; i <= 3; i++) 
        {
            P_HighScores[i] = players[i].Score;

        }

    }

}
