import java.util.List;
import java.util.ArrayList;

public class NuomosUzsakymas {
    private float kaina;

    private List<Automobilis> automobiliai;

    public NuomosUzsakymas() {
        this.automobiliai = new ArrayList<Automobilis>();
    }

    public void PridetiAutomobili(Automobilis automobilis) {
        this.automobiliai.add(automobilis);
    }

    public float SkaiciuotiKaina(KainosPolitika mokejimoStrategija) {
        for (Automobilis automobilis: automobiliai) {
//            sum += automobilis.getKaina();
            kaina = mokejimoStrategija.ikainuotiUzsakymoNuomosKaina(automobilis.getKaina(), automobilis.getMetai(), automobilis.getGalingumas());
        }
        return kaina;
    }
}
