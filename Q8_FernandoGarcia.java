import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q8_FernandoGarcia implements ActionListener {
    private JFrame frame;
    private JButton[] botoes;
    private JLabel resultadoLabel;
    private JLabel tentativaLabel;
    private int numeroCorreto;
    private int tentativas;
    
    public Q8_FernandoGarcia() {
        frame = new JFrame("Adivinhar Número");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        botoes = new JButton[20];
        for (int i = 0; i < 20; i++) {
            botoes[i] = new JButton(Integer.toString(i + 1));
            botoes[i].addActionListener(this);
            frame.add(botoes[i]);
        }
        
        resultadoLabel = new JLabel();
        tentativaLabel = new JLabel();
        
        Container container = frame.getContentPane();
        container.setLayout(new FlowLayout());
        container.add(resultadoLabel);
        container.add(tentativaLabel);
        
        frame.pack();
        frame.setVisible(true);
        
        iniciarJogo();
    }
    
    private void iniciarJogo() {
        numeroCorreto = (int) (Math.random() * 20) + 1;
        tentativas = 0;
        exibirResultado("");
    }
    
    private void exibirResultado(String resultado) {
        resultadoLabel.setText(resultado);
        tentativaLabel.setText("Tentativa atual: " + (tentativas + 1) + "/5");
        if (resultado.equals("Você acertou!") || tentativas == 4) {
            for (int i = 0; i < 20; i++) {
                botoes[i].setEnabled(false);
            }
        }
        tentativas++;
    }

    public void actionPerformed(ActionEvent e) {
        JButton botao = (JButton) e.getSource();
        int numeroAdivinhado = Integer.parseInt(botao.getText());
        if (numeroAdivinhado == numeroCorreto) {
            exibirResultado("Você acertou!");
        } else {
            exibirResultado("Você errou.");
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Q8_FernandoGarcia());
    }
}
