package ru.netology.service;

public class CustomsService {

    public static int calculateCustoms(int price, int weight) {
        int duty = price / HUNDRED + weight * HUNDRED;
        return duty;
    }

    public static final int HUNDRED = 100;
}