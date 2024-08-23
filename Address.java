import java.util.Scanner;

public class Address{
    /**
     * @param args
     */
    public static void main(String[] args){
        //comments for the project
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = keyboard.nextLine();

        System.out.print("Enter your address: ");
        String address = keyboard.nextLine();

        System.out.print("Enter the city: ");
        String city = keyboard.nextLine();

        System.out.print("Enter the state: ");
        String state = keyboard.nextLine();

        System.out.print("Enter the zipcode: ");
        String zipcode = keyboard.nextLine();

        //StudentInfo si = new StudentInfo("Mr. Donnelly", "2 Park St.", "Eliot", "ME", "01303");
        StudentInfo si = new StudentInfo(name, address, city, state, zipcode);
        System.out.println("");

        System.out.println(si.getName());
        System.out.println(si.getAddress());
        System.out.println(si.getCity() + ", "+ si.getState()+ " " + si.getZipCode());
        System.out.println("");

        keyboard.close();
    }

    
}