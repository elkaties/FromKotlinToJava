/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package part3.simple.components;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.SwingUtilities;

/**
 *
 * @author Digitek
 */
public class MainFrame extends JFrame {

    MainFrame(String s) {
        super(s);
        setSize(400, 400);
        setLayout(null);
        JLabel label = new JLabel("Label");
        label.setBounds(100, 50, 100, 40);
        add(label);
        JButton button = new JButton("Button");
        button.setBounds(100, 100, 100, 40);
        add(button);        
        JCheckBox checkbox = new JCheckBox("Checkbox");
        checkbox.setBounds(100, 150, 100, 40);
        add(checkbox);
        JComboBox choice = new JComboBox(new String[] {"Combobox 1", "Combobox 2"});
        choice.setBounds(100, 200, 100, 20);
        add(choice);  
        JList list = new JList(new String[] {"List 1", "List 2", "List 3", "List 4"});
        list.setBounds(100, 250, 100, 90);
        add(list);        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainFrame("Компоненты Swing"));
    }

}
