package abdul_bari_java.mathdemo;

public class MathDemo {
    public static void main(String[] args) {
        System.out.print("Absolute: ");
        System.out.println(Math.abs(-123));

        System.out.print("Absolute: ");
        System.out.println(StrictMath.abs(-123));

        System.out.print("Cube root: ");
        System.out.println(Math.cbrt(9));

        System.out.print("Exact Decrement: ");
        System.out.println(Math.decrementExact(7));

        System.out.print("Exponent value in Floating Point Rep. :");
        System.out.println(Math.getExponent(12.3456));

        System.out.print("Radians: ");
        System.out.println(Math.floorDiv(50,9));

        System.out.print("e power x:");
        System.out.println(Math.exp(1));

        System.out.print("Random: ");
        System.out.println(Math.random()*1000);

        System.out.print("Power: ");
        System.out.println(Math.pow(2,3));

        System.out.print("Exact Product: ");
        System.out.println(Math.multiplyExact(100,200));

        System.out.print("Next Float Value: ");
        System.out.println(Math.nextAfter(12.5,11));

    }
}
