/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathGame;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.lang.Thread.sleep;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Menu extends JFrame {

    Menu() {
        setLayout(null);
        setResizable(false);
        //----------------------------------------------------------------------------------------------

        Font fbt = new Font("Tempus Sans ITC", Font.BOLD, 60);
        Cursor Cur = new Cursor(Cursor.HAND_CURSOR);

        JLabel play = new JLabel("Play");
        play.setBounds(360, 145, 200, 100);
        play.setForeground(Color.WHITE);
        // play.setBackground(new Color(123, 62, 46, 255));
        play.setFont(fbt);
        play.setCursor(Cur);
        add(play);
        
         play.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
              MathGame fr = new MathGame();
                dispose();
            }
        });
         
        

        JLabel exit = new JLabel("Exit");
        exit.setBounds(360, 265, 200, 100);
        exit.setForeground(new Color(255, 0, 51));
        // play.setBackground(new Color(123, 62, 46, 255));
        exit.setFont(fbt);
        exit.setCursor(Cur);
        add(exit);

        exit.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent e) {
                System.exit(3);
            }
        });
        
        //---------animation Code -------------------------------------------------------------------------------
            Thread t3 = new Thread() {

            @Override
            public void run() {
                for (int i = 0; i < 360; i = i + 5) {
                    exit.setBounds(i, 290, 200, 50);

                    try {
                        sleep(5);
                    } catch (InterruptedException e) {
                    }
                }
            }
        };

        t3.start();
        
        
        Thread t4 = new Thread() {

            @Override
            public void run() {
                for (int i = 0; i < 360; i = i + 5) {
                    play.setBounds(i, 119, 200, 150);

                    try {
                        sleep(5);
                    } catch (InterruptedException e) {
                    }
                }
            }
        };

        t4.start();
        
        //----------------------------------------------------------------------------

        JLabel pic = new JLabel();
        pic.setIcon(new ImageIcon(getClass().getResource("baba.png")));
        pic.setBounds(0, 0, 800, 532);
        add(pic);
        //----------------------------------------------------------------------------------------------
        setSize(800, 532);
        //setTitle("MATH GAME");
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        Menu obj = new Menu();
    }
}
