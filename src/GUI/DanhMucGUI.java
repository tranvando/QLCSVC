/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.SQLException;
import BLL.GiaoDichBLL;
import BLL.KhoBLL;
import BLL.PhongBLL;
import BLL.TaiKhoanBLL;
import BLL.ThongKeBLL;
import CustomTable.FormatRenderer;
import CustomTable.NumberRenderer;
import CustomTable.TableGiaoDich;
import CustomTable.TableKho;
import CustomTable.TableLichSu;
import CustomTable.TablePhong;
import CustomTable.TableTBPhong;
import DTO.GiaoDichDTO;
import DTO.KhoDTO;
import DTO.LichSuDTO;
import DTO.PhongDTO;
import DTO.CacGiaoDichDTO;
import DTO.TBThongKeDTO;
import DTO.TaiKhoanDTO;
import DTO.ThietBiPhongDTO;
import DTO.jPanelCacLoaiGD;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;


public class DanhMucGUI extends javax.swing.JFrame {

    TaiKhoanBLL TaiKhoanBLL = new TaiKhoanBLL();
    KhoBLL KhoBLL = new KhoBLL();
    GiaoDichBLL GiaoDichBLL = new GiaoDichBLL();
    PhongBLL PhongBLL = new PhongBLL();

    long millis = System.currentTimeMillis();
    Date date = new java.sql.Date(millis);
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    String strDate = formatter.format(date);//Lấy ngày hiện tại

    String TenDangNhap;
    String TenNhanVien;
    String ChucVuNV;
   
