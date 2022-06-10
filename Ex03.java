import javax.swing.JOptionPane;

public class Ex03 {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Digite um texto: ");
        int pos1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição onde começar"));
        int pos2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição onde terminar"));
        String novoTexto = texto.substring(pos1,pos2+1);
        JOptionPane.showMessageDialog(null,novoTexto);
    }
}
