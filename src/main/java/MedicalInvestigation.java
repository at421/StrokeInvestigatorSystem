import Scans.BloodPressure;
import Scans.MRI;

public class MedicalInvestigation {
    protected MRI mri;
    protected BloodPressure bloodPressure;

    MedicalInvestigation(MRI mri, BloodPressure bloodPressure){
        this.mri = mri;
        this.bloodPressure = bloodPressure;
    }
}
