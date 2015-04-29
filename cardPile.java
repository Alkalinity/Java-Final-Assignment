import java.util.ArrayList;
public class cardPile{

   ArrayList<Card> cardPile;
   
   public cardPile(){
      //Card Pile is just an area
      cardPile = new ArrayList<Card>();
      
   }
   /**
   @return Card c
   */
      public Card getLastCard(){
      int length = cardPile.size();
      return cardPile.get(length-1);
   
   }
   /**
   @return Card c
   */
   public Card dealCard(){
      //remove card and return it
      Card returnCard = cardPile.remove(0);
      return returnCard;
   }
   /**
   @return int length
   */
   public int cardsRemaining(){
      //return length of array
      return cardPile.size();
   }
}
      
   