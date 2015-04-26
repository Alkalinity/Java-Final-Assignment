/**
The Card Class simulates a playing Card witha  suit or
a rank
*/
public class Card{
   
   /* Setting public constants for suit and named ranks */
   public final static int SPADES = 0; // Spades
   public final static int CLUBS = 1; // Clubs
   public final static int HEARTS = 2; // Hearts
   public final static int DIAMONDS = 3; //Diamonds
   public final static int JOKER = 4; // Joker is 5 if needed
   
   public final static int ACE = 1; // Ace is low in this case
   public final static int JACK = 11; // Jack is 11
   public final static int QUEEN = 12; // Queen is 12
   public final static int KING = 13; // King is 13
   
   /* private data for rank and suit of card */
   private int rank;
   private int suit;
   private String image;
   
   /**
   Constructor for Card that takes the rank and the suit
   */
   public Card(int rank, int suit){
      this.rank = rank;
      this.suit = suit;
      image = this.getImage();
   }
   /** Getter for Rank
      @return rank
   */
   public int getRank(){
      return rank;
   }
   /** Getter for Suit
   @return suit
   */
   public int getSuit(){
      return suit;
   }
   /** 
   Getter that gets rank as a string
   @return String
   */
   public String getRankString(){
      if(rank == 1)
         return "Ace";
      else if(rank == 2)
         return "Two";
      else if (rank == 3)
         return "Three";
      else if (rank == 4)
         return "Four";
      else if (rank == 5)
         return "Five";
      else if (rank == 6)
         return "Six";
      else if (rank == 7)
         return "Seven";
      else if (rank == 8)
         return "Eight";
      else if (rank == 9)
         return "Nine";
      else if (rank == 10)
         return "Ten";
      else if (rank == 11)
         return "Jack";
      else if (rank == 12)
         return "Queen";
      else if (rank == 13)
         return "King";
      else
         return "It broke";
   }  
   /** Getter that gets Suit as a string
   @return string
   */
   public String getSuitString(){
      if(suit == 0)
         return "Spades";
      else if(suit == 1)
         return "Clubs";
      else if (suit == 2)
         return "Hearts";
      else if (suit == 3)
         return "Diamonds";
      else
         return "It broke";
   }
   /** To string method gives the card in a readable
   string
   @return string
   */
   public String toString(){
      return this.getRankString() + " of " + this.getSuitString() + ".";
   }
   /**
   equals method checks if two cards are equal to
   eachother
   @return boolean
   */
   public boolean equals(Card object2){
      boolean status = false;
      if(this.getRank() == object2.getRank())
         status = true;
      else
         status = false;
      return status;
   }
   /**
   Greater Than
   */
   public boolean greaterThan(Card object2){
      boolean status=false;
      if(this.getRank() > object2.getRank())
         status = true;
      else
         status = false;
      return status;
   }
   /**
   Less Than
   */
   public boolean lessThan(Card object2){
      boolean status=false;
      if(this.getRank() < object2.getRank())
         status = true;
      else
         status = false;
      return status;
   }
   public String getImageRank(){
      if(rank == 1)
         return "Ace";
      else if(rank == 2)
         return "2";
      else if (rank == 3)
         return "3";
      else if (rank == 4)
         return "3";
      else if (rank == 5)
         return "5";
      else if (rank == 6)
         return "6";
      else if (rank == 7)
         return "7";
      else if (rank == 8)
         return "8";
      else if (rank == 9)
         return "9";
      else if (rank == 10)
         return "10";
      else if (rank == 11)
         return "jack";
      else if (rank == 12)
         return "queen";
      else if (rank == 13)
         return "king";
      else
         return "It broke";
   }
   public String getImageSuit(){
      if(suit == 0)
         return "s";
      else if(suit == 1)
         return "c";
      else if (suit == 2)
         return "h";
      else if (suit == 3)
         return "d";
      else
         return "It broke";
   }
   public String getImage(){
      String image = this.getImageRank() + this.getImageSuit() + ".jpg";
      return image;
   }
}

         