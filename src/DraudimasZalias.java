public class DraudimasZalias implements DraudimoPolitika{

    public static float VariklioDraudimoKoeficietnas(float kaina, float galingumas) {
        if (galingumas < 100) {
            return kaina;
        } else {
            kaina = kaina + kaina * (galingumas / 100);
            return kaina;
        }
    }

    @Override
    public float ApskaiciuotiDraudimoKaina(float kaina, int metai, int galingumas) {
        kaina = VariklioDraudimoKoeficietnas(kaina, galingumas);
        return kaina;
    }
}
