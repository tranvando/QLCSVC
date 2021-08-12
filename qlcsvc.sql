-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th8 12, 2021 lúc 04:56 AM
-- Phiên bản máy phục vụ: 10.4.14-MariaDB
-- Phiên bản PHP: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `qlcsvc`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `giaodich`
--

CREATE TABLE `giaodich` (
  `MaGD` int(11) NOT NULL,
  `MaPhong` varchar(20) COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `ThoiGian` varchar(15) COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `LoaiGD` varchar(30) COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `NguoiTH` varchar(40) COLLATE utf8mb4_vietnamese_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `giaodich`
--

INSERT INTO `giaodich` (`MaGD`, `MaPhong`, `ThoiGian`, `LoaiGD`, `NguoiTH`) VALUES
(1, NULL, '10/07/2021', 'Thêm thiết bị vào kho', 'Vũ Thị A'),
(2, NULL, '10/07/2021', 'Cập nhật thiết bị', 'Vũ Thị A'),
(3, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(4, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(5, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(6, NULL, '10/07/2021', 'Cập nhật thiết bị', 'Vũ Thị A'),
(7, NULL, '10/07/2021', 'Cập nhật thiết bị', 'Vũ Thị A'),
(8, NULL, '10/07/2021', 'Thanh lý thiết bị', 'Vũ Thị A'),
(9, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(10, NULL, '10/07/2021', 'Thêm thiết bị vào kho', 'Vũ Thị A'),
(11, NULL, '10/07/2021', 'Cập nhật thiết bị', 'Vũ Thị A'),
(12, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(13, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(14, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(15, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(16, NULL, '10/07/2021', 'Thanh lý thiết bị', 'Vũ Thị A'),
(17, 'p1', '10/07/2021', 'Lưu kho', 'Vũ Thị A'),
(18, 'p1', '10/07/2021', 'Lưu kho', 'Vũ Thị A'),
(19, 'p1', '10/07/2021', 'Lưu kho', 'Vũ Thị A'),
(20, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(21, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(22, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(23, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(24, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(25, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(26, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(27, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(28, NULL, '10/07/2021', 'Thanh lý thiết bị', 'Vũ Thị A'),
(29, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(30, NULL, '10/07/2021', 'Thêm thiết bị vào kho', 'Vũ Thị A'),
(31, NULL, '10/07/2021', 'Cập nhật thiết bị', 'Vũ Thị A'),
(32, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(33, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(34, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(35, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(36, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(37, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(38, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(39, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(40, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(41, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(42, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(43, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(44, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(45, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(46, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(47, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(48, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(49, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(50, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(51, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(52, 'p1', '10/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(53, NULL, '10/07/2021', 'Thanh lý thiết bị', 'Vũ Thị A'),
(54, NULL, '11/07/2021', 'Thêm thiết bị vào kho', 'Vũ Thị A'),
(55, 'p1', '11/07/2021', 'Lưu kho', 'Vũ Thị A'),
(56, 'p1', '11/07/2021', 'Lưu kho', 'Vũ Thị A'),
(57, 'p1', '11/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(58, 'p1', '11/07/2021', 'Chuyển thiết bị', 'Vũ Thị A'),
(59, NULL, '11/07/2021', 'Thanh lý thiết bị', 'Vũ Thị A'),
(60, NULL, '11/07/2021', 'Thanh lý thiết bị', 'Vũ Thị A'),
(61, NULL, '05/08/2021', 'Cập nhật thiết bị', 'Vũ Thị A');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `lichsu`
--

CREATE TABLE `lichsu` (
  `MaTB` varchar(20) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `MaGD` int(11) NOT NULL,
  `TinhTrang` varchar(20) COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `MoTa` text COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `SoLuong` int(11) DEFAULT NULL,
  `DonGia` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `lichsu`
--

INSERT INTO `lichsu` (`MaTB`, `MaGD`, `TinhTrang`, `MoTa`, `SoLuong`, `DonGia`) VALUES
('tb01', 1, 'Tốt', '', 3, 10000),
('tb01', 2, 'Tốt', '', 4, 10000),
('tb01', 3, 'Tốt', '', 1, 0),
('tb01', 4, 'Tốt', '', 1, 0),
('tb01', 5, 'Tốt', '', 1, 0),
('tb01', 6, 'Tốt', '', 4, 10000),
('tb01', 7, 'Tốt', '', 4, 10000),
('tb01', 8, 'Tốt', '1df', 1, 1000),
('tb01', 9, 'Tốt', '', 1, 0),
('tb01', 11, 'Tốt', '', 10, 10000),
('tb01', 12, 'Tốt', '', 2, 0),
('tb01', 13, 'Tốt', '', 1, 0),
('tb01', 14, 'Tốt', '', 1, 0),
('tb01', 15, 'Tốt', '', 1, 0),
('tb01', 16, 'Tốt', 'dfdf', 1, 111),
('tb01', 17, 'Tốt', 'dfdf', 1, 0),
('tb01', 18, 'Hỏng', 'dffdf', 1, 0),
('tb01', 19, 'Tốt', 'dfdf', 8, 0),
('tb01', 20, 'Tốt', '', 1, 0),
('tb01', 21, 'Tốt', '', 1, 0),
('tb01', 22, 'Tốt', '', 1, 0),
('tb01', 23, 'Tốt', '', 1, 0),
('tb01', 26, 'Tốt', '', 1, 0),
('tb01', 27, 'Tốt', '', 1, 0),
('tb01', 28, 'Hỏng', 'df', 1, 444),
('tb01', 29, 'Tốt', '', 1, 0),
('tb01', 33, 'Tốt', '', 1, 0),
('tb01', 35, 'Tốt', '', 1, 0),
('tb01', 36, 'Tốt', '', 13, 0),
('tb01', 37, 'Tốt', '', 1, 0),
('tb01', 38, 'Tốt', '', 1, 0),
('tb01', 39, 'Tốt', '', 1, 0),
('tb01', 40, 'Tốt', '', 1, 0),
('tb01', 41, 'Tốt', '', 1, 0),
('tb01', 43, 'Tốt', '', 1, 0),
('tb01', 44, 'Tốt', '', 1, 0),
('tb01', 45, 'Tốt', '', 1, 0),
('tb01', 46, 'Tốt', '', 1, 0),
('tb01', 47, 'Tốt', '', 1, 0),
('tb01', 48, 'Tốt', '', 1, 0),
('tb01', 49, 'Tốt', '', 1, 0),
('tb01', 51, 'Tốt', '', 1, 0),
('tb01', 53, 'Tốt', '1dfs', 1, 1),
('tb01', 56, 'Hỏng', 'dfdf', 1, 0),
('tb01', 57, 'Tốt', '', 1, 0),
('tb01', 59, 'Hỏng', 'dcf', 1, 1),
('tb01', 60, 'Tốt', 'dfdfbhf', 1, 112),
('tb02', 10, 'Tốt', '', 3, 10000),
('tb02', 24, 'Tốt', '', 1, 0),
('tb02', 25, 'Tốt', '', 1, 0),
('tb02', 28, 'Tốt', 'dff', 1, 555),
('tb02', 34, 'Tốt', '', 2, 0),
('tb02', 42, 'Tốt', '', 1, 0),
('tb02', 50, 'Tốt', '', 1, 0),
('tb03', 30, 'Tốt', '', 2, 10000),
('tb03', 31, 'Tốt', '', 2, 10000),
('tb03', 32, 'Tốt', '', 1, 0),
('tb03', 52, 'Tốt', '', 1, 0),
('tb03', 55, 'Tốt', 'fgfg', 1, 0),
('tb03', 60, 'Tốt', 'fgfg', 1, 1212),
('tb03', 61, 'Tốt', '', 1, 10000),
('tb04', 54, 'Tốt', '', 1, 10000),
('tb04', 58, 'Tốt', '', 1, 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phong`
--

CREATE TABLE `phong` (
  `MaPhong` varchar(20) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `TenPhong` varchar(70) COLLATE utf8mb4_vietnamese_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `phong`
--

INSERT INTO `phong` (`MaPhong`, `TenPhong`) VALUES
('p1', 'lớp 10a4');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `taikhoan`
--

CREATE TABLE `taikhoan` (
  `TenDN` varchar(30) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `MatKhau` varchar(20) COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `TenNV` varchar(40) COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `ChucVu` varchar(100) COLLATE utf8mb4_vietnamese_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `taikhoan`
--

INSERT INTO `taikhoan` (`TenDN`, `MatKhau`, `TenNV`, `ChucVu`) VALUES
('admin', 'admin', 'Vũ Thị A', 'Nhân viên quản lý');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbphong`
--

CREATE TABLE `tbphong` (
  `MaTB` varchar(20) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `MaPhong` varchar(20) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `SL` int(11) DEFAULT NULL,
  `SLHong` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `tbphong`
--

INSERT INTO `tbphong` (`MaTB`, `MaPhong`, `SL`, `SLHong`) VALUES
('tb01', 'p1', 14, 0),
('tb04', 'p1', 1, 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `thietbi`
--

CREATE TABLE `thietbi` (
  `MaTB` varchar(20) COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `TenTB` varchar(70) COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `CauHinh` text COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `MoTa` text COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  `DonGia` int(11) DEFAULT NULL,
  `SoLuong` int(11) DEFAULT NULL,
  `SoLuongHong` int(11) DEFAULT NULL,
  `SoLuongChoMuon` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `thietbi`
--

INSERT INTO `thietbi` (`MaTB`, `TenTB`, `CauHinh`, `MoTa`, `DonGia`, `SoLuong`, `SoLuongHong`, `SoLuongChoMuon`) VALUES
('tb01', 'Máy tính', 'đẹp vcl', 'df', 10000, 1, 0, -2),
('tb02', 'Máy tính', 'đẹp vcl', 'df', 10000, 0, -1, 1),
('tb03', 'Máy tínhsdfsds', 'đẹp vclsdfasfdas', 'df', 10000, 1, 0, 0),
('tb04', 'Máy tínhsdfsds', 'đẹp ', 'df', 10000, 0, 0, 1);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `giaodich`
--
ALTER TABLE `giaodich`
  ADD PRIMARY KEY (`MaGD`),
  ADD KEY `MaPhong` (`MaPhong`);

--
-- Chỉ mục cho bảng `lichsu`
--
ALTER TABLE `lichsu`
  ADD PRIMARY KEY (`MaTB`,`MaGD`),
  ADD KEY `MaGD` (`MaGD`);

--
-- Chỉ mục cho bảng `phong`
--
ALTER TABLE `phong`
  ADD PRIMARY KEY (`MaPhong`);

--
-- Chỉ mục cho bảng `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD PRIMARY KEY (`TenDN`);

--
-- Chỉ mục cho bảng `tbphong`
--
ALTER TABLE `tbphong`
  ADD PRIMARY KEY (`MaTB`,`MaPhong`),
  ADD KEY `MaPhong` (`MaPhong`);

--
-- Chỉ mục cho bảng `thietbi`
--
ALTER TABLE `thietbi`
  ADD PRIMARY KEY (`MaTB`);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `giaodich`
--
ALTER TABLE `giaodich`
  ADD CONSTRAINT `giaodich_ibfk_1` FOREIGN KEY (`MaPhong`) REFERENCES `phong` (`MaPhong`);

--
-- Các ràng buộc cho bảng `lichsu`
--
ALTER TABLE `lichsu`
  ADD CONSTRAINT `lichsu_ibfk_1` FOREIGN KEY (`MaGD`) REFERENCES `giaodich` (`MaGD`),
  ADD CONSTRAINT `lichsu_ibfk_2` FOREIGN KEY (`MaTB`) REFERENCES `thietbi` (`MaTB`);

--
-- Các ràng buộc cho bảng `tbphong`
--
ALTER TABLE `tbphong`
  ADD CONSTRAINT `tbphong_ibfk_1` FOREIGN KEY (`MaPhong`) REFERENCES `phong` (`MaPhong`),
  ADD CONSTRAINT `tbphong_ibfk_2` FOREIGN KEY (`MaTB`) REFERENCES `thietbi` (`MaTB`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
