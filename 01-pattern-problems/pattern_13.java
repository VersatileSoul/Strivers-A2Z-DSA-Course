void main() {

    int num = Integer.parseInt(IO.readln("Enter a number: "));
    int counter = 1;


    for(int i = 0; i < num; i++) {
        for(int j = 0; j <= i; j++) {
            IO.print((counter++)+" ");
        }
        IO.println();
    }
}
