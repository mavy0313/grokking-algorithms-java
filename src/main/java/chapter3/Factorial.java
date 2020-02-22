package chapter3;

class Factorial {
    public int evaluate(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x * evaluate(x - 1);
        }
    }
}
