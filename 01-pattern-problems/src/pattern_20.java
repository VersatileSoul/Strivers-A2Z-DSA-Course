void main() {

    int num = Integer.parseInt(IO.readln("Enter a number: "));

    for(int i = 0; i < num; i++) {
        // stars
        for(int j = 0; j <= i; j++) {
            IO.print("*");
        }
        // spaces
        for(int j = 0; j < 2*(num-i-1); j++) {
            IO.print(" ");
        }
        // stars
        for(int j = 0; j <= i; j++) {
            IO.print("*");
        }
        IO.println();
    }
    num--;
    for(int i = 0; i < num; i++) {
        // stars
        for(int j = i; j < num; j++) {
            IO.print("*");
        }
        // spaces
        for(int j = 0; j < 2*(i+1); j++) {
            IO.print(" ");
        }
        // stars
        for(int j = i; j < num; j++) {
            IO.print("*");
        }
        IO.println();
    }
}
