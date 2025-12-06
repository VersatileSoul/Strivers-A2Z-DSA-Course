void main() {
    int num = Integer.parseInt(IO.readln("Enter a number: "));

    IO.println("Fibonacci number: " + fibonacci(num));
}

public int fibonacci(int n) {
    if(n<=0) {
        return 0;
    }
    if(n==1 || n==2) {
        return 1;
    }
    return fibonacci(n-1)+fibonacci(n-2);
}