package com.dexterous.flutterlocalnotifications.models;
import com.google.gson.annotations.SerializedName;
import androidx.annotation.Keep;

@Keep
public enum BeforeAfter {
    @SerializedName("BeforeAfter.before")
    BEFORE,
    @SerializedName("BeforeAfter.after")
    AFTER
}