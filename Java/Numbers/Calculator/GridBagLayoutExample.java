//Imports are listed in full to show what's being used
//could just import javax.swing.* and java.awt.* etc..
import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;
import javax.swing.*;
import javax.swing.border.Border;


public class GridBagLayoutExample {
    JFrame guiFrame;


    public static void main(String[] args) {

        //Use the event dispatch thread for Swing components
        EventQueue.invokeLater(new Runnable()
        {

            @Override
            public void run()
            {

                new GridBagLayoutExample();
            }
        });

    }

    public GridBagLayoutExample()
    {
        guiFrame = new JFrame();

        //make sure the program exits when the frame closes
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("My Calculator");
        guiFrame.setSize(400,600);

        //This will center the JFrame in the middle of the screen
        guiFrame.setLocationRelativeTo(null);

        //creating a border to highlight the component areas
        Border outline = BorderFactory.createLineBorder(Color.black);

        //create GribBagLayout and the GridBagLayout Constraints
        GridBagLayout gridBag = new GridBagLayout();
        GridBagConstraints cons = new GridBagConstraints();

        cons.fill = GridBagConstraints.HORIZONTAL;

        JPanel compPanel = new JPanel();
        compPanel.setLayout(gridBag);

//        cons.gridx = 2;
//        cons.gridy = 2;
//        JLabel randomLbl = new JLabel("In Xanadu did Kubla Khan, "
//                + "A stately pleasure-dome decree");
//        randomLbl.setBorder(outline);
//        gridBag.setConstraints(randomLbl, cons);
//        compPanel.add(randomLbl);

        //Use the GridBagConstraints to determine how the component
        //is displayed within the GridBagLayout. ipadx and ipady are used
        //to pad the component within the cell(s). The weightx and weighty
        //are used to give a weighting to the component to specify how the
        //any extra space is handled by a row or column. gridx and gridy are
        //the position coordinates for the component within the grid. fill 
        //determines what happens to sizing of a component if it doesn't completely
        //fill its cell. gridwidth and gridheight specify how many cells (either 
        //in a row or column) the component will take up.

//        cons.ipady = 100;
//        cons.ipadx = 100;
        cons.weighty = 1.0;
        cons.gridx = 0;
        cons.gridy = 0;
        cons.gridwidth = 5;
//        cons.gridheight = 2;
        JTextField displayfield = new JTextField("Enter a value");
        displayfield.setBorder(outline);
        gridBag.setConstraints(displayfield, cons);
        compPanel.add(displayfield);

//        cons.ipady = 50;
//        cons.ipadx = 100;
        cons.weightx = 0;
        cons.gridx = 0;
        cons.gridy = 1;
        cons.gridwidth = 1;
        JButton hello = new JButton("Hello");
        gridBag.setConstraints(hello, cons);
        compPanel.add(hello);

//        cons.ipady = 100;
//        cons.ipadx = 10;
        cons.gridx = 1;
        cons.gridy = 1;
        JButton goodbye = new JButton("GoodBye");
        gridBag.setConstraints(goodbye, cons);
        compPanel.add(goodbye);

        cons.weightx = 0;
        cons.gridx = 0;
        cons.gridy = 2;
        JButton eh = new JButton("eh?");
        gridBag.setConstraints(eh, cons);
        compPanel.add(eh);


        guiFrame.add(compPanel);
        guiFrame.setVisible(true);

    }

}