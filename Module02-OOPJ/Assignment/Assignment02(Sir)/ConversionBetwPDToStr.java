class ConversionBetwPDToStr {
    public static void main(String args[]) {
        boolean bool = true;
        byte no1 = 100;
        char ch = 'a';
        short no2 = 1000;
        int no3 = 10000;
        long no4 = 100000l;
        float no5 = 100.555f;
        double no6 = 1000.555;

        // Boxing
        System.out.println(Boolean.toString(bool));
        System.out.println(Byte.toString(no1));
        System.out.println(Character.toString(ch));
        System.out.println(Short.toString(no2));
        System.out.println(Integer.toString(no3));
        System.out.println(Long.toString(no4));
        System.out.println(Float.toString(no5));
        System.out.println(Double.toString(no6));

        // Unboxing
        System.out.println(String.valueOf(bool));
        System.out.println(String.valueOf(no1));
        System.out.println(String.valueOf(ch));
        System.out.println(String.valueOf(no2));
        System.out.println(String.valueOf(no3));
        System.out.println(String.valueOf(no4));
        System.out.println(String.valueOf(no5));
        System.out.println(String.valueOf(no6));
    }
}
