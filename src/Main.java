public class Main {
    public static void main(String[] args){
        DefaultPrinter printer = new DefaultPrinter();
        DefaultPrinter colored = new ColoredPrinter();
        DefaultPrinter bw = new BWPrinter();

        System.out.println("Default printer: " + printer.printing());
        System.out.println("Colored printer: " + colored.printing());
        System.out.println("Black and White printer: " + bw.printing());
    }
}
