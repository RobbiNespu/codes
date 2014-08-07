/**
 * 
 */
package operator;

/**
 * @author creatorb
 *
 */
public class Aritmatika {

	public static void main (String[] args){
		
		//deklarasi atribut dan properti
		int c = 5;
		int b = 4;
		
		//operasi aritmatika
		int penjumlahan = c + b;
		int pengurangan = c - b;
		int perkalian = c * b;
		int pembagian = c / b;
		int hasilBagi = c % b;
		
		//tampilkan hasil
		System.out.println("hasil dari 5 + 4 adalah " +penjumlahan);
		System.out.println("hasil dari 5 - 4 adalah " +pengurangan);
		System.out.println("hasil dari 5 x 4 adalah " +perkalian);
		System.out.println("hasil dari 5 / 4 adalah " +pembagian);
		System.out.println("hasil dari 5 % 4 adalah " +hasilBagi);
	}
	
}
