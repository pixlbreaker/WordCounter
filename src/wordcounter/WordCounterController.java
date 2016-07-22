/*
This is the controller class, it takes the input from the previous view
and splits the words, gets a lenght, and some other math
*/
package wordcounter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class WordCounterController implements ActionListener{
    
    private JTextArea textArea;
    private String text;
    private int textLength;
    
    public WordCounterController(JTextArea textArea){
        this.textArea = textArea;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JFrame frame = new JFrame();
        
        // Creates the class vars on the text Given
        text = textArea.getText();
        textLength = text.length();
        
        String[] words = text.split("\\s+");
        JOptionPane.showMessageDialog(frame, "There are " + words.length + " words");
    }
    
}
