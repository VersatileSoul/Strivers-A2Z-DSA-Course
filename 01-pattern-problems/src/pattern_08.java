void main() {

    IO.println("Enter a number: ");
    int num = Integer.parseInt(IO.readln());

    for(int i = 0; i < num; i++) {

        // space
        for(int j = 0; j < i; j++) {
            IO.print(" ");
        }

        // stars
        for(int j = 0; j < (2*(num-i)-1); j++) {
            IO.print("*");
        }
        IO.println();
    }
}
