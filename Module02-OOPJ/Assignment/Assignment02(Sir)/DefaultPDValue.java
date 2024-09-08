class DefaultPDValue {
    boolean a;
    byte b;
    char c;
    short d;
    int e;
    long f;
    float g;
    double h;

    static boolean n1;
    static byte n2;
    static char n3;
    static short n4;
    static int n5;
    static long n6;
    static float n7;
    static double n8;

    public static void main(String[] args) {
        DefaultPDValue obj = new DefaultPDValue();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
        System.out.println(obj.e);
        System.out.println(obj.f);
        System.out.println(obj.g);
        System.out.println(obj.h);

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);
        System.out.println(n7);
        System.out.println(n8);

        // int no; //error: variable num3 might not have been initialized
        // System.out.println(no);

        // int no = 10; // Initialization
        // System.out.println(no); // Ok

        int no;
        no = 10; // Assignment
        System.out.println(no); // OK
    }
}
