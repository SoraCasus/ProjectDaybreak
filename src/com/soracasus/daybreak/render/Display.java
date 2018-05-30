package com.soracasus.daybreak.render;

import javax.swing.*;
import java.awt.*;

public class Display {

    private JFrame frame;
    private Canvas canvas;

    private String title;
    private int width;
    private int height;

    public Display(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;

        createDisplay();
    }

    private void createDisplay() {
        Dimension d = new Dimension(width, height);
        this.frame = new JFrame(title);
        this.frame.setSize(d);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setLocationRelativeTo(null);
        this.frame.setVisible(true);

        this.canvas = new Canvas();
        this.canvas.setPreferredSize(d);
        this.canvas.setMaximumSize(d);
        this.canvas.setMinimumSize(d);
        this.canvas.setFocusable(false);

        this.frame.add(canvas);
        this.frame.pack();
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public JFrame getFrame() {
        return frame;
    }
}
