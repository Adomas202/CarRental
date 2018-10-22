public class DraudimasRaudonas implements DraudimoPolitika {

    public static float VariklioDraudimoKoeficientas(float kaina, float galingumas) {
        if (galingumas > 200)
            kaina = kaina * 2;
        return kaina;
    }

    @Override
    public float ApskaiciuotiDraudimoKaina(float kaina, int metai, int galingumas) {
        kaina = VariklioDraudimoKoeficientas(kaina,galingumas);
        return kaina;
    }
}
