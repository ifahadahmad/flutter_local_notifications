package com.dexterous.flutterlocalnotifications.models;

import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
@Keep
public class TimeFromNamaz {
    @SerializedName("namazTime")
    private NamazTime namazTime;

    @SerializedName("beforeAfter")
    private BeforeAfter beforeAfter;

    @SerializedName("minutes")
    private Integer minutes;

    @SerializedName("hours")
    private Integer hours;

    // Getters and setters

    public static TimeFromNamaz fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, TimeFromNamaz.class);
    }
}

enum NamazTime {
    @SerializedName("NamazTime.Fajr")
    FAJR,
    @SerializedName("NamazTime.Dhuhr")
    DHUHR,
    @SerializedName("NamazTime.Asr")
    ASR,
    @SerializedName("NamazTime.Maghrib")
    MAGHRIB,
    @SerializedName("NamazTime.Isha")
    ISHA
}

enum BeforeAfter {
    @SerializedName("BeforeAfter.before")
    BEFORE,
    @SerializedName("BeforeAfter.after")
    AFTER
}