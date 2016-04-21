package com.springmvc.qlcb.model;
// Generated Apr 19, 2016 9:35:55 AM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * Taikhoan generated by hbm2java
 */
@Entity
@Table(name = "taikhoan", catalog = "qlcb_new")
public class Taikhoan implements java.io.Serializable {

	private int maCanBo;
	private Canbo canbo;
	private String tenDangNhap;
	private String matKhau;

	public Taikhoan() {
	}

	public Taikhoan(Canbo canbo, String tenDangNhap, String matKhau) {
		this.canbo = canbo;
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
	}
	
	public Taikhoan(int maCB, String ten, String mk){
		this.maCanBo = maCB;
		this.tenDangNhap = ten;
		this.matKhau = mk;
	}
	

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "canbo"))
	@Id
	@GeneratedValue(generator = "generator")

	@Column(name = "MaCanBo", unique = true, nullable = false)
	public int getMaCanBo() {
		return this.maCanBo;
	}

	public void setMaCanBo(int maCanBo) {
		this.maCanBo = maCanBo;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Canbo getCanbo() {
		return this.canbo;
	}

	public void setCanbo(Canbo canbo) {
		this.canbo = canbo;
	}

	@Column(name = "TenDangNhap", nullable = false, length = 50)
	public String getTenDangNhap() {
		return this.tenDangNhap;
	}

	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}

	@Column(name = "MatKhau", nullable = false, length = 50)
	public String getMatKhau() {
		return this.matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

}