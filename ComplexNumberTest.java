public class ComplexNumberTest { 
    public static void main(String args[]) {
        ComplexNumber complex1 = new ComplexNumber(2, 5);
        ComplexNumber complex2 = new ComplexNumber(4, 6);
        ComplexNumber complex3 = new ComplexNumber(8, -5);
        ComplexNumber complex4 = new ComplexNumber(4, -2);
        ComplexNumber complex5 = new ComplexNumber();
        ComplexNumber complex6 = new ComplexNumber();
        ComplexNumber complex7 = new ComplexNumber(1.5, 4.6);
        ComplexNumber complex8 = new ComplexNumber(8.7, 22.4);
        ComplexNumber complex9 = new ComplexNumber(100000.0, -100000.0);

        System.out.println("Test Case 1:\nAddition: ");
        complex1.add(complex2);
        System.out.println("Multiplication: ");
        complex1.multiply(complex2);

        System.out.println("________________________________");

        System.out.println("Test Case 2:\nAddition: ");
        complex3.add(complex4);
        System.out.println("Multiplication: ");
        complex3.multiply(complex4);

        System.out.println("________________________________");

        System.out.println("Test Case 3:\nAddition: ");
        complex5.add(complex6);
        System.out.println("Multiplication: ");
        complex5.multiply(complex6);

        System.out.println("________________________________");

        System.out.println("Test Case 4:\nAddition: ");
        complex7.add(complex8);
        System.out.println("Multiplication: ");
        complex7.multiply(complex8);

        System.out.println("________________________________");

        System.out.print("Test Case 5:\n");
        complex9.add(complex5);
    }
}
