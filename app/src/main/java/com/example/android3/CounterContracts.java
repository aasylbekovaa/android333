package com.example.android3;

public class CounterContracts {
    interface CounterView {
        void updateCounter(int count);

        void greenText();

        void showMassage(String massage);
    }

    interface Presenter {
        void increment();

        void decrement();

        void attachView(CounterView counterView);

        void change();
    }

}
