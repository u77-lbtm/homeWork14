public class Author {

    String firstName;
    String lastName;

    public Author(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName () {

        return this.firstName;
    }

    public String getLastName () {

        return this.lastName;
    }
    @Override
    public String toString() {

        return firstName + " " + lastName;
    }

