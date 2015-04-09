 
import javax.swing.*;

public class HelloWorldSwing {
    public static void main(String[] args) {

	 /* Here is the code that sets up and shows the frame:

		JFrame frame = new JFrame("HelloWorldSwing");

		frame.pack();
		frame.setVisible(true);
	 */

      JFrame frame = new JFrame("HelloWorldSwing");

	 /* a JFrame has some notion of how to respond when the
	 	user attempts to close the window. The default behavior
	 	is to simply hide the JFrame when the user closes the window.
	 	To change the default behavior, you invoke the method
	 	setDefaultCloseOperation(int).
	 */
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	 /* The method pack() is an alternative to the setSize() method.
	 	It makes sure that the frame is as small as it possibly can
	 	be and still show all it has to show. With setSize() (or setBounds())
	 	you force a size which could be too big or too small.
	 */
      frame.setVisible(true);
     	frame.pack();
     	
      /** ALTERNATIVE: 
      frame.setSize(200,200);
     	frame.validate();
     	 **/
      
      /* validate effectively redoes the layout if necessary deciding on new sizes
	   and locations of all the components in the container. pack does a validate
	   after computing the size for a frame or window based on the preferred sizes
	   of all the contained components.
	*/

     }
}
     /* 
      setVisible( boolean ) controls whether a Component and its children
     	are displayed on the screen. 
      setVisible( false ) hides a Component by
     	marking it as invisible. setVisible( true ) reveals a Component by marking
     	it as visible.
     */