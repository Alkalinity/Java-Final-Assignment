public class War{

   private playerHand yourHand; //Piles for hand and discard
   private playerHand computerHand;
   private discardPile yourDiscard;
   private discardPile computerDiscard;
   private Deck initialDeck; //The deck
   private String turnWinner; // Game States
   private String gameWinner;
   private Card yourCard;
   private Card computerCard;
   //Default constructor
   public War(){
      //New deck
      initialDeck = new Deck();
      //Shuffle it
      initialDeck.shuffle();
      //Create new piles
      yourDiscard = new discardPile();
      computerDiscard = new discardPile();
      yourHand = new playerHand();
      computerHand = new playerHand();
      //Deal the deck
      gameWinner = "none"; 
      while(initialDeck.isEmpty() != true){
         yourHand.addCard(initialDeck.dealCard());
         computerHand.addCard(initialDeck.dealCard());
      }
   }
   //One turn of War
   public void turn(){
   //Deal two cards and compare
      yourCard = yourHand.dealCard();
      computerCard = computerHand.dealCard();
      //You win
      if(yourCard.greaterThan(computerCard)){
         yourDiscard.addCard(yourCard);
         yourDiscard.addCard(computerCard);
         this.turnWinner = "player";
         this.gameCheck(); 
      }
      //They win
      else if(yourCard.lessThan(computerCard)){
         computerDiscard.addCard(yourCard);
         computerDiscard.addCard(computerCard);
         this.turnWinner = "computer";
         this.gameCheck();
      }
      //War
      else if(yourCard.equals(computerCard)){
         this.turnWinner = "war";
         warTurn();
         if(this.turnWinner == "player"){
            yourDiscard.addCard(yourCard);
            yourDiscard.addCard(computerCard);
            this.turnWinner = "war_player";
            this.gameCheck();
         }
         else if(this.turnWinner == "computer"){
            computerDiscard.addCard(yourCard);
            computerDiscard.addCard(computerCard);
            this.turnWinner = "war_computer";
            this.gameCheck();
         }   
      }
      
   }
   //War turn, does another turn
   public void warTurn(){
      this.turn();  
   }
   //Check game states, if someone wins or wins the war
   public void gameCheck(){
      if(yourHand.cardsRemaining() == 0 && yourDiscard.cardsRemaining() == 0){
         gameWinner = "computer";
      }
      else if(computerHand.cardsRemaining() == 0 && computerDiscard.cardsRemaining() == 0){
         gameWinner = "player";
      }
      if(yourHand.cardsRemaining() == 1 || yourHand.cardsRemaining() == 0){
         yourDiscard.toHand(yourHand);
      }
      if(computerHand.cardsRemaining() == 1 || computerHand.cardsRemaining() == 0){
         computerDiscard.toHand(computerHand);
      }
   }
   //Getter
   /**
   @return cardPile yourDiscard
   */
   public cardPile getYourDiscard(){
      return this.yourDiscard;
   }
   /**
   @return cardPile computerDiscard
   */
   public cardPile getComputerDiscard(){
      return this.computerDiscard;
   }
   /**
   @return cardPile yourHand
   */
   public cardPile getYourHand(){
      return this.yourHand;
   }
   /**
   @return cardPile computerHand
   */
   public cardPile getComputerHand(){
      return this.computerHand;
   }
   /**
   @return Card yourCard
   */
   public Card getYourCard(){
      return this.yourCard;
   }
   /**
   @return Card computerCard
   */
   public Card getComputerCard(){
      return this.computerCard;
   }
   /**
   @return String gameWinner
   */
   public String getGameWinner(){
      return this.gameWinner;
   }
   /**
   @return String turnWinner
   */
   public String getTurnWinner(){
      return this.turnWinner;
   }

}
      
      
         
   

   