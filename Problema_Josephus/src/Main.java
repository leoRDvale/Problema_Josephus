import javax.swing.*;

/*
   *Problema de Josephus.  Imagine uma roda de 20 pessoas numeradas de 1 a 20 no sentido horário.
   * Cada pessoa possui nome, telefone endereço e CPF. Começando com a pessoa de número 1,
   * percorra a roda no sentido horário e elimine cada m-ésima pessoa escolhida aleatoriamente enquanto
   * a roda tiver uma ou mais pessoas. Qual o número é a pessoa sobrevivente que ainda está na lista?

 */



public class Main {
    public static void main(String[] args) {
        Soldado soldado = new Soldado();

        String numInput = JOptionPane.showInputDialog("Digite um número: ");
        int num = Integer.parseInt(numInput);

        int soldadoNumero = soldado.localizarSoldado(num);

        Soldado.Soldados soldadoData = null;

        for(Soldado.Soldados soldados : soldado.getListSoldado()) {
            if(soldados.getNumero() == soldadoNumero) {
                soldadoData = soldados;
                break;
            }
        }

        String s = "O Soldado sobre vivente é o número: " + soldadoData.getNumero() + "\n";
        s += "Nome: " + soldadoData.getNome() + "\n";
        s += "Telefone: " + soldadoData.getTelefone() + "\n";
        s += "CPF: " + soldadoData.getCpf() + "\n";
        s += "Endereço: " + soldadoData.getEndereco() + "\n";

        JOptionPane.showMessageDialog(null, s);







    }

}
