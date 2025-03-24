import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DemoTabulka extends JFrame {
    private JPanel pnMain;
    private JTable tdData;
    private JScrollPane sc;

KvetinyTableModel model = new KvetinyTableModel(
        List.of(
               new Kvetina("tulipán", 30, Color.red)

        ));

    public DemoTabulka(){
        initComponents();
    }

    private void initComponents(){
        setContentPane(pnMain);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
        tdData.setModel(model);
    }
}
