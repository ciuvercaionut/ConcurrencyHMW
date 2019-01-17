package com.siit.concurency.homework;


public class FestivalAttendeeThread extends Thread {

    private TicketType ticketType;

    public FestivalAttendeeThread(TicketType ticketType, FestivalGate gate) {
        this.ticketType = ticketType;
        gate.addTicket(ticketType);
    }

    @Override
    public void run() {

        System.out.println();
        System.out.println("Somebody bought a " + ticketType + " ticket.");
        System.out.println();

    }

}








