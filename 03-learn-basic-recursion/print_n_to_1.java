void main() {
    int num = Integer.parseInt(IO.readln("Enter a number: "));

    print_n_to_1_(num);
}

public void print_n_to_1_(int n) {
    if (n == 1) {
        IO.println(n);
        return;
    }
    IO.println(n);
    n--;
    print_n_to_1_(n);
}