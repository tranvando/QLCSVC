
package CustomTable;

import DTO.GiaoDichDTO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TableGiaoDich extends AbstractTableModel{
    private String name[]={"Mã giao dịch","Tên loại giao dịch","Thời gian","Người thực hiện"};
    private Class classes[]={String.class,String.class,String.class,String.class};
    ArrayList<GiaoDichDTO> listGiaoDich=new ArrayList<GiaoDichDTO>();
    public TableGiaoDich(ArrayList<GiaoDichDTO> listGiaoDich)
    {
        this.listGiaoDich=listGiaoDich;
    }
    
    @Override
    public int getRowCount() {
        return listGiaoDich.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex)
       {
           case 0: return listGiaoDich.get(rowIndex).getMaGD();
           case 1: return listGiaoDich.get(rowIndex).getLoaiGD();
           case 2: return listGiaoDich.get(rowIndex).getThoiGian();
           case 3: return listGiaoDich.get(rowIndex).getNguoiTH();
           
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
