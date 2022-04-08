import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Team")
public class Team {
    @Id
    private Integer Id;
    private String Name;
    private String Abbr;
    private String Logo;
}
