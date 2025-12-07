void main() {

    int num = Integer.parseInt(IO.readln("Enter a number: "));

    for(int i = 0; i < num; i++) {
        for(int j = 0; j <= i; j++) {
            if((i+j)%2 == 1) IO.print(0+" ");
            else IO.print(1+" ");
        }
        IO.println();
    }
}