void main() {

    int num = Integer.parseInt(IO.readln("Enter a number: "));

    for(int i = 0; i < num; i++) {
        char ch = (char)('A'+ num - i - 1);
//        char x = (char)(ch - i);
        for(int j = 0; j <= i; j++) {
            IO.print((ch++)+" ");
        }
        IO.println();
    }
}
