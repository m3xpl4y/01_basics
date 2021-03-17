package at.tamasanu.campus.classes;

public class MethodNameTitle {

    public static void getTitle(String firstName, String lastName, boolean gender)
    {
        gender = true;
        if(gender == true)
        {
            System.out.println("Sehr geehrter Herr " + firstName + " " + lastName);
        }
        else
        {
            System.out.println("Sehr geehrte Frau " + firstName + " " + lastName);
        }
    }


}
