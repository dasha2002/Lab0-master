import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="PositionName")

public class PositionName {
    @Id
    private Integer Id;
    private String Name;
}
