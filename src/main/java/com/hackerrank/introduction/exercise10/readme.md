**[Java Int to String](https://www.hackerrank.com/challenges/java-int-to-string/problem?isFullScreen=true)**

**Original Class**
```
package com.hackerrank.introduction.exercise10;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        //String s=???; Complete this line below

        //Write your code here


        if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer.");
        }
    }
}

```

You are given an integer , you have to convert it into a string.

Please complete the partially completed code in the editor. If your code successfully converts _n_ into a string the code will print "_Good job_". Otherwise it will print "_Wrong answer_".

_n_ can range between -100 to 100 inclusive.

**Sample Input 0**
```
100
```
**Sample Output 0**
```
Good job
```