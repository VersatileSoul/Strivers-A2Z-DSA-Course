void main() {

    IO.println("Enter a number: ");
    int num = Integer.parseInt(IO.readln());

    for(int i = 0; i < num; i++) {
        for(int j = 0; j < (num-i); j++) {
            IO.print((j+1)+" ");
        }
        IO.println();
    }
}
