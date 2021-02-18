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
        AddressBook contact = new AddressBook("Lavanya","Sakhamuri","Pattbhipuram","Guntur","AndhraPradesh",522006,"45902338921","hello@gmai.com");
        System.out.println(contact);
    }
}
