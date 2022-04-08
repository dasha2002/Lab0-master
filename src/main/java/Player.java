import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name= "Player")
public class Player {
    @Id
    private Integer id;
    private String LastName;
    private String FirstName;
    private char Gender;
    private Double Height;
    private Double Weight;
    private String ShirtNumber;
    private String Email;
    private char CounterCode;
    private Integer TeamId;
}
