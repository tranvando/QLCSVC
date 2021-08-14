package BLL;

import DAL.DAL;
import DTO.KhoDTO;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class KhoBLL {

    DAL dal = new DAL();

    public ResultSet listTBKho() //trả về list thiết bị
    {
        String sql = "select * from ThietBi where SoLuong!=0 or SoLuongHong!=0 or SoLuongChoMuon!=0";
        return dal.getResult(sql);
    }
    public int ThemThietBi(String MaTB, String TenTB, String CauHinh, String MoTa,int DonGia, int SoLuong)//Thêm thiết bị vào kho 
    {       //int kq=0;
            String sql="insert into ThietBi values('"+MaTB+"',N'"+TenTB+"',N'"+CauHinh+"',N'"+MoTa+"',"+DonGia+","+SoLuong+",0,0)";
            return dal.UpdateData(sql);
    }
    public ResultSet ktKhoa(String MaTB)
    {   
        ResultSet rs=null;
        try {
            String sql = "select * from ThietBi where MaTB='"+MaTB+"'";
            rs=dal.getResult(sql);
            }
        catch(Exception e) {
               e.printStackTrace();
        }
        return rs;
    }
    public int CapNhatTB(String MaTB, String TenTB, String CauHinh, String MoTa,int DonGia, int SoLuong)//Thêm thiết bị vào kho 
    {
            String sql="update ThietBi set TenTB=N'"+TenTB+"',CauHinh=N'"+CauHinh+"',MoTa=N'"+MoTa+"',DonGia="+DonGia+",SoLuong="+SoLuong+" where MaTB='"+MaTB+"'";
            return dal.UpdateData(sql);
    }
}
