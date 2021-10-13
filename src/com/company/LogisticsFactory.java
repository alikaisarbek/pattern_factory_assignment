package com.company;

public class LogisticsFactory {
    public Logistics createLogistics(String way)
    {
        if (way == null || way.isEmpty())
            return null;
        if ("Land".equals(way)) {
            return new LandLogistics();
        }
        else if ("Sea".equals(way)) {
            return new SeaLogistics();
        }
        else if ("Air".equals(way)) {
            return new AirLogistics();
        }
        return null;
    }
}


