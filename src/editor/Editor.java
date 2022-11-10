/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package editor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Stack;

public class Editor extends JFrame {
    private JTextPane textPane1;
    private JPanel panel1;
    private JButton undoButton;
    private JButton redoButton;
    private JButton boldButton;
    private JButton italicButton;
    private JComboBox fontList;
    private JButton fontDeğiştiıButton;
    private JButton ctrlYButton;
    private JButton ctrlZButton;
    
    Stack<String> yigit = new Stack<String>();
    Stack<String> yigit2 = new Stack<String>();
    int i=0,j=0;
    String font;
    public Editor() {
        setContentPane(panel1);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(700,500);
        
          ctrlZButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String oldElement = yigit.pop();
                node element = new node(oldElement);
                yigit2.push(element.Eleman);
                textPane1.setText(yigit.toString().replaceAll("\\[","").replaceAll(",","").replaceAll("]",""));
                String newString = textPane1.getText();
                i=newString.length();
                j=i;
            }
        });
            ctrlYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newString = textPane1.getText();
                yigit.push(yigit2.pop());
                textPane1.setText(yigit.toString().replaceAll("\\[","").replaceAll(",","").replaceAll("]",""));
                i=textPane1.getText().length();
                j=i;
            }
        });
        boldButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPane1.setFont(new Font(fontList.getSelectedItem().toString(),Font.BOLD,14));
            }
        });
        italicButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPane1.setFont(new Font(fontList.getSelectedItem().toString(),Font.ITALIC,14));
            }
        });
        textPane1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                i++;
                if( e.getKeyChar()==' '){
                    String name =textPane1.getText();
                    String newName = name.substring(j,i-1);
                    node eleman = new node(newName);
                    yigit.push(eleman.Eleman);
                    j=i;
                }
            }
        });
        fontDeğiştiıButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPane1.setFont(new Font(fontList.getSelectedItem().toString(),Font.PLAIN,14));
            }
        });
        undoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String oldElement = yigit.pop();
                node element = new node(oldElement);
                yigit2.push(element.Eleman);
                textPane1.setText(yigit.toString().replaceAll("\\[","").replaceAll(",","").replaceAll("]",""));
                String newString = textPane1.getText();
                i=newString.length();
                j=i;
            }
        });
        redoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newString = textPane1.getText();
                yigit.push(yigit2.pop());
                textPane1.setText(yigit.toString().replaceAll("\\[","").replaceAll(",","").replaceAll("]",""));
                i=textPane1.getText().length();
                j=i;
            }
        });
    }
    public static void main(String[] args) {
        Editor yeni =new Editor();
    }
}