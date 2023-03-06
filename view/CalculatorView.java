package view;

import controller.CalculatorController;
import model.CalculatorModel;

import javax.swing.*;
import java.awt.*;

public class CalculatorView extends JFrame {
    private CalculatorModel calculatormodel;
    private JTextField text3;
    private JTextField text2;
    private JTextField text1;
    public CalculatorView(CalculatorModel calculatormodel){
        this.calculatormodel = calculatormodel;
    }

    public JTextField getText3() {
        return text3;
    }

    public void setText3(JTextField text3) {
        this.text3 = text3;
    }

    public JTextField getText2() {
        return text2;
    }

    public void setText2(JTextField text2) {
        this.text2 = text2;
    }

    public JTextField getText1() {
        return text1;
    }

    public void setText1(JTextField text1) {
        this.text1 = text1;
    }

    public CalculatorModel getCalculatormodel() {
        return calculatormodel;
    }

    public void setCalculatormodel(CalculatorModel calculatormodel) {
        this.calculatormodel = calculatormodel;
    }
    public CalculatorView(){
        this.init();
        this.setVisible(true);
    }
    public void init(){
        this.setTitle("MINI CALCULATOR");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 600);
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);
        text1 = new JTextField();
        text2 = new JTextField();
        text3 = new JTextField();
        CalculatorController control = new CalculatorController(this);
        Font font = new Font("Times New Roman", Font.BOLD, 30);
        JLabel label1 = new JLabel("Tính : ");
        label1.setFont(font);
        JLabel label2 = new JLabel("Number 2 : ");
        JLabel label3 = new JLabel("Answer : ");
        label3.setFont(font);
        JPanel head = new JPanel();
        head.setLayout(new GridLayout(3, 2, 10, 10));
        head.add(label1);
        head.add(text1);
