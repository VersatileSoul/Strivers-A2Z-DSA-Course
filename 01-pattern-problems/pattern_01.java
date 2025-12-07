void main() {

    Scanner sc = new Scanner(System.in);
    IO.println("Enter a number: ");
    int num = sc.nextInt();

    for (int i = 0; i < num; i++) {
        for (int j = 0; j < num; j++) {
            IO.print("* ");
        }
        IO.println();
    }
}