package com.example.sep4android.APIS;

import com.example.sep4android.Models.CO2;
import com.example.sep4android.Models.Humidity;
import com.example.sep4android.Models.OptimalValues;
import com.example.sep4android.Models.Temperature;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ArchiveResponse {



    private Archive archive;
    @SerializedName("carbonDioxide")
    @Expose
    private double co2;
    private double temperature;
    private double humidity;

    public class Archive
    {
        @SerializedName("id")
        @Expose
        private int roomNumber;
        private String name;
        @SerializedName("optimalValuesEntity")
        @Expose
        private OptimalValues optimalValues;

        public int getRoomNumber() {
            return roomNumber;
        }

        public String getName() {
            return name;
        }

        public OptimalValues getOptimalValues() {
            return optimalValues;
        }
    }

    public Archive getArchive() {
        return archive;
    }

    public double getCo2() {
        return co2;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

}