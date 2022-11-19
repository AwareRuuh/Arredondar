import java.math.*;
// ^ utilizei para importar o BigDecimal.
class Main {
  public static void main(String[] args) {
  double d = 451.3256531;
BigDecimal bd = new BigDecimal(d).setScale(4, RoundingMode.HALF_EVEN);
System.out.println(bd.doubleValue());
  }
}