import java.util.Scanner;
	public class Kubus{
	public int sisi;
	
	public Kubus (int s){
	sisi = s;
	}
	
	public int hitungLuasKubus(){
		return 6*sisi*sisi;
	}
	
	public int hitungVolumeKubus(){
	return sisi*sisi*sisi;
	}
	
	}