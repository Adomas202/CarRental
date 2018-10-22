public class KainosPolitikaSudetinga implements KainosPolitika{

    @Override
    public float IkainuotiUzsakymoNuomosKaina(float kaina, int metai) {
        kaina = KainosPolitikaSkaiciavimas(kaina, metai);
        return kaina;
    }

    public static float KainosPolitikaSkaiciavimas(float kaina, int metai) {
        if (metai > 2000) {
            kaina *= 0.1;
        } else if (metai < 1980) {
            kaina *= 0.5;
        } else if (metai > 2017) {
            kaina *= 0.8;
        }
        return kaina;
    }
}
