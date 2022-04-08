import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="PositionOfPlayer")
public class PositionOfPlayer {
    @Id
    private Integer PositionId;
    @Id
    private Integer PlayerId;
}
