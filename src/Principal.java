
import javax.swing.JFrame;

/**
 *
 * @author acxel
 */
public class Principal {
    
    public static void main(String[] args) {
        Ventana o = new Ventana();
        o.setVisible(true);
        o.setResizable(false);
        o.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        o.setSize(400, 400);
        o.setLocationRelativeTo(null);
    }
}
