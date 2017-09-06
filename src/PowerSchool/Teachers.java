package PowerSchool;

public class Teachers {
    String firstName;
    String lastName;
    int id;
    int roomNumber;


    public Teachers(String firstName, String lastName, int id, int roomNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.roomNumber = roomNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
