package com.poc.swaggerdemo.request;

import lombok.Data;

@Data
public class PassengerInfo {
    private String pname;
    private String from;
    private String to;
    private String flightName;
    private String journeyDate;
}
