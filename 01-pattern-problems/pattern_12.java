void main() {

    int num = Integer.parseInt(IO.readln("Enter a number: "));

    for(int i = 0; i < num; i++) {
        for(int j = 0; j <= i; j++) {
            IO.print(j+1);
        }
        for(int j = 0; j < num - i - 1; j++) {
            IO.print(" ");
        }
        for(int j = 0; j < num - i - 1; j++) {
            IO.print(" ");
        }
        for(int j = i; j >= 0; j--) {
            IO.print(j+1);
        }
        IO.println();
    }
}