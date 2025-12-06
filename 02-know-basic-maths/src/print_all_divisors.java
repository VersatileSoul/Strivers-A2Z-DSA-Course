void main() {

    int num = Integer.parseInt(IO.readln("Enter a number: "));

    ArrayList<Integer> ans = divisors(num);
    IO.println("Divisors of a given number are: " + ans);
}

public ArrayList<Integer> divisors(int x) {
    ArrayList<Integer> ls = new ArrayList<>();
    for(int i = 1; i*i <= x; i++) {
        if(x%i == 0) {
            ls.add(i);
            if(!ls.contains(x/i)) ls.add(x/i);
        }
    }
    return ls;
}