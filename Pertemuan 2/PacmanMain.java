import java.util.Scanner;
	public class PacmanMain{
		public static void main(String[] args){
			
		Pacman p = new Pacman();
		Scanner sc = new Scanner(System.in);
		p.a = 0;
		p.y = 0;
		
		System.out.print("Masukkan batas a = ");
		p.width = sc.nextInt();
		System.out.print("Masukkan batas y = ");
		p.height = sc.nextInt();
		
		for (;;){
			System.out.print(
				"\nPilih action : \n1.Move Left\n2.Move Right\n3.Move Up"
			int input = sc.nextInt();
			if (p.a == 0 && input == 1){
				System.out.println("\nPacman kurang atau melebihi batas");
				p.printPosition(p.a, p.y);
				continue;
			}else if (p.y == 0 && input == 4){
				System.out.println("\nPacman kurang atau melebihi batas");
				p.printPosition(p.a, p.y);
				continue;
			}else if (p.a == p.width && input == 2){
				System.out.println("\nPacman kurang atau melebihi batas");
				p.printPosition(p.a, p.y);
				continue;
			}else if (p.a == p.height && input == 3){
				System.out.println("\nPacman kurang atau melebihi batas");
				p.printPosition(p.a, p.y);
				continue;
			}
			
			if (input == 1){
				p.moveLeft(p.a);
				p.printPosition(p.a, p.y);
			}else if (input == 2){
				p.moveRight(p.a);
				p.printPosition(p.a, p.y);
			}else if (input == 3){
				p.moveRight(p.a);
				p.printPosition(p.a, p.y);
			}else if (input == 4){
				p.moveRight(p.a);
				p.printPosition(p.a, p.y);
			}else {
				System.out.println("\nTERIMA KASIH\n");
				break;
			}
		}
			
			
			
			
			
			
			
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}