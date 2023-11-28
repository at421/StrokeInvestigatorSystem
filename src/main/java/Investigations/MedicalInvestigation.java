package Investigations;

import Scans.BloodPressure;
import Scans.MRI;
import Scans.Scan;

import java.util.ArrayList;

public class MedicalInvestigation {
    private ArrayList<Scan> scanList = new ArrayList<>();

    public MedicalInvestigation(){}

    public void addScan(Scan scan){
        scanList.add(scan);
    }
    public MRI getMRI(){
        if (!scanList.isEmpty()) {
            for (Scan scan : scanList){
                if (scan.getClass() == MRI.class){
                    return (MRI) scan;
                }
            }
        }
        return null;
    }
    public BloodPressure getBP(){
        if (!scanList.isEmpty()) {
            for (Scan scan: scanList){
                if (scan.getClass() == BloodPressure.class){
                    return (BloodPressure) scan;
                }
            }
        }
        return null;
    }
}
