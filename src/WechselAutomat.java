public class WechselAutomat{
    public class Waehrung {
        public String bezeichner;
        public double[] muenzenStueckelung;
        public Waehrung(String bezeichner, double[] _muenzenStueckelung) {
            this.bezeichner = bezeichner;
            this.muenzenStueckelung = _muenzenStueckelung;
        }
    }
    public Waehrung waehrung;
    public WechselAutomat()
    {
        double [] muenzenStueckelung = new double[]{2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
        waehrung = new Waehrung("euro", muenzenStueckelung );
    }
    public void wechseln(double geldbetrag) {
        int stueckzahl = 0;
        double tempBetrag = geldbetrag;
        for (double muenze : this.waehrung.muenzenStueckelung) {
            stueckzahl = (int) (tempBetrag / muenze);
            if(stueckzahl>=1)
            System.out.println( "" + stueckzahl + "*" + muenze +" " + waehrung.bezeichner);
            tempBetrag = tempBetrag % muenze;
        }
    }
    public static void main(String[] args){
        WechselAutomat automat = new WechselAutomat();
        automat.wechseln(4.36);
    }
}