    public DanhMucGUI() {
        initComponents();
    }
    public DanhMucGUI(String TenDN, String TenNV, String ChucVu) {
        initComponents();
        TenDangNhap=TenDN;//lấy thông tin tài khoản
        TenNhanVien=TenNV;
        ChucVuNV=ChucVu;
        
        loadUser();//hiển thị thông tin user
      
        setLocationRelativeTo(null);
        txtMaPhongLuu.setEditable(false);
        txtMaTBLuu.setEditable(false);
        jTabbedPaneMain.setSelectedIndex(4);
        btnTrangChu.setBackground(colorClick);
        setJtable();
        ImageIcon icon = new ImageIcon("src/Icon/truong1.png");
        btnLogo.setIcon(icon);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenu = new javax.swing.JPanel();
        btnTrangChu = new javax.swing.JButton();
        btnKho = new javax.swing.JButton();
        btnPhongBan = new javax.swing.JButton();
        btnGiaoDich = new javax.swing.JButton();
        btnDoiMK = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        jTabbedPaneMain = new javax.swing.JTabbedPane();
        jPanelKho = new javax.swing.JPanel();
        jTabbedPaneThaoTac = new javax.swing.JTabbedPane();
        jPanelThemThietBi = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCauHinh = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtMaTB = new javax.swing.JTextField();
        txtTenTB = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        jLabel24 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnThemTb = new javax.swing.JButton();
        btnSuaThietBi = new javax.swing.JButton();
        jPanelChuyenThietBi = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanelTbChuyen = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbbPhongChuyen = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        btnThemTbChuyen = new javax.swing.JButton();
        btnChuyenTb = new javax.swing.JButton();
        jPanelThanhLy = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanelLoatDongTB = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnThanhLy = new javax.swing.JButton();
        btnThemDongTB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableThietBi = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanelPhongBan = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        txtMaPhong = new javax.swing.JTextField();
        txtTenPhong = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTablePhong = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        btnThemPhong = new javax.swing.JButton();
        btnSuaPhong = new javax.swing.JButton();
        btnXoaPhong = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        cbbTenPhong = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableTbPhong = new javax.swing.JTable();
        txtSLHong = new javax.swing.JTextField();
        btnSLHong = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtMaPhongLuu = new javax.swing.JTextField();
        txtMaTBLuu = new javax.swing.JTextField();
        cbbTinhTrangLuu = new javax.swing.JComboBox<>();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtLyDoLuu = new javax.swing.JTextArea();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txtSLLuuKho = new javax.swing.JTextField();
        btnLuuKho = new javax.swing.JButton();
        jPanelMatKhau = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnDoiPass = new javax.swing.JButton();
        txtPassMKCu = new javax.swing.JPasswordField();
        txtPassMKMoi = new javax.swing.JPasswordField();
        txtPassMKNhapLai = new javax.swing.JPasswordField();
        jPanelGiaoDich = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableGiaoDich = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableChiTietGD = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblMaGD = new javax.swing.JLabel();
        lblTenGD = new javax.swing.JLabel();
        lblThoiGian = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        lblNguoiTH = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        cbbTKLoaiGD = new javax.swing.JComboBox<>();
        jPanelMain = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        lblTenNV = new javax.swing.JLabel();
        lblChucVu = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTableThongKe = new javax.swing.JTable();
        cbbTkMa = new javax.swing.JComboBox<>();
        cbbTkPhong = new javax.swing.JComboBox<>();
        cbbTkTinhTrang = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        btnLogo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1055, 650));
        setPreferredSize(new java.awt.Dimension(1055, 613));
        setResizable(false);

        jPanelMenu.setBackground(new java.awt.Color(204, 255, 255));
        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTrangChu.setBackground(new java.awt.Color(102, 102, 255));
        btnTrangChu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTrangChu.setForeground(new java.awt.Color(255, 255, 255));
        btnTrangChu.setText("Trang chủ");
        btnTrangChu.setPreferredSize(new java.awt.Dimension(134, 50));
        btnTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTrangChuMousePressed(evt);
            }
        });
        btnTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangChuActionPerformed(evt);
            }
        });
        jPanelMenu.add(btnTrangChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 140, -1));

        btnKho.setBackground(new java.awt.Color(102, 102, 255));
        btnKho.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnKho.setForeground(new java.awt.Color(255, 255, 255));
        btnKho.setText("Kho thiết bị");
        btnKho.setPreferredSize(new java.awt.Dimension(134, 50));
        btnKho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnKhoMousePressed(evt);
            }
        });
        btnKho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoActionPerformed(evt);
            }
        });
        jPanelMenu.add(btnKho, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 140, -1));

        btnPhongBan.setBackground(new java.awt.Color(102, 102, 255));
        btnPhongBan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPhongBan.setForeground(new java.awt.Color(255, 255, 255));
        btnPhongBan.setText("Phòng/Lớp");
        btnPhongBan.setPreferredSize(new java.awt.Dimension(120, 50));
        btnPhongBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPhongBanMousePressed(evt);
            }
        });
        btnPhongBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhongBanActionPerformed(evt);
            }
        });
        jPanelMenu.add(btnPhongBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 140, -1));

        btnGiaoDich.setBackground(new java.awt.Color(102, 102, 255));
        btnGiaoDich.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGiaoDich.setForeground(new java.awt.Color(255, 255, 255));
        btnGiaoDich.setText("Giao Dịch");
        btnGiaoDich.setPreferredSize(new java.awt.Dimension(120, 50));
        btnGiaoDich.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGiaoDichMousePressed(evt);
            }
        });
        btnGiaoDich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaoDichActionPerformed(evt);
            }
        });
        jPanelMenu.add(btnGiaoDich, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 140, -1));

        btnDoiMK.setBackground(new java.awt.Color(102, 102, 255));
        btnDoiMK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDoiMK.setForeground(new java.awt.Color(255, 255, 255));
        btnDoiMK.setText("Mật khẩu");
        btnDoiMK.setPreferredSize(new java.awt.Dimension(120, 50));
        btnDoiMK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDoiMKMousePressed(evt);
            }
        });
        btnDoiMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMKActionPerformed(evt);
            }
        });
        jPanelMenu.add(btnDoiMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 140, -1));

        btnDangXuat.setBackground(new java.awt.Color(102, 102, 255));
        btnDangXuat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setPreferredSize(new java.awt.Dimension(120, 50));
        btnDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDangXuatMousePressed(evt);
            }
        });
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        jPanelMenu.add(btnDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 140, -1));

        btnThongKe.setBackground(new java.awt.Color(102, 102, 255));
        btnThongKe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThongKe.setForeground(new java.awt.Color(255, 255, 255));
        btnThongKe.setText("Thống kê");
        btnThongKe.setPreferredSize(new java.awt.Dimension(120, 50));
        btnThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnThongKeMousePressed(evt);
            }
        });
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });
        jPanelMenu.add(btnThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 140, -1));

        jTabbedPaneMain.setTabPlacement(javax.swing.JTabbedPane.RIGHT);

        jTabbedPaneThaoTac.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtCauHinh.setColumns(20);
        txtCauHinh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCauHinh.setRows(5);
        jScrollPane2.setViewportView(txtCauHinh);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Đơn giá");

        txtDonGia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDonGia.setPreferredSize(new java.awt.Dimension(10, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Mã thiết bị");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Tên thiết bị");

        txtMaTB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMaTB.setPreferredSize(new java.awt.Dimension(15, 30));

        txtTenTB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTenTB.setPreferredSize(new java.awt.Dimension(10, 30));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Số lượng");

        txtSoLuong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSoLuong.setPreferredSize(new java.awt.Dimension(10, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Cấu hình");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Mô tả");

        txtMoTa.setColumns(20);
        txtMoTa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMoTa.setRows(5);
        jScrollPane3.setViewportView(txtMoTa);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel24.setText("Thêm thiết bị");

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnThemTb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThemTb.setText("Thêm ");
        btnThemTb.setPreferredSize(new java.awt.Dimension(95, 25));
        btnThemTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemTbActionPerformed(evt);
            }
        });
        jPanel2.add(btnThemTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 40));

        btnSuaThietBi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSuaThietBi.setText("Cập nhật");
        btnSuaThietBi.setPreferredSize(new java.awt.Dimension(95, 25));
        btnSuaThietBi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaThietBiActionPerformed(evt);
            }
        });
        jPanel2.add(btnSuaThietBi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 40));

        javax.swing.GroupLayout jPanelThemThietBiLayout = new javax.swing.GroupLayout(jPanelThemThietBi);
        jPanelThemThietBi.setLayout(jPanelThemThietBiLayout);
        jPanelThemThietBiLayout.setHorizontalGroup(
            jPanelThemThietBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelThemThietBiLayout.createSequentialGroup()
                .addGroup(jPanelThemThietBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelThemThietBiLayout.createSequentialGroup()
                        .addGroup(jPanelThemThietBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelThemThietBiLayout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelThemThietBiLayout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelThemThietBiLayout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelThemThietBiLayout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelThemThietBiLayout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addGroup(jPanelThemThietBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelThemThietBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenTB, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaTB, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelThemThietBiLayout.createSequentialGroup()
                                .addGroup(jPanelThemThietBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelThemThietBiLayout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(228, 228, 228))
        );
        jPanelThemThietBiLayout.setVerticalGroup(
            jPanelThemThietBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelThemThietBiLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel24)
                .addGap(6, 6, 6)
                .addGroup(jPanelThemThietBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(6, 6, 6)
                .addGroup(jPanelThemThietBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(6, 6, 6)
                .addGroup(jPanelThemThietBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelThemThietBiLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel22))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanelThemThietBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelThemThietBiLayout.createSequentialGroup()
                        .addGroup(jPanelThemThietBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelThemThietBiLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel23))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanelThemThietBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelThemThietBiLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel18))
                            .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanelThemThietBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelThemThietBiLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel21))
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneThaoTac.addTab("Thêm thiết bị", jPanelThemThietBi);

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Mã thiết bị");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Số lượng ");

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanelTbChuyenLayout = new javax.swing.GroupLayout(jPanelTbChuyen);
        jPanelTbChuyen.setLayout(jPanelTbChuyenLayout);
        jPanelTbChuyenLayout.setHorizontalGroup(
            jPanelTbChuyenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 473, Short.MAX_VALUE)
        );
        jPanelTbChuyenLayout.setVerticalGroup(
            jPanelTbChuyenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTbChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelTbChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 242, Short.MAX_VALUE))
        );

        jScrollPane9.setViewportView(jPanel1);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Chọn phòng:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Chuyển thiết bị đến phòng");

        cbbPhongChuyen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnThemTbChuyen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThemTbChuyen.setText("Thêm");
        btnThemTbChuyen.setMinimumSize(new java.awt.Dimension(70, 25));
        btnThemTbChuyen.setPreferredSize(new java.awt.Dimension(80, 30));
        btnThemTbChuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemTbChuyenActionPerformed(evt);
            }
        });

        btnChuyenTb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnChuyenTb.setText("Chuyển");
        btnChuyenTb.setPreferredSize(new java.awt.Dimension(80, 30));
        btnChuyenTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenTbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnChuyenTb, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemTbChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(btnThemTbChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnChuyenTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelChuyenThietBiLayout = new javax.swing.GroupLayout(jPanelChuyenThietBi);
        jPanelChuyenThietBi.setLayout(jPanelChuyenThietBiLayout);
        jPanelChuyenThietBiLayout.setHorizontalGroup(
            jPanelChuyenThietBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelChuyenThietBiLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(jPanelChuyenThietBiLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel5)
                .addContainerGap(592, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelChuyenThietBiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelChuyenThietBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelChuyenThietBiLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbbPhongChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelChuyenThietBiLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(138, 138, 138)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(592, 592, 592))
        );
        jPanelChuyenThietBiLayout.setVerticalGroup(
            jPanelChuyenThietBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChuyenThietBiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanelChuyenThietBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbPhongChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addGroup(jPanelChuyenThietBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelChuyenThietBiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addGroup(jPanelChuyenThietBiLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTabbedPaneThaoTac.addTab("Chuyển thiết bị", jPanelChuyenThietBi);

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanelLoatDongTBLayout = new javax.swing.GroupLayout(jPanelLoatDongTB);
        jPanelLoatDongTB.setLayout(jPanelLoatDongTBLayout);
        jPanelLoatDongTBLayout.setHorizontalGroup(
            jPanelLoatDongTBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        jPanelLoatDongTBLayout.setVerticalGroup(
            jPanelLoatDongTBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanelLoatDongTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(485, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanelLoatDongTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 329, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(jPanel3);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Thanh lý thiết bị");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Mã thiết bị");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Lý do");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Số lượng");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Đơn giá");

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setText("Tình trạng");

        btnThanhLy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThanhLy.setText("Thanh lý");
        btnThanhLy.setPreferredSize(new java.awt.Dimension(80, 30));
        btnThanhLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhLyActionPerformed(evt);
            }
        });

        btnThemDongTB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThemDongTB.setText("Thêm");
        btnThemDongTB.setPreferredSize(new java.awt.Dimension(80, 30));
        btnThemDongTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemDongTBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnThemDongTB, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThanhLy, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(btnThemDongTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnThanhLy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelThanhLyLayout = new javax.swing.GroupLayout(jPanelThanhLy);
        jPanelThanhLy.setLayout(jPanelThanhLyLayout);
        jPanelThanhLyLayout.setHorizontalGroup(
            jPanelThanhLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelThanhLyLayout.createSequentialGroup()
                .addGroup(jPanelThanhLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelThanhLyLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelThanhLyLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanelThanhLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelThanhLyLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(30, 30, 30))
        );
        jPanelThanhLyLayout.setVerticalGroup(
            jPanelThanhLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelThanhLyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(31, 31, 31)
                .addGroup(jPanelThanhLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10)
                    .addComponent(jLabel40)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelThanhLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addGroup(jPanelThanhLyLayout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTabbedPaneThaoTac.addTab("Thanh lý thiết bị", jPanelThanhLy);

        jTableThietBi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableThietBi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableThietBi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableThietBiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableThietBi);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("THIẾT BỊ TRONG KHO");

        javax.swing.GroupLayout jPanelKhoLayout = new javax.swing.GroupLayout(jPanelKho);
        jPanelKho.setLayout(jPanelKhoLayout);
        jPanelKhoLayout.setHorizontalGroup(
            jPanelKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneThaoTac, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanelKhoLayout.createSequentialGroup()
                .addGroup(jPanelKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelKhoLayout.setVerticalGroup(
            jPanelKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelKhoLayout.createSequentialGroup()
                .addComponent(jTabbedPaneThaoTac, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneMain.addTab("", jPanelKho);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jPanel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Mã phòng");

        txtMaPhong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtTenPhong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Tên phòng");

        jTablePhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTablePhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePhongMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(jTablePhong);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel30.setText("Quản lý phòng");

        btnThemPhong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThemPhong.setText("Thêm");
        btnThemPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemPhongActionPerformed(evt);
            }
        });

        btnSuaPhong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSuaPhong.setText("Sửa");
        btnSuaPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaPhongActionPerformed(evt);
            }
        });

        btnXoaPhong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXoaPhong.setText("Xóa");
        btnXoaPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaPhongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(btnThemPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSuaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnXoaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtMaPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                                    .addComponent(txtTenPhong)))
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(270, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel30)
                .addGap(44, 44, 44)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemPhong)
                    .addComponent(btnSuaPhong)
                    .addComponent(btnXoaPhong))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Quản lý phòng", jPanel4);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel26.setText("Thiết bị trong phòng");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Phòng:");

        cbbTenPhong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbbTenPhong.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbTenPhongItemStateChanged(evt);
            }
        });

        jTableTbPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableTbPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTbPhongMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTableTbPhong);

        txtSLHong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnSLHong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSLHong.setText("Cập nhật");
        btnSLHong.setPreferredSize(new java.awt.Dimension(80, 25));
        btnSLHong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSLHongActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Số lượng hỏng");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel33.setText("Lưu kho");

        txtMaPhongLuu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtMaTBLuu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cbbTinhTrangLuu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbbTinhTrangLuu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hỏng", "Tốt" }));

        txtLyDoLuu.setColumns(20);
        txtLyDoLuu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLyDoLuu.setRows(5);
        jScrollPane10.setViewportView(txtLyDoLuu);

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("Mã phòng");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("Mã thiết bị");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("Tình trạng");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("Lý do lưu");

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("Số lượng");

        txtSLLuuKho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaTBLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaPhongLuu)
                    .addComponent(cbbTinhTrangLuu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSLLuuKho)
                    .addComponent(jScrollPane10))
                .addGap(55, 55, 55))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel35))
                    .addComponent(txtMaPhongLuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel36))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMaTBLuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbTinhTrangLuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(txtSLLuuKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addContainerGap())
        );

        btnLuuKho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLuuKho.setText("Lưu kho");
        btnLuuKho.setPreferredSize(new java.awt.Dimension(80, 30));
        btnLuuKho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuKhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnLuuKho, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSLHong, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel31)
                                    .addComponent(btnSLHong, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbbTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel26)
                .addGap(14, 14, 14)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSLHong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSLHong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(67, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLuuKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))))
        );

        jTabbedPane1.addTab("Quản lý thiết bị phòng", jPanel6);

        javax.swing.GroupLayout jPanelPhongBanLayout = new javax.swing.GroupLayout(jPanelPhongBan);
        jPanelPhongBan.setLayout(jPanelPhongBanLayout);
        jPanelPhongBanLayout.setHorizontalGroup(
            jPanelPhongBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanelPhongBanLayout.setVerticalGroup(
            jPanelPhongBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPhongBanLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPaneMain.addTab("", jPanelPhongBan);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("CẬP NHẬT MẬT KHẨU");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Nhập lại");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Mật khẩu mới");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Mật khẩu cũ");

        btnDoiPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDoiPass.setText("Đổi mật khẩu");
        btnDoiPass.setPreferredSize(new java.awt.Dimension(120, 30));
        btnDoiPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiPassActionPerformed(evt);
            }
        });

        txtPassMKCu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtPassMKMoi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtPassMKNhapLai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanelMatKhauLayout = new javax.swing.GroupLayout(jPanelMatKhau);
        jPanelMatKhau.setLayout(jPanelMatKhauLayout);
        jPanelMatKhauLayout.setHorizontalGroup(
            jPanelMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMatKhauLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelMatKhauLayout.createSequentialGroup()
                        .addGroup(jPanelMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDoiPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassMKNhapLai, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassMKCu, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelMatKhauLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(txtPassMKMoi))))
                .addGap(0, 490, Short.MAX_VALUE))
        );
        jPanelMatKhauLayout.setVerticalGroup(
            jPanelMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMatKhauLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel13)
                .addGap(23, 23, 23)
                .addGroup(jPanelMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassMKCu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassMKMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanelMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassMKNhapLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDoiPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(428, Short.MAX_VALUE))
        );

        jTabbedPaneMain.addTab("", jPanelMatKhau);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Lịch sử giao dịch");

        jTableGiaoDich.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableGiaoDich.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableGiaoDich.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableGiaoDichMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTableGiaoDich);

        jTableChiTietGD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableChiTietGD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(jTableChiTietGD);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Giao dịch: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Thời gian:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Mã GD:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("Chi tiết giao dịch");

        lblMaGD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMaGD.setText(".");

        lblTenGD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTenGD.setText(".");

        lblThoiGian.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblThoiGian.setText(".");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Người thực hiện:");

        lblNguoiTH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNguoiTH.setText(".");

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setText("Loại giao dịch:");

        cbbTKLoaiGD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbbTKLoaiGD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thêm thiết bị vào kho", "Cập nhật thiết bị", "Chuyển thiết bị", "Thanh lý thiết bị", "Lưu kho" }));
        cbbTKLoaiGD.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbTKLoaiGDItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanelGiaoDichLayout = new javax.swing.GroupLayout(jPanelGiaoDich);
        jPanelGiaoDich.setLayout(jPanelGiaoDichLayout);
        jPanelGiaoDichLayout.setHorizontalGroup(
            jPanelGiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGiaoDichLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelGiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(jPanelGiaoDichLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanelGiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelGiaoDichLayout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(46, 46, 46))
                            .addGroup(jPanelGiaoDichLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMaGD, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTenGD, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(159, 159, 159))
                            .addGroup(jPanelGiaoDichLayout.createSequentialGroup()
                                .addGroup(jPanelGiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelGiaoDichLayout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblNguoiTH, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelGiaoDichLayout.createSequentialGroup()
                        .addGroup(jPanelGiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelGiaoDichLayout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelGiaoDichLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanelGiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelGiaoDichLayout.createSequentialGroup()
                                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbbTKLoaiGD, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(241, 241, 241)))
                .addContainerGap())
        );
        jPanelGiaoDichLayout.setVerticalGroup(
            jPanelGiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGiaoDichLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addGap(22, 22, 22)
                .addGroup(jPanelGiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(cbbTKLoaiGD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanelGiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lblNguoiTH))
                .addGap(21, 21, 21)
                .addGroup(jPanelGiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(lblMaGD)
                    .addComponent(lblThoiGian)
                    .addComponent(lblTenGD))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneMain.addTab("", jPanelGiaoDich);

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel45.setText("Họ tên: ");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel46.setText("Thông tin tài khoản quản lý");

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel49.setText("Chức vụ:");

        lblTenNV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTenNV.setText(".");

        lblChucVu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblChucVu.setText(".");

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49)
                            .addComponent(jLabel45))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTenNV, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                            .addComponent(lblChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(284, Short.MAX_VALUE))
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel46)
                .addGap(31, 31, 31)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(lblTenNV))
                .addGap(35, 35, 35)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(lblChucVu))
                .addContainerGap(400, Short.MAX_VALUE))
        );

        jTabbedPaneMain.addTab("", jPanelMain);

        jTableThongKe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableThongKe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã", "Tên thiết bị", "Số lượng", "Phòng/lớp", "Tình trạng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane11.setViewportView(jTableThongKe);
        if (jTableThongKe.getColumnModel().getColumnCount() > 0) {
            jTableThongKe.getColumnModel().getColumn(0).setPreferredWidth(65);
            jTableThongKe.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTableThongKe.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTableThongKe.getColumnModel().getColumn(3).setPreferredWidth(150);
            jTableThongKe.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        cbbTkMa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbbTkMa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbTkMa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbTkMaItemStateChanged(evt);
            }
        });

        cbbTkPhong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbbTkPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbTkPhong.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbTkPhongItemStateChanged(evt);
            }
        });

        cbbTkTinhTrang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbbTkTinhTrang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Tốt", "Hỏng", "Thanh lý" }));
        cbbTkTinhTrang.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbTkTinhTrangItemStateChanged(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel42.setText("Thống kê thiết bị");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(cbbTkMa, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbbTkPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(cbbTkTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbTkMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbTkPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbTkTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );

        jTabbedPaneMain.addTab("", jPanel9);

        btnLogo.setBackground(new java.awt.Color(204, 255, 255));
        btnLogo.setPreferredSize(new java.awt.Dimension(113, 113));
        btnLogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jTabbedPaneMain, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jTabbedPaneMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPaneMain.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void setJtable()//set font cho chữ cho jtable
    {
        JTableHeader tableHeader1 = jTableThietBi.getTableHeader();
        JTableHeader tableHeader2 = jTablePhong.getTableHeader();
        JTableHeader tableHeader3 = jTableTbPhong.getTableHeader();
        JTableHeader tableHeader4 = jTableGiaoDich.getTableHeader();
        JTableHeader tableHeader5 = jTableChiTietGD.getTableHeader();
        JTableHeader tableHeader6 = jTableThongKe.getTableHeader();
        
        tableHeader1.setBackground(Color.black);
        tableHeader1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        tableHeader2.setFont(new Font("Tahoma", Font.BOLD, 14));
        tableHeader3.setFont(new Font("Tahoma", Font.BOLD, 14));
        tableHeader4.setFont(new Font("Tahoma", Font.BOLD, 14));
        tableHeader5.setFont(new Font("Tahoma", Font.BOLD, 14));
        tableHeader6.setFont(new Font("Tahoma", Font.BOLD, 14));
        
        jTableThietBi.setFont(new Font("Tahoma", Font.PLAIN, 14));
        jTablePhong.setFont(new Font("Tahoma", Font.PLAIN, 14));
        jTableTbPhong.setFont(new Font("Tahoma", Font.PLAIN, 14));
        jTableGiaoDich.setFont(new Font("Tahoma", Font.PLAIN, 14));
        jTableChiTietGD.setFont(new Font("Tahoma", Font.PLAIN, 14));
        jTableThongKe.setFont(new Font("Tahoma", Font.PLAIN, 14));
    }
    
    
    ////////////////////////////////////////
    //Đổi mật khẩu/////////////////////////////////////////////////////////////////////////////////
    public boolean KtPassCu() throws SQLException
    {
        String MkCuNhap = String.valueOf(txtPassMKCu.getPassword());
        ResultSet rs = TaiKhoanBLL.getTaiKhoan(TenDangNhap, MkCuNhap);
        while(rs.next())
        {
            String MkCuCSDL=rs.getString("MatKhau");
            if(MkCuNhap.equals(MkCuCSDL))
               return true;
        }
        return false;
    }                        
    private void btnDoiPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiPassActionPerformed

        String matKhauCu = String.valueOf(txtPassMKCu.getPassword());//Lấy dữ liệu từ PassField
        String matKhauMoi = String.valueOf(txtPassMKMoi.getPassword());
        String mkNhapLai = String.valueOf(txtPassMKNhapLai.getPassword());
        if (matKhauCu.isEmpty() || matKhauMoi.isEmpty() || mkNhapLai.isEmpty())
            JOptionPane.showMessageDialog(null, "Bạn chưa nhập đầy đủ thông tin", "Thông báo", 1);
        else {
            try {
                if(!KtPassCu())//Kiểm tra mật khẩu cũ nhập vào có giống trong csdl;
                    JOptionPane.showMessageDialog(null, "Mật khẩu cũ không đúng", "Thông báo", 1);
                else
                {
                    if (matKhauMoi.compareTo(mkNhapLai)!=0)//Kiểm tra nếu mật khẩu mới nhập lại khác nhau
                        JOptionPane.showMessageDialog(null, "Mật khẩu mới không trùng khớp", "Thông báo", 1);
                    else
                        if(TaiKhoanBLL.capNhatMK(TenDangNhap,matKhauMoi, matKhauCu) != 0)//
                        {
                            JOptionPane.showMessageDialog(null, "Đổi mật khẩu thành công", "Thông báo", 1);//cập nhật mật khẩu vào cơ sở dữ liệu
                            txtPassMKCu.setText("");
                            txtPassMKMoi.setText("");
                            txtPassMKNhapLai.setText("");    
                        }
                }
            } catch (SQLException ex) {
                Logger.getLogger(DanhMucGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnDoiPassActionPerformed
    ////////////////////////////////////////////////////////////////////////////////////////

    
    
    
    
    
    
    /////MENU////////////////////////////////////////////////////////////
    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        DangNhapGUI dn = new DangNhapGUI();
        System.gc();
        System.runFinalization();
        dn.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnDoiMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMKActionPerformed

        jTabbedPaneMain.setSelectedIndex(2);
        System.gc();
        System.runFinalization();
    }//GEN-LAST:event_btnDoiMKActionPerformed

    private void btnPhongBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhongBanActionPerformed
        jTabbedPaneMain.setSelectedIndex(1);
        rowTBPhong=-1;
        txtSLHong.setText("");
        txtMaPhongLuu.setText("");
        txtMaTBLuu.setText("");
        loadPhong();
        loadCbbPhong();
        System.gc();
        System.runFinalization();
    }//GEN-LAST:event_btnPhongBanActionPerformed

    private void btnKhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoActionPerformed
        jTabbedPaneMain.setSelectedIndex(0);
        //btnKho.setBackground(Color.green);
        loadThietBi();
        cbbPhongChuyen.setModel(new DefaultComboBoxModel(listMaPhong()));
        System.gc();
        System.runFinalization();
        
    }//GEN-LAST:event_btnKhoActionPerformed
    ////////////////////////////////////////////////////////////////////////////////

    
    
    
    //////KHO/////////////////////////////////////////////
    
    public void loadThietBi() {
         jTableThietBi.setModel(new TableKho(listTbKho()));
         TableColumnModel m = jTableThietBi.getColumnModel();
         m.getColumn(4).setCellRenderer(NumberRenderer.getIntegerRenderer());//định dạng tiền cột đơn giá
    }
    public void xoaTrang()
    {
        txtTenTB.setText("");
        txtMaTB.setText("");
        txtCauHinh.setText("");
        txtMoTa.setText("");
        txtDonGia.setText("");
        txtSoLuong.setText("");
    }
    public ArrayList<KhoDTO> listTbKho()
    {
        try {
            ArrayList<KhoDTO> listKho = new ArrayList<KhoDTO>();
            ResultSet rs = KhoBLL.listTBKho();
            while (rs.next()) {
                KhoDTO kho = new KhoDTO();
                kho.setMaTB(rs.getString("MaTB"));
                kho.setTenTB(rs.getString("TenTB"));
                kho.setCauHinh(rs.getString("CauHinh"));
                kho.setMoTa(rs.getString("MoTa"));
                kho.setDonGia(rs.getInt("DonGia"));
                kho.setSLTot(rs.getInt("SoLuong"));
                kho.setSLHong(rs.getInt("SoLuongHong"));
                kho.setSLPhongKhac(rs.getInt("SoLuongChoMuon"));
                listKho.add(kho);
            }
            return listKho;
        } catch (SQLException ex) {
            Logger.getLogger(DanhMucGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public void Them() throws Exception
    {
        String MaTB = txtMaTB.getText();
        String TenTB = txtTenTB.getText();
        String CauHinh = txtCauHinh.getText();
        String MoTa = txtMoTa.getText();
        String SoLuong = txtSoLuong.getText();
        String DonGia = txtDonGia.getText();
            if (MaTB.isEmpty() || TenTB.isEmpty() || CauHinh.isEmpty() || SoLuong.isEmpty() || DonGia.isEmpty())//Kiểm tra dữ liệu nhập vào không được trống
                throw new Exception("Bạn chưa nhập đầy đủ thông tin");
             else {
                if (KhoBLL.ktKhoa(MaTB).isBeforeFirst()) 
                    throw new Exception("Trùng mã thiết bị");
                if(!Pattern.matches("[0-9]+",SoLuong)||Integer.valueOf(SoLuong)<=0)
                    throw new Exception("Số lượng không hợp lệ");
                if(!Pattern.matches("[0-9]+",DonGia)||Integer.valueOf(DonGia)<0)
                    throw new Exception("Đơn giá không hợp lệ");
                if (KhoBLL.ThemThietBi(MaTB, TenTB, CauHinh, MoTa, Integer.valueOf(DonGia), Integer.valueOf(SoLuong)) != 0) {
                    JOptionPane.showMessageDialog(null, "Thêm thiết bị thành công", "Thông báo", 1);
                    GiaoDichBLL.GiaoDichThem("Thêm thiết bị vào kho", strDate,TenNhanVien);//Them vào GiaoDich(Ten,LoaiGD,Ngay)
                    GiaoDichBLL.LichSu(MaTB, Integer.valueOf(SoLuong), Integer.valueOf(DonGia), "Tốt", "");//Thêm vào bảng LichSu;
                    loadThietBi();
                    xoaTrang();
                    } else {
                        JOptionPane.showMessageDialog(null, "Thêm thiết bị không thành công", "Thông báo", 1);
                    }
            }
    }
    //Thêm thiết bị
    private void btnThemTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemTbActionPerformed
        try{
            Them();
            xoaTrang();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage(), "Thông báo", 1);
        }
        
    }//GEN-LAST:event_btnThemTbActionPerformed
    //CapNhatThietBi

    private void btnSuaThietBiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaThietBiActionPerformed
        try{
        String MaTB = txtMaTB.getText();
        String TenTB = txtTenTB.getText();
        String CauHinh = txtCauHinh.getText();
        String MoTa = txtMoTa.getText();
        if (MaTB.isEmpty())
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn thiết bị", "Thông báo", 1);
        else {
            int SoLuong = Integer.valueOf(txtSoLuong.getText());
            int DonGia = Integer.valueOf(txtDonGia.getText());
            if (KhoBLL.CapNhatTB(MaTB, TenTB, CauHinh, MoTa, DonGia, SoLuong) != 0) {
                JOptionPane.showMessageDialog(null, "Cập nhật thành công", "Thông báo", 1);
                GiaoDichBLL.GiaoDichThem("Cập nhật thiết bị", strDate, TenNhanVien);//Them vào GiaoDich(Ten,LoaiGD,Ngay)
                GiaoDichBLL.LichSu(MaTB, Integer.valueOf(SoLuong), Integer.valueOf(DonGia), "Tốt", "");//Thêm vào bảng LichSu;
                loadThietBi();
                xoaTrang();
            } else {
                JOptionPane.showMessageDialog(null, "Cập nhật thất bại", "Thông báo", 1);
            }
        }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Số lượng, đơn giá phải là số", "Thông báo", 1);
        }
             
    }//GEN-LAST:event_btnSuaThietBiActionPerformed
    //Hiển thị thông tin thiết bị khi chọn 1 dòng trong Jtable
    private void jTableThietBiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableThietBiMouseClicked
        ArrayList<KhoDTO> list = listTbKho();
        int row = jTableThietBi.getSelectedRow();
        KhoDTO kho = list.get(row);
        txtMaTB.setText(kho.getMaTB());
        txtTenTB.setText(kho.getTenTB());
        txtCauHinh.setText(kho.getCauHinh());
        txtMoTa.setText(kho.getMoTa());
        txtSoLuong.setText(String.valueOf(kho.getSLTot()));
        txtDonGia.setText(String.valueOf(kho.getDonGia()));
    }//GEN-LAST:event_jTableThietBiMouseClicked
    //////////////////////////////////////////////////////////////////////

    
    
    
    //THANH LÝ THIẾT BỊ//////////////////////////////////////////////////// 
    ArrayList<jPanelCacLoaiGD> listDongThanhLy = new ArrayList<>();//danh sách các dòng động đã thêm trên GUI
    public int ktTrungMaTL()
    {
        ArrayList<CacGiaoDichDTO> listTBCchay = listTBTL();
        for(int i=0; i<listTBCchay.size(); i++)
        {
            String ktMaTB = listTBCchay.remove(i).getMaTB();//Mã thiết bị dòng đầu tiên
            CacGiaoDichDTO GD = new CacGiaoDichDTO();
            GD.setMaTB(ktMaTB);
            if (listTBCchay.contains(GD))//Kiểm tra trùng mã thiết bị giữa dòng các hàng
                return 1;
            listTBCchay=listTBTL();
        }
        return 0;
    }
    public void ktSLTot() throws Exception//Kiểm tra số lượng thanh lý có nhỏ hơn số lượng trong kho hay không
    {
        ArrayList<CacGiaoDichDTO> listTbThanhLy=listTBTL();
        for(int i=0; i<listTbThanhLy.size(); i++)
        {   
            int SLThanhLy=listTbThanhLy.get(i).getSoLuong();
            int SLTot=getSLTrongKho(listTbThanhLy.get(i).getMaTB())-getSLHongKho(listTbThanhLy.get(i).getMaTB());
            if(listTbThanhLy.get(i).getTinhTrang().compareTo("Tốt")==0&&SLThanhLy>SLTot)
                throw new Exception("Số lượng thiết bị tốt thanh lý lớn hơn số lượng tốt trong kho");
            if(listTbThanhLy.get(i).getTinhTrang().compareTo("Hỏng")==0&&SLThanhLy>getSLHongKho(listTbThanhLy.get(i).getMaTB()))
                throw new Exception("Số lượng thanh lý lớn hơn số lượng hỏng trong kho");
        }
                ThanhLyTB();
    }
    public int getSLTrongKho(String MaTB)//Lấy số lượng tốt theo mã thiết bị
    {
        int SLTot=0;
        ArrayList<KhoDTO> listTbKho = listTbKho();
        //ArrayList<CacGiaoDichDTO> listTbThanhLy=listTBTL();
        for(int i=0; i<listTbKho.size(); i++)
        {
            if(listTbKho.get(i).getMaTB().compareTo(MaTB)==0)
            {
                SLTot=listTbKho.get(i).getSLTot();
            }
        }
        return SLTot;
    }
    public int getSLHongKho(String MaTB)//Lấy số lượng hỏng theo mã thiết bị
    {
        int SLHong=0;
        ArrayList<KhoDTO> listTbKho = listTbKho();
        //ArrayList<CacGiaoDichDTO> listTbThanhLy=listTBTL();
        for(int i=0; i<listTbKho.size(); i++)
        {
            if(listTbKho.get(i).getMaTB().compareTo(MaTB)==0)
            {
                SLHong=listTbKho.get(i).getSLHong();
            }
        }
        return SLHong;
    }
    public ArrayList<CacGiaoDichDTO> listTBTL()//Lấy thông tin từ các dòng động
    {
        ArrayList<CacGiaoDichDTO> thanhly = new ArrayList<CacGiaoDichDTO>();
        for (int i = 0; i < listDongThanhLy.size(); i++) {
            CacGiaoDichDTO tl = new CacGiaoDichDTO();
            tl.setMaTB(listDongThanhLy.get(i).getCbbMaTB().getSelectedItem().toString());
            tl.setTinhTrang(listDongThanhLy.get(i).getCbbTinhTrang().getSelectedItem().toString());
            tl.setMoTa(listDongThanhLy.get(i).getTxtMoTa().getText());
            tl.setSoLuong(Integer.valueOf(listDongThanhLy.get(i).getTxtSL().getText()));
            tl.setDonGia(Integer.valueOf(listDongThanhLy.get(i).getTxtDonGia().getText()));
            thanhly.add(tl);
        }
        return thanhly;
    }
    public void ThanhLyTB() throws Exception{
        int dem = 0,kt=0;
        int ret = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn thanh lý thiết bị?", "Thoát", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) 
        {
            
            GiaoDichBLL.GiaoDichThem("Thanh lý thiết bị", strDate,TenNhanVien);//Them vào GiaoDich(Ten,LoaiGD)
            ArrayList<CacGiaoDichDTO> listTB = listTBTL();
            for (int i = 0; i < listTB.size(); i++) {
                String MaTB = listTB.get(i).getMaTB();
                String TinhTrang = listTB.get(i).getTinhTrang();
                String MoTa = listTB.get(i).getMoTa();
                int SoLuong = listTB.get(i).getSoLuong();
                int DonGia =  listTB.get(i).getDonGia();
                if (GiaoDichBLL.LichSu(MaTB, SoLuong, DonGia, TinhTrang, MoTa) != 0) {
                    dem++;
                    GiaoDichBLL.THThanhLy(MaTB, SoLuong, TinhTrang);
                }
            }
        }
        else 
            kt=1;
            if (dem != 0) {
                JOptionPane.showMessageDialog(null, "Thanh lý thành công", "Thông báo", 1);
                loadThietBi();
            } else
                if(kt==0)
                JOptionPane.showMessageDialog(null, "Thanh lý thất bại", "Thông báo", 1);
    }
    public void ThucHienTL() throws Exception
    {
            for (int i = 0; i < listDongThanhLy.size(); i++) {
                String MaTB = listDongThanhLy.get(i).getCbbMaTB().getSelectedItem().toString();
                String TinhTrang = listDongThanhLy.get(i).getCbbTinhTrang().getSelectedItem().toString();
                String SL = listDongThanhLy.get(i).getTxtSL().getText();
                String DonGia = listDongThanhLy.get(i).getTxtDonGia().getText();
                if (MaTB.isEmpty() || SL.isEmpty() || DonGia.isEmpty() || TinhTrang.isEmpty())
                    throw new Exception("Bạn chưa nhập đầy đủ thông tin");
                //Pattern p = Pattern.compile("\dg"); 
                //Matcher ma = p.matcher(SL);
                //boolean b = m.matches();  
                if(!Pattern.matches("[0-9]+",SL)||Integer.valueOf(SL)<=0)
                    throw new Exception("Số lượng không hợp lệ");
                if(!Pattern.matches("[0-9]+",DonGia)||Integer.valueOf(DonGia)<0)
                    throw new Exception("Đơn giá không hợp lệ");
            }   
            if(listTBTL().size() != 0)
            {
                if(ktTrungMaTL()==1)
                    throw new Exception("Trùng mã thiết bị");
                ktSLTot(); 
            }
    }
    public void themTbThanhLy()//Thêm động các hàng nhập thông tin thiết bị trên form
    {
        jPanelLoatDongTB.setLayout(new BoxLayout(jPanelLoatDongTB, BoxLayout.Y_AXIS));//set layout cho panel
        FlowLayout flow = new FlowLayout(FlowLayout.RIGHT);
        JPanel panelHang = new JPanel();
        panelHang.setLayout(flow);

        JComboBox cbbMaTB = new JComboBox(listMaTB());
        cbbMaTB.setPreferredSize(new Dimension(130, 25));
        cbbMaTB.setFont(new Font("Tahoma", Font.PLAIN, 14));

        JComboBox cbbTinhTrang = new JComboBox();
        cbbTinhTrang.setPreferredSize(new Dimension(100, 25));
        cbbTinhTrang.setFont(new Font("Tahoma", Font.PLAIN, 14));
        cbbTinhTrang.addItem("Hỏng");
        cbbTinhTrang.addItem("Tốt");
        

        JTextField txtLyDo = new JTextField();
        txtLyDo.setPreferredSize(new Dimension(130, 25));
        txtLyDo.setFont(new Font("Tahoma", Font.PLAIN, 14));
        
        JTextField txtSL = new JTextField();
        txtSL.setPreferredSize(new Dimension(80, 25));
        txtSL.setFont(new Font("Tahoma", Font.PLAIN, 14));

        JTextField txtDonGia = new JTextField();
        txtDonGia.setPreferredSize(new Dimension(100, 25));
        txtDonGia.setFont(new Font("Tahoma", Font.PLAIN, 14));

        ImageIcon icon = new ImageIcon("src/Icon/Delete.png");
        JButton btn = new JButton(icon);
        btn.setPreferredSize(new Dimension(20, 20));

        jPanelCacLoaiGD tl = new jPanelCacLoaiGD();
        tl.setBtn(btn);
        tl.setCbbMaTB(cbbMaTB);
        tl.setCbbTinhTrang(cbbTinhTrang);
        tl.setTxtMoTa(txtLyDo);
        tl.setTxtSL(txtSL);
        tl.setTxtDonGia(txtDonGia);
        listDongThanhLy.add(tl);

        panelHang.add(cbbMaTB);
        panelHang.add(cbbTinhTrang);
        panelHang.add(txtLyDo);
        panelHang.add(txtSL);
        panelHang.add(txtDonGia);
        panelHang.add(btn);

        jPanelLoatDongTB.add(panelHang);
        btn.setIcon(icon);
        this.revalidate();
        this.repaint();

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < listDongThanhLy.size(); i++) {
                    if (listDongThanhLy.get(i).getBtn().equals(btn)) {
                        listDongThanhLy.remove(i);
                    }
                }
                jPanelLoatDongTB.remove(panelHang);
                jPanelLoatDongTB.revalidate();
                jPanelLoatDongTB.repaint();
            }
        });
    }
    public Vector<String> listMaTB()//danh sách mã thiết bị
    {
        ArrayList<KhoDTO> kho = listTbKho();
        Vector<String> dsMaTB = new Vector<>();
        for (int i = 0; i < kho.size(); i++) {
            dsMaTB.add(kho.get(i).getMaTB());
        }
        return dsMaTB;
    }
    private void btnThemDongTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemDongTBActionPerformed
        themTbThanhLy();
    }//GEN-LAST:event_btnThemDongTBActionPerformed

    private void btnThanhLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhLyActionPerformed

        try {
            ThucHienTL();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo", 1);
        }
    }//GEN-LAST:event_btnThanhLyActionPerformed
    /////////////////////////////////////////////////////////////////////////////////////

    
    
    
    //////GIAO DỊCH//////////////////////////
    public ArrayList<GiaoDichDTO> listGD()//Lấy danh sách các giao dịch từ cơ sở dữ liệu
    {
        try {
            ArrayList<GiaoDichDTO> listGD = new ArrayList<GiaoDichDTO>();
            ResultSet rs = GiaoDichBLL.loadGD(cbbTKLoaiGD.getSelectedItem().toString());
            while (rs.next()) {
                GiaoDichDTO gd = new GiaoDichDTO();
                gd.setMaGD(rs.getInt("MaGD"));
                gd.setLoaiGD(rs.getString("LoaiGD"));
                gd.setThoiGian(rs.getString("ThoiGian"));
                gd.setMaPhong(rs.getString("MaPhong"));
                gd.setNguoiTH(rs.getString("NguoiTH"));
                listGD.add(gd);
            }
            return listGD;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public ArrayList<LichSuDTO> listLichSu(int MaGD)//Lấy danh sách các chi tiết giao dịch từ cơ sở dữ liệu
    {
         try {
            ArrayList<LichSuDTO> listLichSu = new ArrayList<LichSuDTO>();
            ResultSet rs = GiaoDichBLL.loadLichSu(MaGD);
            while (rs.next()) {
                LichSuDTO ls=new LichSuDTO();
                ls.setMaTB(rs.getString("MaTB"));
                ls.setTenTB(rs.getString("TenTB"));
                ls.setTinhTrang(rs.getString("TinhTrang"));
                ls.setMoTa(rs.getString("MoTa"));
                ls.setSoLuong(rs.getInt("SoLuong"));
                ls.setDonGia(rs.getInt("DonGia"));
                listLichSu.add(ls);
            }
            return listLichSu;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void loadGD() {
        jTableGiaoDich.setModel(new TableGiaoDich(listGD()));
    }
    
    //Nút giao dịch ở menu///////////////////////////
    private void btnGiaoDichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaoDichActionPerformed
        jTabbedPaneMain.setSelectedIndex(3);
        loadGD();
        ArrayList<LichSuDTO> list = new ArrayList<>();
        jTableChiTietGD.setModel(new TableLichSu(list));
        //jTableChiTietGD.setRow
        lblNguoiTH.setText("");
        lblMaGD.setText("");
        lblThoiGian.setText("");
        lblTenGD.setText("");
        System.gc();
        System.runFinalization();
    }//GEN-LAST:event_btnGiaoDichActionPerformed
    
    
    //Chọn một dòng trong bảng giao dịch
    private void jTableGiaoDichMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableGiaoDichMouseClicked
        int row = jTableGiaoDich.getSelectedRow();
        GiaoDichDTO ls= listGD().get(row);
        int MaGD=ls.getMaGD();
        String TenGD=ls.getLoaiGD();
        String ThoiGian=ls.getThoiGian();
        String MaPhong= ls.getMaPhong();
        String TenNV=ls.getNguoiTH();
        //
        lblMaGD.setText(String.valueOf(MaGD));
        //lblTenGD.setText(TenGD);
        lblThoiGian.setText(ThoiGian);
        lblNguoiTH.setText(TenNV);
        
        jTableChiTietGD.setModel(new TableLichSu(listLichSu(MaGD)));//load dữ liệu lên bảng chi tiết giao dịch
        
        TableColumnModel m = jTableChiTietGD.getColumnModel();
        m.getColumn(5).setCellRenderer(NumberRenderer.getIntegerRenderer());//định dạng tiền cột đơn giá
        m.getColumn(6).setCellRenderer(NumberRenderer.getIntegerRenderer());//định dạng tiền tệ cho cột thành tiền
      
        if(TenGD.equals("Chuyển thiết bị"))
             lblTenGD.setText(TenGD + " đến mã phòng: "+MaPhong);
        else
            if(TenGD.equals("Lưu kho"))
               lblTenGD.setText(TenGD + " tại mã phòng: "+MaPhong); 
            else
                lblTenGD.setText(TenGD);
    }//GEN-LAST:event_jTableGiaoDichMouseClicked
   
    ///////////////////////////////////////////////////////////////////////////////////////

    
    
    
    
    
    
    //////////PHÒNG//////////////
    
     public ArrayList<PhongDTO> listPhong()//ds phòng từ cơ sở dữ liệu
    {
       try {
            ArrayList<PhongDTO> listPhong = new ArrayList<PhongDTO>();
            ResultSet rs = PhongBLL.loadPhong();
            while (rs.next()) {
                PhongDTO phong = new PhongDTO();
                phong.setMaPhong(rs.getString("MaPhong"));
                phong.setTenPhong(rs.getString("TenPhong"));
                listPhong.add(phong);
            }
            return listPhong;
        } catch (SQLException ex) {
            Logger.getLogger(DanhMucGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null; 
    }
    public void loadPhong() {
        jTablePhong.setModel(new TablePhong(listPhong()));
    }
    
     public void ThemPhong() throws Exception
     {
        String MaPhong = txtMaPhong.getText();
        String TenPhong = txtTenPhong.getText();
        ArrayList<PhongDTO> list = listPhong();
        PhongDTO phong=new PhongDTO();
        phong.setMaPhong(MaPhong);
        if (MaPhong.isEmpty() || TenPhong.isEmpty())
            throw new Exception("Bạn chưa nhập đầy đủ thông tin");
        else {
            if (list.contains(phong)) 
                throw new Exception("Mã phòng đã tồn tại");
            else {
                if (PhongBLL.ThemPhong(MaPhong, TenPhong) != 0) {
                    JOptionPane.showMessageDialog(null, "Thêm phòng thành công", "Thông báo", 1);
                    loadPhong();
                    txtMaPhong.setText("");
                    txtTenPhong.setText("");
                    loadCbbPhong();
                } else
                    JOptionPane.showMessageDialog(null, "Thêm phòng thất bại", "Thông báo", 1);
            }

        }
     }
    private void btnThemPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemPhongActionPerformed
        try {
            ThemPhong();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage(), "Thông báo", 1);
        }
    }//GEN-LAST:event_btnThemPhongActionPerformed

    private void btnSuaPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaPhongActionPerformed
        String MaPhong = txtMaPhong.getText();
        String TenPhong = txtTenPhong.getText();
        if (MaPhong.isEmpty() || TenPhong.isEmpty())
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn phòng", "Thông báo", 1);
        else {
            if (PhongBLL.SuaPhong(MaPhong, TenPhong) != 0) {
                JOptionPane.showMessageDialog(null, "Cập nhật thành công", "Thông báo", 1);
                loadPhong();
                txtMaPhong.setText("");
                txtTenPhong.setText("");
                loadCbbPhong();
            } else {
                JOptionPane.showMessageDialog(null, "Cập nhật thất bại", "Thông báo", 1);
            }
        }
    }//GEN-LAST:event_btnSuaPhongActionPerformed
    
    //Chọn một dòng trong table Thiết bị
    private void jTablePhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePhongMouseClicked
        int row=jTablePhong.getSelectedRow();
        String MaPhong=(String)jTablePhong.getValueAt(row, 0);
        String TenPhong=(String)jTablePhong.getValueAt(row, 1);
        txtMaPhong.setText(MaPhong);
        txtTenPhong.setText(TenPhong);
       
    }//GEN-LAST:event_jTablePhongMouseClicked

    private void btnXoaPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaPhongActionPerformed
        String MaPhong = txtMaPhong.getText();
        String TenPhong = txtTenPhong.getText();
        if(MaPhong.isEmpty()||TenPhong.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn phòng", "Thông báo", 1);
        }
        else
        {
            try {
                if(PhongBLL.getTbMaPhong(MaPhong).isBeforeFirst())
                    JOptionPane.showMessageDialog(null, "Vẫn còn thiết bị trong phòng", "Thông báo", 1);
                else
                { 
                    int ret=JOptionPane.showConfirmDialog(null,"Bạn có chắc chắn muốn xóa phòng", "Thoát",
                    JOptionPane.YES_NO_OPTION);
                    if(ret==JOptionPane.YES_OPTION)
                    {
                        if(PhongBLL.XoaPhong(MaPhong)!=0)
                        {
                            JOptionPane.showMessageDialog(null, "Xóa phòng thành công", "Thông báo", 1);
                            loadPhong();
                            txtMaPhong.setText("");
                            txtTenPhong.setText("");
                            loadCbbPhong();
                        }
                        else
                            JOptionPane.showMessageDialog(null, "Xóa phòng thất bại", "Thông báo", 1);
                    }
                    
                }   
            } catch (SQLException ex) {
                Logger.getLogger(DanhMucGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
    }//GEN-LAST:event_btnXoaPhongActionPerformed
//////////////////////////////////////////////////////////////////////////////////
    
    
    
    
    //Thiết bị trong phòng//////////////////////////////////////////////////////////////
    
    private void cbbTenPhongItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbTenPhongItemStateChanged
        String MaPhong = String.valueOf(cbbTenPhong.getSelectedItem());
        loadTbPhong(MaPhong);
    }//GEN-LAST:event_cbbTenPhongItemStateChanged
    
     public void loadCbbPhong()//Load Mã thiết bị lên combobox
    {
        cbbTenPhong.setModel(new DefaultComboBoxModel(listMaPhong()));
        String MaPhong = String.valueOf(cbbTenPhong.getSelectedItem());
        loadTbPhong(MaPhong);
    }
    
     public ArrayList<ThietBiPhongDTO> listTbPhong(String MaPhong)
    {
       try {
            ArrayList<ThietBiPhongDTO> listTbPhong = new ArrayList<ThietBiPhongDTO>();
            ResultSet rs = PhongBLL.loadTbPhong(MaPhong);
            while (rs.next()) {
                ThietBiPhongDTO TbPhong = new ThietBiPhongDTO();
                TbPhong.setMaTB(rs.getString("MaTB"));
                TbPhong.setTenTB(rs.getString("TenTB"));
                TbPhong.setSL(rs.getInt("SL"));
                TbPhong.setSLHong(rs.getInt("SLHong"));
                listTbPhong.add(TbPhong);
            }
            return listTbPhong;
        } catch (SQLException ex) {
            Logger.getLogger(DanhMucGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null; 
    }
    public void loadTbPhong(String MaPhong)//Load thiết bị trong phòng dựa vào mã phòng truyền vào
    {
        jTableTbPhong.setModel(new TableTBPhong(listTbPhong(MaPhong)));
    }
     public Vector<String> listMaPhong()//danh sách mã thiết bị
    {
        ArrayList<PhongDTO> phong = listPhong();
        Vector<String> dsMaPhong = new Vector<>();
        for (int i = 0; i < phong.size(); i++) {
            dsMaPhong.add(phong.get(i).getMaPhong());
        }
        return dsMaPhong;
    }
     
    String MaTBPhong="";
    int SLTong=0;
    private void btnSLHongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSLHongActionPerformed

        if(rowTBPhong==-1)
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn thiết bị", "Thông báo", 1);
        else
        {
            String MaPhong=String.valueOf(cbbTenPhong.getSelectedItem());
            
            if(!Pattern.matches("[0-9]+",txtSLHong.getText()))
                  JOptionPane.showMessageDialog(null, "Số lượng không hợp lệ", "Thông báo", 1);
            else
            {
                int SLHong = Integer.valueOf(txtSLHong.getText());
                if(SLHong>SLTong)
                    JOptionPane.showMessageDialog(null, "Số lượng hỏng vượt quá tổng số lượng thiết bị", "Thông báo", 1);
                else
                {
                    if(PhongBLL.CapNhatSLHong(MaPhong,MaTBPhong,SLHong)!=0)
                    {
                        JOptionPane.showMessageDialog(null, "Cập nhật số lượng hỏng thành công", "Thông báo", 1);
                        loadTbPhong(MaPhong);
                        txtSLHong.setText("");
                        txtMaPhongLuu.setText("");
                        txtMaTBLuu.setText("");
                    }
                else
                    JOptionPane.showMessageDialog(null, "Cập nhật số lượng hỏng thất bại", "Thông báo", 1);
                }
            }
        }
        
    }//GEN-LAST:event_btnSLHongActionPerformed
    int rowTBPhong=-1;
    private void jTableTbPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTbPhongMouseClicked
        rowTBPhong=jTableTbPhong.getSelectedRow();
        int SLHong=(Integer) jTableTbPhong.getValueAt(rowTBPhong, 4);
        SLTong=(Integer) jTableTbPhong.getValueAt(rowTBPhong, 2);
        MaTBPhong=(String) jTableTbPhong.getValueAt(rowTBPhong, 0);
        txtSLHong.setText(String.valueOf(SLHong));
        ///Load lên để lưu kho//
        String MaPhong=cbbTenPhong.getSelectedItem().toString();
        txtMaPhongLuu.setText(MaPhong);
        txtMaTBLuu.setText(MaTBPhong);
    }//GEN-LAST:event_jTableTbPhongMouseClicked
///////////////////////////////////////////////////////////////////
    
    
    
    
    
    
    ////////CHUYỂN THIẾT BỊ/////////////////////////////////
    ArrayList<jPanelCacLoaiGD> listDongChuyen =new ArrayList<jPanelCacLoaiGD>();
    public ArrayList<CacGiaoDichDTO> listTBChuyen()//Lấy thông tin từ các dòng động add vào list thiết bị chuyển
    {
        ArrayList<CacGiaoDichDTO> chuyen = new ArrayList<CacGiaoDichDTO>();
        for (int i = 0; i < listDongChuyen.size(); i++) {
            CacGiaoDichDTO tl = new CacGiaoDichDTO();
            tl.setMaTB(listDongChuyen.get(i).getCbbMaTB().getSelectedItem().toString());
            tl.setSoLuong(Integer.valueOf(listDongChuyen.get(i).getTxtSL().getText()));
            chuyen.add(tl);
        }
        return chuyen;
    }
    public int ktTrungMa()
    {
        ArrayList<CacGiaoDichDTO> listTBCchay = listTBChuyen();
        for(int i=0; i<listTBCchay.size(); i++)
        {
            String ktMaTB = listTBCchay.remove(i).getMaTB();//Mã thiết bị dòng đầu tiên
            CacGiaoDichDTO GD = new CacGiaoDichDTO();
            GD.setMaTB(ktMaTB);
            if (listTBCchay.contains(GD))//Kiểm tra trùng mã thiết bị giữa dòng các hàng
                return 1;
            listTBCchay=listTBChuyen();
        }
        return 0;
    }
    public void themTbChuyen()//Thêm động các hàng nhập thông tin thiết bị trên form
    {
        jPanelTbChuyen.setLayout(new BoxLayout(jPanelTbChuyen, BoxLayout.Y_AXIS));//set layout cho panel
        FlowLayout flow = new FlowLayout(FlowLayout.RIGHT);
        JPanel panelHang = new JPanel();
        panelHang.setLayout(flow);

        JComboBox cbbMaTB = new JComboBox(listMaTB());
        cbbMaTB.setPreferredSize(new Dimension(200, 25));
        cbbMaTB.setFont(new Font("Tahoma", Font.PLAIN, 14));

        JTextField txtSL = new JTextField();
        txtSL.setPreferredSize(new Dimension(150, 25));
        txtSL.setFont(new Font("Tahoma", Font.PLAIN, 14));


        ImageIcon icon = new ImageIcon("src/Icon/Delete.png");
        JButton btn = new JButton(icon);
        btn.setPreferredSize(new Dimension(20, 20));

        jPanelCacLoaiGD tl = new jPanelCacLoaiGD();
        tl.setBtn(btn);
        tl.setCbbMaTB(cbbMaTB);
        tl.setTxtSL(txtSL);
        listDongChuyen.add(tl);

        panelHang.add(cbbMaTB);
        panelHang.add(txtSL);
        panelHang.add(btn);

        jPanelTbChuyen.add(panelHang);
        btn.setIcon(icon);
        this.revalidate();
        this.repaint();

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < listDongChuyen.size(); i++) {
                    if (listDongChuyen.get(i).getBtn().equals(btn)) {
                        listDongChuyen.remove(i);
                    }
                }
                jPanelTbChuyen.remove(panelHang);
                jPanelTbChuyen.revalidate();
                jPanelTbChuyen.repaint();
            }
        });
    }
    public int getSL(String MaTB)//Trả về số lượng tốt trong kho của thiết bị có MaTB
    {
        ArrayList<KhoDTO> list = listTbKho();
        for(int i=0; i<list.size();i++)
            if(list.get(i).getMaTB().equals(MaTB))
                return list.get(i).getSLTot()-list.get(i).getSLHong();
        return 0;
    }
    public void Chuyen()
    {   
        int dem=0, kt=0, kt1=0;
        ArrayList<CacGiaoDichDTO> listTBC = listTBChuyen();
        String MaPhongChuyen=cbbPhongChuyen.getSelectedItem().toString();
        int ret = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn chuyển thiết bị", "Thoát",
                JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) 
        {
            GiaoDichBLL.GiaoDich("Chuyển thiết bị", MaPhongChuyen, strDate, TenNhanVien);
            for(int i=0; i<listTBC.size(); i++)
            {
                int SL=listTBC.get(i).getSoLuong();
                String MaTB=listTBC.get(i).getMaTB();
                if (GiaoDichBLL.LichSu(MaTB, SL, 0, "Tốt", "") != 0)
                {
                    dem++;
                    GiaoDichBLL.THChuyen(MaPhongChuyen, MaTB, SL);
                    GiaoDichBLL.TH(MaPhongChuyen, MaTB, SL);
                }
            }
        } else
            kt1 = 1;
        if (dem != 0) 
        {
            JOptionPane.showMessageDialog(null, "Chuyển thiết bị thành công", "Thông báo", 1);
            loadThietBi();
        } 
        else 
            if (kt1 == 0) 
                JOptionPane.showMessageDialog(null, "Chuyển thiết bị thất bại", "Thông báo", 1);

    }
    public void ThucHienChuyen() throws Exception
    {
            for (int i = 0; i < listDongChuyen.size(); i++) {
                String MaTB = listDongChuyen.get(i).getCbbMaTB().getSelectedItem().toString();
                String SoLuong = listDongChuyen.get(i).getTxtSL().getText();
                if (MaTB.isEmpty() || SoLuong.isEmpty())
                    throw new Exception("Bạn chưa nhập đầy đủ thông tin");
                if(!Pattern.matches("[0-9]+",SoLuong))
                    throw new Exception("Số lượng không hợp lệ");
            }
                if(listTBChuyen().size() != 0) 
                {   
                    int dem=0, kt=0,kt1=0;
                    
                    ArrayList<CacGiaoDichDTO> listTBC = listTBChuyen();
                    for (int i = 0; i <listTBC.size(); i++) //Thêm list dòng vào cơ sở dữ liệu
                    {   
                        int SL=listTBC.get(i).getSoLuong();
                        String MaTB=listTBC.get(i).getMaTB();
                        if(ktTrungMa()==1)//Kiểm tra trùng mã thiết bị giữa dòng các hàng
                            throw new Exception("Trùng mã thiết bị");
                        if(SL<=0)
                            throw new Exception("Số lượng không hợp lệ");
                        if(listTBC.get(i).getSoLuong()>getSL(listTBC.get(i).getMaTB()))
                            throw new Exception("Số lượng chuyển vượt quá số lượng trong kho");
                    }
                    Chuyen();
                }            
    }
            
    private void btnThemTbChuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemTbChuyenActionPerformed
        themTbChuyen();
    }//GEN-LAST:event_btnThemTbChuyenActionPerformed
 
    private void btnChuyenTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenTbActionPerformed

        try {
            ThucHienChuyen();
            //System.gc();//gom rac
            //System.runFinalization();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Thông báo", 1);
        }
       
    }//GEN-LAST:event_btnChuyenTbActionPerformed
