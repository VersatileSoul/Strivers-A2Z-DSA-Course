void main() {
    int num = Integer.parseInt(IO.readln("Enter a number: "));

    print_1_to_n(num);
}
int x = 1;
public void print_1_to_n(int n) {
    if(x == n) {
        IO.println(n);
        return;
    }
    IO.println(x);
    x++;
    print_1_to_n(n);
}