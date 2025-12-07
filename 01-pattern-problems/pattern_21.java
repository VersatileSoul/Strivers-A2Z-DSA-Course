void main() {

    IO.println("Enter a number: ");
    int num = Integer.parseInt(IO.readln());

    for(int i = 0; i < num; i++) {
        for(int j = 0; j < num; j++) {
            if(i==0 || i==num-1 || j==0 || j==num-1) {
                IO.print("*"+" ");
            }
            else {
                IO.print("  ");
            }
        }
        IO.println();
    }
}
