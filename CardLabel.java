import javax.swing.*;

public class CardLabel extends JPanel{
   
   private JLabel cardLabel;
   
   public CardLabel(){
   
      cardLabel = new JLabel("Cards in Deck: ");
      add(cardLabel);
   }
   public void changeCard(cardPile p){
      
      cardLabel.setText("Cards In Hand: " + p.cardsRemaining());   
   }
}