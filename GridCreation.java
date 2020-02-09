package AutoStuff;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//add extends evenlistener, etc
public class GridCreation implements MouseListener, MouseMotionListener, ActionListener {
    static JFrame mainFrame;
    static JPanel panel;
    public static JPanel sidePanel = new JPanel();;
    public static JLabel gridCountLabel;
    public static int gridSize = 16;

    public static void main(String[] args) {
        mainFrame = new JFrame("Main Frame");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        mainFrame.setLayout(new BorderLayout());
        mainFrame.setSize(400, 400);
        mainFrame.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setBackground(Color.darkGray); 
        JButton btn = new JButton("16");
        panel.add(btn);
        btn.addMouseListener(new CreateGridMouseListener());

        gridCountLabel = new JLabel();
        gridCountLabel.setForeground(Color.white);
        panel.add(gridCountLabel);
        
        panel.add(Box.createRigidArea(new Dimension(15, 15)));
        mainFrame.add(panel, BorderLayout.WEST);
        
        sidePanel.setLayout(new GridLayout(gridSize, gridSize));
        sidePanel.setBackground(Color.lightGray);
        mainFrame.add(sidePanel, BorderLayout.CENTER);
        
        mainFrame.setVisible(true); //<-- this need to be always last 
        print("init Done");
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        JButton newbtn;
        print("Is in");
        int gridCount = 0;
        for (gridCount =0; gridCount<17; gridCount++) {
            newbtn = new JButton(Integer.toString(gridCount));
            sidePanel.add(newbtn);
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    public static void print(String string) {
        System.out.println(string);
    }
}