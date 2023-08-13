package org;

public class JvmComprehension {

    public static void main(String[] args) {
        int i = 1;                      // 1 в Stack Memory создается i c присвоением 1
        Object o = new Object();        // 2 в Stack Memory создается o со ссылкой new Object() в Heap (т.е. сам объект хранится в куче)
        Integer ii = 2;                 // 3 в Stack Memory создается ii c присвоением 2
        printAll(o, i, ii);             // 4 в новом фрейме Stack Memory создается printAll с параметрами o, i, ii
        System.out.println("finished"); // 7 в новом фрейме Stack Memory создается println с параметром, у которого присвоено значение "finished"
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // 5 в Stack Memory создается uselessVar c присвоением 700
        System.out.println(o.toString() + i + ii);  // 6 в новом фрейме Stack Memory создается println с параметром,
        // у которого присвоено значение результата вычисления o.toString() + i + ii, при этом toString создается в новом фрейме Stack Memory
    }
}
