public class TestSimpleCalculator {
  public static void main(String[] args) {
    int n1 = 5;
    int n2 = 5;
    SimpleCalculator calc = new SimpleCalculator(n1, n2);
    System.out.println(n1 + " + " + n2 + " = " + calc.addition());
    System.out.println(n1 + " - " + n2 + " = " + calc.subtraction());
    System.out.println(n1 + " x " + n2 + " = " + calc.multiplication());
    System.out.println(n1 + " / " + n2 + " = " + calc.division());
  }
}
