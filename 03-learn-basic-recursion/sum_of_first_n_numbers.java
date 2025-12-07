void main() {
    int num = Integer.parseInt(IO.readln("Enter a number: "));

    IO.println("Sum: " + sum(num));
}
public int sum(int n) {
    if(n == 1) {
        return 1;
    }
    return n + sum(n-1);
}