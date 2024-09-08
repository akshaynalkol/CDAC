class WorkWithShort {
    public static void main(String[] args) {
        // b
        // System.out.println(Short.BYTES); // bytes
        // System.out.println(Short.SIZE); // bits

        // c
        // System.out.println(Short.MAX_VALUE);
        // System.out.println(Short.MIN_VALUE);

        // d
        // short number = 1000;
        // System.out.println(number);
        // System.out.println(Short.toString(number));

        // e
        // String strNumber = "1000";
        // System.out.println(strNumber);
        // System.out.println(Short.parseShort(strNumber));

        // f - parseShort method will throw a NumberFormatException
        // String strNumber = "Ab12Cd3";
        // System.out.println(strNumber);
        // System.out.println(Short.parseShort(strNumber));

        // g
        // short number = 10000;
        // System.out.println(number);
        // System.out.println(Short.valueOf(number));

        // h
        // String strNumber = "1000";
        // System.out.println(strNumber);
        // System.out.println(Short.valueOf(strNumber));

        // i
        float no = 12.5f;
        System.out.println(no);
        System.out.println((short) no);

        short number = 150;
        System.out.println(number);
        System.out.println((double) number);
    }
}
