void main() {

    int num = Integer.parseInt(IO.readln("Enter a number: "));

    func(num);
}

public void func(int n) {
    if(n == 0) {
        return;
    }
    IO.println("x");
    n--;
    func(n);
}