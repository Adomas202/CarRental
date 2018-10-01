public class KainosPolitikaPaprasta implements KainosPolitika{

    @Override
    public float ikainuotiUzsakymoDraudimoKaina(float kaina, int metai, int galingumas) {
        return 0;
    }

    @Override
    public float ikainuotiUzsakymoNuomosKaina(float kaina, int metai, float galingumas) {
        float koeficientas = galingumas / 100;
        kaina = kaina * koeficientas;

        System.out.println(kaina);
        return kaina;
    }
}
