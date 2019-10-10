/*
 * i certify that this is my original work
 * Byron De Paz PID 3999061
 */
package pascalstriangle;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.IOException;

public class PascalTester {

    public static void main(String[] args) throws IOException 
    {
        boolean keepPlaying = true;
        while (keepPlaying)
        {
          // the code for this confirmation can be seen in JOption Pane javadoc
          int response = JOptionPane.showConfirmDialog(null,
                  "Do you want to calculate a Pascal Triangle?", "Confirm",
                  JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

          if (response == JOptionPane.NO_OPTION) 
          {
            // No was clicked in the dialog box
            System.out.println("okay, won't calculate it...");
            keepPlaying = false;
          } 
          else if (response == JOptionPane.YES_OPTION) 
          {
            // yes was selected, now ask the user for a number
            String input = JOptionPane.showInputDialog("please enter a"
                    + " number between 1 and 13 ");
            Scanner number = new Scanner(input);
            if(number.hasNextInt())
            {
                int rows = number.nextInt();
                if (rows >= 1 && rows <= 13 )
                {
                // generate the pascal triangle     
                Pascal triangle = new Pascal(rows);
                triangle.generateTri(); // calculate the values
                triangle.toString(); // print them
                }
                else
                {
                // a number outside the scope was given, that a no no.
                System.out.println("I need a number between 1 and 13 not "
                + input);
                }
            }
            else
            {
                // an input that is not a number is given, also a no no.
                System.out.println("I need a number between 1 and 13 not "
                + input);
            }
          } 
          else if (response == JOptionPane.CLOSED_OPTION) 
          {
            // they closed the box
            System.out.println("Looks like you closed the dialog box, please"
                   + "run the program again.");
            keepPlaying = false;
          }
         }
       }
    }
