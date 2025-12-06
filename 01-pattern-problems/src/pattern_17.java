void main() {

    int num = Integer.parseInt(IO.readln("Enter a number: "));

    for(int i = 0; i < num; i++) {

        for(int j = i; j < num - 1; j++) {
            IO.print(" ");
        }
        char ch = 'A';
        for(int j = 0; j <= i; j++) {
            IO.print(ch++);
        }
        ch = (char)('A'+i);
        for(int j = i; j > 0; j--) {
            IO.print(--ch);
        }
        IO.println();
    }
}
