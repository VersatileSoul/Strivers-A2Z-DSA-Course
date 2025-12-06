void main() {
    long num = Long.parseLong(IO.readln("Enter a number: "));

    if(isPrime(num)) {
        IO.println("Given number is Prime");
    } else {
        IO.println("Given number is not Prime");
    }
}

public boolean isPrime(long num) {
    if (num <= 1) return false;
    if(num == 2) return true;
    if(num%2 == 0) return false;
    for(int i = 3; i * (long)i <= num; i++) {
        if(num % i == 0) {
            return false;
        }
    }
    return true;
}