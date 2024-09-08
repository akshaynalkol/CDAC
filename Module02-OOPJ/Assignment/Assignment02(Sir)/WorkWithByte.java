class WorkWithByte {
    public static void main(String args[]) {
        // b
        // System.out.println(Byte.BYTES); // byte
        // System.out.println(Byte.SIZE); // bits

        // c
        // System.out.println(Byte.MAX_VALUE);
        // System.out.println(Byte.MIN_VALUE);

        // d
        // byte number = 121;
        // System.out.println(number);
        // System.out.println(Byte.toString(number));

        // e
        // String strNumber = "121";
        // System.out.println(strNumber);
        // System.out.println(Byte.parseByte(strNumber));

        // f - parseByte method will throw a NumberFormatException
        // String strNumber = "Ab12Cd3";
        // System.out.println(strNumber);
        // System.out.println(Byte.parseByte(strNumber));

        // g
        // byte number = 15;
        // System.out.println(number);
        // System.out.println(Byte.valueOf(number));

        // h
        // String strNumber = "100";
        // System.out.println(strNumber);
        // System.out.println(Byte.valueOf(strNumber));

        // i
        int no = 145;
        System.out.println(no);
        System.out.println((byte) no);

        byte number = 65;
        System.out.println(number);
        System.out.println((char) number);
    }
}
