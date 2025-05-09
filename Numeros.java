import javax.swing.JOptionPane;
public class Numeros {
    public static void main(String[] args){
        String numero1 = JOptionPane.showInputDialog("Ingresa el primer numero ");
        String numero2 = JOptionPane.showInputDialog("Ingresa el segundo numero ");

        //Casting de numeros enteros
        //int numeroEntero1 = Integer.parseInt(numero1);
        //int numeroEntero2 = Integer.parseInt(numero2);

        //Casting de numeros decimales
        double numeroDecimal1 = Double.parseDouble(numero1);
        double numeroDecimal2 = Double.parseDouble(numero2);

        System.out.println("La suma es: " + (numeroDecimal1+numeroDecimal2));
    }
}
