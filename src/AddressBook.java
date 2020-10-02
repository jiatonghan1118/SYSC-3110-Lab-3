import java.util.HashMap;


public class AddressBook {

    private HashMap<String, BuddyInfo> find;
    public AddressBook() {
        find = new HashMap<String, BuddyInfo>();
    }

    public void addBuddy(BuddyInfo a) {
        find.put(a.getName(),a);
    }

    public void removeBuddy(BuddyInfo a){
        find.remove(a.getName());
    }

    public static void main (String[] args){
        BuddyInfo buddy=new BuddyInfo("Tom","Carleton","613");
        AddressBook addressBook=new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
        System.out.println("Address Book");
    }

}

