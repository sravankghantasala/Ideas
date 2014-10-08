/**
 * This Holds the GUI for a Calculator
 * Created by ghantasa on 08-10-2014.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

//extends Frame implements ActionListener

public class GUI extends JPanel{
//  Components of layout

//  A text field to show the input and output
    private static TextField displayfield;
    private static ArrayList<Button> buttons = new ArrayList();
    private static String[] numbers = {"1","2","3","4","5","6","7","8","9","0"};
    private static String[] operations = {"+","-","*","/","%","^","\u221A"};

    public GUI () {
//        Gridbag layout : An exact fit for calc app.
        JPanel f = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill =  GridBagConstraints.HORIZONTAL;

        f.setName("My Calculator");
        f.setSize(500, 500);

        displayfield = new TextField("0",30);
        displayfield.setEditable(false);
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 3;
        f.add(displayfield, c);

        for (String s : numbers ) {
            Button b = new Button(s);
            buttons.add(b);
        }
        int i=1,j=0;
        for (Button b : buttons ) {
            c.gridwidth = 1;
            c.gridx = i;
            c.gridx = j;
            c.weightx = 0.5;
            j++;
            if (j==3) i++;
            f.add(b,c);
        }

        f.setVisible(true);
    }

    // Main Method
    public static void main(String[] args) {
        GUI frame = new GUI();
//        for (String s : operations ) {
//            System.out.println(s);
//        }
    }

//    @Override
//    public void actionPerformed ( ActionEvent e ) {
//
//    }

}
