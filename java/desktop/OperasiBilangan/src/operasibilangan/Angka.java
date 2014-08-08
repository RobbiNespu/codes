/**
 * Contact me on Creatorb45@gmail.com
 * cool syntax isn't running on computer but also readable for programmer ;)
 * Coder Coding Code's
 */
package operasibilangan;
import mypackage.Myclass;
/**
 * @author creatorb
 *
 */
public class Angka {
	
	public static void main(String[] args){
		
		//instantisasi obyek op1
		Operasibilangan obyek1 = new Operasibilangan();
		
		obyek1.angkaA = 2;
		obyek1.angkaB = 3;
		obyek1.jumlah();
		obyek1.tampilkanhasil();
	
		//instantisasi obyek op2
		Operasibilangan obyek2 = new Operasibilangan();
		obyek2.angkaA = 4;
		obyek2.angkaB = 5;
		obyek2.jumlah();
		obyek2.tampilkanhasil();
		
		//instanisasi obyek dari myclass
		Myclass kelasku = new Myclass();
		kelasku.tampilkankata();
		
	}
}
