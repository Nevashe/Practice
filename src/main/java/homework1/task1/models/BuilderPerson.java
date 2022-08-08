package homework1.task1.models;
 public class BuilderPerson {

    private final Person person;
    protected BuilderPerson(Person person) {
        this.person = person;
    }

    public BuilderPerson firstName(String firstName) {
        person.setFirstName(firstName);
        return this;
    }

    public BuilderPerson lastName(String lastName) {
        person.setLastName(lastName);
        return this;
    }

    public BuilderPerson middleName(String middleName) {
        person.setMiddleName(middleName);
        return this;
    }

    public BuilderPerson country(String country) {
        person.setCountry(country);
        return this;
    }

    public BuilderPerson address(String address) {
        person.setAddress(address);
        return this;
    }

    public BuilderPerson phone(String phone) {
        person.setPhone(phone);
        return this;
    }

    public BuilderPerson age(int age) {
        person.setAge(age);
        return this;
    }

    public BuilderPerson gender(String gender) {
        person.setGender(gender);
        return this;
    }

    public Person build(){
        return person;
    }

}
