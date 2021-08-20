
package CustomTable;

import DTO.LichSuDTO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class TableLichSu extends AbstractTableModel {
    private String name[]={"Mã TB","Tên thiết bị","Tình trạng","Mô tả","Số lượng","Đơn giá","Thành tiền"};
    private Class classes[]={String.class,String.class,String.class,String.class,int.class,int.class,double.class};
    ArrayList<LichSuDTO> listLichSu=new ArrayList<LichSuDTO>();
    public TableLichSu(ArrayList<LichSuDTO> listLichSu)
    {
        this.listLichSu=listLichSu;
    }
    
    @Override
    public int getRowCount() {
        return listLichSu.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex)
       {
           case 0: return listLichSu.get(rowIndex).getMaTB();
           case 1: return listLichSu.get(rowIndex).getTenTB();
           case 2: return listLichSu.get(rowIndex).getTinhTrang();
           case 3: return listLichSu.get(rowIndex).getMoTa();
           case 4: return listLichSu.get(rowIndex).getSoLuong();
           case 5: return listLichSu.get(rowIndex).getDonGia();
           case 6: return listLichSu.get(rowIndex).getThanhTien();
           
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
