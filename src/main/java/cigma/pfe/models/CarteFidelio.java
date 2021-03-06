package cigma.pfe.models;
import javax.persistence.*;

@Entity

public class CarteFidelio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String code;
    public CarteFidelio(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public CarteFidelio(String code, Client client) {
        this.code = code;
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "CarteFidelio{" +
                "id=" + id +
                ", code='" + code + '\'' +
                '}';
    }
    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;
}