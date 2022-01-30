package mingtoy;

public class Person {

    private String name;
    private String email;
    private String mobileNumber;

    public Person(String name, String email, String mobileNumber) {

        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getMobileNumber() {

        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {

        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {

        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", number=" + mobileNumber +
                '}';
    }
}
