/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathGame;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import static java.lang.Thread.sleep;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRootPane;
import javax.swing.border.Border;

/**
 *
 * @author Shiran
 */
public class MathGame extends JFrame {

//        
    MathGame() {
        
        setLayout(null);
        Font fbt = new Font("Tempus Sans ITC", Font.BOLD, 40);
        Cursor Cur = new Cursor(Cursor.HAND_CURSOR);
//
//     setUndecorated(true);
//     setBackground(new Color(20, 40,30, 180));
//       // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
//        getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
//     //setDefaultCloseOperation(EXIT_ON_CLOSE);
//        //----------------------------------------------------------------------------------------------

        //--------------------easy  layer ----------------
        JLabel easy = new JLabel("Easy");
        easy.setBounds(380, 105, 100, 100);
        easy.setForeground(new Color(153, 255, 51));
        // play.setBackground(new Color(123, 62, 46, 255));
        easy.setFont(fbt);
        easy.setCursor(Cur);
        add(easy);
        //--------------------meduim  layer ----------------

        JLabel medium = new JLabel("medium");
        medium.setBounds(350, 184, 150, 100);
        medium.setForeground(new Color(255, 204, 0));
        // play.setBackground(new Color(123, 62, 46, 255));
        medium.setFont(fbt);
        medium.setCursor(Cur);
        add(medium);
        //--------------------hard   layer ----------------

        JLabel hard = new JLabel("hard");
        hard.setBounds(380, 281, 100, 100);
        hard.setForeground(new Color(255, 51, 51));
        // play.setBackground(new Color(123, 62, 46, 255));
        hard.setFont(fbt);
        hard.setCursor(Cur);
        add(hard);

        //--------------------exit layer ----------------
        JLabel exit = new JLabel("Menu");
        exit.setBounds(340, 360, 70, 100);
        exit.setForeground(new Color(0, 255, 255));
        // play.setBackground(new Color(123, 62, 46, 255));
        exit.setFont(fbt);
        exit.setCursor(Cur);
        add(exit);

        //---exit code------
        exit.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                 Menu fr = new Menu();
                dispose();
            }
        });
        
        
        //------------go to Easy -------
        
        
         easy.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                 Easy fr = new Easy();
                dispose();
            }
        });
         
         
         //------------go to hard -------
        
        
         hard.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                 hard fr = new hard();
                dispose();
            }
        });
         
           //------------go to medium -------
        
        
         medium.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                 Medium fr = new Medium();
                dispose();
            }
        });
         
         
         
        //-------animation code For Label----------------------------------------------------------
            
        //-- easy  layer------------------------
            Thread t1 = new Thread() {

            @Override
            public void run() {
                for (int i = 0; i < 380; i = i + 5) {
                    easy.setBounds(i, 129, 200, 50);

                    try {
                        sleep(3);
                    } catch (InterruptedException e) {
                    }
                }
            }
        };

        t1.start();
        
        
 
        
        
           //---hard layer-------------------------------
           
            Thread t2 = new Thread() {

            @Override
            public void run() {
                for (int i = 0; i < 350; i = i + 5) {
                    medium.setBounds(i, 210, 200, 50);

                    try {
                        sleep(3);
                    } catch (InterruptedException e) {
                    }
                }
            }
        };

        t2.start();
        
        //-----hard layer-----
        
           Thread t3 = new Thread() {

            @Override
            public void run() {
                for (int i = 0; i < 380; i = i + 5) {
                    hard.setBounds(i, 306, 200, 50);

                    try {
                        sleep(3);
                    } catch (InterruptedException e) {
                    }
                }
            }
        };

        t3.start();
        
        
           //-----exit  layer-----
        
           Thread t4 = new Thread() {

            @Override
            public void run() {
                for (int i = 0; i < 370; i = i + 5) {
                    exit.setBounds(i, 386, 200, 50);

                    try {
                        sleep(3);
                    } catch (InterruptedException e) {
                    }
                }
            }
        };

        t4.start();
        
    
        

        //----------------------------------------------------------------------------------------------
        JLabel pic = new JLabel();
        pic.setIcon(new ImageIcon(getClass().getResource("menu2.png")));
        pic.setBounds(0, 0, 800, 532);
        add(pic);

        //----------------------------------------------------------------------------------------------
        setSize(800, 532);
        //setTitle("MATH GAME");
        setLocationRelativeTo(null);
        setVisible(true);

        //setVisible(true);
    }

    public static void main(String[] args) {

        MathGame obj = new MathGame();
    }

}