//////////////////////////////////////////////////////////////////////////
    
    
    
    
    
    ////////Lưu kho///////
    public void LuuKho() throws Exception
    {
        String MaPhongLuu=txtMaPhongLuu.getText();
        String MaTBLuu=txtMaTBLuu.getText();
        String TinhTrang=cbbTinhTrangLuu.getSelectedItem().toString();
        String SLLuu= txtSLLuuKho.getText();
        String LyDo=txtLyDoLuu.getText();
        int SLTrongPhong=(Integer) jTableTbPhong.getValueAt(rowTBPhong, 2);
        int SLHong=(Integer) jTableTbPhong.getValueAt(rowTBPhong, 4); 
        if(MaPhongLuu.isEmpty()||MaTBLuu.isEmpty())
            throw new Exception("Bạn chưa chọn thiết bị");
        if(SLLuu.isEmpty()||LyDo.isEmpty())
            throw new Exception("Bạn chưa nhập đủ thông tin");
        if(!Pattern.matches("[0-9]+",SLLuu))
            throw new Exception("Số lượng không hợp lệ");
        else
        {
            int SoLuongLuu=Integer.parseInt(SLLuu);
            if(TinhTrang.equals("Tốt")&&SoLuongLuu>SLTrongPhong-SLHong)
                throw new Exception("Số lượng vượt quá số lượng trong phòng");
            else
            {
                if(TinhTrang.equals("Hỏng")&&SLHong<SoLuongLuu)
                    throw new Exception("Số lượng vượt quá số lượng hỏng trong phòng");
                else
                {
                    int ret = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn lưu kho?", "Thoát",JOptionPane.YES_NO_OPTION);
                    if (ret == JOptionPane.YES_OPTION) 
                    {
                        if(GiaoDichBLL.THLuKho(MaPhongLuu, MaTBLuu,SoLuongLuu,TinhTrang)!=0)
                        {
                            GiaoDichBLL.GiaoDich("Lưu kho", MaPhongLuu, strDate, TenNhanVien);
                            GiaoDichBLL.LichSu(MaTBLuu, SoLuongLuu,0, TinhTrang, LyDo);
                            JOptionPane.showMessageDialog(null,"Lưu kho thành công", "Thông báo", 1);
                            loadTbPhong(MaPhongLuu);
                            txtMaPhongLuu.setText("");
                            txtMaTBLuu.setText("");
                            txtSLLuuKho.setText("");
                            txtLyDoLuu.setText("");
                        }
                        else
                         JOptionPane.showMessageDialog(null,"Lưu không thành công", "Thông báo", 1);
                    }
                }
            }
        }
    }
    private void btnLuuKhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuKhoActionPerformed
       try{
           LuuKho();
           rowTBPhong=-1;
           txtSLHong.setText("");
       }
       catch(Exception e)
       {
            JOptionPane.showMessageDialog(null,e.getMessage(),"Thông báo",1);
       }
    }//GEN-LAST:event_btnLuuKhoActionPerformed
        Color colorClick = new Color(255,102,102);
        Color colorBD = new Color(102,102,255);
    ////////////////////////////////////////////////////////////////////    
        
        
        
        
        
    //đổi màu menu/////////////////////////////////////////
    private void btnTrangChuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrangChuMousePressed
        //btnTrangChu.setBackground(new JButton().getBackground());
        btnTrangChu.setBackground(colorClick);
        btnKho.setBackground(colorBD);
        btnPhongBan.setBackground(colorBD);
        btnGiaoDich.setBackground(colorBD);
        btnDoiMK.setBackground(colorBD);
        btnDangXuat.setBackground(colorBD);
        btnThongKe.setBackground(colorBD);
    }//GEN-LAST:event_btnTrangChuMousePressed

    private void btnKhoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhoMousePressed
        btnKho.setBackground(colorClick);
        btnTrangChu.setBackground(colorBD);
        btnPhongBan.setBackground(colorBD);
        btnGiaoDich.setBackground(colorBD);
        btnDoiMK.setBackground(colorBD);
        btnDangXuat.setBackground(colorBD);
         btnThongKe.setBackground(colorBD);
    }//GEN-LAST:event_btnKhoMousePressed

    private void btnPhongBanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPhongBanMousePressed
        btnPhongBan.setBackground(colorClick);
        btnTrangChu.setBackground(colorBD);
        btnKho.setBackground(colorBD);
        btnGiaoDich.setBackground(colorBD);
        btnDoiMK.setBackground(colorBD);
        btnDangXuat.setBackground(colorBD);
        btnThongKe.setBackground(colorBD);
    }//GEN-LAST:event_btnPhongBanMousePressed

    private void btnGiaoDichMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGiaoDichMousePressed
        btnGiaoDich.setBackground(colorClick);
        btnTrangChu.setBackground(colorBD);
        btnPhongBan.setBackground(colorBD);
        btnKho.setBackground(colorBD);
        btnDoiMK.setBackground(colorBD);
        btnDangXuat.setBackground(colorBD);
        btnThongKe.setBackground(colorBD);
    }//GEN-LAST:event_btnGiaoDichMousePressed

    private void btnDoiMKMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoiMKMousePressed
        btnDoiMK.setBackground(colorClick);
        btnTrangChu.setBackground(colorBD);
        btnPhongBan.setBackground(colorBD);
        btnGiaoDich.setBackground(colorBD);
        btnKho.setBackground(colorBD);
        btnDangXuat.setBackground(colorBD);
        btnThongKe.setBackground(colorBD);
    }//GEN-LAST:event_btnDoiMKMousePressed

    private void btnDangXuatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangXuatMousePressed
        btnDangXuat.setBackground(colorClick);
        btnTrangChu.setBackground(colorBD);
        btnPhongBan.setBackground(colorBD);
        btnGiaoDich.setBackground(colorBD);
        btnDoiMK.setBackground(colorBD);
        btnKho.setBackground(colorBD);
        btnThongKe.setBackground(colorBD);
    }//GEN-LAST:event_btnDangXuatMousePressed

    
    
    ///Nút Trang chủ ở menu /////////////////////////////////////
    private void btnTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangChuActionPerformed
        jTabbedPaneMain.setSelectedIndex(4);
        loadUser();
        System.gc();
        System.runFinalization();
    }//GEN-LAST:event_btnTrangChuActionPerformed

    
    //Nút logo ở menu///////////////////////////////////////////////
    private void btnLogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoActionPerformed
        jTabbedPaneMain.setSelectedIndex(4);
        btnTrangChu.setBackground(colorClick);
        btnKho.setBackground(colorBD);
        btnPhongBan.setBackground(colorBD);
        btnGiaoDich.setBackground(colorBD);
        btnDoiMK.setBackground(colorBD);
        btnDangXuat.setBackground(colorBD);
        btnThongKe.setBackground(colorBD);
        loadUser();
        System.gc();
        System.runFinalization();
    }//GEN-LAST:event_btnLogoActionPerformed
