import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SwingDemo {

    JLabel jlab;

    SwingDemo(){
        JFrame jfrm =new JFrame("1");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(220,90);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jbtAlpha =new JButton("Al");
        JButton jbtBeta =new JButton("Be");
        jbtAlpha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("2");
            }
        });
        jbtBeta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jlab.setText("3");
            }
        });
        jfrm.add(jbtAlpha);
        jfrm.add(jbtBeta);
        jlab = new JLabel("2");
        jfrm.add(jlab);
        jfrm.setVisible(true);
    }
    public static void main (String args[]){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
}
