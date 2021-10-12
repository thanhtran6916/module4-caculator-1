package com.caculator.model;

public class Caculator {
    private double numberA;

    private double numberB;

    public Caculator() {
    }

    public Caculator(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
}
