import java.util.Scanner;
	public class mahasiswaMain{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	mahasiswa[] m = new mahasiswa[3];
	for (int i = 0; i < m.length; i++){
		m[i] = new mahasiswa();
	}
	for (int i = 0; i < m.length; i++){
		System.out.println("\nMasukkan data Mahasiswa ke - " + (i + 1) + " : ");
		System.out.print("Masukkan nama : ");
		m[i].nama = sc.nextLine();
		System.out.print("Masukkan NIM : ");
		sc.nextLine();
		System.out.print("Masukkan jenis kelamin : ");
		m[i].jenisKelamin = sc.nextLine();
		System.out.print("Masukkan IPK : ");
		m[i].ipk = sc.nextDouble();
		sc.nextLine();
		
	}
	System.out.println();
	
	for (int i = 0; i < m.length; i++){
		System.out.println("\nData Mahasiswa ke - " + (i + 1) + " : ");
		System.out.println("Nama : " + m[i].nama);
		System.out.println("NIM : " + m[i].nim);
		System.out.println("Jenis Kelamin : " + m[i].jenisKelamin);
		System.out.println("IPK : " + m[i].ipk);
	}	
	
	
	
	
	
	}
	
	}