//////////////////////////////////////////////////////
    
    
    ////////Sự kiện thay đổi dữ liệu combobox loại giao dịch////////////////////////////
    private void cbbTKLoaiGDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbTKLoaiGDItemStateChanged

        loadGD();
        ArrayList<LichSuDTO> list = new ArrayList<>();
        jTableChiTietGD.setModel(new TableLichSu(list));
        lblNguoiTH.setText("");
        lblMaGD.setText("");
        lblThoiGian.setText("");
        lblTenGD.setText("");
    }//GEN-LAST:event_cbbTKLoaiGDItemStateChanged

    
    
    
    
    
    
    //////////////////THỐNG KÊ////////////////////////////
    private void btnThongKeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongKeMousePressed
        btnThongKe.setBackground(colorClick);
        btnDangXuat.setBackground(colorBD);
        btnTrangChu.setBackground(colorBD);
        btnPhongBan.setBackground(colorBD);
        btnGiaoDich.setBackground(colorBD);
        btnDoiMK.setBackground(colorBD);
        btnKho.setBackground(colorBD);
       
    }//GEN-LAST:event_btnThongKeMousePressed

    public Vector<String> listMaTBTk()//danh sách mã thiết bị thông kê
    {
        ArrayList<KhoDTO> kho = listTbKho();
        Vector<String> dsMaTB = new Vector<>();
        dsMaTB.add(0, "All");
        for (int i = 0; i <kho.size(); i++) {
            dsMaTB.add(kho.get(i).getMaTB());
        }
        return dsMaTB;
    }
     public Vector<String> listTenTBTk()//danh sách tên thiết bị thông kê
    {
        ArrayList<KhoDTO> kho = listTbKho();
        Vector<String> dsTenTB = new Vector<>();
        dsTenTB.add(0, "All");
        for (int i = 0; i <kho.size(); i++) {
            dsTenTB.add(kho.get(i).getTenTB());
        }
        return dsTenTB;
    }
     public Vector<String> listTenPhong()//danh sách tên phòng
    {
        ArrayList<PhongDTO> phong = listPhong();
        Vector<String> dsTenPhong = new Vector<>();
        dsTenPhong.add(0, "Kho");
        for (int i = 0; i < phong.size(); i++) {
            dsTenPhong.add(phong.get(i).getTenPhong());
        }
        return dsTenPhong;
    }
     
    //gọi đến tab thống kê.
    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
       jTabbedPaneMain.setSelectedIndex(5);
       cbbTkMa.setModel(new DefaultComboBoxModel(listMaTBTk()));//load mã thiết bị vào combobox
       cbbTkPhong.setModel(new DefaultComboBoxModel(listTenPhong()));//load tên phòng vào combobox
       loadTableTk(listTbTKe(tk.tk1("All")),"Kho","");
    }//GEN-LAST:event_btnThongKeActionPerformed

    //Dữ liệu cbb Mã thiết bị thống kê thay đổi 
    private void cbbTkMaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbTkMaItemStateChanged
        ThongKe();
    }//GEN-LAST:event_cbbTkMaItemStateChanged

    private void cbbTkPhongItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbTkPhongItemStateChanged
        ThongKe();
    }//GEN-LAST:event_cbbTkPhongItemStateChanged

    private void cbbTkTinhTrangItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbTkTinhTrangItemStateChanged
        ThongKe();
    }//GEN-LAST:event_cbbTkTinhTrangItemStateChanged
    
     public ArrayList<TBThongKeDTO> listTbTKe(ResultSet rs)
    {
        try {
            ArrayList<TBThongKeDTO> listTbTKe = new ArrayList<TBThongKeDTO>();
            while (rs.next()) {
                TBThongKeDTO tb = new TBThongKeDTO();
                tb.setMaTB(rs.getString("MaTB"));
                tb.setTenTB(rs.getString("TenTB"));
                tb.setSoLuong(rs.getString("SoLuong"));
                listTbTKe.add(tb);
            }
            return listTbTKe;
        } catch (SQLException ex) {
            Logger.getLogger(DanhMucGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     public void loadTableTk(ArrayList<TBThongKeDTO> dsTB,String Phong,String TinhTrang)
     {
          DefaultTableModel model=(DefaultTableModel) jTableThongKe.getModel();
          model.setRowCount(0);
          for(TBThongKeDTO tb:dsTB)
          {
              model.addRow(new Object[]{tb.getMaTB(),tb.getTenTB(),tb.getSoLuong(),Phong,TinhTrang});
          }
     }
     
     ThongKeBLL tk=new ThongKeBLL();
    public void ThongKe()
    {
        String MaTB=String.valueOf(cbbTkMa.getSelectedItem());
        String Phong=String.valueOf(cbbTkPhong.getSelectedItem());
        String TinhTrang=String.valueOf(cbbTkTinhTrang.getSelectedItem());
        if(Phong.equals("Kho"))
        {
            if(TinhTrang.equals("All"))//tk1
                loadTableTk(listTbTKe(tk.tk1(MaTB)),"Kho","");
            if(TinhTrang.equals("Tốt"))//tk2
                loadTableTk(listTbTKe(tk.tk2(MaTB)),"Kho","Tốt");
            if(TinhTrang.equals("Hỏng"))//tk3
                loadTableTk(listTbTKe(tk.tk3(MaTB)),"Kho","Hỏng");
            if(TinhTrang.equals("Thanh lý"))//tk4
                loadTableTk(listTbTKe(tk.tk4(MaTB)),"","Thanh lý");
        }
        else
        {
            if(TinhTrang.equals("All"))//tk5
                loadTableTk(listTbTKe(tk.tk5(MaTB,Phong)),Phong,"");
            if(TinhTrang.equals("Tốt"))//tk6
                loadTableTk(listTbTKe(tk.tk6(MaTB,Phong)),Phong,"Tốt");
            if(TinhTrang.equals("Hỏng"))//tk7
                loadTableTk(listTbTKe(tk.tk7(MaTB,Phong)),Phong,"Hỏng");
            if(TinhTrang.equals("Thanh lý"))//tk4
                loadTableTk(listTbTKe(tk.tk4(MaTB)),"","Thanh lý");
        }
    }
    
    
    
    
    
    ///////////////////Trang chủ/////////////////////////////////////////////
    public void loadUser()
    {
        lblTenNV.setText(TenNhanVien);
        lblChucVu.setText(ChucVuNV);
    }
    
    ////////////////////////////////////////////////////////////////////////
     public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DanhMucGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DanhMucGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DanhMucGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DanhMucGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DanhMucGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChuyenTb;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDoiMK;
    private javax.swing.JButton btnDoiPass;
    private javax.swing.JButton btnGiaoDich;
    private javax.swing.JButton btnKho;
    private javax.swing.JButton btnLogo;
    private javax.swing.JButton btnLuuKho;
    private javax.swing.JButton btnPhongBan;
    private javax.swing.JButton btnSLHong;
    private javax.swing.JButton btnSuaPhong;
    private javax.swing.JButton btnSuaThietBi;
    private javax.swing.JButton btnThanhLy;
    private javax.swing.JButton btnThemDongTB;
    private javax.swing.JButton btnThemPhong;
    private javax.swing.JButton btnThemTb;
    private javax.swing.JButton btnThemTbChuyen;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnTrangChu;
    private javax.swing.JButton btnXoaPhong;
    private javax.swing.JComboBox<String> cbbPhongChuyen;
    private javax.swing.JComboBox<String> cbbTKLoaiGD;
    private javax.swing.JComboBox<String> cbbTenPhong;
    private javax.swing.JComboBox<String> cbbTinhTrangLuu;
    private javax.swing.JComboBox<String> cbbTkMa;
    private javax.swing.JComboBox<String> cbbTkPhong;
    private javax.swing.JComboBox<String> cbbTkTinhTrang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelChuyenThietBi;
    private javax.swing.JPanel jPanelGiaoDich;
    private javax.swing.JPanel jPanelKho;
    private javax.swing.JPanel jPanelLoatDongTB;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelMatKhau;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelPhongBan;
    private javax.swing.JPanel jPanelTbChuyen;
    private javax.swing.JPanel jPanelThanhLy;
    private javax.swing.JPanel jPanelThemThietBi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPaneMain;
    private javax.swing.JTabbedPane jTabbedPaneThaoTac;
    private javax.swing.JTable jTableChiTietGD;
    private javax.swing.JTable jTableGiaoDich;
    private javax.swing.JTable jTablePhong;
    private javax.swing.JTable jTableTbPhong;
    private javax.swing.JTable jTableThietBi;
    private javax.swing.JTable jTableThongKe;
    private javax.swing.JLabel lblChucVu;
    private javax.swing.JLabel lblMaGD;
    private javax.swing.JLabel lblNguoiTH;
    private javax.swing.JLabel lblTenGD;
    private javax.swing.JLabel lblTenNV;
    private javax.swing.JLabel lblThoiGian;
    private javax.swing.JTextArea txtCauHinh;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextArea txtLyDoLuu;
    private javax.swing.JTextField txtMaPhong;
    private javax.swing.JTextField txtMaPhongLuu;
    private javax.swing.JTextField txtMaTB;
    private javax.swing.JTextField txtMaTBLuu;
    private javax.swing.JTextArea txtMoTa;
    private javax.swing.JPasswordField txtPassMKCu;
    private javax.swing.JPasswordField txtPassMKMoi;
    private javax.swing.JPasswordField txtPassMKNhapLai;
    private javax.swing.JTextField txtSLHong;
    private javax.swing.JTextField txtSLLuuKho;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenPhong;
    private javax.swing.JTextField txtTenTB;
    // End of variables declaration//GEN-END:variables
}
