import javax.swing.JOptionPane;

public class sueldosdeultimos {

	public static void main(String[] args) {
		//pedir un numero N introducir N sueldos y mostrar el sueldo maximo
		
		int numerosueldo;
		float sueldo,sueldo_maximo=0;
		
		numerosueldo = Integer.parseInt(JOptionPane.showInputDialog(null,"digite la cantidad de sueldo que desea introducir sueldos"));
		for(int i=1;i<=numerosueldo;i++) {
			sueldo = Float.parseFloat(JOptionPane.showInputDialog("digite el sueldo: "+i+":"));
			
			if(sueldo > sueldo_maximo) {
				sueldo_maximo = sueldo;
			}
		}
		System.out.println("el sueldo maximo es: "+sueldo_maximo);
	}
}
