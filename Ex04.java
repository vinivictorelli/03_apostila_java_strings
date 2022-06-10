import javax.swing.JOptionPane;

public class Ex04 {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Digite duas palavras separadas por um espaço em branco");
        String[] textoSeparado = texto.split(" ");
        JOptionPane.showMessageDialog(null,textoSeparado[0].length());
        JOptionPane.showMessageDialog(null,textoSeparado[1].length());
    }
}
