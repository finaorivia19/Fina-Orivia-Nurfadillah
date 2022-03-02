import java.util.Scanner;
	public class BarangJs{
	
	String nama;
	int hargaSatuan;
	int jumlah;
	int hargaTotal(int p, int j){
		int hargatotal;
		hargatotal=p*j;
		return hargatotal;
	}
	
	double diskon(int a){
		double hargaDiskon=0;
		if (a>100000){
			hargaDiskon=a*0.10;
		} else if (a>=50000&&a<100000){
			hargaDiskon=a*0.05;
		} else {
			hargaDiskon=0;
		}
		return hargaDiskon;
	}

	double hargaBayar(int x, double a){
		double hargaBayar=0;
		hargaBayar=x-a;
		return hargaBayar;
	}









}