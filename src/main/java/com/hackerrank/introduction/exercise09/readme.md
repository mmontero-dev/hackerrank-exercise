**[Java Static Initializer Block](https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true)**

**Original Class**
```
package com.hackerrank.introduction.exercise09;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

```

Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.

It's time to test your knowledge of _Static initialization blocks_. You can read about it [here.](https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html)

You are given a class _Solution_ with a _main_ method. Complete the given code so that it outputs the area of a parallelogram with breadth and height . You should read the variables from the standard input.

If or , the output should be _"java.lang.Exception: Breadth and height must be positive"_ without quotes.

**Input Format**

There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.

**Constraints**
- -100 <= B <= 100
- -100 <= H <= 100

**Output Format**

If both values are greater than zero, then the _main_ method must output the area of the _parallelogram_. Otherwise, print _"java.lang.Exception: Breadth and height must be positive"_ without quotes.

**Sample input 1**

```
1
3
```

**Sample output 1**

```
3
```

**Sample input 2**

```
-1
2
```

**Sample output 2**

```
java.lang.Exception: Breadth and height must be positive
```