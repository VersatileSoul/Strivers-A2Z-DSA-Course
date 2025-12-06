void main() {
    int num = Integer.parseInt(IO.readln("Enter a number: "));

    if(isPalindrome(num)) {
        IO.println("Given number is Palindrome");
    } else {
        IO.println("Given number is not Palindrome");
    }
}

public boolean isPalindrome(int x) {
    if(x < 0) {
        return false;
    }
    if(x == 0) {
        return true;
    }
    double temp = x;
    double reversedNum = 0;
    while(temp > 0) {
        reversedNum = reversedNum * 10 + temp % 10;
        temp = Math.floor(temp/10);
    }
    return reversedNum == x;
}