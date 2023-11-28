import java.net.URL;
import java.util.ArrayList;

public class Patient {
    private String name;
    private URL profilePictureURL;
    private int age;
    private ArrayList<MedicalInvestigation> medicalInvestigations = new ArrayList<>();

    Patient(String name, String profilePicture, int age){
        this.name = name;
        this.profilePictureURL = null;
        try {
            this.profilePictureURL = new URL(profilePicture);
        }
        catch (Exception e){
            System.out.println("Failed to load URL with exception: " + e.getMessage());
        }
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public URL getProfilePictureURL() {
        return profilePictureURL;
    }
    public void addMedicalExam(MedicalInvestigation medicalInvestigation){
        medicalInvestigations.add(medicalInvestigation);
    }
    public MedicalInvestigation showLastMedicalExam(){
        return medicalInvestigations.get(medicalInvestigations.size()-1);
    }
    public int getAge() {
        return age;
    }
}
