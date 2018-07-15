
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author acxel
 */
public class Ventana extends JFrame {
    
    private JPanel panel;
    private JLabel label;
    private JButton boton, boton2;
    private static int c;
    
    public Ventana() {
        
        iniciar();
    }
    
    private void iniciar() {
        // panel
        panel();
        
        //label
        label();
        
        //boton
        boton();
    }
    
    private void panel() {
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.white);
        this.add(panel);
    }
    
    private void label() {
        
        label = new JLabel("En espera ...", SwingConstants.CENTER);
        label.setBounds(0, 50, 400, 40);
        label.setFont(new Font("Hack", 0, 17));
        label.setForeground(Color.MAGENTA);
        panel.add(label);
    }
    
    private void boton() {
        
        boton = new JButton("Pulsa aquí");
        boton.setBounds(77, 250, 250, 40);
        boton.setFont(new Font("arial", Font.BOLD, 18));
        boton.setBackground(Color.ORANGE);
        panel.add(boton);
        
        boton2 = new JButton("Limpiar");
        boton2.setBounds(77, 310, 250, 40);
        boton2.setFont(new Font("arial", Font.BOLD, 18));
        boton2.setBackground(Color.RED);
        panel.add(boton2);
        
        evento();
    }
    
    private void evento() {
        
        boton.addActionListener((ActionEvent e) -> {
            
            c++;
            if (c == 1) {
                
                label.setText("Has precionado el boton 1 vez");
            } else {
                
                label.setText("Has precionado el boton "+c+" veces");
            }
        });
        
        boton2.addActionListener((ActionEvent e) -> {
           
            label.setText("En espera ...");
            c = 0;
        });
    }
}
