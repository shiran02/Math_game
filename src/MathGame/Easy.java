/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathGame;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.lang.Math.min;
import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRootPane;
import javax.swing.JTextField;

public class Easy extends JFrame {

    Easy() {

        setLayout(null);
        setResizable(false);
//          getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
//        setUndecorated(true);
//        setBackground(new Color(10, 50, 40, 140));

        //-----------------------------------------------------------------------------------------------------------
        Font fbt = new Font("Tempus Sans ITC", Font.BOLD, 35);
        Font fbt_num = new Font("Tempus Sans ITC", Font.BOLD, 65);
        Font fbt_print = new Font("Tempus Sans ITC", Font.BOLD, 35);
        Cursor Cur = new Cursor(Cursor.HAND_CURSOR);

        JLabel play = new JLabel("Play");
        play.setBounds(690, 250, 200, 100);
        play.setForeground(Color.WHITE);
        // play.setBackground(new Color(123, 62, 46, 255));
        play.setFont(fbt);
        play.setCursor(Cur);
        add(play);

        JLabel finish = new JLabel("Finish");
        finish.setBounds(685, 395, 200, 100);
        finish.setForeground(Color.WHITE);
        // play.setBackground(new Color(123, 62, 46, 255));
        finish.setFont(fbt);
        finish.setCursor(Cur);
        add(finish);

        finish.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                Menu fr = new Menu();
                dispose();
            }
        });

        JLabel menu = new JLabel("Menu");
        menu.setBounds(35, 295, 200, 100);
        menu.setForeground(new Color(255, 255, 255));
        // play.setBackground(new Color(123, 62, 46, 255));
        menu.setFont(fbt);
        menu.setCursor(Cur);
        add(menu);

        JLabel num1 = new JLabel("");
        num1.setBounds(180, 85, 200, 100);
        num1.setForeground(new Color(255, 255, 255));
        // play.setBackground(new Color(123, 62, 46, 255));
        num1.setFont(fbt_num);
        num1.setCursor(Cur);
        add(num1);

        JLabel num2 = new JLabel("");
        num2.setBounds(530, 85, 200, 100);
        num2.setForeground(new Color(255, 255, 255));
        //play.setBackground(new Color(123, 62, 46, 255));
        num2.setFont(fbt_num);
        num2.setCursor(Cur);
        add(num2);

        JLabel print = new JLabel("");
        print.setBounds(230, 285, 500, 400);
        print.setForeground(new Color(0, 255, 255));
        //play.setBackground(new Color(123, 62, 46, 255));
        print.setFont(fbt_print);
        print.setCursor(Cur);
        add(print);
        
         JLabel num = new JLabel("-");
        num.setBounds(380, 85, 200, 100);
        num.setForeground(new Color(0, 0, 102));
        //play.setBackground(new Color(123, 62, 46, 255));
        num.setFont(fbt_num);
        num.setCursor(Cur);
        add(num);
        
         JLabel check = new JLabel("check");
        check.setBounds(350, 240, 200, 100);
        check.setForeground(new Color(255, 255, 255));
        // play.setBackground(new Color(123, 62, 46, 255));
        check.setFont(fbt);
        check.setCursor(Cur);
        add(check);

        menu.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                MathGame fr = new MathGame();
                dispose();
            }
        });

        JTextField answer_field = new JTextField("");
        answer_field.setBounds(300, 335, 200, 80);
        answer_field.setForeground(new Color(255, 255, 255));
        answer_field.setBackground(new Color(123, 62, 46, 255));
        answer_field.setFont(fbt_num);
        answer_field.setCursor(Cur);
        add(answer_field);
        //------run code  random ----------------------

        play.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {

                print.setText(" ");
                answer_field.setText("");
                num1.setText(String.valueOf((int) (Math.random() * (200 - 100 + 1) + 100)));
                num2.setText(String.valueOf((int) (Math.random() * (200 - 100 + 1) + 100)));

            }
        });

        answer_field.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(final KeyEvent ke) {

                int keypad = ke.getKeyCode();

                if (keypad == KeyEvent.VK_ENTER) {

                    int a = Integer.parseInt(num1.getText());
                    int b = Integer.parseInt(num2.getText());
                    int c = Integer.parseInt(answer_field.getText());

                    int total = (a + b);

                    if (c == total) {
                        print.setText("Your Answer is Correct");
                    } else {

                        print.setText("Your Answer is InCorrect");
                        num2.setText("");
                        num1.setText("");
                        answer_field.setText("");

                    }

                }
            }
        });

        //-------------------------------------------------------------------------------------------------------------
        JLabel pic = new JLabel();
        pic.setIcon(new ImageIcon(getClass().getResource("easy_back.png")));
        pic.setBounds(0, -20, 810, 572);
        add(pic);
        //----------------------------------------------------------------------------------------------
        setSize(812, 570);
        //setTitle("MATH GAME");
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        Easy obj = new Easy();
    }

//       public static class ran{
//    public static int generate (int min,int max)
//    {
//        return min + (int)(Math.random() * (max - min) +1);
//            
//        // TODO code application logic here
//    }
//     }
}
