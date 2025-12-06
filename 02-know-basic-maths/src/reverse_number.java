void main() {

    int num = Integer.parseInt(IO.readln("Enter a number: "));

    IO.println("Reversed number: " + reverse(num));
}

public int reverse(int x) {
    if(x == 0) {
        return 0;
    }
    double temp = x;
    if(x < 0) {
        temp = Math.abs(temp);
    }
    String str = "";
    while(temp > 0) {
        char ch = (char)(temp%10+48);
        str += ch;
        temp = Math.floor(temp / 10);
    }
    double num = Double.parseDouble(str);
    if(x<0) {
        num *= -1;
    }
    if(num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) {
        return -1;
    }
    return (int)num;
}