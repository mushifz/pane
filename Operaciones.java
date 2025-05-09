import javax.swing.JOptionPane;
public class Operaciones{
    public static void main(String[] args){
        String numero1 = JOptionPane.showInputDialog("Ingresa numero 1 ");
        String numero2 = JOptionPane.showInputDialog("Ingresa numero 2 ");

        double numeroDecimal1 = Double.parseDouble(numero1);
        double numeroDecimal2 = Double.parseDouble(numero2);

        System.out.println("La suma es: " + (numeroDecimal1+numeroDecimal2));
        System.out.println("La resta es: " + (numeroDecimal1-numeroDecimal2));
        System.out.println("La multipliacion es: " + (numeroDecimal1*numeroDecimal2));
        System.out.println("La division es: " + (numeroDecimal1/numeroDecimal2));
    }
}