//        head.add(label2);
//        head.add(text2);
        head.add(label3);
        head.add(text3);
        this.add(head, BorderLayout.NORTH);
        JButton button1 = new JButton("+");
        JButton button2 = new JButton("-");
        JButton button3 = new JButton("x");
        JButton button4 = new JButton(":");
        JButton button5 = new JButton("^");
        JButton button6 = new JButton("%");
        JButton button7 = new JButton(".");
        JButton buttonso0 = new JButton("0");
        JButton buttonso1 = new JButton("1");
        JButton buttonso2 = new JButton("2");
        JButton buttonso3 = new JButton("3");
        JButton buttonso4 = new JButton("4");
        JButton buttonso5 = new JButton("5");
        JButton buttonso6 = new JButton("6");
        JButton buttonso7 = new JButton("7");
        JButton buttonso8 = new JButton("8");
        JButton buttonso9 = new JButton("9");
        JButton buttonbang = new JButton("=");
        buttonbang.setForeground(Color.WHITE);
        buttonbang.setBackground(Color.GREEN);
        buttonbang.setOpaque(true);
        JButton buttonxoa = new JButton("DELETE");
        JButton thoat = new JButton("EXIT");
        button1.addActionListener(control);
        button2.addActionListener(control);
        button3.addActionListener(control);
        button4.addActionListener(control);
        button5.addActionListener(control);
        button6.addActionListener(control);
        button7.addActionListener(control);
        buttonso0.addActionListener(control);
        buttonso1.addActionListener(control);
        buttonso2.addActionListener(control);
        buttonso3.addActionListener(control);
        buttonso4.addActionListener(control);
        buttonso5.addActionListener(control);
        buttonso6.addActionListener(control);
        buttonso7.addActionListener(control);
        buttonso8.addActionListener(control);
        buttonso9.addActionListener(control);
        buttonbang.addActionListener(control);
        buttonxoa.addActionListener(control);
        thoat.addActionListener(control);
        button1.setForeground(Color.GREEN);
        button1.setBackground(Color.WHITE);
        button1.setOpaque(true);
        button2.setForeground(Color.GREEN);
        button2.setBackground(Color.WHITE);
        button2.setOpaque(true);
        button3.setForeground(Color.GREEN);
        button3.setBackground(Color.WHITE);
        button3.setOpaque(true);
        button4.setForeground(Color.GREEN);
        button4.setBackground(Color.WHITE);
        button4.setOpaque(true);
        button5.setForeground(Color.GREEN);
        button5.setBackground(Color.WHITE);
        button5.setOpaque(true);
        button6.setForeground(Color.GREEN);
        button6.setBackground(Color.WHITE);
        button6.setOpaque(true);
        thoat.setForeground(Color.RED);
        thoat.setBackground(Color.WHITE);
        thoat.setOpaque(true);
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(5, 4));
        bottom.add(thoat);
        bottom.add(button1);
        bottom.add(button2);
        bottom.add(button3);
        bottom.add(buttonso7);
        bottom.add(buttonso8);
        bottom.add(buttonso9);
        bottom.add(button4);
        bottom.add(buttonso4);
        bottom.add(buttonso5);
        bottom.add(buttonso6);
        bottom.add(button5);
        bottom.add(buttonso1);
        bottom.add(buttonso2);
        bottom.add(buttonso3);
        bottom.add(button6);
        bottom.add(buttonxoa);
        bottom.add(buttonso0);
        bottom.add(button7);
        bottom.add(buttonbang);
        this.add(bottom, BorderLayout.CENTER);
    }
    public void tong(){
        String so1 = text1.getText();
        String so2 = text2.getText();
        double n = Double.valueOf(so1) + Double.valueOf(so2);
        text3.setText(String.valueOf(n));
    }
    public void hieu(){
        String so1 = text1.getText();
        String so2 = text2.getText();
        double n = Double.valueOf(so1) - Double.valueOf(so2);
        text3.setText(String.valueOf(n));
    }
    public void nhan(){
        String so1 = text1.getText();
        String so2 = text2.getText();
        double n = Double.valueOf(so1) * Double.valueOf(so2);
        text3.setText(String.valueOf(n));
    }
    public void chia(){
        String so1 = text1.getText();
        String so2 = text2.getText();
        double n = Double.valueOf(so1) / Double.valueOf(so2);
        text3.setText(String.valueOf(n));
    }
    public void mu(){
        String so1 = text1.getText();
        String so2 = text2.getText();
        double n = Math.pow(Double.valueOf(so1), Double.valueOf(so2));
        text3.setText(String.valueOf(n));
    }
    public void mod(){
        String so1 = text1.getText();
        String so2 = text2.getText();
        double n = Double.valueOf(so1) % Double.valueOf(so2);
        text3.setText(String.valueOf(n));
    }
    public void tinh(String s){
        String s1 = "";
        String s2 = "";
        String dau = "";
        int i = 0;
        while(s.charAt(i) != '+' && s.charAt(i) != '-' && s.charAt(i) != 'x' &&
                s.charAt(i) != ':' && s.charAt(i) != '^' && s.charAt(i) != '%' ){
            s1 += s.charAt(i);
            i++;
        }
        dau += s.charAt(i);
        i++;
        while(i < s.length()){
            s2 += s.charAt(i);
            i++;
        }
        if(dau.equals("+")){
            text3.setText(String.valueOf(Double.valueOf(s1) + Double.valueOf(s2)));
        }else if(dau.equals("-")){
            text3.setText(String.valueOf(Double.valueOf(s1) - Double.valueOf(s2)));
        }else if(dau.equals("x")){
            text3.setText(String.valueOf(Double.valueOf(s1) * Double.valueOf(s2)));
        }else if(dau.equals(":")){
            text3.setText(String.valueOf(Double.valueOf(s1) / Double.valueOf(s2)));
        }else if(dau.equals("^")){
            text3.setText(String.valueOf(Math.pow(Double.valueOf(s1), Double.valueOf(s2))));
        }else if(dau.equals("%")){
            text3.setText(String.valueOf(Double.valueOf(s1) % Double.valueOf(s2)));
        }
    }
}
