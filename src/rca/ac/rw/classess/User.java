package rca.ac.rw.classess;

public class User {
//    the properties
    private int id;
    private String firstName;
    private String secondName;
    private int age;
    private String email;
    private int telephone;
    private String fatherName;
    private String motherName;

    //the getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    //the constructors
    public User(){

    }

    public User(int id , String firstName , String secondName , int age , String email , int telephone , String fatherName , String motherName){
        this.id = id;
        this.age = age;
        this.email = email;
        this.telephone = telephone;
        this.firstName = firstName;
        this.secondName = secondName;
        this.fatherName = fatherName;
        this.motherName = motherName;
    }

}
