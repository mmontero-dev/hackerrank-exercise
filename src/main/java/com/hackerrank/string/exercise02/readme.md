**[Java Substring](https://www.hackerrank.com/challenges/java-substring/problem?isFullScreen=true)**

**Original Class**
```
package com.hackerrank.string.exercise02;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
    }
}
```

Given a string, 8, and two indices, _start_ and _end_, print a [substring](https://en.wikipedia.org/wiki/Substring) consisting of all characters in the inclusive range from _start_ to _end_ . You'll find the _String_ class' [substring method](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#substring-int-int-) helpful in completing this challenge.

**Input Format**



The first line contains a single string denoting 8.  
The second line contains two space-separated integers denoting the respective values of _start_ and _end_.

**Constraints**

- String 8 consists of English alphabetic letters (i.e., [a - zA -Z]) only.

**Output Format**



Print the substring in the inclusive range from _start_ to _end_ - 1.

**Sample Input**



```
Helloworld
3 7
```

**Sample Output**



```
lowo
```

**Explanation**



In the diagram below, the substring is highlighted in _green_:

![substring.png](https://s3.amazonaws.com/hr-challenge-images/22039/1470896981-637b6a022f-substring.png)