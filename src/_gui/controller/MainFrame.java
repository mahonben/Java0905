package _gui.controller;

import _gui.View.OrderInfoView;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public static final int FRAME_WIDTH = 700;
    public static final int FRAME_HEIGHT = 500;

    public static int FRAME_X = 300;
    public static int FRAME_Y = 200;

    public MainFrame() {
        super("검색프로그램");
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        double sw = dimension.getWidth();
        double sh = dimension.getHeight();



//        setLocation(FRAME_X, FRAME_Y);

        FRAME_X = (int)((0.5)*(sw - FRAME_WIDTH));
        FRAME_Y = (int)((0.5)*(sh - FRAME_HEIGHT));

        OrderInfoView orderInfoView = new OrderInfoView();
        add(orderInfoView, "Center");

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLocation(FRAME_X, FRAME_Y);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setVisible(true);
    }


    public static void main(String[] args) {
        new MainFrame();
    }

}