import People.Patient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Manager {

    private ArrayList<Patient> patients = new ArrayList<>();
    Manager(){}

    public void addPatientToSystem(Patient patient){
        patients.add(patient);
    }

    public void doctorDisplayRecords(){
        JFrame frame = new JFrame("Medical Exams");
        frame.setSize(1000,500);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(patients.size(),2));

        for (Patient patient : patients){
            JPanel profilePanel = new JPanel();
            profilePanel.setLayout(new GridLayout(1, 2));
            JLabel imageLabel = new JLabel();
            imageLabel.setIcon(new ImageIcon(patient.getProfilePictureURL()));
            profilePanel.add(imageLabel);
            JLabel nameLabel = new JLabel("<html><b>Name:</b> " + patient.getName() + "<br> <b>Age:</b> " + patient.getAge() + "</html>");
            profilePanel.add(nameLabel);
            mainPanel.add(profilePanel);

            JPanel scanPanel = new JPanel();
            scanPanel.setLayout(new GridLayout(1, 2));
            JLabel scanImage = new JLabel();
            scanImage.setIcon(new ImageIcon(patient.showLastMedicalExam().getMRI().getImage()));
            scanPanel.add(scanImage);
            JLabel scanDetails = new JLabel("<html> <b>Blood Pressure:</b> " +
                    patient.showLastMedicalExam().getBP().getSystolicPressure() +
                    " over " +
                    patient.showLastMedicalExam().getBP().getDiasolicPressure()
                    + "</html>");
            scanPanel.add(scanDetails);
            mainPanel.add(scanPanel);
        }
        frame.setContentPane(mainPanel);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }});
    }

    public void adminTechLog(){
        JFrame frame = new JFrame("Admin View");
        frame.setSize(500,200);
        JPanel adminPanel = new JPanel();
        adminPanel.setLayout(new GridLayout(patients.size(), 1));
        for (Patient patient : patients){
            JLabel label = new JLabel("<html><b>Patient:</b> " +
                    patient.getName() + ": <b>MRI:</b> " +
                    patient.showLastMedicalExam().getMRI().getFieldStrength() + " Tesla, " +
                    patient.showLastMedicalExam().getMRI().getScanDate().toString() + ": <b>BP:</b> " +
                    patient.showLastMedicalExam().getBP().getDuration() + ", " +
                    patient.showLastMedicalExam().getBP().getScanDate().toString() +
                    "</html>"
            );
            adminPanel.add(label);
        }

        frame.setContentPane(adminPanel);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }});
    }
}
