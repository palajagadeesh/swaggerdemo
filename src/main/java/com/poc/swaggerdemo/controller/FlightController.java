package com.poc.swaggerdemo.controller;

import com.poc.swaggerdemo.request.PassengerInfo;
import com.poc.swaggerdemo.response.TicketInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController {
    @PostMapping(value="/bookflight",consumes = "application/json",produces = "application/json")
    public TicketInfo bookTicket(@RequestBody PassengerInfo pinfo){
        TicketInfo ticketInfo= new TicketInfo();
        ticketInfo.setName(pinfo.getPname());
        ticketInfo.setFrom(pinfo.getFrom());
        ticketInfo.setTo(pinfo.getTo());
        ticketInfo.setFlightId(pinfo.getFlightName());
        ticketInfo.setJourneyDate(pinfo.getJourneyDate());
        ticketInfo.setTicketPrice("$1000");
        return ticketInfo;
    }
}
