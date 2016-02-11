package socerleague;

public abstract class Human implements Visitable {
    protected int id;
    protected String name;
    protected String surname;
    protected int age;
    protected String nationality;
    protected double salary;
    protected String login;
    protected String password;

    Human() {
    }

    Human(int id, String name, String surname, int age, String nationality) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.nationality = nationality;
    }

    public void initialize(String[] tmp) {
        this.id = Integer.parseInt(tmp[1]);
        setName(tmp[2]);
        setSurname(tmp[3]);
        setAge(Integer.parseInt(tmp[4]));
        setNationality(tmp[5]);
        setSalary(Double.parseDouble(tmp[6]));
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return this.login;
    }

    public String getPassword() {
        return this.password;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        String details = this.getName() + " " + this.getSurname() + " " + this.getAge() + " " + this.getNationality() + " " +this.getSalary();
        return details;
    }

    public void setAge(byte age) {
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    
}
