package homework1.task1.models;


public class Person {

    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;



    public static BuilderPerson builder(){
        return new BuilderPerson(new Person());
    }

    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }

    protected void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    protected void setCountry(String country) {
        this.country = country;
    }

    protected void setAddress(String address) {
        this.address = address;
    }

    protected void setPhone(String phone) {
        this.phone = phone;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
