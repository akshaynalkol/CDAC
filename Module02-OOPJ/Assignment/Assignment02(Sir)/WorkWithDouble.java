class WorkWithDouble {
    public static void main(String[] args) {
        // b
        // System.out.println(Double.BYTES); // bytes
        // System.out.println(Double.SIZE); // bites

        // c
        // System.out.println(Double.MAX_VALUE);
        // System.out.println(Double.MIN_VALUE);

        // d
        // double number = 5000.50;
        // System.out.println(number);
        // System.out.println(Double.toString(number));

        // e
        // String strNumber = "5000.50";
        // System.out.println(strNumber);
        // System.out.println(Double.parseDouble(strNumber));

        // f - parseDouble method will throw a NumberFormatException
        // String strNumber = "Ab12Cd3";
        // System.out.println(strNumber);
        // System.out.println(Double.parseDouble(strNumber));

        // g
        // double number = 50.25;
        // System.out.println(number);
        // System.out.println(Double.valueOf(number));

        // h
        // String strNumber = "50.25";
        // System.out.println(strNumber);
        // System.out.println(Double.valueOf(strNumber));

        // i
        // double a = 112.2, b = 556.6;
        // System.out.println(Double.sum(a, b));

        // j
        // double a = 112.2, b = 556.6;
        // System.out.println(Double.max(a, b));
        // System.out.println(Double.min(a, b));

        // k - For negative no. -> NaN & positive no. -> Get Sqrt
        // double number = -25.0;
        // System.out.println(Math.sqrt(number));

        // l - If we divide by 0 then it give Infinity & we divide 0.0/0.0 then it give NaN
        // double a = 0.0, b = 0.0;
        // System.out.println(a/b);

        // m
        char c = 'a';
        System.out.println(c);
        System.out.println((double) c);

        double number = 25.25;
        System.out.println(number);
        System.out.println((int) number);
    }
}
