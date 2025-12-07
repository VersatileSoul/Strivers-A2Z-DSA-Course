void main() {

    long first_num = Long.parseLong(IO.readln("Enter first number: "));
    long second_num = Long.parseLong(IO.readln("Enter first number: "));

    IO.println("HCF of numbers: " + hcf(first_num,second_num));
    IO.println("LCM of numbers: " + lcm(first_num,second_num));
}

public long hcf(long num1, long num2) {
    while(num1 != 0 && num2 != 0) {
        if(num1 > num2) {
            num1 %= num2;
        }
        else {
            num2 %= num1;
        }
    }
    if(num1 == 0) {
        return  num2;
    }
    return num1;
}

public long lcm(long num1, long num2) {
    long gcd = hcf(num1,num2);
    return (num1 / gcd) * num2;
}