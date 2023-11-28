package Scans;

import Scans.Scan;

import java.time.LocalDate;

public class BloodPressure extends Scan {
    private int systolicPressure;
    private int diasolicPressure;
    private String duration;

    public BloodPressure(int systolicPressure, int diasolicPressure, LocalDate scanDate, String duration){
        super(scanDate);
        this.systolicPressure = systolicPressure;
        this.diasolicPressure = diasolicPressure;
        this.duration = duration;
    }
    public int getDiasolicPressure() {
        return diasolicPressure;
    }
    public int getSystolicPressure() {
        return systolicPressure;
    }
    public String getDuration() {
        return duration;
    }
}
