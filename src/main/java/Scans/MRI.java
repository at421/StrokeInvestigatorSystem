package Scans;

import java.net.URL;
import java.time.LocalDate;

public class MRI extends Scan {
    private URL imageURL;
    private final int fieldStrength;

    public MRI(String image, int fieldStrength, LocalDate scanDate){
        super(scanDate);
        this.imageURL = null;
        try {
            this.imageURL = new URL(image);
        }
        catch (Exception e){
            System.out.println("Failed to load URL with exception: " + e.getMessage());
        }
        this.fieldStrength = fieldStrength;
    }
    public int getFieldStrength() {
        return fieldStrength;
    }
    public URL getImage() {
        return imageURL;
    }
}
