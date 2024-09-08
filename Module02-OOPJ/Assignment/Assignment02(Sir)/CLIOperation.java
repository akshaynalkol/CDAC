class CLIOperation {
    public static void main(String args[]) {
        float no1 = Float.parseFloat(args[0]);
        float no2 = Float.parseFloat(args[1]);

        System.out.println("Entered No1 : " + args[0]);
        System.out.println("Entered No2 : " + args[1]);
        System.out.println("Opeartion : " + args[2]);

        switch (args[2]) {
            case "+":
                System.out.println("Addition Of 2 No : " + (no1 + no2));
                break;
            case "-":
                System.out.println("Addition Of 2 No : " + (no1 - no2));
                break;
            case "*":
                System.out.println("Addition Of 2 No : " + (no1 * no2));
                break;
            case "/":
                System.out.println("Addition Of 2 No : " + (no1 / no2));
                break;
            default:
                System.out.println("Incorrect Input");
                break;
        }
    }
}
