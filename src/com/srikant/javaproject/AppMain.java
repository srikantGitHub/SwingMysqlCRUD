package com.srikant.javaproject; 
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import com.srikant.javaproject.DAO.HospitalBean;
import com.srikant.javaproject.DAO.PaitentBean;
import com.srikant.javaproject.UI.HospitalUI;
import com.srikant.javaproject.UI.PaitentUI;

public class AppMain {
	  static JFrame f=new JFrame();
      public static void main(String[] args) {
	   HospitalBean.loadPorperties();
	   PaitentBean.loadPorperties();
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
      f.getContentPane().add(new HospitalUI());
      f.getContentPane().add(new PaitentUI());
      f.setSize(1200, 800);
      f.setVisible(true);
     showMenuDemo();
   }
   private static void showMenuDemo(){
	      //create a menu bar
	      final JMenuBar menuBar = new JMenuBar();

	      //create menus
	      JMenu fileMenu = new JMenu("File");
	      JMenu editMenu = new JMenu("Edit"); 
	      final JMenu aboutMenu = new JMenu("About");
	      final JMenu linkMenu = new JMenu("Links");
	     
	      //create menu items
	      JMenuItem newMenuItem = new JMenuItem("New");
	      newMenuItem.setMnemonic(KeyEvent.VK_N);
	      newMenuItem.setActionCommand("New");

	      JMenuItem openMenuItem = new JMenuItem("Open");
	      openMenuItem.setActionCommand("Open");

	      JMenuItem saveMenuItem = new JMenuItem("Save");
	      saveMenuItem.setActionCommand("Save");

	      JMenuItem exitMenuItem = new JMenuItem("Exit");
	      exitMenuItem.setActionCommand("Exit");

	      JMenuItem cutMenuItem = new JMenuItem("Cut");
	      cutMenuItem.setActionCommand("Cut");

	      JMenuItem copyMenuItem = new JMenuItem("Copy");
	      copyMenuItem.setActionCommand("Copy");

	      JMenuItem pasteMenuItem = new JMenuItem("Paste");
	      pasteMenuItem.setActionCommand("Paste");

	      MenuItemListener menuItemListener = new MenuItemListener();

	      newMenuItem.addActionListener(menuItemListener);
	      openMenuItem.addActionListener(menuItemListener);
	      saveMenuItem.addActionListener(menuItemListener);
	      exitMenuItem.addActionListener(menuItemListener);
	      cutMenuItem.addActionListener(menuItemListener);
	      copyMenuItem.addActionListener(menuItemListener);
	      pasteMenuItem.addActionListener(menuItemListener);

	      final JCheckBoxMenuItem showWindowMenu = new JCheckBoxMenuItem("Show About", true);
	      showWindowMenu.addItemListener(new ItemListener() {
	         public void itemStateChanged(ItemEvent e) {
	        	 System.out.println(e.getItemSelectable()+ " JMenuItem clicked.");
	            if(showWindowMenu.getState()){
	               menuBar.add(aboutMenu);
	            } else {
	               menuBar.remove(aboutMenu);
	            }
	         }
	      });
	      final JRadioButtonMenuItem showLinksMenu = new JRadioButtonMenuItem("Show Links", true);
	      showLinksMenu.addItemListener(new ItemListener() {
	         public void itemStateChanged(ItemEvent e) {
	        	 System.out.println(e.getItemSelectable() + " JMenuItem clicked.");
	            if(menuBar.getMenu(3)!= null){
	               menuBar.remove(linkMenu);
	               f.repaint();
	            } else {                   
	               menuBar.add(linkMenu);
	               f.repaint();
	            }
	         }
	      });
	      //add menu items to menus
	      fileMenu.add(newMenuItem);
	      fileMenu.add(openMenuItem);
	      fileMenu.add(saveMenuItem);
	      fileMenu.addSeparator();
	      fileMenu.add(showWindowMenu);
	      fileMenu.addSeparator();
	      fileMenu.add(showLinksMenu);       
	      fileMenu.addSeparator();
	      fileMenu.add(exitMenuItem);        
	      
	      editMenu.add(cutMenuItem);
	      editMenu.add(copyMenuItem);
	      editMenu.add(pasteMenuItem);

	      //add menu to menubar
	      menuBar.add(fileMenu);
	      menuBar.add(editMenu);
	      menuBar.add(aboutMenu);       
	      menuBar.add(linkMenu);

	      //add menubar to the frame
	      f.setJMenuBar(menuBar);
	      f.setVisible(true);     
	   }
}
	   class MenuItemListener implements ActionListener {
	      public void actionPerformed(ActionEvent e) {            
	        System.out.println(e.getActionCommand() + " JMenuItem clicked.");
	      }    
	   }
