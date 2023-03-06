package model;

public class CalculatorModel {
    private double x;
    private double y;
    private double ans;

    public CalculatorModel(double x, double y, double ans) {
        this.x = x;
        this.y = y;
        this.ans = ans;
    }

    public double getAns() {
        return ans;
    }

    public void setAns(double ans) {
        this.ans = ans;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void tong(){
        ans = x + y;
    }
    public void hieu(){
        ans = x - y;
    }
    public void nhan(){
        ans = x * y;
    }
    public void chia(){
        ans = x / y;
    }

}
