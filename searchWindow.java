import java.awt.BorderLayout;

import javax.imageio.plugins.tiff.TIFFDirectory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.*;

public class searchWindow {
    //Declaring all Variables
    JFrame frame2;
    JButton search;
    JTextArea previousSearches;
    JLabel PreviousSearches;
    JLabel Search;
    JTextField searchBar;
    JPanel panel2;

    public void searchWindow()
    {
        // setting all Variables
        frame2 = new JFrame();
        panel2 = new JPanel();
        search = new JButton("Search");
        previousSearches = new JTextArea("");
        PreviousSearches = new JLabel("Previous Searches");
        searchBar = new JTextField(20);
        Search = new JLabel("Name of Game");
        
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        search.addActionListener(this::actionPerformed);
        
        panel2.add(PreviousSearches);
        panel2.add(previousSearches);
        panel2.add(Search);
        panel2.add(searchBar);
        panel2.add(search);

        frame2.getContentPane().add(BorderLayout.NORTH, PreviousSearches);
        frame2.getContentPane().add(BorderLayout.CENTER, previousSearches);
        frame2.getContentPane().add(BorderLayout.SOUTH, panel2);
        
        frame2.setSize(500,500);
        frame2.setVisible(true);
    }

    public void actionPerformed(ActionEvent event)
    {
        String searchedTitles = searchBar.getText();

        previousSearches.setText(searchedTitles);

        /*
        implement the use of the Database here. IE if statements searching the DB for the correct game or something.
        You could put this logic in a different class to keep this one less cluttered.
         */
    }

}
