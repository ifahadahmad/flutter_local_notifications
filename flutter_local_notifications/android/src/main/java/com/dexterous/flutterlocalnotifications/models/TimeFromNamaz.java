package com.dexterous.flutterlocalnotifications.models;

import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
@Keep
public class TimeFromNamaz {
    @SerializedName("namazTime")
    public NamazTime namazTime;

    @SerializedName("beforeAfter")
    public BeforeAfter beforeAfter;

    @SerializedName("minutes")
    public Integer minutes;

    @SerializedName("hours")
    public Integer hours;

    // Getters and setters

    public static TimeFromNamaz fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, TimeFromNamaz.class);
    }
}
