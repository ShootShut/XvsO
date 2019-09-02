package view;

import controller.GameController;
import model.Field;
import model.Point;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {

    Field field;
    public static final int SIZE = 3;

    public void init() {
        setSize(400,400);
        setTitle("XxsO");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(SIZE, SIZE));
        JButton[][] jButtons = new JButton[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                JButton jButton = new JButton(j % 2 == 0 ? "X" : "O");
                final int finalJ = j;
                final int finalI = i;
                jButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String buttonText = e.getActionCommand();
                        System.out.printf("Button: %s, x: %d, y: %d%n", buttonText, finalJ, finalI);
                        GameController.doShoot(new Point(finalI, finalJ), buttonText.equals("X") ? Field.Type.X :
                                Field.Type.O);
                    }
                });

                jButtons[i][j] = jButton;
                jPanel.add(jButton);
            }
        }
        add(jPanel);
        setVisible(true);
    }
}
