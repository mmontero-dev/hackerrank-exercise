**[Java End-of-file](https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true)**

**Original Class**
```
package com.hackerrank.introduction.exercise08;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
```
**Input Example**
```
Hello world
I am a file
Read me until end-of-file.
```
> "In computing, _End Of File_ (commonly abbreviated _EOF_) is a condition in a computer operating system where no more data can be read from a data source." — ([Wikipedia: End-of-file](https://en.wikipedia.org/wiki/End-of-file))

The challenge here is to read lines of input until you reach _EOF_, then number and print all lines of content.

**Hint:** Java's _Scanner.hasNext()_ method is helpful for this problem.

**Input Format**

Read some unknown lines of input from _stdin(System.in)_ until you reach _EOF_; each line of input contains a non-empty _String_.

**Output Format**

For each line, print the line number, followed by a single space, and then the line content received as input.

**Sample Input**

```
Hello world
I am a file
Read me until end-of-file.
```

**Sample Output**

```
1 Hello world
2 I am a file
3 Read me until end-of-file.
```