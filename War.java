public class War{

   private playerHand yourHand;
   private playerHand computerHand;
   private discardPile yourDiscard;
   private discardPile computerDiscard;
   private Deck initialDeck;
   private String turnWinner;
   private String gameWinner;
   
   public War(){
      initialDeck = new Deck();
      initialDeck.shuffle();
      yourDiscard = new discardPile();
      computerDiscard = new discardPile();
      while(initialDeck.isEmpty() != true){
         yourHand.addCard(initialDeck.dealCard());
         computerHand.addCard(initialDeck.dealCard());
      }
   }
   public void turn(){
      Card yourCard = yourHand.dealCard();
      Card computerCard = computerHand.dealCard();
      if(yourCard.greaterThan(computerCard)){
         yourDiscard.addCard(yourCard);
         yourDiscard.addCard(computerCard);
         this.turnWinner = "player"; 
      }
      else if(yourCard.lessThan(computerCard)){
         computerDiscard.addCard(yourCard);
         computerDiscard.addCard(computerCard);
         this.turnWinner = "computer";
      }
      else if(yourCard.equals(computerCard)){
         warTurn();
         if(this.turnWinner == "player"){
            yourDiscard.addCard(yourCard);
            yourDiscard.addCard(computerCard);
         }
         else if(this.turnWinner == "computer"){
            computerDiscard.addCard(yourCard);
            computerDiscard.addCard(computerCard);
         }   
      }
      
   }
   public void warTurn(){
      this.turn();  
   }
   public void gameCheck(){
      if(yourHand.cardsRemaining() == 0 && yourDiscard.cardsRemaining() == 0){
         gameWinner = "computer";
      }
      else if(computerHand.cardsRemaining() == 0 && computerDiscard.cardsRemaining() == 0){
         gameWinner = "player";
      }
      if(yourHand.cardsRemaining() == 0){
         yourDiscard.toHand(yourHand);
      }
      if(computerHand.cardsRemaining() == 0){
         computerDiscard.toHand(computerHand);
      }
   }
}
      
      
         
   

   