package ae.samples.model;


import java.util.Date;

public class Pet {

    private String name;

    private Integer weight;

    private Date birthdate;

    private Person person ;

    public Pet(String name, Integer weight, Date birthdate, Person person) {
        this.name = name;
        this.weight = weight;
        this.birthdate = birthdate;
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
