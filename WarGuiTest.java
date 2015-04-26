import java.awt.*;
import javax.swing.*;


public class WarGuiTest extends JFrame{
   
   private final int WINDOW_WIDTH = 850;
   private final int WINDOW_HEIGHT = 650;
   private JPanel playersCard;
   private JPanel playersDiscard;
   private JPanel computerDiscard;
   private JPanel computerCard;

   public WarGuiTest(){
     
      setTitle("War - The Card Game");
      
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      setLayout(new GridLayout(4,4));
      
      playersCard = new JPanel();
      playersDiscard = new JPanel();
      computerDiscard = new JPanel();
      computerCard = new JPanel();
      
      JButton button1 = new JButton("FUCK");
      JButton button2 = new JButton("FUCK");
      JButton button3 = new JButton("FUCK");
      JButton button4 = new JButton("FUCK");
      
      playersDiscard.add(button1);
      computerCard.add(button2);
      computerDiscard.add(button3);
      playersCard.add(button4);
      
      
      add(playersCard);
      add(playersDiscard);
      add(computerDiscard);
      add(computerCard);
      
      pack();
      setVisible(true);
   }
     
   public static void main(String [] Args){
      
      new WarGuiTest();
   
   }
}