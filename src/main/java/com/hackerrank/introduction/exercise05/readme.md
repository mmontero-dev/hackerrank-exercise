**[Java Loops I](https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true)**

**Original Class**
```
package com.hackerrank.example05;

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
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
    }
}
```

**Objective**  
In this challenge, we're going to use loops to help us do some simple math.

**Task**  
Given an integer, _N_ , print its first 10 multiples. Each multiple _N_ x _i_ (where 1 < _i_ < 10) should be printed on a new line in the form: `N x i = result`.

**Input Format**

A single integer, _N_.

**Constraints**
- 2 < _N_ < 20

**Output Format**

Print 10 lines of output; each line (where 1 < _i_ < 10) contains the of _N_ in the form:  
`N x i = result`.

**Sample Input**

```
2
```

**Sample Output**

```
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
```