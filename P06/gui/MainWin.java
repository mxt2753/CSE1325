package gui;

import store.Customer;
import store.Store;
import store.Computer;
import store.Option;
import store.Order;
//import store.TestStore;

import javax.swing.JFrame;           // for main window
import javax.swing.JOptionPane;      // for standard dialogs
// import javax.swing.JDialog;          // for custom dialogs (for alternate About dialog)
import javax.swing.JMenuBar;         // row of menu selections
import javax.swing.JMenu;            // menu selection that offers another menu
import javax.swing.JMenuItem;        // menu selection that does something
import javax.swing.JToolBar;         // row of buttons under the menu
import javax.swing.JButton;          // regular button
import javax.swing.JToggleButton;    // 2-state button
import javax.swing.BorderFactory;    // manufacturers Border objects around buttons
import javax.swing.Box;              // to create toolbar spacer
import javax.swing.UIManager;        // to access default icons
import javax.swing.JLabel;           // text or image holder
import javax.swing.ImageIcon;        // holds a custom icon
import javax.swing.SwingConstants;   // useful values for Swing method calls

import javax.imageio.ImageIO;        // loads an image from a file

import java.io.File;                 // opens a file
import java.io.IOException;          // reports an error reading from a file

import java.awt.BorderLayout;        // layout manager for main window
import java.awt.FlowLayout;          // layout manager for About dialog

import java.awt.Color;               // the color of widgets, text, or borders
import java.awt.Font;                // rich text in a JLabel or similar widget
import java.awt.image.BufferedImage; // holds an image loaded from a file

import javax.swing.*;
/*
Name: Mary-Rose Tracy 
ID#:1001852753 
Assignment: P06 Email
TODO: see program comments below
Credit to Prof Rice
*/
public class MainWin extends JFrame
{
    public MainWin(String title)
    {
        store = new Store(title);
        frame = new JFrame(title);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem quitItem = new JMenuItem("Quit");
        //event = e, gonna short hand it cuz too many words debugging
        quitItem.addActionListener(e->onQuitClick());
        fileMenu.add(quitItem);
        menuBar.add(fileMenu);

        JMenu insertMenu=new JMenu("Insert");
        JMenuItem customerItem=new JMenuItem("Customer");
        
        customerItem.addActionListener(e->onInsertCustomerClick());
        insertMenu.add(customerItem);
        JMenuItem optionItem=new JMenuItem("Option");
        optionItem.addActionListener(e -> onInsertOptionClick());
        insertMenu.add(optionItem);
        JMenuItem computerItem=new JMenuItem("Computer");
        computerItem.addActionListener(e->onInsertComputerClick());
        insertMenu.add(computerItem);
        menuBar.add(insertMenu);
        JMenu viewMenu=new JMenu("View");
        JMenuItem customersItem=new JMenuItem("Customers");
        customersItem.addActionListener(e->onViewClick(Record.CUSTOMER));
        viewMenu.add(customersItem);
        JMenuItem optionsItem=new JMenuItem("Options");
        optionsItem.addActionListener(e->onViewClick(Record.OPTION));
        viewMenu.add(optionsItem);
        JMenuItem computersItem=new JMenuItem("Computers");
        computersItem.addActionListener(e->onViewClick(Record.COMPUTER));
        viewMenu.add(computersItem);
        menuBar.add(viewMenu);
        JMenu helpMenu=new JMenu("Help");
        JMenuItem aboutItem=new JMenuItem("About");
        aboutItem.addActionListener(e->onAboutClick());
        helpMenu.add(aboutItem);
        menuBar.add(helpMenu);
        frame.setJMenuBar(menuBar);
        display=new JLabel("Welcome to ELSA, The Exceptional Laptops and Supercomputers Always Store!");
        frame.add(display);
        frame.setVisible(true);
    }
    protected void onQuitClick()
    {
        System.exit(0);
    }
    protected void onInsertCustomerClick() 
    {
        try
        {
            String name = JOptionPane.showInputDialog(this,"Customer name");
            if(name==null)
            {
                return;
            }
            String email=JOptionPane.showInputDialog(this,"Customer email");
            if(email==null) 
            {
                return;
            }
            Customer customer=new Customer(name, email);
            store.add(customer);
            JOptionPane.showMessageDialog(this,"Customer added successfully!");

        } 
        catch (IllegalArgumentException e) 
        {
            JOptionPane.showMessageDialog(this, "Invalid email address", "Error", JOptionPane.ERROR_MESSAGE);
        }
    
    }
    protected  void onInsertOptionClick() 
    {
        try
        {
            String name=JOptionPane.showInputDialog(this, "Option Name");
            String cost=JOptionPane.showInputDialog(this, "Option Cost");
            double cost_c=Double.parseDouble(cost)*100;
            long cost_b=(long) cost_c;
        }
        catch(IllegalArgumentException e)
        {
            JOptionPane.showMessageDialog(this, "Cost cannot be negative. ", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    protected void onInsertComputerClick()
    {
        /*String name=JOptionPane.showInputDialog("Computer Name");
        String name=JOptionPane.showInputDialog("Computer Model");
        Computer computer =new Computer(name, model);
        */
    }
    protected void onViewClick(Record record)
    {
    }
    protected void onAboutClick() 
    {
        JLabel logo=null;
        /* WORK THAT COULD"VE POSSIBLY WORKED
        try {
            BufferedImage myPicture = ImageIO.read(new File("Eceptional Laptops and Supercomputers Always Version 0.2"));
            JOptionPane.showMessageDialog(frame, "Computer Store v1.0", "About", JOptionPane.PLAIN_MESSAGE);
            logo = new JLabel(new ImageIcon(myPicture));
        } catch(IOException e) {
        }
        */
        JLabel title = new JLabel("<html>"
          + "<p><font size=+4>ELSA</font></p>"
          + "<p>Exceptional Laptops and Supercomputers Always Version 0.2</p>"
           + "</html>",
        SwingConstants.CENTER);
        JLabel artists = new JLabel("<html>"
          + "<br/><p>Copyright 2017-2023 by George F. Rice</p>"
          + "<p>Licensed under Gnu GPL 3.0</p><br/>"
          + "<p>Logo by M0tty, licensed under CC BY-SA 3.0</p>"
          + "<p><font size=-2>https://commons.wikimedia.org/wiki/File:Pyramidal_matches.svg</font></p>"
          + "<p>Robot by FreePik.com, licensed for personal</p><p>and commercial purposes with attribution</p>"
          + "<p><font size=-2>https://www.freepik.com/free-vector/grey-robot-silhouettes_714902.htm</font></p>"
          + "</html>");
         JOptionPane.showMessageDialog
         (
            this, 
            new Object[]{logo, title, artists},
            "ELSA",
            JOptionPane.PLAIN_MESSAGE);
    }
    private Store store;
    private JFrame frame;
    private JLabel display;
}
