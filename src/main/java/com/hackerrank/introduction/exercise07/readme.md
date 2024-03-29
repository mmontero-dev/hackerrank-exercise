**[Java Datatypes](https://www.hackerrank.com/challenges/java-datatypes/problem?isFullScreen=true)**

**Original Class**
```
package com.hackerrank.example07;

import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) System.out.println("* byte");
                //Complete the code
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }
}


```

**Input Example**

```
5 -150 150000 1500000000 213333333333333333333333333333333333 -100000000000000
```

Java has 8 primitive data types; _char, boolean, byte, short, int, long, float, and double_. For this exercise, we'll work with the primitives used to hold integer values (_byte, short, int,_ and _long_):

- A _byte_ is an 8-bit signed integer.
- A _short_ is a 16-bit signed integer.
- An _int_ is a 32-bit signed integer.
- A _long_ is a 64-bit signed integer.

Given an input integer, you must determine which primitive data types are capable of properly storing that input.

To get you started, a portion of the solution is provided for you in the editor.

**Reference:** [https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)

**Input Format**

The first line contains an integer, _T_, denoting the number of test cases.  
Each test case, _T_, is comprised of a single line with an integer, _n_, which can be arbitrarily large or small.

**Output Format**

For each input variable and appropriate primitive , you must determine if the given primitives are capable of storing it. If yes, then print:

```
n can be fitted in:
* dataType
```

If there is more than one appropriate data type, print each one on its own line and order them by size (i.e.: ).

If the number cannot be stored in one of the four aforementioned primitives, print the line:

```
n can't be fitted anywhere.
```

**Sample Input**

```
5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
```

**Sample Output**

```
-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long
```

**Explanation**

-150 can be stored in a _short_, an _int_, or a _long_.

21333333333333333333333333333is very large and is outside of the allowable range of values for the primitive data types discussed in this problem.
