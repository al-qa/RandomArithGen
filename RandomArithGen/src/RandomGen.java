import javax.swing.*;

/**
 * Created by A on 5/12/2017.
 */
public class RandomGen {

    private int ranNum1 = (int) Math.round(Math.random() * 9) + 1;
    private int ranNum2 = (int) Math.round(Math.random() * 9) + 1;
    private int ranNum3 = (int) Math.round(Math.random() * 2) + 1;
    private int result;
    private String operator;

    public int getRanNum1() {
        return ranNum1;
    }
    public int getRanNum2() {
        return ranNum2;
    }
    public int getRanNum3() {
        return ranNum3;
    }
    static public void main(String... h){

        for (int x = 0; x < 10; x++) {
            RandomGen gen = new RandomGen();
            if (gen.getRanNum1() < gen.getRanNum2())
                gen.add(gen.getRanNum1(), gen.getRanNum2());
            else
                gen.setOperation(gen.getRanNum3());

            JOptionPane.showMessageDialog(null, gen.getRanNum1() + gen.getOperator() + gen.getRanNum2()
                                            + " = " + gen.getResult(),"10 random operations",JOptionPane.PLAIN_MESSAGE);
        }
    }
    public void setOperation(int a){
        switch (a){
            case 1: add(getRanNum1(), getRanNum2());
                break;
            case 2: subtract(getRanNum1(), getRanNum2());
                break;
            case 3: multiple(getRanNum1(), getRanNum2());
                break;
            //case 4: divide(getRanNum1(), getRanNum2());
        }
    }
    public void add(int a, int b){
        setResult(a + b);
        setOperator(" + ");
    }
    public void subtract(int a, int b){
        setResult(a - b);
        setOperator(" - ");
    }
    public void multiple(int a, int b){
        setResult(a * b);
        setOperator(" * ");
    }
//    public void divide(int a, int b){
//        setResult(a / b);
//        setOperator("/");
//    }
    public int getResult() {
        return result;
    }
    public void setResult(int result) {
        this.result = result;
    }
    public String getOperator() {
        return operator;
    }
    public void setOperator(String operator) {
        this.operator = operator;
    }
}
