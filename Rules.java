package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Dive into BrainBrew " + name + " and test your wits!");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1. Whether you're a newbie or a pro, this quiz is open to everyone-jump in and show us what you've got!." + "<br><br>" +
                "2. Get ready for 10 exciting questions." + "<br><br>" +
                "3. You've got just 15 seconds to answer each question. Stay sharp and think fast!" + "<br><br>" +
                "4. Each participant will have access to a 50-50 lifeline for one question during the quiz." + "<br><br>" +
                "5. All questions in the quiz are based on Java programming." + "<br><br>" +
                "6. Participants will be able to see their scores at the end of the quiz." + "<br><br>" +
                "7. The quiz is one time event, so make every question count. You only get one shot!" + "<br><br>" +
                "8. Fair play for all, Good Luck!" + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}
