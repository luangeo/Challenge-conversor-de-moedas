import javax.swing.JOptionPane;

public class converteMoeda {
    public static void main(String[] args){

        String instrucao;
        instrucao = JOptionPane.showInputDialog("Bem vindo ao Conversor de moeda." +
                "\nEscrevar **OK** para Iniciar.");

        String moeda = "";
        while (!moeda.equals("1") && !moeda.equals("2") && !moeda.equals("3") && !moeda.equals("4")) {
            moeda = JOptionPane.showInputDialog("Bem vindo!!!\n" +
                    "Escolha a opção: "
                    + "\n1 Euro"
                    + "\n2 Dólar"
                    + "\n3 Dólar para o Real"
                    + "\n4 Euro para o Real");

            if (!moeda.equals("1") && !moeda.equals("2") && !moeda.equals("3") && !moeda.equals("4")) {
                JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, escolha uma opção válida.");
            }
        }

        int opcao = Integer.parseInt(moeda);

        if (opcao == 1) {
            String valor = JOptionPane.showInputDialog("Digite o valor em real.");
            double valorReal = Double.parseDouble(valor);
            final double euro = 5.54;
            double valorConvertido = valorReal / euro;
            String msg = "O valor em Euro é €  " + valorConvertido;
            JOptionPane.showMessageDialog(null, msg);

        } else if (opcao == 2) {
            String valor = JOptionPane.showInputDialog("Digite o valor em real.");
            double valorReal = Double.parseDouble(valor);
            final double dolar = 5.16;
            double valorConvertido = valorReal / dolar;
            String msg = "O valor em Dólar é: " + valorConvertido;
            JOptionPane.showMessageDialog(null, msg);

        } else if (opcao == 3) {
            String valor = JOptionPane.showInputDialog("Digite um valor em dolar.");
            double valorDolar = Double.parseDouble(valor);
            final double dolar = 5.16;
            double valorConvertido = valorDolar * dolar;
            String msg = "O valor em Real é R$ " + valorConvertido;
            JOptionPane.showMessageDialog(null, msg);

        } else if (opcao == 4) {
            String valor = JOptionPane.showInputDialog("Digite um valor em Euro.");
            double valorEuro = Double.parseDouble(valor);
            final double euro = 5.56;
            double valorConvertido = valorEuro * euro;
            String msg = "O valor em Real é R$  " + valorConvertido;
            JOptionPane.showMessageDialog(null, msg);
        }
    }
}