import javafx.scene.control.Hyperlink;

import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import java.awt.*;
import java.beans.*;
import java.io.*;
import java.net.*;
public class launcher {

    public static void main(String[] args) throws java.io.IOException
    {

        JFrame f = new JFrame("Eternal Conflict Launcher");
        JPanel p = new JPanel(new GridBagLayout());
        f.setVisible(true);
        f.setSize(500, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
        p.setBackground(Color.BLUE);

        f.setResizable(false);

        Icon loginimg = new ImageIcon("C:\\Users\\Aaron Appleby\\IdeaProjects\\LauncherV1\\src\\Login.png");
        Icon pressedlogin = new ImageIcon("C:\\Users\\Aaron Appleby\\IdeaProjects\\LauncherV1\\src\\Login_pressed.png");
        Icon updateimg = new ImageIcon("C:\\Users\\Aaron Appleby\\IdeaProjects\\LauncherV1\\src\\Update.png");
        Icon regesterimg = new ImageIcon("C:\\Users\\Aaron Appleby\\IdeaProjects\\LauncherV1\\src\\Regester.png");

        JButton login = new JButton(loginimg);
        login.setPressedIcon(pressedlogin);
        login.setPreferredSize(new Dimension(81,23));

        JButton update = new JButton(updateimg);
        update.setPreferredSize(new Dimension(81,23));

        JButton regester = new JButton(regesterimg);
        regester.setPreferredSize(new Dimension(81,23));

        JProgressBar progress = new JProgressBar();

        JLabel passlabel = new JLabel("Password");

        JLabel usernamelabel = new JLabel("Username");

        JPasswordField passtext = new JPasswordField(16);

        JTextField usernametext = new JTextField(16);

        GridBagConstraints c = new GridBagConstraints();

        c.insets = new Insets(3, 3, 3, 3);
        c.gridx = 0;
        c.gridy = 1;
        p.add(login,c);

        c.gridx = 0;
        c.gridy = 2;
        p.add(regester,c);

        c.gridx = 0;
        c.gridy = 3;
        p.add(update,c);

        c.gridx = 2;
        c.gridy = 2;
        p.add(passtext,c);

        c.gridx = 1;
        c.gridy= 1;
        p.add(usernamelabel,c);

        c.gridx = 2;
        c.gridy = 1;
        p.add(usernametext,c);

        c.gridx = 1;
        c.gridy= 2;
        p.add(passlabel,c);

        c.gridx = 0;
        c.gridy = 10;
        p.add(progress,c);
        f.add(p,BorderLayout.BEFORE_FIRST_LINE);
        f.pack();



    }

}

