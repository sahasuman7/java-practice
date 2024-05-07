package com.JavaTutorial;
import java.awt.*;
import java.awt.event.*;

public class commandLineArguments {
    public static void main(String[] args) {
    }
}





class NotepadMenu extends Frame
{
    MenuBar note; Menu file; MenuItem file1,file2,file3;
    Menu edit; MenuItem edit1,edit2;
    NotepadMenu(String s)
    {
        super(s);
        note= new MenuBar();
        file=new Menu("FILE");
        file1=new MenuItem("NEW");
        file2=new MenuItem("OPEN");
        file3=new MenuItem("EXIT");
        edit=new Menu("EDIT");
        edit1=new MenuItem("COPY");
        edit2=new MenuItem("PASTE");
        edit.add(edit1);edit.add(edit2);
        file.add(file1);file.add(file2);file.add(file3);
        note.add(file); note.add(edit);
        setMenuBar(note);
        setSize(300,300);
        setVisible(true);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
    public static void main(String args[])
    {
        NotepadMenu np=new NotepadMenu("Notepad");
    }
}