import java.util.Scanner;
public class MainpemilihanSuara{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("=================================================================");
		System.out.println("Pemilihan Suara Dalam Rangka Memilih Ketua BEM Periode Tahun 2020");
		System.out.println("=================================================================");
		
		pemilihanSuara BEM = new pemilihanSuara();
		pemilihanSuara[] arr = new pemilihanSuara[BEM.jumlahKandidat];
	
		for (int i = 0; i < BEM.jumlahKandidat; i++){
			arr[i] = new pemilihanSuara();
			System.out.print("Nama Kandidat Ke- " + (i + 1) + " : ");
			arr[i].kandidat = input.nextLine();
		}
		System.out.println("=======================");
		for (int i = 0; i < BEM.jumlahKandidat; i++){
			System.out.print("Jumlah Suara Kandidat Ke- " + (i + 1) + " : ");
			arr[i].suara = input.nextLine();
			BEM.jumlahSuara += arr[i].suara;
		}
		System.out.println("=======================");
		int hasil = BEM.Hitung(BEM.jumlahSuara, arr[0].suara, arr[1].suara, arr[2].suara, arr[3].suara);
		if (hasil == 0){
			System.out.println("Masing-masing Kandidat memiliki mayoritas yang hampir sama");
		}else {
			System.out.println("Ketua BEM yang terpilih yaitu : " +qrr[hasil-1].kandidat);
			
		}
	
	}
}