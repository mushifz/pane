import javax.swing.JOptionPane;
public class Entrada {
    public static void main(String[] args){
        String nombreUsuario = JOptionPane.showInputDialog("Como se llama tu nombre ");
        System.out.println("Tu nombre se llama: " + nombreUsuario);
    }    
}