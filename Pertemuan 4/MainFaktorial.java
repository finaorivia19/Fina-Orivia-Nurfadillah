import java.util.Scanner;
	public class MainFaktorial{
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);
	System.out.println("===================");
	System.out.print("Masukkan jumlah elemen yang ingin Anda hitung : ");
	int elemen = sc.nextInt();
	
	Faktorial [] fk = new Faktorial[elemen];
	for (int i=0;i<elemen;i++){
		fk[i] = new Faktorial();
		System.out.print("Masukkan nilai data ke-"+(i+1)+" : ");
		fk[i].nilai = sc.nextInt();
	
	System.out.println("==================================");
	System.out.println("Hasil Faktorial dengan Brute Force : ");
	for (int i=0;i<elemen;i++){
	System.out.println("Faktorial dari nilai "+fk[i].nilai+ " adalah "+fk[i].FaktorialBF(fk[i].nilai));
	}
	System.out.println("==================================");
	System.out.println("Hasil Faktorial dengan Divide Conquer : ");
	for (int i = 0; i < elemen; i++){
	System.out.println("Faktorial dari nilai "+fk[i].nilai+ " adalah "+fk[i].FaktorialDC(fk[i].nilai));	
	}
	System.out.println("==================================");
	}
	
	}
	
	
	
	
	
	
	}