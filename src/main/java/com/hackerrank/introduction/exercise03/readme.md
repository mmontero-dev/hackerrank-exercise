**[Java If-Else](https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true)**

**Original Class**
```
package com.hackerrank.introduction.exercise03;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
    }
}
```

In this challenge, we test your knowledge of using _if-else_ conditional statements to automate decision-making processes. An if-else statement has the following logical flow:

![Wikipedia if-else flow chart](https://s3.amazonaws.com/hr-challenge-images/13689/1446563087-4ec019a919-332px-If-Then-Else-diagram.svg.png#gh-light-mode-only)

<sub>Source: <a href="https://en.wikipedia.org/wiki/Conditional_%28computer_programming%29">Wikipedia</a></sub>

**Task**  
Given an integer, , perform the following conditional actions:

- If is odd, print `Weird`
- If is even and in the inclusive range of to , print `Not Weird`
- If is even and in the inclusive range of to , print `Weird`
- If is even and greater than , print `Not Weird`

Complete the stub code provided in your editor to print whether or not is weird.

**Input Format**

A single line containing a positive integer, **n**.

**Constraints**

**Output Format**

Print `Weird` if the number is weird; otherwise, print `Not Weird`.

**Sample Input 0**

```
3
```

**Sample Output 0**

```
Weird
```

**Sample Input 1**

```
24
```

**Sample Output 1**

```
Not Weird
```

**Explanation**

_Sample Case 0: n = 3_  
is odd and odd numbers are weird, so we print `Weird`.

_Sample Case 1: n = 24_  
**n > 20** and **n** is even, so it isn't weird. Thus, we print `Not Weird`.