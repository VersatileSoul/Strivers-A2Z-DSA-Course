void main() {

    int num = Integer.parseInt(IO.readln("Enter a number: "));

    for(int i = 0; i < num; i++) {
        char ch = 'A';
        for(int j = i; j < num; j++) {
            IO.print(ch++);
        }
        IO.println();
    }
}
