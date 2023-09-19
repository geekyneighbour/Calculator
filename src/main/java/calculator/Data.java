package calculator;


public class Data {

    private String action;
    private int num1;

    private int num2;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public Object getResult() {
        int result = 0;
        String s = "";
        switch (action) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                }
                else {s = "На ноль делить нельзя";}
                break;
            default:
                s = "Недопустимая операция";
                break;}
        if (s.isEmpty()) {
            return result;
            } else {
                return s;
            }
            }
    }







