import java.util.*;
public class AddressBook {

    private final String firstName;
    private final String lastName;
    private final String houseAddress;
    private final String city;
    private final String state;
    private final int zip;
    private final String phoneNum;
    private final String email;

    public AddressBook(String firstName, String lastName, String houseAddress, String city,String state, int zip, String phoneNum, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.houseAddress = houseAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNum = phoneNum;
        this.email = email;
    } 
    public String toString() {
        return "\tFirst Name: "+firstName+"\n\tLast Name: "+lastName+"\n\tAddress: "+houseAddress+"\n\tCity: "+city+
                    "\n\tState: "+state+"\n\tZIP: "+zip+"\n\tPhoneNum: "+phoneNum+"\n\temail: "+email;
    }
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book");
        Scanner sc = new Scanner(System.in);
        // Array Declaration
        AddressBook[] contacts = new AddressBook[1];
        //Instance variables
        int entries, zip;
        String first, last, address, city, state, phone, email;
        //Asking User for how many entries in Address Book
        System.out.println("How many new Entries do you require in AddressBook: ");
        entries = sc.nextInt();
        // Initialising Array
        if ( entries > 0)
            contacts = new AddressBook[entries];
        else {
            System.out.println("Should create atleast 1 Entry");
            System.exit(0);
        }
        System.out.println("\t*****Address Book*****\t");
        for ( int i = 0 ; i < entries ; i++ ) {
            System.out.println("Entry: "+(i+1));
            System.out.print("First name? ");
            first = sc.next();
            System.out.print("Last name? ");
            last = sc.next();
            System.out.print("Address? ");
            address = sc.next();
            System.out.print("City? ");
            city = sc.next();
            System.out.print("State? ");
            state = sc.next();
            System.out.print("ZIP? ");
            zip = sc.nextInt();
            System.out.print("Phone? ");
            phone = sc.next();
            System.out.print("Email? ");
            email = sc.next();
            contacts[i] = new AddressBook(first, last, address, city, state, zip, phone, email);
        }
        for ( int i = 0 ; i < entries ; i++ ) {
            System.out.println("Entry: "+(i+1));
            System.out.println(contacts[i]);
        }
    }
}
   

