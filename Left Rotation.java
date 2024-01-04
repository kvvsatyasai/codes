import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
       Scanner lr = new Scanner(System.in);
       int n = lr.nextInt();
       int d = lr.nextInt();
       int a[] = new int[n];
       int i;
       for(i = 0;i < n;i++)
       a[i] = lr.nextInt();
    //    System.out.print(a[d]+" ");
       for(i = d;i < n;i++)
       System.out.print(a[i]+" ");
       for(i = 0;i < d;i++)
       System.out.print(a[i]+" ");
       
       
    }
}
