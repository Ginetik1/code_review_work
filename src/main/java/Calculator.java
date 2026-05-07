public class Calculator {
    public int add(int a, int b){
        return (a + b);
    }
    public int dif(int a, int b){
        return (a - b);

    }
    public int div(int a, int b){
        return (a / b);
    }
    public int times(int a, int b){
        return (a * b);
    }
    // (2*8 - 9*6) / 2
    public int solver(){
        return div(dif(times(2,8), times(9,6)),2);
    }
}
