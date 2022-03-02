import java.util.Scanner;
public class BarangLatihan{
	public static void main(String[] args){
	
	String namaBarang, jenisBarang;
	int stok, hargaSatuan;
	
	Barang(){
	}
	Barang(String nm, String jn, int st, int has){
	namaBarang = nm;
	jenisBarang = jn;
	stok = st;
	hargaSatuab = hs;
	}

	void tampilBarang(){
		System.out.println("Nama = "+namaBarang);
		System.out.println("Jenis = "+jenisBarang);
		System.out.println("Stok = "+stok);
		System.out.println("Harga Satuan = "+hargaSatuan);
	}

	void tambahStok(int n){
		stok=stok+n;
	}

	 void kurangiStok(int n){
        if(n>0){
        stok=stok-n;
        }
	}
	
	int hitungHargaTotal (int jumlah){
		return jumlah*hargaSatuan;
	}


}



}

// program error, tidak bisa di run