import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Country")

public class Country {
    @Id
    private char CountryCode;
    private String CountryName;
}
