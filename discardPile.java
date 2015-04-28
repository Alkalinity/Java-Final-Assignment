import java.util.Random;
// extends cardPile
public class discardPile extends cardPile{
   //Add a card to the pile
   public void addCard(Card c){
      cardPile.add(c);
   }

   //Add the pile to playerhand
   public void toHand(playerHand h){
   
      shuffle();
      int s = cardPile.size();
      for(int i = 0; i < s; i++){
         Card c = cardPile.remove(0);
         h.addCard(c);
      }
   }
   //Shuffle the discard pile
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
   
         
      
   