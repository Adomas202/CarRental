public class Main {

    public static void main(String[] args) {
        NuomosUzsakymas uzsakymas = new NuomosUzsakymas();

        Automobilis bmw320i = new Automobilis(3000, 1999, 68);
        Automobilis mercedes = new Automobilis(40000, 2017, 340);

        uzsakymas.PridetiAutomobili(bmw320i);
        uzsakymas.PridetiAutomobili(mercedes);

        uzsakymas.SkaiciuotiKaina(new KainosPolitikaPaprasta());
    }
}
