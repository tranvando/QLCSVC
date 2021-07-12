
package CustomTable;

import DTO.PhongDTO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class TablePhong extends AbstractTableModel{
    private String name[]={"Mã phòng","Tên phòng"};
    private Class classes[]={String.class,String.class};
    ArrayList<PhongDTO> listPhong=new ArrayList<PhongDTO>();
    public TablePhong(ArrayList<PhongDTO> listPhong)
    {
        this.listPhong=listPhong;
    }
    
    @Override
    public int getRowCount() {
        return listPhong.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex)
       {
           case 0: return listPhong.get(rowIndex).getMaPhong();
           case 1: return listPhong.get(rowIndex).getTenPhong();
           
           default: return null;
       }
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return name[column];
    }
}
