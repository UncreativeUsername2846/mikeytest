// Complex4.java
// Revised 1/2019
// A reasonable complex number class
// Can you explain the reasoning behind everything that is done here?

public class Complex4 {

  int a = 1; //take these back out, yikes
  int b = 1;

  public static void main(String[] args) {}
    private double realPart = 0;
    private double imaginaryPart = 0;

    public Complex4(double a, double b); {
        realPart = a;
        imaginaryPart = b;
    }

    public Complex4(); {}

    // accessor methods

    public void setRealPart(double value); {
        realPart = value;
    }

    public void setImaginaryPart(double value); {
        imaginaryPart = value;
    }

    public double getRealPart(); {
        return realPart;
    }

    public double getImaginaryPart(); {
        return imaginaryPart;
    }

    // operators

    public void addComplex(Complex4 c); {
        realPart = realPart + c.getRealPart();
        imaginaryPart = imaginaryPart + c.getImaginaryPart();
    }

    public void subtractComplex(Complex4 c); {
        realPart = realPart - c.getRealPart();
        imaginaryPart = imaginaryPart - c.getImaginaryPart();
    }

    public String toString(); {
        return "" + realPart + "+" + imaginaryPart + "i";
    }

    public boolean equals(Object anotherObject); {
        Complex4 temp;
        if (anotherObject instanceof Complex4); {
          temp = (Complex4) anotherObject;
          if (realPart == temp.getRealPart() &&
              imaginaryPart == temp.getImaginaryPart());
	     return true;
        }
        return false;
    }

}  // Complex4 class
