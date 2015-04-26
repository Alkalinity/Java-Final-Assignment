import java.util.ArrayList;
public class cardPile{

   ArrayList<Card> cardPile;
   
   public cardPile(){
   
      cardPile = new ArrayList<Card>();
      
   }
   
   public Card dealCard(){
      Card returnCard = cardPile.remove(0);
      return returnCard;
   }
   
   public int cardsRemaining(){
      return cardPile.size();
   }
}
      
   