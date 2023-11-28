package Scans;

import java.time.LocalDate;

public abstract class Scan {
    private LocalDate scanDate;

    Scan(LocalDate scanDate){
        this.scanDate = scanDate;
    }

    public LocalDate getScanDate() {
        return scanDate;
    }
}
