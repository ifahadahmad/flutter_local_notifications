package com.dexterous.flutterlocalnotifications.models;
import com.google.gson.annotations.SerializedName;
import androidx.annotation.Keep;

@Keep
enum NamazTime {
    @SerializedName("NamazTime.Fajr")
    Fajr,
    @SerializedName("NamazTime.Dhuhr")
    Dhuhr,
    @SerializedName("NamazTime.Asr")
    Asr,
    @SerializedName("NamazTime.Maghrib")
    Maghrib,
    @SerializedName("NamazTime.Isha")
    Isha
}