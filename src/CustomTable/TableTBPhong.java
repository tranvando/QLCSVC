
package CustomTable;

import DTO.ThietBiPhongDTO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;



public class TableTBPhong extends AbstractTableModel {
    private String name[]={"Mã TB","Tên thiết bị","Tổng SL","SL tốt","SL hỏng"};
    private Class classes[]={String.class,String.class,int.class,int.class,int.class};
    ArrayList<ThietBiPhongDTO> listTBPhong=new ArrayList<ThietBiPhongDTO>();
    public TableTBPhong(ArrayList<ThietBiPhongDTO> listTBPhong)
    {
        this.listTBPhong=listTBPhong;
    }
    
    @Override
    public int getRowCount() {
        return listTBPhong.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex)
       {
           case 0: return listTBPhong.get(rowIndex).getMaTB();
           case 1: return listTBPhong.get(rowIndex).getTenTB();
           case 2: return listTBPhong.get(rowIndex).getSL();
           case 3: return listTBPhong.get(rowIndex).getSL()-listTBPhong.get(rowIndex).getSLHong();
           case 4: return listTBPhong.get(rowIndex).getSLHong();
           
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

