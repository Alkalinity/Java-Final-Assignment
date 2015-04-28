import javax.swing.*;

public class DiscardLabel extends JPanel{
   
   private JLabel discardLabel;
   
   public DiscardLabel(){
   
      discardLabel = new JLabel("Cards In Discard");
      add(discardLabel);
   }
   public void changeCard(cardPile p){
      
      discardLabel.setText("Cards In Discard: " + p.cardsRemaining());   
   }
}