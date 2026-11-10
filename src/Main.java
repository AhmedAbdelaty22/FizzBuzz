void main() {
    Scanner sc = new Scanner(System.in);

    IO.print("Please Enter a Number : ");
    int number = sc.nextInt();

    if (number % 5 == 0 && number % 3 == 0) {
        IO.println("FizzBuzz");
    }
    else if (number % 5 == 0) {
        IO.println("Fizz");
    }
    else if (number % 3 == 0) {
        IO.println("Buzz");
    }
    else {
        IO.println("Your Number is : " + number);
    }
}