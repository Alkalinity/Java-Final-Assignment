import javax.swing.*;

public class DiscardLabel extends JPanel{
   
   private JLabel discardLabel;
   
   public DiscardLabel(){
      //Create label
      discardLabel = new JLabel("Cards In Discard");
      add(discardLabel);
   }
   public void changeCard(cardPile p){
      //Change label
      discardLabel.setText("Cards In Discard: " + p.cardsRemaining());   
   }
}