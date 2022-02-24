import java.util.Scanner;
public class NilaiMahasiswa{
	public static void main (String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("PROGRAM MENGHITUNG NILAI AKHIR");
	System.out.println("==============================");
	float nilaiUAS, nilaiUTS, nilaiTugas;
	float nilaiAkhir;
 
	System.out.println("Masukkan Nilai UAS: ");
	nilaiUAS = sc.nextFloat();
	System.out.println("Masukkan Nilai UTS: ");
	nilaiUTS = sc.nextFloat();
	System.out.println("Masukkan Nilai Tugas: ");
	nilaiTugas = sc.nextFloat();
	nilaiUAS = nilaiUAS * 45/100;
	nilaiUTS = nilaiUTS * 35/100;
	nilaiTugas = nilaiTugas * 20/100;
	nilaiAkhir = nilaiUAS + nilaiUTS + nilaiTugas;
	String nilaiHuruf;
	System.out.println("Nilai Akhir Anda Adalah: " + nilaiAkhir);
	
	if(nilaiAkhir> 80 && nilaiAkhir <=100){
		nilaiHuruf = "A";
		System.out.println("Nilai Huruf: " + nilaiHuruf);
	}else if(nilaiAkhir> 73 && nilaiAkhir <=80){
		nilaiHuruf = "B+";
		System.out.println("Nilai Huruf: " + nilaiHuruf);
	}else if(nilaiAkhir> 65 && nilaiAkhir <=73){
		nilaiHuruf = "B";
		System.out.println("Nilai Huruf: " + nilaiHuruf);
	}else if(nilaiAkhir> 60 && nilaiAkhir <=65){
		nilaiHuruf = "C+";
		System.out.println("Nilai Huruf: " + nilaiHuruf);
	}else if (nilaiAkhir> 50 && nilaiAkhir <=60){
		nilaiHuruf = "C";
		System.out.println("Nilai Huruf: " + nilaiHuruf);
	}else if(nilaiAkhir> 39 && nilaiAkhir <=50){
		nilaiHuruf = "D";
		System.out.println("Nilai Huruf: " + nilaiHuruf);
	}else{
		nilaiHuruf = "E";
	}
	System.out.println("==============================");
	System.out.println("==============================");
	}
}

	
	
	
