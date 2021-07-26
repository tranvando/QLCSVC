package BLL;

import DAL.DAL;
import DTO.GiaoDichDTO;
import DTO.KhoDTO;
import DTO.LichSuDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GiaoDichBLL {

    DAL dal = new DAL();
    public int GiaoDich(String LoaiGD, String MaPhong,String ThoiGian, String NguoiTH) {
        int ma=MaGD()+1;
        String sql = "insert into GiaoDich values("+ma+",'"+MaPhong+"','"+ThoiGian+"',N'"+LoaiGD+"',N'"+NguoiTH+"')";
        //String sql = "insert into GiaoDich(MaGD,MaPhong,ThoiGian,LoaiGD) select MaGD="+ma+"',MaPhong=(select DBO.KTMa(N'"+TenPhong+"')),ThoiGian='"+ThoiGian+"',LoaiGD=N'"+LoaiGD+"')";
        return dal.UpdateData(sql);
    }
    public int GiaoDichThem(String LoaiGD,String ThoiGian, String NguoiTH) {
        int ma=MaGD()+1;
        String sql = "insert into GiaoDich(MaGD,ThoiGian,LoaiGD,NguoiTH) values("+ma+",'"+ThoiGian+"',N'"+LoaiGD+"',N'"+NguoiTH+"')";
        return dal.UpdateData(sql);
    }
    public int MaGD() {
        int so=0;
        try {
            String sql = "select max(MaGD) as MaGDNew from GiaoDich"; 
            ResultSet rs = dal.getResult(sql);
            while (rs.next()){
            so=rs.getInt("MaGDNew");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return so;
    }

    public int LichSu(String MaTB,int SL, int DonGia, String TinhTrang, String MoTa)
    {
        int ma = MaGD();
        String sql = "insert into LichSu values('"+MaTB+"',"+ma+",N'"+TinhTrang+"',N'"+MoTa+"',"+SL+","+DonGia+")";
        return dal.UpdateData(sql);
    }
    public ResultSet loadGD(String loaiGD) //trả về list giao dịch
    {
        String sql = "select * from GiaoDich where LoaiGD=N'"+loaiGD+"'";
        return dal.getResult(sql);
    }
    public ResultSet loadLichSu(int MaGD) //trả về các thiết bị trong bảng lịch sứ
    {
        String sql = "select ThietBi.MaTB ,ThietBi.TenTB,LichSu.TinhTrang, LichSu.MoTa, LichSu.SoLuong, LichSu.DonGia from ThietBi,LichSu,GiaoDich where ThietBi.MaTB=LichSu.MaTB and LichSu.MaGD=GiaoDich.MaGD and GiaoDich.MaGD="+MaGD+"";
        return dal.getResult(sql);
    }
    //////////////Lưu kho////////////////////
    public int xoaTBPhong(String MaTB) //xóa thiết bị có tổng số lượng = 0
    {
        String sql = "delete from TBPhong where MaTB='"+MaTB+"' and SL=0";
        return dal.UpdateData(sql);
    }
    public int ThucHien(String MaPhong, String MaTB,int SL,String TinhTrang) 
    {
        String sql="update TBPhong set SL=SL-"+SL+" where MaTB='"+MaTB+"' and MaPhong='"+MaPhong+"'";
        if(TinhTrang.equals("Hỏng"))
            sql="update TBPhong set SL=SL-"+SL+", SLHong=SLHong-"+SL+" where MaTB='"+MaTB+"' and MaPhong='"+MaPhong+"'";
        return dal.UpdateData(sql);
    }
    public int THLuKho(String MaPhong, String MaTB,int SL,String TinhTrang)
    {
        String sql="update ThietBi set SoLuong=SoLuong+"+SL+", SoLuongChoMuon=SoLuongChoMuon-"+SL+" where MaTB='"+MaTB+"' ";
        if(TinhTrang.equals("Hỏng"))
            sql="update ThietBi set SoLuong=SoLuong+"+SL+",SoLuongChoMuon=SoLuongChoMuon-"+SL+",SoLuongHong=SoLuongHong+"+SL+" where MaTB='"+MaTB+"' ";
        ThucHien(MaPhong, MaTB, SL, TinhTrang);
        xoaTBPhong(MaTB);
        return dal.UpdateData(sql);
    }
    ///////////////
    
    //Chuyển thiết bị
    public int KtTBPhong(String MaTB) //Kiểm tra xem phòng đó đã có thiết bị chưa
    {
        int so=0;
        try {
            String sql = "select * from TBPhong where MaTB='"+MaTB+"'";
            ResultSet rs = dal.getResult(sql);
            if(rs.isBeforeFirst())
                so=1;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return so;
    }
    /*public int THChuyen(String MaPhong, String MaTB,int SL)
    {
        String sql="update ThietBi set SoLuong=SoLuong-"+SL+", SoLuongChoMuon=SoLuongChoMuon+"+SL+" where MaTB='"+MaTB+"';  "+
        "update TBPhong set SL=SL+"+SL+" where MaTB='"+MaTB+"' and MaPhong='"+MaPhong+"'";     
        if(KtTBPhong(MaTB)==0)
            sql="update ThietBi set SoLuong=SoLuong-"+SL+", SoLuongChoMuon=SoLuongChoMuon+"+SL+" where MaTB='"+MaTB+"'; "+
                 "insert into TBPhong values('"+MaTB+"','"+MaPhong+"',"+SL+",0)";
        return dal.UpdateData(sql);
    }*/
     public int TH(String MaPhong, String MaTB,int SL)
    {
        String sql= "update TBPhong set SL=SL+"+SL+" where MaTB='"+MaTB+"' and MaPhong='"+MaPhong+"'";     
        if(KtTBPhong(MaTB)==0)
            sql= "insert into TBPhong values('"+MaTB+"','"+MaPhong+"',"+SL+",0)";
        return dal.UpdateData(sql);
    }
     public int THChuyen(String MaPhong, String MaTB,int SL)
    {
        String sql="update ThietBi set SoLuong=SoLuong-"+SL+", SoLuongChoMuon=SoLuongChoMuon+"+SL+" where MaTB='"+MaTB+"'";
        //TH(MaPhong, MaTB, SL);
        return dal.UpdateData(sql);
    }
    
    
    //Thanh lý thiết bị 
    public int THThanhLy(String MaTB,int SL,String TinhTrang)
    {
        String sql="update ThietBi set SoLuong=SoLuong-"+SL+" where MaTB='"+MaTB+"'";
        if(TinhTrang.equals("Hỏng"))
            sql="update ThietBi set SoLuong=SoLuong-"+SL+", SoLuongHong=SoLuongHong-"+SL+" where MaTB='"+MaTB+"'";
        return dal.UpdateData(sql);
    }
}
