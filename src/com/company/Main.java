package com.company;

public class Main {
    public static void main(String[] args)
    {
        LogisticsFactory LogisticsFactory = new LogisticsFactory();
        Logistics notification = LogisticsFactory.createLogistics("Sea");
        notification.deliver();
    }
}


