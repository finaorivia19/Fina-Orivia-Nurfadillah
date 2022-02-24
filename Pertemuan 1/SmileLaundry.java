import java.util.Scanner;
public class SmileLaundry {
	public static void main(String[] args) {
	
	int ani = 4, bina = 6, budi = 15, cita = 11;
	double hasilAkhir;
	hasilAkhir = (4*4500) + (6*4500) + (15*4500*0.05) + (11*4500*0.05);
		System.out.println("Hasil Pendapatan dari Keseluruhan Laundry adalah Rp: "+hasilAkhir);
		System.out.println("Dengan Perolehan:");
		System.out.println("Ani Rp: " + 4*4500);
		System.out.println("Bina Rp: " + 6*4500);
		System.out.println("Budi Rp: " + (15*4500*0.05));
		System.out.println("Cita Rp: " + (11*4500*0.05));
	
	}
}