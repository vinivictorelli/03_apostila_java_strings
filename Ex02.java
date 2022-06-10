import javax.swing.JOptionPane;

public class Ex02 {
    public static void main(String[] args) {
        String senha = JOptionPane.showInputDialog("Digite a sua senha: ");
        char[] primeiroCaractere = senha.toCharArray();
        if (senha.length() == 4 && primeiroCaractere[0] == 'A' || primeiroCaractere[0] == 'a') {
            for (char c : primeiroCaractere) {
                if (c%2 != 0) {
                    JOptionPane.showMessageDialog(null,"Senha Válida");
                    break;        
                }
                else {
                    JOptionPane.showMessageDialog(null,"Senha Inválida");
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Senha Inválida");
        }

        }
    }

