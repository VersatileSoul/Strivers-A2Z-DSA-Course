void main() {
    int num = Integer.parseInt(IO.readln("Enter a number: "));

    if(isArmstrong(num)) {
        IO.println("Given number is armstrong");
    } else {
        IO.println("Given number is not armstrong");
    }
}

public boolean isArmstrong(int num) {
    if(num < 0) {
        return false;
    }
    if(num == 0) {
        return true;
    }
    long armstrong = 0;
    int temp = num;
    while(temp > 0) {
        armstrong += Math.powExact(temp%10,3);
        temp /= 10;
    }
    return armstrong == (long)(num);
}