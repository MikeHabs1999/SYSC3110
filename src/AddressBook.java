import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> myBuddies;

    public AddressBook() {
        myBuddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo aBuddy) {
        if (aBuddy != null) {
            myBuddies.add(aBuddy);
        }
    }

    public void removeBuddy(BuddyInfo aBuddy) {
        if (aBuddy != null) {
            myBuddies.remove(aBuddy);
        }
    }
    public void add2Buddies(BuddyInfo aBuddy, BuddyInfo a2ndBuddy) {
        myBuddies.add(aBuddy);
        myBuddies.add(a2ndBuddy);
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressbook = new AddressBook();
        addressbook.addBuddy(buddy);
        addressbook.removeBuddy(buddy);
    }
    // hi
}
