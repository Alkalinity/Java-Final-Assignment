import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class WarGui extends JFrame{
   //Private Data for GUI
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
   private JLabel systemMessage;
   private JButton runButton;
   private JButton playButton;
   private JPanel buttonPanel;
   //For the Game
   private War currentGame;

   public WarGui(){
     
      setTitle("War - The Card Game"); //Title
      
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT); //Size
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Close
      
      setLayout(new GridLayout(0,4)); //Layout Manager
      
      playersCard = new CardPanel();  //The 4 Card Panels along the top
      playersDiscard = new CardPanel();
      computerDiscard = new CardPanel();
      computerCard = new CardPanel();
      
      playersCardLabel = new CardLabel(); //Labels for the card Panels
      playersDiscardLabel = new DiscardLabel();
      computersDiscardLabel = new DiscardLabel();
      computersCardLabel = new CardLabel();
      
      systemMessage = new JLabel("Click to Play!"); //Label for button
      
      buildButtonPanel(); //Button to run  game
      
      
      
      add(playersCard); //Adding everything
      add(playersDiscard);//Cards
      add(computerDiscard);
      add(computerCard);
      
      add(playersCardLabel);//Labels
      add(playersDiscardLabel);
      add(computersDiscardLabel);
      add(computersCardLabel);
      
      add(buttonPanel); //Button and message
      add(systemMessage);
      
      pack(); //Pack Frame
      setVisible(true); //Make visible
   }
   //Button Panel Builder
   private void buildButtonPanel(){
   //New Panel that adds the buttons
      buttonPanel = new JPanel();
   //Two different buttons, one to start, one for each turn
      runButton = new JButton("Play!");
      playButton = new JButton("Play!");
      //Listeners for both
      runButton.addActionListener(new runButtonListener());
      playButton.addActionListener(new playButtonListener());
      // Add the button to the panel
      buttonPanel.add(runButton);
      
   }
   //Run listener
   private class runButtonListener implements ActionListener{
      
      public void actionPerformed(ActionEvent e){
         //Create a new war game
         currentGame = new War();
         //Remove run button, switch to play button
         buttonPanel.remove(runButton);
         buttonPanel.add(playButton);
         validate();
      }
   }
   //Play  button listener
   private class playButtonListener implements ActionListener{
   
      public void actionPerformed(ActionEvent e){
         //Continue turn
         //Do a turn
         if(currentGame.getGameWinner().equals("computer")){
            JOptionPane.showMessageDialog(null, "Computer Wins!");
            System.exit(0);
         }
         else if(currentGame.getGameWinner().equals("player")){
            JOptionPane.showMessageDialog(null, "Player Wins!");
            System.exit(0);
         }
         else{
            currentGame.turn();
            //Change images
            playersDiscard.changeImage(currentGame.getYourCard());
            computerDiscard.changeImage(currentGame.getComputerCard());
            //Change labels
            playersCardLabel.changeCard(currentGame.getYourHand());
            playersDiscardLabel.changeCard(currentGame.getYourDiscard());
            computersDiscardLabel.changeCard(currentGame.getComputerDiscard());
            computersCardLabel.changeCard(currentGame.getComputerHand());    
            //Change system message
            if(currentGame.getTurnWinner().equals("computer")){
               systemMessage.setText("Computer Takes!");
            }
            else if(currentGame.getTurnWinner().equals("player")){
               systemMessage.setText("Player Takes!");
            }
            else if(currentGame.getTurnWinner().equals("war_player")){
               systemMessage.setText("War! Player Takes!");
            }
            else if(currentGame.getTurnWinner().equals("war_computer")){
               systemMessage.setText("War! Computer Takes!");
            }
         }
      }
   }
   //Main method
   public static void main(String [] Args){
      
      new WarGui();
   
   }
}
      