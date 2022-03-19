package cigma.pfe.models;


import javax.persistence.*;

@Entity(name = "TProduit")

public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private  String name ;
    private  double price ;

    public Produit() {
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}