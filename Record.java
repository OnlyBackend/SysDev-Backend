public class Record {
    private String name;
    private String age;
    private String gender;

    public Record(String[] data) {
        this.name = data[0];
        this.age = data[1];
        this.gender = data[2];
    }

    public String getName() {
        return name;
    }
    public String getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
}
