public class start {
    public static void main (String [] args) {
        System.out.println(fibonacciNumber(10));
    }
    public static int fibonacciNumber(int degree){
        int firstNumber = 1;
        int secondNumber = 1;
        int thirdNumber = 1;

        for(int i = 3; i <= degree; i++){
            thirdNumber = secondNumber + firstNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
        }
        return thirdNumber;
    }
}
