package com.springmvc.qlcb.model;
// Generated Apr 25, 2016 1:43:12 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Danhgiacanbo generated by hbm2java
 */
@Entity
@Table(name = "danhgiacanbo", catalog = "qlcb")
public class Danhgiacanbo implements java.io.Serializable {

	private int maDanhGiaCanBo;
	private Canbo canboByMaNguoiDanhGia;
	private Canbo canboByMaCanBoDuocDanhGia;
	private Mucdohoanthanh mucdohoanthanh;
	private Quy quy;
	private String noiDung;
	private Date ngayDanhGia;
	private int nam;
	private boolean laQuanLyHienTai;
	private String chucVuHienTaiNguoiDanhGia;

	public Danhgiacanbo() {
	}

	public Danhgiacanbo(int maDanhGiaCanBo, Canbo canboByMaNguoiDanhGia, Canbo canboByMaCanBoDuocDanhGia, Quy quy,
			int nam, boolean laQuanLyHienTai) {
		this.maDanhGiaCanBo = maDanhGiaCanBo;
		this.canboByMaNguoiDanhGia = canboByMaNguoiDanhGia;
		this.canboByMaCanBoDuocDanhGia = canboByMaCanBoDuocDanhGia;
		this.quy = quy;
		this.nam = nam;
		this.laQuanLyHienTai = laQuanLyHienTai;
	}

	public Danhgiacanbo(int maDanhGiaCanBo, Canbo canboByMaNguoiDanhGia, Canbo canboByMaCanBoDuocDanhGia,
			Mucdohoanthanh mucdohoanthanh, Quy quy, String noiDung, Date ngayDanhGia, int nam, boolean laQuanLyHienTai,
			String chucVuHienTaiNguoiDanhGia) {
		this.maDanhGiaCanBo = maDanhGiaCanBo;
		this.canboByMaNguoiDanhGia = canboByMaNguoiDanhGia;
		this.canboByMaCanBoDuocDanhGia = canboByMaCanBoDuocDanhGia;
		this.mucdohoanthanh = mucdohoanthanh;
		this.quy = quy;
		this.noiDung = noiDung;
		this.ngayDanhGia = ngayDanhGia;
		this.nam = nam;
		this.laQuanLyHienTai = laQuanLyHienTai;
		this.chucVuHienTaiNguoiDanhGia = chucVuHienTaiNguoiDanhGia;
	}

	@Id

	@Column(name = "MaDanhGiaCanBo", unique = true, nullable = false)
	public int getMaDanhGiaCanBo() {
		return this.maDanhGiaCanBo;
	}

	public void setMaDanhGiaCanBo(int maDanhGiaCanBo) {
		this.maDanhGiaCanBo = maDanhGiaCanBo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaNguoiDanhGia", nullable = false)
	public Canbo getCanboByMaNguoiDanhGia() {
		return this.canboByMaNguoiDanhGia;
	}

	public void setCanboByMaNguoiDanhGia(Canbo canboByMaNguoiDanhGia) {
		this.canboByMaNguoiDanhGia = canboByMaNguoiDanhGia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaCanBoDuocDanhGia", nullable = false)
	public Canbo getCanboByMaCanBoDuocDanhGia() {
		return this.canboByMaCanBoDuocDanhGia;
	}

	public void setCanboByMaCanBoDuocDanhGia(Canbo canboByMaCanBoDuocDanhGia) {
		this.canboByMaCanBoDuocDanhGia = canboByMaCanBoDuocDanhGia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MucDoHoanThanh")
	public Mucdohoanthanh getMucdohoanthanh() {
		return this.mucdohoanthanh;
	}

	public void setMucdohoanthanh(Mucdohoanthanh mucdohoanthanh) {
		this.mucdohoanthanh = mucdohoanthanh;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Quy", nullable = false)
	public Quy getQuy() {
		return this.quy;
	}

	public void setQuy(Quy quy) {
		this.quy = quy;
	}

	@Column(name = "NoiDung", length = 65535)
	public String getNoiDung() {
		return this.noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "NgayDanhGia", length = 10)
	public Date getNgayDanhGia() {
		return this.ngayDanhGia;
	}

	public void setNgayDanhGia(Date ngayDanhGia) {
		this.ngayDanhGia = ngayDanhGia;
	}

	@Column(name = "Nam", nullable = false)
	public int getNam() {
		return this.nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}

	@Column(name = "LaQuanLyHienTai", nullable = false)
	public boolean isLaQuanLyHienTai() {
		return this.laQuanLyHienTai;
	}

	public void setLaQuanLyHienTai(boolean laQuanLyHienTai) {
		this.laQuanLyHienTai = laQuanLyHienTai;
	}

	@Column(name = "ChucVuHienTaiNguoiDanhGia", length = 65535)
	public String getChucVuHienTaiNguoiDanhGia() {
		return this.chucVuHienTaiNguoiDanhGia;
	}

	public void setChucVuHienTaiNguoiDanhGia(String chucVuHienTaiNguoiDanhGia) {
		this.chucVuHienTaiNguoiDanhGia = chucVuHienTaiNguoiDanhGia;
	}

}
