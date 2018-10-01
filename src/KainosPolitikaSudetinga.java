public class KainosPolitikaSudetinga implements KainosPolitika{

    @Override
    public float PridetiDraudimoKaina(float kaina, int metai, int galingumas) {
        kaina = ArNauja(kaina, metai);
        return VariklioGalingumoIrDraudimoKainosKoeficientas(kaina, galingumas);
    }

    @Override
    public float IkainuotiUzsakymoNuomosKaina(float kaina, int metai) {
        kaina = ArNauja(kaina, metai);
        return kaina;
    }

    private float VariklioGalingumoIrDraudimoKainosKoeficientas(float kaina, float galingumas) {
        kaina = kaina + kaina * (galingumas / 100);
        return kaina;
    }

    private float ArNauja(float kaina, int metai) {
        if (metai > 2017) {
            kaina *= 2;
        }
        return kaina;
    }

}
