package ru.netology.sqr;

public class SqrtService {

    public int calcSqrt(int x) {
        for (int i = 10; i <= x; i++) {
            if (i * i >= x) {
                return i;
            }
        }
        return -1;
    }
}