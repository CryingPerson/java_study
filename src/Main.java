

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TextAreaFrame extends JFrame
        implements ActionListener
{
    private JButton insertButton;
    private JButton wrapButton;
    private JButton noWrapButton;
    private JTextArea textArea;
    private JScrollPane scrollPane;

    TextAreaFrame()
    {
        JPanel p=new JPanel();
        setTitle("SDD");
        setSize(300,400);

        insertButton=new JButton("insert");
        p.add(insertButton);
        insertButton.addActionListener(this);
        wrapButton =new JButton("wrap");
        p.add(wrapButton);
        wrapButton.addActionListener(this);
        noWrapButton=new JButton("nowrap");
        p.add(noWrapButton);
        noWrapButton.addActionListener(this);

        textArea=new JTextArea(8,40);
        scrollPane=new JScrollPane(textArea);
        getContentPane().add(p,"South");
        getContentPane().add(scrollPane,"Center");
    }
    public void actionPerformed(ActionEvent evt)
    {
        Object source=evt.getSource();
        if(source == insertButton)
            textArea.append("I want to sex with you");
        else if(source == wrapButton)
        {
            textArea.setLineWrap(true);
            scrollPane.validate();
        }
        else if(source == noWrapButton)
        {
            textArea.setLineWrap(false);
            scrollPane.validate();
        }
    }

}

 class TextAreaTest {
    public static void main(String[] args)
    {  JFrame f = new TextAreaFrame();
        f.show();
    }
}



