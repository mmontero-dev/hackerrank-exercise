**[Java Strings Introduction](https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true)**

**Original Class**
```
package com.hackerrank.string.exercise01;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

    }
}
```

```
"A string is traditionally a sequence of characters, either as a literal constant or as some kind of variable." — Wikipedia: String (computer science)
```

This exercise is to test your understanding of Java Strings. A sample _String_ declaration:

```
String myString = "Hello World!"
```

The elements of a _String_ are called _characters_. The number of _characters_ in a _String_ is called the _length_, and it can be retrieved with the _String.length()_ method.

Given two strings of lowercase English letters, and , perform the following operations:

1. Sum the lengths of _A_ and _B_.
2. Determine if _A_ is lexicographically larger than _B_ (i.e.: does _B_ come before _A_ in the dictionary?).
3. Capitalize the first letter in _A_ and _B_ and print them on a single line, separated by a space.

**Input Format**

The first line contains a string _A_. The second line contains another string _B_. The strings are comprised of only lowercase English letters.

**Output Format**

There are three lines of output:  
For the first line, sum the lengths of and .  
For the second line, write `Yes` if _A_ is lexicographically greater than _B_ otherwise print `No` instead.  
For the third line, capitalize the first letter in both _A_ and _B_ and print them on a single line, separated by a space.

**Sample Input 0**
```
hello
java
```

**Sample Output 0**
```
9
No
Hello Java
```

**Explanation 0**

String _A_ is "hello" and _B_ is "java".

_A_ has a _length_ of 5, and _B_ has a _length_ of 4; the sum of their lengths is 9.

When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore, _A_ is not greater than _B_ and the answer is `No`.

When you capitalize the first letter of both _A_ and _B_ then print them separated by a space, you get "Hello Java".