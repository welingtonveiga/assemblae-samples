package ae.samples;

import ae.samples.dto.PetDTO;
import ae.samples.model.Address;
import ae.samples.model.Pet;
import br.com.machinae.assemblae.Assemblae;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Hello world!
 *
 */
public class MoreFeaturesTest
{
    public static void main( String[] args ) throws Exception {
        // Date For Pet Birth
        Date birthDate = new SimpleDateFormat("dd/mm/YYYY").parse("12/01/2008");

        // List With One Address
        List<Address> addressList = Arrays.asList(new Address("Alm Silvio Savino", "Juiz de Fora", "MG", "Brazil", "552188999777"));

        // Instantiate Pet and his owner
        Pet pet = new Pet("vader", 5, birthDate , null); //new Person(1, "José Oliveira", addressList ));

        // Act!
        PetDTO dto = Assemblae.assemble(pet, PetDTO.class);

        System.out.print(dto);
        // Output:
        // PetDTO{name='vader', age=5, weight=5, person='José Oliveira', tel='+ 55 (21)88999777'}
    }
}
