package BLL;

import DAL.DAL;
import java.sql.ResultSet;
import java.sql.SQLException;

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
        public int LichSu(String MaTB,int SL, int DonGia, String TinhTrang, String MoTa)
    {
        int ma = MaGD();
        String sql = "insert into LichSu values('"+MaTB+"',"+ma+",N'"+TinhTrang+"',N'"+MoTa+"',"+SL+","+DonGia+")";
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
}
