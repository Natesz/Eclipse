package aVeryBigSum;

//Problem: https://www.hackerrank.com/challenges/a-very-big-sum
//Java 8

import java.util.*;

public class Solution {

  public static void main(String[] args) {
      /* Enter code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner input = new Scanner(System.in);
      int n  = input.nextInt();
      long sum = 0;
      for(int i = 0; i<n; i++)
      {
          sum += input.nextInt();
      }
      System.out.println(sum);
  }
}
