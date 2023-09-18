import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies;

    public AddressBook() {
         buddies = new ArrayList<BuddyInfo>();
    }
    private void addBuddy(BuddyInfo newBuddy) {
        buddies.add(newBuddy);
    }

    private Boolean removeBuddy(BuddyInfo remBuddy) {
        return buddies.remove(remBuddy);
    }

    public static void main(String[] args) {
        System.out.println("Address book bruh");
    }


}
