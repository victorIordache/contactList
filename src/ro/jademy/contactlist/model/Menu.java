package ro.jademy.contactlist.model;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Menu implements ActionListener {

    JFrame frame;
    JMenuBar menuBar;
    JMenu menu,menu2;
    JMenuItem menuItem1, menuItem2, menuItem3;

    public void Test(){

        menuBar = new JMenuBar();

        menu = new JMenu("File");
        menuBar.add(menu);

        menu2 = new JMenu("Edit");
        menuBar.add(menu2);

        menuItem1 = new JMenuItem("Load");
        menu.add(menuItem1);

        menuItem2 = new JMenuItem("Save");
        menu.add(menuItem2);

        menuItem3 = new JMenuItem("Options");
        menu.add(menuItem3);

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(420,420);
        frame.setJMenuBar(menuBar);
    }
    @Override
    public void actionPerformed(ActionEvent e){

    }
}
