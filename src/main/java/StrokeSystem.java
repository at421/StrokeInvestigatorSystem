import Scans.BloodPressure;
import Scans.MRI;

import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StrokeSystem {
    public static void main(String[] args) {
        Patient daphneVonOram = new Patient("Daphne Von Oram", "https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg", 62);
        Patient sebastianCompton = new Patient("Sebastian Compton", "https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg", 31);

        MRI mriExamDVO = new MRI("https://martinh.netfirms.com/BIOE60010/mri1.jpg", 2, LocalDate.of(2023, 9, 14));
        BloodPressure bpDVO = new BloodPressure(130, 70, LocalDate.of(2023, 9, 15), "ST");
        daphneVonOram.addMedicalExam(new MedicalInvestigation(mriExamDVO, bpDVO));

        MRI mriExamSC = new MRI("https://martinh.netfirms.com/BIOE60010/mri2.jpg", 4, LocalDate.of(2023, 11, 23));
        BloodPressure bpSC = new BloodPressure(150, 80, LocalDate.of(2023, 11, 20), "VST");
        sebastianCompton.addMedicalExam(new MedicalInvestigation(mriExamSC, bpSC));

        Manager manger = new Manager();
        manger.addPatientToSystem(daphneVonOram);
        manger.addPatientToSystem(sebastianCompton);

        manger.doctorDisplayRecords();
        manger.adminTechLog();



    }


}