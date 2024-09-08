class WorkWithFloat {
    public static void main(String args[]) {
        // b
        // System.out.println(Float.BYTES); // bytes
        // System.out.println(Float.SIZE); // bits

        // c
        // System.out.println(Float.MAX_VALUE);
        // System.out.println(Float.MIN_VALUE);

        // d
        // float number = 54.5f;
        // System.out.println(number);
        // System.out.println(Float.toString(number));

        // e
        // String strNumber = "55.555";
        // System.out.println(strNumber);
        // System.out.println(Float.parseFloat(strNumber));

        // f - parseFloat method will throw a NumberFormatException
        // String strNumber = "Ab12Cd3";
        // System.out.println(strNumber);
        // System.out.println(Float.parseFloat(strNumber));

        // g
        // float number = 555.55F;
        // System.out.println(number);
        // System.out.println(Float.valueOf(number));

        // h
        // String strNumber = "55555.555";
        // System.out.println(strNumber);
        // System.out.println(Float.valueOf(strNumber));

        // i
        // float a = 112.3f, b = 984.5f;
        // System.out.println(Float.sum(a, b));

        // j
        // float a = 112.3f, b = 984.5f;
        // System.out.println(Float.max(a, b));
        // System.err.println(Float.min(a, b));

        // k - For negative no. -> NaN & positive no. -> Get Sqrt
        // float number = -25.0f;
        // System.out.println(Math.sqrt(number));

        // l- If we divide by 0 then it give Infinity & we divide 0.0/0.0 then it give NaN
        // float a = 0.0f, b = 0.0f;
        // System.out.println(a / b);

        // m 
        int no = 125;
        System.out.println(no);
        System.out.println((float) no);

        float number = 125.50f;
        System.out.println(number);
        System.out.println((int) number);
    }
}
