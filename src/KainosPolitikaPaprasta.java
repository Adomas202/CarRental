public class KainosPolitikaPaprasta implements KainosPolitika{

    @Override
    public float IkainuotiUzsakymoNuomosKaina(float kaina, int metai) {
        float uzsakymoKaina = 0;
        uzsakymoKaina = KainosPolitikaPaprastasSkaiciavimas(kaina, metai);
        return uzsakymoKaina;
    }

    public float KainosPolitikaPaprastasSkaiciavimas(float kaina, int metai) {
        int mokesciai = 21;
        kaina = kaina * (mokesciai / 100);
        return kaina;
    }


}
