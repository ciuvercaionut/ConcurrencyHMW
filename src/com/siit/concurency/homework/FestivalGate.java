package com.siit.concurency.homework;

import static com.siit.concurency.homework.TicketType.*;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;


public class FestivalGate {

    Queue<TicketType> tickets = new LinkedList<>();

    public void addTicket(TicketType ticketType) {
        tickets.add(ticketType);
    }

    public void count() {

        System.out.println();
        System.out.println(tickets.size() + " people entered");
        System.out.println(Collections.frequency(tickets, FULL_VIP) + " have FULLVIP tickets");
        System.out.println(Collections.frequency(tickets, FULL) + " have FULL tickets");
        System.out.println(Collections.frequency(tickets, FREE_PASS) + " have free pass.");
        System.out.println(Collections.frequency(tickets, ONE_DAY_VIP) + " have ONE DAY tickets");
        System.out.println(Collections.frequency(tickets, ONE_DAY_VIP) + " have ONE DAY VIP tickets");
        System.out.println();

    }
}


