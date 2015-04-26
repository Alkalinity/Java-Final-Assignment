import java.awt.*;
import javax.swing.*;


public class WarGui extends JFrame{
   
   private final int WINDOW_WIDTH = 850;
   private final int WINDOW_HEIGHT = 650;
   private CardPanel playersCard;
   private CardPanel playersDiscard;
   private CardPanel computerDiscard;
   private CardPanel computerCard;
   private CardLabel playersCardLabel;
   private CardLabel computersCardLabel;
   private DiscardLabel playersDiscardLabel;
   private DiscardLabel computersDiscardLabel;

   public WarGui(){
     
      setTitle("War - The Card Game");
      
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      setLayout(new GridLayout(0,4));
      
      playersCard = new CardPanel();
      playersDiscard = new CardPanel();
      computerDiscard = new CardPanel();
      computerCard = new CardPanel();
      
      playersCardLabel = new CardLabel();
      playersDiscardLabel = new DiscardLabel();
      
      computersDiscardLabel = new DiscardLabel();
      computersCardLabel = new CardLabel();
      
      
      
      add(playersCard);
      add(playersDiscard);
      add(computerDiscard);
      add(computerCard);
      
      add(playersCardLabel);
      add(playersDiscardLabel);
      add(computersDiscardLabel);
      add(computersCardLabel);
      
      pack();
      setVisible(true);
   }
     
   public static void main(String [] Args){
      
      new WarGui();
   
   }
}
      