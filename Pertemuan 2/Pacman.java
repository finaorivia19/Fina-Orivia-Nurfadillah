import java.util.Scanner;
	public class Pacman{
		int x, y, width, height;
		
		void moveLeft(int z){
			x -= 1;
		}
		void moveRight(int z){
			x += 1;
		}
		void moveUp(int z){
			y += 1;
		}
		void moveDown(int z){
			y -= 1;
		}
		void printPosition(int z, int y){
			System.out.println("\nPacman pada posisi (x,y) = " + x + "," + y);
		}
	
	
	}