public class SimpleCalculator {
  private int number1;
  private int number2;

  public SimpleCalculator(int n1, int n2) {
    number1 = n1;
    number2 = n2;
  }

  public int addition() {
    return number1 + number2;
  }

  public int subtraction() {
    return number1 - number2;
  }

  public int multiplication() {
    return number1 * number2;
  }

  public int division() {
    return number1 / number2;
  }
}
