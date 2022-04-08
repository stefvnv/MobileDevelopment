package com.example.app3;

import java.util.Arrays;

public class Fish {

    private String date_range = "", current_date = "", description = "", compatibility = "", mood = "", color = "", lucky_number = "", lucky_time = "";
    private String toParse = "";

    public String getDate_range() {
        return date_range;
    }

    public String getCurrent_date() {
        return current_date;
    }

    public String getDescription() {
        return description;
    }

    public String getCompatibility() {
        return compatibility;
    }

    public String getMood() {
        return mood;
    }

    public String getColor() {
        return color;
    }

    public String getLucky_number() {
        return lucky_number;
    }

    public String getLucky_time() {
        return lucky_time;
    }

    public Fish() {

    }

    public Fish(String toParse) {
        this.toParse = toParse;
    }


    public void foStuff(String toParse) {
        if (!toParse.equalsIgnoreCase("")) {
            //String toParse = "{\"date_range\": \"Jan 20 - Feb 18\", \"current_date\": \"April 7, 2022\", \"description\": \"You're cut out for quite a fun, lively and interesting evening, even if you spend it at home. You'll only be alone if you really want to be  -- which you probably won't.\", \"compatibility\": \"Aries\", \"mood\": \"Playful\", \"color\": \"Peach\", \"lucky_number\": \"85\", \"lucky_time\": \"12pm\"}";
            toParse = toParse.replaceAll("[}:,{]", "");
            String[] split = toParse.split("\"");
            for (int i = 0; i < split.length; i++) {
                System.out.println(split[i] + " is index " + i);
            }
            date_range = split[3];
            current_date = split[7];
            description = split[11];
            compatibility = split[15];
            mood = split[19];
            color = split[23];
            lucky_number = split[27];
            lucky_time = split[31];

/**
 System.out.println("Date range = " + date_range + " current date = " + current_date + " description = " + description + " comnpat = " + compatibility + " mood = " + mood
 + " colour = " + color + " lucky num = " + lucky_number + " lucky time = " + lucky_time);**/
        }
    }

}
