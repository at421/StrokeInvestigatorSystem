package People;

import Investigations.MedicalInvestigation;

import java.net.URL;
import java.util.ArrayList;

public class Patient extends Person{
    //Creating an ArrayList to store all medicalExams, allows for flexible access to multiple exams
    private ArrayList<MedicalInvestigation> medicalInvestigations = new ArrayList<>();

    public Patient(String name, String profilePicture, int age){
        super(name, profilePicture, age);
    }
    public MedicalInvestigation showLastMedicalExam(){
        return medicalInvestigations.get(medicalInvestigations.size()-1);
    }
    public void addMedicalExam(MedicalInvestigation medicalInvestigation){
        medicalInvestigations.add(medicalInvestigation);
    }

}
