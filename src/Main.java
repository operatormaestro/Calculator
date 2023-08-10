public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        BinOps binOps = new BinOps();
        System.out.println(calc.sum(2, 2));
        System.out.println(calc.mult(10, 22));
        System.out.println(calc.pow(2, 10));
        System.out.println(binOps.sum("11", "101"));
        System.out.println(binOps.mult("101", "111"));
    }
}