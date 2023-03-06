package controller;

import view.CalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController implements ActionListener {
    private CalculatorView calculatorview;

    public CalculatorController(CalculatorView calculatorview) {
        this.calculatorview = calculatorview;
    }

    public CalculatorView getCalculatorview() {
        return calculatorview;
    }

    public void setCalculatorview(CalculatorView calculatorview) {
        this.calculatorview = calculatorview;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if(src.equals("+")){
            String s = this.calculatorview.getText1().getText();
            this.calculatorview.getText1().setText(s + "+");
        }else if(src.equals("-")){
            String s = this.calculatorview.getText1().getText();
            this.calculatorview.getText1().setText(s + "-");
        }else if(src.equals("x")){
            String s = this.calculatorview.getText1().getText();
            this.calculatorview.getText1().setText(s + "x");
        }else if(src.equals(":")){
            String s = this.calculatorview.getText1().getText();
            this.calculatorview.getText1().setText(s + ":");
        }else if(src.equals("^")){
            String s = this.calculatorview.getText1().getText();
            this.calculatorview.getText1().setText(s + "^");
        }else if(src.equals("%")){
            String s = this.calculatorview.getText1().getText();
            this.calculatorview.getText1().setText(s + "%");
        }else if(src.equals("1")){
            String s = this.calculatorview.getText1().getText();
            this.calculatorview.getText1().setText(s + "1");
        }else if(src.equals("2")){
            String s = this.calculatorview.getText1().getText();
            this.calculatorview.getText1().setText(s + "2");
        }else if(src.equals("3")){
            String s = this.calculatorview.getText1().getText();
            this.calculatorview.getText1().setText(s + "3");
        }else if(src.equals("4")){
            String s = this.calculatorview.getText1().getText();
            this.calculatorview.getText1().setText(s + "4");
        }else if(src.equals("5")){
            String s = this.calculatorview.getText1().getText();
            this.calculatorview.getText1().setText(s + "5");
        }else if(src.equals("6")){
            String s = this.calculatorview.getText1().getText();
            this.calculatorview.getText1().setText(s + "6");
        }else if(src.equals("7")){
            String s = this.calculatorview.getText1().getText();
            this.calculatorview.getText1().setText(s + "7");
        }else if(src.equals("8")){
            String s = this.calculatorview.getText1().getText();
            this.calculatorview.getText1().setText(s + "8");
        }else if(src.equals("9")){
            String s = this.calculatorview.getText1().getText();
            this.calculatorview.getText1().setText(s + "9");
        }else if(src.equals("=")){
            this.calculatorview.tinh(this.calculatorview.getText1().getText());
        }else if(src.equals("DELETE")){
            String s = this.calculatorview.getText1().getText();
            String t = "";
            if(s.length() >= 1){
                t += s.substring(0, s.length() - 1);
            }
            this.calculatorview.getText1().setText(t);
        }else if(src.equals("0")){
            String s = this.calculatorview.getText1().getText();
            this.calculatorview.getText1().setText(s + "0");
        }else if(src.equals(".")){
            String s = this.calculatorview.getText1().getText();
            this.calculatorview.getText1().setText(s + ".");
        }else{
            System.exit(0);
        }
    }
}
