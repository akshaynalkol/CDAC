class WorkWithLong {
    public static void main(String[] args) {
        // b
        // System.out.println(Long.BYTES); // bytes
        // System.out.println(Long.SIZE); // bits

        // c
        // System.out.println(Long.MAX_VALUE);
        // System.out.println(Long.MIN_VALUE);

        // d
        // long number = 500000000000000l;
        // System.out.println(number);
        // System.out.println(Long.toString(number));

        // e
        // String strNumber = "50000";
        // System.out.println(strNumber);
        // System.out.println(Long.parseLong(strNumber));

        // f - parseLong method will throw a NumberFormatException
        // String strNumber = "Ab12Cd3";
        // System.out.println(strNumber);
        // System.out.println(Long.parseLong(strNumber));

        // g
        // long number = 5000l;
        // System.out.println(number);
        // System.out.println(Long.valueOf(number));

        // h
        // String strNumber = "5000";
        // System.out.println(strNumber);
        // System.out.println(Long.valueOf(strNumber));

        // i
        // long a = 1123l, b = 9845L;
        // System.out.println(Long.sum(a, b));

        // j
        // long a = 1123l, b = 9845L;
        // System.out.println(Long.max(a, b));
        // System.err.println(Long.min(a, b));

        // k
        // long number=7;
        // System.out.println(Long.toBinaryString(number));
        // System.out.println(Long.toOctalString(number));
        // System.out.println(Long.toHexString(number));

        // l
        float no = 154.55f;
        System.out.println(no);
        System.out.println((long) no);

        long number = 5000L;
        System.out.println(number);
        System.out.println((int) number);
    }
}
