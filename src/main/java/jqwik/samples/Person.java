package jqwik.samples;


// records are immutable
// constructor goes before the braces
// don't need methods
// methods can use the values but cannot change them
// no default constructor

public record Person(String firstName, String lastName) {
    public String fullName() {
        return firstName + " " + lastName;
    }
}
