package collections;

public class Family implements Comparable<Family> {
    private String name;
    private int age;
    private String email;

    public Family(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public int compareTo(Family o) {
        return age > o.age ? 1 : -1;
    }

    @Override
    public String toString() {
        return "Family{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
