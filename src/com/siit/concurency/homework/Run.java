package com.siit.concurency.homework;

import java.util.Random;

public class Run {


    public static void main(String[] args) throws InterruptedException {


        FestivalGate gate = new FestivalGate();
        FestivalStatisticsThread statsThread = new FestivalStatisticsThread(gate);

        statsThread.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Stats " + i);
            TicketType ticketType = TicketType.values()[new Random().nextInt(TicketType.values().length)];
            Thread festivalAttendee = new FestivalAttendeeThread(ticketType, gate);
            festivalAttendee.start();
            Thread.sleep(2000);
            festivalAttendee.join();

        }

        statsThread.stop(); //i used stop method because without it the process will go on forever repeating the last stat.


    }
}