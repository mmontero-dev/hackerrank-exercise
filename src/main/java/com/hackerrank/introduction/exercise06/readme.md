**[Java Loops II](https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true)**

**Original Class**
```
package com.hackerrank.introduction.exercise06;

import java.util.Scanner;

public class Solution {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
        }
        in.close();
    }
    
}

```

**Input Example**

```
2 0 2 10 5 3 5
```

We use the integers _a_, _b_, and _n_ to create the following series:
```
 (a + 2 * b), (a ...)
```

You are given _q_ queries in the form of _a_, _b_, and _n_. For each query, print the series corresponding to the given _a_, _b_, and _n_ values as a single line of _n_ space-separated integers.

**Input Format**

The first line contains an integer, _q_, denoting the number of queries.
Each line _i_ of the _q_ subsequent lines contains three space-separated integers describing the respective _a_, _b_, and _n_ values for that query.

**Constraints**

- 0 < q < 500
- 0 < a,b < 50
- 1 < n < 15

Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.

**Sample Input**

```
2
0 2 10
5 3 5
```

**Sample Output**

```
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
```

**Explanation**

We have two queries:

1. We use _a_ = 0, _b_ = 2, and _n_ = 10 to produce some series _s_ 0, _s_ 1,...,_s_ n-1

- _s_ 0 = 0 + 1 * 2 = 2
- _s_ 1 = 0 + 1 * 2 + 2 * 2 = 6
- _s_ 2 = 0 + 1 * 2 + 2 * 2 + 4 * 2 = 14

... and so on.

2. Once we hit _n_ = 10, we print the first ten terms as a single line of space-separated integers.

We use _a_ = 5, _b_ = 3, and _n_ = 5 to produce some series _s_ 0, _s_ 1,...,_s_ n-1

We then print each element of our series as a single line of space-separated values.