package com.caculator.service;

import com.caculator.model.Caculator;

public class CaculatorService implements IGeneralService{
    private Caculator caculator;

    public CaculatorService() {
    }

    public Caculator getCaculator() {
        return caculator;
    }

    public void setCaculator(Caculator caculator) {
        this.caculator = caculator;
    }

    public double cong() {
        return caculator.getNumberA() + caculator.getNumberB();
    }

    public double tru() {
        return caculator.getNumberA() - caculator.getNumberB();
    }

    public double nhan() {
        return caculator.getNumberA() * caculator.getNumberB();
    }

    public double chia() {
        if (caculator.getNumberB() == 0) {
            return Integer.MAX_VALUE;
        }
        return caculator.getNumberA() / caculator.getNumberB();
    }
}
