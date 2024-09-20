public class Main {
    public static void main(String[] args) {
        int intOperandA = 6;
        int intOperandB = 2;
        int intSum = 55;
        int intProduct = 42;
        int intDifference = 69;
        int intQuotient = 99;
        int intModulo = 57;

        intSum = intOperandA + intOperandB;
        intDifference = intOperandA - intOperandB;
        intProduct = intOperandA * intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;

        System.out.println("The sum is " + intSum);
        System.out.println("The product is " + intProduct);
        System.out.println("The difference is " + intDifference);
        System.out.println("The quotient is " + intQuotient);
        System.out.println("The modulo is " + intModulo);

        System.out.println("");

        double doubleOperandA = 4.2;
        double doubleOperandB = 6.9;
        double doubleSum = 8.9;
        double doubleProduct = 7.8;
        double doubleDifference = 1.9;
        double doubleQuotient = 9.0;

        doubleSum = doubleOperandA + doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;

        System.out.println("The sum is " + doubleSum);
        System.out.println("The product is " + doubleProduct);
        System.out.println("The difference is " + doubleDifference);
        System.out.println("The quotient is " + doubleQuotient);

        String birthDate = "8 / 27 / 2004";
        System.out.println("\nMy Birthday is " + birthDate);
        int myAge = 20;
        System.out.println("As a result of when I was born, my age is\n" + myAge + " years old");
    }
}