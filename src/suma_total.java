import java.util.Scanner;

import javax.swing.JOptionPane;

public class suma_total {

	public static void main(String[] args) {
		//pedir 10 numeros y escribir la suma total
		int suma=0,numero;
		Scanner entrada = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			numero =Integer.parseInt(JOptionPane.showInputDialog(null,"digite un numero"));
		
		suma+=numero;
		}System.out.println("la suma es...."+suma);
		
	
		
	}

}
