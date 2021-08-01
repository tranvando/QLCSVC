package BLL;

import DAL.DAL;
import DTO.TaiKhoanDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class TaiKhoanBLL {

    DAL dal=new DAL();

    public ResultSet getTaiKhoan(String tenDN, String matKhau) {
        String sql = "select * from TaiKhoan where TenDN='"+tenDN+"' and MatKhau='"+matKhau+"'";
        return dal.getResult(sql);
    }
    
    public int capNhatMK(String tenDN, String matKhauMoi,String matKhauCu)
    {
       String sql="update TaiKhoan set MatKhau='"+matKhauMoi+"'where MatKhau='"+matKhauCu+"' and TenDN='"+tenDN+"'";
       return dal.UpdateData(sql);
    }
    
}
