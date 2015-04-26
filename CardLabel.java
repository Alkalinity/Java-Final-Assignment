import javax.swing.*;

public class CardLabel extends JPanel{
   
   private JLabel cardLabel;
   
   public CardLabel(){
   
      cardLabel = new JLabel("Card");
      add(cardLabel);
   }
   public void changeCard(Card c){
      
      cardLabel.setText(c.toString());   
   }
}