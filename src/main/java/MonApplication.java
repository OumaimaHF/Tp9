package cigma.pfe;

import cigma.pfe.controllers.ClientController;
import cigma.pfe.controllers.FactureController;
import cigma.pfe.models.CarteFidelio;
import cigma.pfe.models.Client;
import cigma.pfe.models.Facture;
import cigma.pfe.models.Promotion;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class MonApplication {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController) context.getBean("controller");

        Client client = new Client("Oum");
        //List<Promotion> promotions=Arrays.asList(new Promotion("remise 20%"),new Promotion("solde 60%"));

        CarteFidelio carteFidelio = new CarteFidelio("A29930489");
        carteFidelio.setClient(client);
        client.setCarteFidelio(carteFidelio);

        //client.setPromotions(promotions);

        ctrl.save(client);

    }
}