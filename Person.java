public class Person {
    private String firsname;
    private String lastname;
    public Person(String firsname, String lastname) {
        this.firsname = firsname;
        this.lastname = lastname;
    }

    public String getFirsname() {
        return firsname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setFirsname(String firsname) {
        this.firsname = firsname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
