//package com.fastLearner.gui;

import javax.swing.JMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.KeyStroke;
import java.awt.event.InputEvent;

public class Notepad implements ActionListener
{
JFrame jf;
JMenuBar menuBar;
JMenu file,edit,format,help;
JMenuItem neww,open,save,saveAs,exit,pageSetup,print;
JMenuItem cut,copy,paste,replace,dateTime;
JMenuItem font,fontColor,textAreaColor;
JTextArea textarea;
String title = "Untitled - Notepad";

public Notepad()
{
try
{
UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
}
catch(Exception e)
{
System.out.println(e);
}
jf = new JFrame(title);
jf.setSize(500,500);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

menuBar = new JMenuBar();

// ------------------adding file attributes---------------------

file = new JMenu("File");

neww = new JMenuItem("New");
neww.addActionListener(this);
file.add(neww);

open = new JMenuItem("Open");
open.addActionListener(this);
file.add(open);

save = new JMenuItem("Save");
save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.META_DOWN_MASK));
save.addActionListener(this);
file.add(save);

saveAs = new JMenuItem("Save As");
saveAs.addActionListener(this);
file.add(saveAs);

file.addSeparator();

pageSetup = new JMenuItem("Page Setup");
pageSetup.addActionListener(this);
file.add(pageSetup);

print = new JMenuItem("Print");
print.addActionListener(this);
file.add(print);

file.addSeparator();

exit = new JMenuItem("Exit");
exit.addActionListener(this);
file.add(exit);
menuBar.add(file);

// ----------------file attributes are added---------------- 

// ---------------adding edit attributes--------------------

edit = new JMenu("Edit");

cut = new JMenuItem("Cut");
cut.addActionListener(this);
cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,InputEvent.META_DOWN_MASK));
edit.add(cut);

copy = new JMenuItem("Copy");
copy.addActionListener(this);
copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,InputEvent.META_DOWN_MASK));
edit.add(copy);

edit.addSeparator();

paste = new JMenuItem("Paste");
paste.addActionListener(this);
paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,InputEvent.META_DOWN_MASK));
edit.add(paste);

edit.addSeparator();

replace = new JMenuItem("Replace");
replace.addActionListener(this);
edit.add(replace);

dateTime = new JMenuItem("Date/Time");
dateTime.addActionListener(this);
edit.add(dateTime);

menuBar.add(edit);

// --------------------added edit attributes--------------------

// --------------------adding format attributes-----------------

format = new JMenu("Format");

font = new JMenuItem("Font");
font.addActionListener(this);
format.add(font);

fontColor = new JMenuItem("Font Color");
fontColor.addActionListener(this);
format.add(fontColor);

format.addSeparator();

textAreaColor = new JMenuItem("Textarea Color");
textAreaColor.addActionListener(this);
format.add(textAreaColor);

menuBar.add(format);

// -------------------added format attributes------------------
// -----------adding help menu----------------
help = new JMenu("Help");
menuBar.add(help);
// ----------added------------



jf.setJMenuBar(menuBar);

textarea = new JTextArea();
JScrollPane scrollPane = new JScrollPane(textarea);
scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

jf.add(scrollPane);

jf.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==neww)
{
textarea.setText("");
}

}

public static void main(String args[])
{
new Notepad();

}
}
