import java.util.ArrayList;

public class Main {
    public static ArrayList<Record> records = new ArrayList<>();

    public static void main(String[] args) {

        //this program assumes that the data in the array is always in the following order: (1) Name, (2) Age, (3) Gender

        String[] arr1 = {"Mike", "15", "Male"};
        String[] arr2 = {"Maya", "24", "Female"};
        String[] arr3 = {"Steve", "9", "Male"};
        String[] arr4 = {"Aidan", "18", "Male"};

        addData(arr1);
        addData(arr2);
        addData(arr3);
        addData(arr4);

        updateName("Mike", "Will");
        updateAge("Steve", "19");
        updateGender("Maya", "Lesbian");

        deleteData("aidan");

        printAll();
    }

    //add
    public static void addData(String[] data) {
        if (data.length != 3) {
            System.out.println("Cannot accept this entry. Array must contain exactly 3 elements");
        }
        else{
            Record newRecord = new Record(data);
            records.add(newRecord);
            System.out.println(data[0] + " has been added to your records.");
        }
    }

    //delete
    //pass in a string name whose record you want to delete
    public static void deleteData(String name) {
        int index = getIndex(name);
        if (index >= 0) {
            records.remove(index);
            System.out.println("Successfully deleted " + name);
        }
        else {
            System.out.println("Cannot delete " + name + "'s record. They don't exist in your records");
        }
    }

    //updates a particular information on your records
    //pass in a string name whose record you want to update
    public static void updateName(String currentName, String newName) {
        int index = getIndex(currentName);
        if (index >= 0) {
            records.get(index).setName(newName);
            System.out.printf("Successfully updated %s's name to %s\n", currentName, newName);
        }
        else {
            System.out.println("Cannot update " + currentName + "'s record. They don't exist in your records");
        }
    }
    public static void updateAge(String name, String newAge) {
        int index = getIndex(name);
        if (index >= 0) {
            records.get(index).setAge(newAge);
            System.out.printf("Successfully updated %s's age to %s\n", name, newAge);
        }
        else {
            System.out.println("Cannot update " + name + "'s record. They don't exist in your records");
        }
    }
    public static void updateGender(String name, String newGender) {
        int index = getIndex(name);
        if (index >= 0) {
            records.get(index).setGender(newGender);
            System.out.printf("Successfully updated %s's gender to %s\n", name, newGender);
        }
        else {
            System.out.println("Cannot update " + name + "'s record. They don't exist in your records");
        }
    }

    //prints all the information in your records
    public static void printAll() {
        if (records.size() <= 0) {
            System.out.println("You don't have a single record in your list");
        }
        else {
            for (int i = 0; i < records.size(); i++) {
                System.out.println("[Record #" + (i+1) + "]");
                System.out.println("Name: " + records.get(i).getName());
                System.out.println("Age: " + records.get(i).getAge());
                System.out.println("Gender: " + records.get(i).getGender());
                if (i != records.size()-1) {
                    System.out.println("---------------");
                }
            }
        }
    }

    private static int getIndex(String name) {
        //returns the index of the record if the name is found in the list of records
        //returns -1 if not found
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).getName().toLowerCase().equals(name.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }
}
