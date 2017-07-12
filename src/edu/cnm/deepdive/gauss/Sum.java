/**
 * 
 */
package edu.cnm.deepdive.gauss;

/**
 * @author Sky Link
 *
 */
public class Sum {

  /**
   * @param args
   */
  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    assert arithmeticSum(100) == 5050;
    assert arithmeticSum(10) == 55;
    assert arithmeticSum(2, 100) == 5049;
    assert arithmeticSum(2, 100, 2) == 2550;
    assert arithmeticSum(1, 10, 11) == 1;
    System.out.println(arithmeticSum(Integer.MAX_VALUE));
    System.out.printf("%4.3f milliseconds%n", ((double) System.currentTimeMillis() - start));
  }
  
  /**
   * @param to Upper limit (inclusive)
   * @return Sum of terms in sequence
   */
  public static long arithmeticSum(int to) {
    return arithmeticSum(1, to);
  }
  /**
   * @param from Lower limit (inclusive)
   * @param to Upper limit (inclusive)
   * @return Sum of terms in sequence
   */
  public static long arithmeticSum(int from, int to) {
    return arithmeticSum(from, to, 1);
  }
  /**
   * @param from Lower limit (inclusive)
   * @param to Upper limit (inclusive)
   * @param by Difference (common between terms in sequence)
   * @return Sum of terms in sequence
   */
  public static long arithmeticSum(int from, int to, int by) {
//    long runTotal = 0;
//    for (long i = from; i <= to; i += by) {
//      runTotal +=i;
//    }
//    return runTotal;
    long k = ((long) to - from) / by + 1; //number of terms in sequence
    return (k*(2 * (long) from + (k - 1) * (long) by)) / 2;
  }
}
