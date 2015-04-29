import javax.swing.*;

public class CardPanel extends JPanel{

   private JLabel imageLabel;
   private JPanel imagePanel;
   
   public CardPanel(){
      //Make ner image
      ImageIcon cardImage = new ImageIcon("back.jpg");
      //Make new label
      imageLabel = new JLabel("text");
      //Set them
      imageLabel.setIcon(cardImage);
      imageLabel.setText(null);
      //Add it
      add(imageLabel);
   }
   public void changeImage(Card c){
   //Change card image
      ImageIcon changeCard = new ImageIcon(c.getImage());
      imageLabel.setIcon(changeCard);
   }
}


   