**[Java Substring Comparisons](https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true)**

**Original Class**
```
package com.hackerrank.string.exercise03;

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
```

Definimos los siguientes terminos:

- [Orden Lexicográfico](https://en.wikipedia.org/wiki/Lexicographical_order), también conocido como orden alfabético o de diccionario, ordena los caracteres de la siguiente manera:

  Por Ejemplo, `ball < cat`, `dog < dorm`, `Happy < happy`, `Zoo < ball`.

- Un [substring](https://en.wikipedia.org/wiki/Substring) de una cadena es un bloque contiguo de caracteres en la cadena. Por ejemplo, las subcadenas de `abc` son `a`, `b`, `c`, `ab`, `bc`, y `abc`.

Dada una cadena, _s_, y un número entero, _k_, complete la función para que encuentre las subcadenas lexicográficamente más pequeñas y más grandes de longitud.

**Descripcion de la funcion**

Complete la funcion _getSmallestAndLargest_ en el siguiente editor.

_getSmallestAndLargest_ tiene los siguientes parametros:

- _string s:_ un string
- _int k:_ la longitud de las cadenas a encontrar

**Returns**

- _string:_ the string ' + "\\n" + ' where and are the two substrings

**Input Format**

La primera línea contiene una cadena que indica s.
La segunda línea contiene un número entero que denota k.

**Restricciones**

- consta únicamente de letras alfabéticas en inglés (es decir, `[a-zA-Z]`).

**Entrada de muestra 0**

welcometojava
3

**Salida de muestra 0**

ava
wel

**Explicación 0**

String _s_ = "welcometojava" tiene las siguientes subcadenas de longitud ordenadas lexicográficamente _k_ = _3_:

_["ava", "com", "elc", "eto", "jav", "lco", "met", "oja", "ome", "toj", "wel"]_

Luego devolvemos la primera subcadena (lexicográficamente más pequeña) y la última subcadena (lexicográficamente más grande) como dos valores separados por una nueva línea (es decir, `ava\nwel`).

El código auxiliar en el editor luego imprime `ava` como nuestra primera línea de salida y `wel` como nuestra segunda línea de salida.