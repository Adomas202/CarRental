import java.util.List;
        import java.util.ArrayList;

public class NuomosUzsakymas {

    private List<Automobilis> automobiliai;

    public NuomosUzsakymas() {
        this.automobiliai = new ArrayList<Automobilis>();
    }

    public void PridetiAutomobili(Automobilis automobilis) {
        this.automobiliai.add(automobilis);
    }

    public float SkaiciuotiUzsakymoKaina(KainosPolitika mokejimoStrategija) {
        float uzsakymoKaina = 0;
        for (Automobilis automobilis: automobiliai) {
            uzsakymoKaina += mokejimoStrategija.IkainuotiUzsakymoNuomosKaina(automobilis.getKaina(), automobilis.getMetai());
        }
        System.out.println("Jūsų užsakymo kaina yra: "  + uzsakymoKaina);
        return uzsakymoKaina;
    }

    public float SkaiciuotiDraudimoKaina (DraudimoPolitika draudimoPolitika) {
        float draudimoKaina = 0;
        for (Automobilis automobilis: automobiliai) {
            draudimoKaina += draudimoPolitika.ApskaiciuotiDraudimoKaina(automobilis.getKaina(), automobilis.getMetai(), automobilis.getGalingumas());
        }
        return draudimoKaina;
    }
}
