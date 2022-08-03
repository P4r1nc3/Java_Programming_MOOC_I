import java.util.ArrayList;

public class Room {

    private ArrayList<Person> room;

    public Room () {
        this.room = new ArrayList<>();
    }

    public void add (Person person) {
        this.room.add(person);
    }

    public boolean isEmpty() {
        if (this.room.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Person> getPersons () {
        return this.room;
    }

    public Person shortest () {
        if(this.room.isEmpty()) {
            return null;
        }

        Person toReturn = room.get(0);
        for (Person person : room) {
            if (person.getHeight() < toReturn.getHeight()) {
                toReturn = person;
            }
        }
        return toReturn;
    }

    public Person take () {
        if (this.room.isEmpty()) {
            return null;
        }
        Person shortest = shortest();

        this.room.remove(shortest);

        return shortest;
    }
}
