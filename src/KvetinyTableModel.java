import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class KvetinyTableModel extends AbstractTableModel {

    private List<Kvetina> data = new ArrayList<>();

    public KvetinyTableModel(List<Kvetina> coZobrazit){
        this.data.addAll(coZobrazit);
    }




    @Override
    public int getRowCount() {
        return data.size(); //kolik řádků
    }

    @Override
    public int getColumnCount() {
        return 4; // sloupečků
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Kvetina kvetinaNaRadku = data.get(rowIndex);
        switch (columnIndex){
            case 0: return rowIndex +1;
            case 1 : return kvetinaNaRadku.getNazev();
            case 2: return  kvetinaNaRadku.getPocet();
            case 3:
            Color barva = kvetinaNaRadku.getBarva();
            String popisBarvy = barva.getRed() + "," + barva.getGreen() + "," + barva.getBlue();
                return popisBarvy;
            default:
                throw new RuntimeException("špatné číslo sloupce:" + columnIndex);
        }

    }
}
