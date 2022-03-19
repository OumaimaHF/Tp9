package cigma.pfe.controllers;

import cigma.pfe.models.Facture;
import cigma.pfe.services.FactureService;

import java.util.List;

public class FactureController {
    FactureService factureService;

    public FactureController(FactureService factureService) {
        this.factureService = factureService;
    }

    public void setFactureService(FactureService factureService) {
        this.factureService = factureService;
    }

    public Facture create(Facture f) {

        return factureService.create(f);
    }

    public List<Facture> read() {
        return factureService.read();
    }

    public void delete(long id) {
        factureService.delete(id);
    }

    public Facture update(Facture f) {

        return factureService.update(f);
    }
}