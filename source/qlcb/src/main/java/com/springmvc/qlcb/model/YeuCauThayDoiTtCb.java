package com.springmvc.qlcb.model;
// Generated Apr 11, 2016 10:54:37 AM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * YeuCauThayDoiTtCb generated by hbm2java
 */
@Entity
@Table(name = "yeu_cau_thay_doi_tt_cb", catalog = "qlcb")
public class YeuCauThayDoiTtCb implements java.io.Serializable {

	private Long maYeuCau;
	private CanBo canBoByMaCbAnhHuong;
	private CanBo canBoByMaCbYeuCau;
	private String tenYeuCau;
	private String loiNoi;
	private Byte trangThai;
	private Set<MucSuaDoi> mucSuaDois = new HashSet<MucSuaDoi>(0);

	public YeuCauThayDoiTtCb() {
	}

	public YeuCauThayDoiTtCb(CanBo canBoByMaCbAnhHuong, CanBo canBoByMaCbYeuCau) {
		this.canBoByMaCbAnhHuong = canBoByMaCbAnhHuong;
		this.canBoByMaCbYeuCau = canBoByMaCbYeuCau;
	}

	public YeuCauThayDoiTtCb(CanBo canBoByMaCbAnhHuong, CanBo canBoByMaCbYeuCau, String tenYeuCau, String loiNoi,
			Byte trangThai, Set<MucSuaDoi> mucSuaDois) {
		this.canBoByMaCbAnhHuong = canBoByMaCbAnhHuong;
		this.canBoByMaCbYeuCau = canBoByMaCbYeuCau;
		this.tenYeuCau = tenYeuCau;
		this.loiNoi = loiNoi;
		this.trangThai = trangThai;
		this.mucSuaDois = mucSuaDois;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Ma_Yeu_Cau", unique = true, nullable = false)
	public Long getMaYeuCau() {
		return this.maYeuCau;
	}

	public void setMaYeuCau(Long maYeuCau) {
		this.maYeuCau = maYeuCau;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Ma_CB_Anh_Huong", nullable = false)
	public CanBo getCanBoByMaCbAnhHuong() {
		return this.canBoByMaCbAnhHuong;
	}

	public void setCanBoByMaCbAnhHuong(CanBo canBoByMaCbAnhHuong) {
		this.canBoByMaCbAnhHuong = canBoByMaCbAnhHuong;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Ma_CB_Yeu_Cau", nullable = false)
	public CanBo getCanBoByMaCbYeuCau() {
		return this.canBoByMaCbYeuCau;
	}

	public void setCanBoByMaCbYeuCau(CanBo canBoByMaCbYeuCau) {
		this.canBoByMaCbYeuCau = canBoByMaCbYeuCau;
	}

	@Column(name = "Ten_Yeu_Cau", length = 254)
	public String getTenYeuCau() {
		return this.tenYeuCau;
	}

	public void setTenYeuCau(String tenYeuCau) {
		this.tenYeuCau = tenYeuCau;
	}

	@Column(name = "Loi_Noi", length = 254)
	public String getLoiNoi() {
		return this.loiNoi;
	}

	public void setLoiNoi(String loiNoi) {
		this.loiNoi = loiNoi;
	}

	@Column(name = "Trang_Thai")
	public Byte getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(Byte trangThai) {
		this.trangThai = trangThai;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "yeuCauThayDoiTtCb")
	public Set<MucSuaDoi> getMucSuaDois() {
		return this.mucSuaDois;
	}

	public void setMucSuaDois(Set<MucSuaDoi> mucSuaDois) {
		this.mucSuaDois = mucSuaDois;
	}

}