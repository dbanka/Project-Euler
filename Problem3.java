class Problem3{

public static void main(String[] args) {

    long number = 600851475143L;

    long highestPrime = -1;
    for (long i = 2; i <= number; ++i) {
        if (number % i == 0) {
            highestPrime = i;
            while(number%i==0)
             { number=number/i;}
        }
    }

    System.out.println(highestPrime);
}
}
