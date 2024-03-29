**[Java Date and Time](https://www.hackerrank.com/challenges/java-date-and-time/problem?isFullScreen=true)**

**Original Class**
```
package com.hackerrank.introduction.exercise11;

import java.time.LocalDate;
import java.util.Scanner;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        return "";
    }

}

public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        String[] firstMultipleInput = input.replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        System.out.println(Result.findDay(month, day, year));
    }
}

```

The [Calendar class](https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html) is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY\_OF\_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

---

You are given a date. You just need to write the method, , which returns the _day_ on that date. To simplify your task, we have provided a portion of the code in the editor.

**Example**



The method should return as the day on that date.

![image](https://s3.amazonaws.com/hr-assets/0/1514458312-c097047ed4-calendar_class.png)

**Function Description**

Complete the _findDay_ function in the editor below.

_findDay_ has the following parameters:

- _int:_ month
- _int:_ day
- _int:_ year

**Returns**

- _string:_ the day of the week in capital letters

**Input Format**

A single line of input containing the space separated month, day and year, respectively, in format.

**Constraints**

**Sample Input**

```
08 05 2015
```

**Sample Output**

```
WEDNESDAY
```

**Explanation**

The day on August <sup>th</sup> was `WEDNESDAY`.