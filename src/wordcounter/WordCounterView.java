
package wordcounter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class WordCounterView extends JFrame{
    
    public WordCounterView(){
        this.setSize(500, 200);
        this.setTitle("Word Counting");
        makePanel();
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    
    public void makePanel(){
        
        // Makes all the components
        JPanel panel = new JPanel();
        JButton button = new JButton("Count the Words");
        JTextArea textArea = new JTextArea(5, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);
        
        // Button Properties
        button.addActionListener(new WordCounterController(textArea));
        
        // ScrollPane and TextArea properties
        textArea.setLineWrap(true);
        
        // Adds the components
        panel.add(scrollPane);
        panel.add(button);
        panel.setVisible(true);
        this.add(panel);
    }
}
