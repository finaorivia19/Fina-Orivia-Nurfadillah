public class balok2 {
    double p, l, t;

    public balok(double x, double y, double z) {
        p = x;
        l = y;
        t = z;
    }

    double hitungLuasPermukaan() {
        double lp = 2 * ((p * l) + (p * t) + (l * t));
        return lp;
    }

    double hitungVolume() {
        double v = p * l * t;
        return v;
    }
}