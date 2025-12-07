void main() {

    int num = Integer.parseInt(IO.readln("Enter a number: "));
    char ch = 'A';
    for(int i = 0; i < num; i++) {
        for(int j = 0; j <= i; j++) {
            IO.print((ch));
        }
        ch++;
        IO.println();
    }
}
