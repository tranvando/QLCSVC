
package BLL;

import DAL.DAL;
import java.sql.ResultSet;

public class ThongKeBLL {
     DAL dal = new DAL();
     public ResultSet tk1(String MaTB)
    {
        String sql="select MaTB,TenTB,SoLuong from ThietBi where SoLuong>0"; 
        if(!MaTB.equals("All"))
            sql="select MaTB,TenTB,SoLuong from ThietBi where SoLuong>0 and MaTB='"+MaTB+"'";
        return dal.getResult(sql);
    }
      public ResultSet tk2(String MaTB)
    {
        String sql="select MaTB,TenTB,SoLuong-SoLuongHong as SoLuong from ThietBi where SoLuong>0";
        if(!MaTB.equals("All"))
            sql="select MaTB,TenTB,SoLuong-SoLuongHong as SoLuong from ThietBi where SoLuong>0 and MaTB='"+MaTB+"'";
        return dal.getResult(sql);
    }
    public ResultSet tk3(String MaTB)
    {
        String sql="select MaTB,TenTB,SoLuongHong as SoLuong from ThietBi where SoLuong>0";
        if(!MaTB.equals("All"))
            sql="select MaTB,TenTB,SoLuongHong as SoLuong from ThietBi where SoLuong>0 and MaTB='"+MaTB+"'";
        return dal.getResult(sql);
    }
    public ResultSet tk4(String MaTB)
    {
        String sql="select LichSu.MaTB,TenTB,sum(LichSu.SoLuong) as SoLuong from ThietBi,GiaoDich,LichSu where ThietBi.MaTB=LichSu.MaTB and LichSu.MaGD=GiaoDich.MaGD and GiaoDich.LoaiGD=N'Thanh lý thiết bị' GROUP by MaTB";
        if(!MaTB.equals("All"))
            sql="select LichSu.MaTB,TenTB,sum(LichSu.SoLuong) as SoLuong from ThietBi,GiaoDich,LichSu where ThietBi.MaTB=LichSu.MaTB and LichSu.MaGD=GiaoDich.MaGD and GiaoDich.LoaiGD=N'Thanh lý thiết bị' and LichSu.MaTB='"+MaTB+"' GROUP by MaTB";
        return dal.getResult(sql);
    }
    
       ///////////////////
    public ResultSet tk5(String MaTB,String Phong)
    {
        String sql="select ThietBi.MaTB,TenTB,SL as SoLuong from ThietBi,Phong,TbPhong where ThietBi.MaTB=TBPhong.MaTB and TbPhong.MaPhong=Phong.MaPhong and Phong.TenPhong=N'"+Phong+"'";
        if(!MaTB.equals("All"))
            sql="select ThietBi.MaTB,TenTB,SL as SoLuong from ThietBi,Phong,TbPhong where ThietBi.MaTB=TBPhong.MaTB and TbPhong.MaPhong=Phong.MaPhong and Phong.TenPhong=N'"+Phong+"' and ThietBi.MaTB='"+MaTB+"'";
        return dal.getResult(sql);
    }
    public ResultSet tk6(String MaTB,String Phong)
    {
        String sql="select ThietBi.MaTB,TenTB,SL-SLHong as SoLuong from ThietBi,Phong,TbPhong where ThietBi.MaTB=TBPhong.MaTB and TbPhong.MaPhong=Phong.MaPhong and Phong.TenPhong=N'"+Phong+"'";
        if(!MaTB.equals("All"))
            sql="select ThietBi.MaTB,TenTB,SL-SLHong as SoLuong from ThietBi,Phong,TbPhong where ThietBi.MaTB=TBPhong.MaTB and TbPhong.MaPhong=Phong.MaPhong and Phong.TenPhong=N'"+Phong+"' and ThietBi.MaTB='"+MaTB+"'";
        return dal.getResult(sql);
    }
    public ResultSet tk7(String MaTB,String Phong)
    {
        String sql="select ThietBi.MaTB,TenTB,SLHong as SoLuong from ThietBi,Phong,TbPhong where ThietBi.MaTB=TBPhong.MaTB and TbPhong.MaPhong=Phong.MaPhong and Phong.TenPhong=N'"+Phong+"'";
        if(!MaTB.equals("All"))
            sql="select ThietBi.MaTB,TenTB,SLHong as SoLuong from ThietBi,Phong,TbPhong where ThietBi.MaTB=TBPhong.MaTB and TbPhong.MaPhong=Phong.MaPhong and Phong.TenPhong=N'"+Phong+"' and ThietBi.MaTB='"+MaTB+"'";
        return dal.getResult(sql);
    }
}
