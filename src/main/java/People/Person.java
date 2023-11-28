package People;

import Investigations.MedicalInvestigation;

import java.net.URL;

public abstract class Person {
    private int age;
    private String name;
    private URL profilePictureURL;
    public Person(String name, String profilePicture, int age){
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
    public int getAge() {
        return age;
    }
}
