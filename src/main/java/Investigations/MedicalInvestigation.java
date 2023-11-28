package Investigations;

import Scans.BloodPressure;
import Scans.MRI;
import Scans.Scan;

import java.util.ArrayList;

public class MedicalInvestigation {

    //Array List that contains multiple Scans so that it's more flexible for the future
    private ArrayList<Scan> scanList = new ArrayList<>();

    public MedicalInvestigation(){}

    //Add Scan
    public void addScan(Scan scan){
        scanList.add(scan);
    }

    //Get MRI
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

    //Get Blood Pressure
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
