package ae.samples.dto;

import ae.samples.dto.tranformer.TelephoneFormatter;
import ae.samples.dto.tranformer.YearTransformer;
import br.com.machinae.assemblae.annotation.DataTransferObject;
import br.com.machinae.assemblae.annotation.MappedProperty;

@DataTransferObject
public class PetDTO {

    private String name;

   @MappedProperty(to = "birthdate", transformer=YearTransformer.class)
    private Integer age;

    private Integer weight;

    @MappedProperty(to = "person.name")
    private String person;

    @MappedProperty(to = "person.addressList[0].tel", transformer = TelephoneFormatter.class)
    private String tel;

    /**
     * DTO requires an default constructor!
     */
    public PetDTO(){

    }

    public PetDTO(String name, Integer age, Integer weight, String person, String tel) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.person = person;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "PetDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", person='" + person + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
