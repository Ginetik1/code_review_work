public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return add(a, times(b, -1));
    }
    public int div(int a, int b){
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver(){ // (2*8 - 9*6)/2
        return div(dif(times(2,8), times(9,6)), 2);
    }
}
