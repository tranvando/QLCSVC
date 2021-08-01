package BLL;

import java.sql.ResultSet;

public class GiaoDichBLL
{
    public ResultSet loadGD(String loaiGD) //trả về list giao dịch
    {
        String sql = "select * from GiaoDich where LoaiGD=N'"+loaiGD+"'";
        return dal.getResult(sql);
    }
}