/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomTable;

import DTO.KhoDTO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TableKho extends AbstractTableModel{

    private String name[]={"Mã","Tên thiết bị","Cấu hình","Mô tả","Đơn giá","Tổng SL ở kho","SL tốt","SL hỏng","SL ở phòng ban"};
    private Class classes[]={String.class,String.class,String.class,String.class,int.class,int.class,int.class,int.class,int.class};
    
    
    ArrayList<KhoDTO> listTB=new ArrayList<KhoDTO>();
    public TableKho(ArrayList<KhoDTO> listTB)
    {
        this.listTB=listTB;
    }
    
    @Override
    public int getRowCount() {
        return listTB.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex)
       {
           case 0: return listTB.get(rowIndex).getMaTB();
           case 1: return listTB.get(rowIndex).getTenTB();
           case 2: return listTB.get(rowIndex).getCauHinh();
           case 3: return listTB.get(rowIndex).getMoTa();
           case 4: return listTB.get(rowIndex).getDonGia();
           case 5: return listTB.get(rowIndex).getSLTot();
           case 6: return listTB.get(rowIndex).getSLTot()-listTB.get(rowIndex).getSLHong();
           case 7: return listTB.get(rowIndex).getSLHong();
           case 8: return listTB.get(rowIndex).getSLPhongKhac();
           
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
