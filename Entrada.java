import javax.swing.JOptionPane;
public class Entrada {
    public static void main(String[] args){
        String nombreUsuario = JOptionPane.showInputDialog("Como se llama tu nombre ");
        String apellidoPaterno = JOptionPane.showInputDialog("Como se llama tu primer apellido ");
        String apellidoMaterno = JOptionPane.showInputDialog("Como se llama tu segundo apellido ");
        System.out.println("Tu nombre se llama: " + nombreUsuario + " " + apellidoPaterno + " " + apellidoMaterno);
    }    
}