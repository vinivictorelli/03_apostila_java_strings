import javax.swing.JOptionPane;

public class Ex01{
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome completo: ");
        String[] textoSeparado = nome.split(" ");
        JOptionPane.showMessageDialog(null, String.format("Olá, %s. Seu sobrenome é %s",textoSeparado[0],textoSeparado[1]));
    }
}