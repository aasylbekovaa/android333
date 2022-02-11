package com.example.android3;

public class CounterModel {
    int count = 0;
    String massage = "Hi";


    void increment() {
        ++count;
    }


    void decrement() {
        --count;
    }

    public int getCount() {
        return count;
    }

    public String getMassage() {
        return massage;
    }
}
