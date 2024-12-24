import java.awt.*;
import javax.swing.*;

public class GridLayoutExample1 {

    JFrame frameObj;

    GridLayoutExample1() {
        frameObj = new JFrame();

        JTextArea textArea = new JTextArea(7, 30);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        //  кнопки
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn10 = new JButton("*");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn11 = new JButton("-");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        JButton btn12 = new JButton("+");
        JButton btn14 = new JButton("C");
        JButton btn15 = new JButton("0");
        JButton btn16 = new JButton("=");
        JButton btn13 = new JButton("/");

        // Панель для размещения кнопок
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 25));

        // кнопки на панель
        buttonPanel.add(btn1);
        btn1.setBackground(Color.WHITE);
        buttonPanel.add(btn2);
        btn2.setBackground(Color.WHITE);
        buttonPanel.add(btn3);
        btn3.setBackground(Color.WHITE);
        buttonPanel.add(btn10);
        btn10.setBackground(Color.GRAY);
        buttonPanel.add(btn4);
        btn4.setBackground(Color.WHITE);
        buttonPanel.add(btn5);
        btn5.setBackground(Color.WHITE);
        buttonPanel.add(btn6);
        btn6.setBackground(Color.WHITE);
        buttonPanel.add(btn11);
        btn11.setBackground(Color.GRAY);
        buttonPanel.add(btn7);
        btn7.setBackground(Color.WHITE);
        buttonPanel.add(btn8);
        btn8.setBackground(Color.WHITE);
        buttonPanel.add(btn9);
        btn9.setBackground(Color.WHITE);
        buttonPanel.add(btn12);
        btn12.setBackground(Color.GRAY);
        buttonPanel.add(btn14);
        buttonPanel.add(btn15);
        btn15.setBackground(Color.WHITE);

        buttonPanel.add(btn16);
        btn16.setBackground(Color.PINK);
        btn14.setBackground(Color.LIGHT_GRAY);
        buttonPanel.add(btn13);

        btn13.setBackground(Color.GRAY);
        // Устанавливаем компоновку для JFrame
        frameObj.setLayout(new BorderLayout());

        // Добавляем текстовое поле сверху
        frameObj.add(textArea, BorderLayout.NORTH);

        // Добавляем панель с кнопками в центр
        frameObj.add(buttonPanel, BorderLayout.CENTER);

        // Настройки окна
        frameObj.setSize(300, 400);
        frameObj.setVisible(true);
        frameObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
