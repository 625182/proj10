import java.util.Date;

public class Person_P extends Person{
    String lastName;
    Date birthday;
    boolean gender;

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName(){
        return this.lastName;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public Date getBirthday() {
        return this.birthday;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public boolean getGender() {
        return this.gender;
    }

    public String getFullName() {
        return this.lastName + " " + this.firstName;
    }

    public Short getAge() {
        return 30;
    }
}
