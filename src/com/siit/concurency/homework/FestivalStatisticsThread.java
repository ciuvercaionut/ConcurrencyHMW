package com.siit.concurency.homework;

public class FestivalStatisticsThread extends Thread {

    private FestivalGate gate;

    public FestivalStatisticsThread(FestivalGate gate) {

        this.gate = gate;
    }

    @Override
    public void run() {
        while (gate.tickets != null) {
            gate.count();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

