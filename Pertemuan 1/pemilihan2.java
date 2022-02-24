import java.util.Scanner;
public class pemilihan2 {
	public static java.util.Scanner input = new java.util.Scanner(System.in);
	public static void main (String[] args) {
	}


	double tugas,uts,uas,finalNilai;
	String gradeNilai;
	System.out.println("Program menghitung nilai Akhir");
	System.out.println("==============================");
	System.out.print("Inputkan Nilai Tugas:");
	tugas = input.nextDouble();
	tugas = tugas*20/100;
		System.out.print("Inputkan Nilai Uts:");
		uts = input.nextDouble();
		uts = uts*35/100;
		System.out.print("Inputkan Nilai Uas:");
		uas = input.nextDouble();
		uas = uas*45/100;
		finalNilai= tugas+uts+uas;
		System.out.println("========================");
		if(finalNilai>80&&finalNilai<=100){
			gradeNilai = "A";
		}else if(finalNilai>=73){
			gradeNilai = "B+";
		}else if(finalNilai>=65){
			gradeNilai = "B";
		}else if(finalNilai>=50){
			gradeNilai = "C+";
		}else if(finalNilai>=39){
			gradeNilai = "D";
		}else {
			gradeNilai = "E";
		}
		System.out.println("=============================");
		System.out.println("Nilai Akhir : "+finalNilai);
		System.out.println("Nilai Huruf : "+gradeNilai);
		if(gradeNilai.equals("D")||gradeNilai.equals("E")){
			System.out.println("Tidak Lulus");
		}else{
			System.out.println("Lulus");
		}
		
			
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	