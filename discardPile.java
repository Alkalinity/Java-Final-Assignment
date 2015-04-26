import java.util.Random;

public class discardPile extends cardPile{

   public void addCard(Card c){
      cardPile.add(c);
   }

   public void toHand(playerHand h){
   
      shuffle();
      int s = cardPile.size();
      for(int i = 0; i < s; i++){
         Card c = cardPile.remove(0);
         h.addCard(c);
      }
   }
   public void shuffle(){
      
      int randNum;
      Card temp;
      Random r = new Random();
      for (int i = 0; i < cardPile.size(); i++)
      {
         randNum = r.nextInt(cardPile.size());
         temp = cardPile.get(i);
         cardPile.set(i,cardPile.get(randNum));
         cardPile.set(randNum,temp);
      }
   }
}
   
         
      
   