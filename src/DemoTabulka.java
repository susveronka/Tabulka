import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class DemoTabulka extends JFrame {
    private JPanel pnMain;
    private JTable tdData;
    private JScrollPane sc;



    public DemoTabulka(){
        initComponents();
    }

    private void initComponents(){
        setContentPane(pnMain);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
    }
}
