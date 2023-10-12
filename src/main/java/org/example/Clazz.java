package org.example;

public class Clazz {
    public int function1(int x1, int x2, int x3) {
        int value = 0;
        if (x1 <= 4) {
            value = func3(x2, x3);
        } else {
            if (x2 >= 5 || x3 >= 10) {
                value = func2(x2, x3);
            } else {
                value = func4(x2);
            }
        }
        return value * 2;
    }

    public int func2(int x1, int x2) {
        return x1 + x2;
    }

    public int func3(int x1, int x2) {
        return x1 - x2;
    }

    public int func4(int x1) {
        return x1 + 1;
    }
}
