void main() {

    int num = Integer.parseInt(IO.readln("Enter a number: "));
    int count = 0;

    if(num == 0) {
        IO.println("Count of Digits: " + 1);
        return;
    }

    num = Math.abs(num);
    while(num > 0) {
        count++;
        num = num/10;
    }

    IO.println("Count of Digits: " + count);

}