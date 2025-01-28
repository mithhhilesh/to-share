public class ComplexNumber {
    public double realPart, imaginaryPart;

    public ComplexNumber() {
        realPart = 0.0;
        imaginaryPart = 0.0;
    }

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public void add(ComplexNumber otherComplex) {
        double sumRealPart = this.realPart + otherComplex.realPart;
        double sumImaginaryPart = this.imaginaryPart + otherComplex.imaginaryPart;
        display(sumRealPart, sumImaginaryPart);
    }

    public void multiply(ComplexNumber otherComplex) {
        double productRealPart = (this.realPart * otherComplex.realPart) - (this.imaginaryPart * otherComplex.imaginaryPart);
        double productImaginaryPart = (this.realPart * otherComplex.imaginaryPart) + (this.imaginaryPart * otherComplex.realPart);
        display(productRealPart, productImaginaryPart);
    }

    public void display(double realPart, double imaginaryPart) {
        System.out.println("Complex Number: " + realPart + " + " + imaginaryPart + " i");
        if (realPart >= 100000.0 || realPart <= -100000.0 || imaginaryPart >= 100000.0 || imaginaryPart <= -100000.0) {
            System.out.println("This input is invalid.");
        }
    }
}
