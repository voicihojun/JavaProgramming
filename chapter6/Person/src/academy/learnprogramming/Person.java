package academy.learnprogramming;

public class Person {
    private String firstName, lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int newAge){
        if(newAge < 0 || newAge > 100) {
            this.age = 0;
        } else {
            this.age = newAge;
        }

    }

    public boolean isTeen() {
        if(this.age < 20 && this.age > 12) {
            return true;
        }
        return false;
    }

    public String getFullName() {
        if(firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if(lastName.isEmpty()) {
            return firstName;
        } else if(firstName.isEmpty()){
            return lastName;
        }
        return firstName + " " + lastName;
    }
}
