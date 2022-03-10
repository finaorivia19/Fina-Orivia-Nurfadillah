public class balokMain {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        balok[] blk = new balok[1];
        for (int i = 0; i < input; i++) {
            System.out.print("\nMasukkan p balok ke - " + (i + 1) + " = ");
            double a = sc.nextDouble();
            System.out.print("Masukkan l balok ke - " + (i + 1) + " = ");
            double b = sc.nextDouble();
            System.out.print("Masukkan t balok ke - " + (i + 1) + " = ");
            double c = sc.nextDouble();
            blk[i] = new balok(x, y, z);
        }

        for (int i = 0; i < input; i++) {
            System.out.print("\nLuas Permukaan Balok " + (i + 1) + " = " + blk[i].hitungLuasPermukaan() +
                    "\nVolume Balok " + (i + 1) + " = " + blk[i].hitungVolume());
        }
