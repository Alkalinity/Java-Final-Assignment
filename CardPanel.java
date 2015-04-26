import javax.swing.*;

public class CardPanel extends JPanel{

   private JLabel imageLabel;
   private JPanel imagePanel;
   
   public CardPanel(){
   
      ImageIcon cardImage = new ImageIcon("back.jpg");
      imageLabel = new JLabel("text");
      imageLabel.setIcon(cardImage);
      imageLabel.setText(null);
      add(imageLabel);
   }
   public void changeImage(Card c){
      ImageIcon changeCard = new ImageIcon(c.getImage());
      imageLabel.setIcon(changeCard);
   }
}


   