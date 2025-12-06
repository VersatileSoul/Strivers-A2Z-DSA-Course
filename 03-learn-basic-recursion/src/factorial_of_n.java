void main() {

    int num = Integer.parseInt(IO.readln("Enter a number: "));

    IO.println("Factorial: " + factorial(num));
}

public int factorial(int n) {
    if(n == 1 || n == 0) {
        return 1;
    }
    return n * factorial(n-1);
}