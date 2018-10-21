package HomeWork7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JFrame {

    private static final int WINDOW_WIDTH = 550;
    private static final int WINDOW_HEIGHT = 450;
    private static final int WINDOW_POS_X = 350;
    private static final int WINDOW_POS_Y = 110;

    private Map map;
    private SettingWindow settingsWindow;

    GameWindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocation(WINDOW_POS_X, WINDOW_POS_Y);
        setResizable(false);
        setTitle("TestWindow");
        JButton btnStart = new JButton("Start");
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settingsWindow.setVisible(true);
            }
        });
        JButton btnStop = new JButton("Stop");
        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        JPanel panBottom = new JPanel();
        panBottom.setLayout(new GridLayout(1,2));
        panBottom.add(btnStart);
        panBottom.add(btnStop);
        add(panBottom, BorderLayout.SOUTH);
//        add(btnStart, BorderLayout.NORTH);
//        add(btnStop, BorderLayout.SOUTH);

        map = new Map();
        settingsWindow = new SettingWindow(this);
        add(map, BorderLayout.CENTER);
        setVisible(true);
    }

    void startNewGame(int mode, int fieldSizeX, int fielSizeY, int winLength) {
        map.startNewGame(mode, fieldSizeX, fielSizeY, winLength);
    }
}
