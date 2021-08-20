
package BLL;

import DAL.DAL;
import DTO.PhongDTO;
import DTO.ThietBiPhongDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PhongBLL {
    DAL dal = new DAL();

    public ResultSet loadPhong() //trả về list thiết bị
    {
        String sql = "select * from Phong";
        return dal.getResult(sql);
    }
    public int ThemPhong(String MaPhong, String TenPhong)
    {
        String sql = "insert into Phong values('"+MaPhong+"',N'"+TenPhong+"')";
        return dal.UpdateData(sql);
    }
    public int SuaPhong(String MaPhong, String TenPhong)
    {
        String sql = "update Phong set TenPhong='"+TenPhong+"' where MaPhong='"+MaPhong+"'";
        return dal.UpdateData(sql);
    }
    public int XoaPhong(String MaPhong)
    {
        String sql ="delete from Phong where MaPhong='"+MaPhong+"'";
        return dal.UpdateData(sql);
    }
    public ResultSet getTbMaPhong(String MaPhong) {
            String sql = "select MaTB from TBPhong where MaPhong='"+MaPhong+"'";
            return dal.getResult(sql);
    }
    public ResultSet loadTbPhong(String MaPhong)
    {
        String sql = "select TBPhong.MaTB, ThietBi.TenTB,TBPhong.SL,TBPhong.SLHong from ThietBi,TBPhong,Phong where ThietBi.MaTB=TBPhong.MaTB and TBPhong.MaPhong=Phong.MaPhong and TBPhong.MaPhong='"+MaPhong+"'";
        return  dal.getResult(sql);
    }
     public int CapNhatSLHong(String MaPhong, String MaTB, int SLHong)
    {
        String sql = "update TBPhong set SLHong="+SLHong+" where MaTB='"+MaTB+"' and MaPhong='"+MaPhong+"'";
        return dal.UpdateData(sql);
    }          
}
