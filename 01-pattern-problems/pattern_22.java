void main() {

    int num = Integer.parseInt(IO.readln("Enter a number: "));
    int temp = num;
    for(int i = 0; i < num; i++) {
        for(int j = num; j >= num-i; j--) {
            IO.print(j+" ");
        }
        for(int j = 0; j < 2*(num-i-1)-1; j++) {
            IO.print(temp+" ");
        }
        temp--;
        for(int j = (num-i); j <= num; j++) {
            if(i==num-1 && j == 1) {
                continue;
            }
            IO.print(j+" ");
        }
        IO.println();
    }
    temp = 1;
    for(int i = 0; i < num-1; i++) {
        for(int j = num; j > i+1; j--) {
            IO.print(j+" ");
        }
        ++temp;
        for(int j = 0; j < 2*(i)+1; j++) {
            IO.print(temp+" ");
        }
        for(int j = i+2; j <= num; j++) {
            IO.print(j+" ");
        }
        IO.println();
    }
}
