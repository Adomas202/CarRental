public class Main {

    public static void main(String[] args) {
        float uzsakymoKaina = 0;
        NuomosUzsakymas uzsakymas = new NuomosUzsakymas();

        Automobilis bmw320i = new Automobilis(3000, 1999, 68);
        Automobilis mercedes = new Automobilis(40000, 2017, 340);

        uzsakymas.PridetiAutomobili(bmw320i);
        uzsakymas.PridetiAutomobili(mercedes);

        uzsakymoKaina += uzsakymas.SkaiciuotiUzsakymoKaina(new KainosPolitikaPaprasta());
        uzsakymoKaina += uzsakymas.SkaiciuotiUzsakymoKaina(new KainosPolitikaSudetinga());

        uzsakymoKaina += uzsakymas.SkaiciuotiDraudimoKaina(new DraudimasZalias());
        uzsakymoKaina += uzsakymas.SkaiciuotiDraudimoKaina(new DraudimasRaudonas());

        System.out.println(uzsakymoKaina);
    }
}
