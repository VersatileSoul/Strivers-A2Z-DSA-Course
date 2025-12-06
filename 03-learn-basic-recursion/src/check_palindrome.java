void main() {
    String str = IO.readln("Enter a string: ");
    String newStr = "";
    for(int i = 0; i < str.length(); i++) {
        if((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
            newStr += str.charAt(i);
        }
    }
    newStr = newStr.toLowerCase();
    if(newStr.isEmpty()) {
        IO.println("String is empty");
        return;
    }
    IO.println(newStr);
    int l = 0;
    int r = newStr.length()-1;

    if(isPalindrome(newStr,l,r)) {
        IO.println("String is Palindrome");
    } else {
        IO.println("String is not Palindrome");
    }
}

public boolean isPalindrome(String s, int l, int r) {
    boolean b = s.charAt(l) == s.charAt(r);
    if(l >= r) {
        return b;
    }
    if(b) {
        l++;
        r--;
        return isPalindrome(s,l,r);
    }
    return false;
}