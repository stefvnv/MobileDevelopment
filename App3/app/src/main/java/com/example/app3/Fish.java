package com.example.app3;

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




    public void foStuff(String toParse) {
        if (!toParse.equalsIgnoreCase("")) {
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
        }
    }
}
