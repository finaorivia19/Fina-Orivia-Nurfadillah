import java.util.Scanner;
	public class hitungTanah{
		int p, l;
		public hitungTanah(int x, int y){
			p = x;
			l = y;
		}
	
		int hitungLuas(){
			int luas = p * l;
			return luas;
		}
	}