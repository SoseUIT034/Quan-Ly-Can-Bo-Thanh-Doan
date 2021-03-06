package com.springmvc.qlcb.model;
// Generated Apr 25, 2016 2:33:53 PM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Canbo generated by hbm2java
 */
@Entity
@Table(name = "canbo", catalog = "qlcb")
public class Canbo implements java.io.Serializable {

	private int maCanBo;
	private Boolean trangThai;
	private Set<CanboDonvi> canboDonvis = new HashSet<CanboDonvi>(0);
	//private Taikhoan taikhoan;
	private Set<Chuyencongtac> chuyencongtacsForNguoiXacNhan = new HashSet<Chuyencongtac>(0);
	private Set<Chuyencongtac> chuyencongtacsForMaCanBoDuocChuyen = new HashSet<Chuyencongtac>(0);
	private Set<CanboGiadinhBanthan> canboGiadinhBanthans = new HashSet<CanboGiadinhBanthan>(0);
	private Set<Danhgiacanbo> danhgiacanbosForMaNguoiDanhGia = new HashSet<Danhgiacanbo>(0);
	private Set<Congtacnuocngoai> congtacnuocngoais = new HashSet<Congtacnuocngoai>(0);
	private Set<Danhgiacanbo> danhgiacanbosForMaCanBoDuocDanhGia = new HashSet<Danhgiacanbo>(0);
	private Set<Daotaochuyenmon> daotaochuyenmons = new HashSet<Daotaochuyenmon>(0);
	private Set<Lichsucongtac> lichsucongtacs = new HashSet<Lichsucongtac>(0);
	private Set<CanboBan> canboBans = new HashSet<CanboBan>(0);
	private Set<CanboGiadinhDoitac> canboGiadinhDoitacs = new HashSet<CanboGiadinhDoitac>(0);
	private Set<Khenthuong> khenthuongs = new HashSet<Khenthuong>(0);
	private Set<Kyluat> kyluats = new HashSet<Kyluat>(0);
	private Set<Dacdienlichsubanthan> dacdienlichsubanthans = new HashSet<Dacdienlichsubanthan>(0);
	private Set<Lylich> lylichesForNguoixacnhan = new HashSet<Lylich>(0);
	private Lylich lylichByMaCanBo;

	public Canbo() {
	}

	public Canbo(int maCanBo) {
		this.maCanBo = maCanBo;
	}

	public Canbo(int maCanBo, Boolean trangThai, Set<CanboDonvi> canboDonvis, Taikhoan taikhoan,
			Set<Chuyencongtac> chuyencongtacsForNguoiXacNhan, Set<Chuyencongtac> chuyencongtacsForMaCanBoDuocChuyen,
			Set<CanboGiadinhBanthan> canboGiadinhBanthans, Set<Danhgiacanbo> danhgiacanbosForMaNguoiDanhGia,
			Set<Congtacnuocngoai> congtacnuocngoais, Set<Danhgiacanbo> danhgiacanbosForMaCanBoDuocDanhGia,
			Set<Daotaochuyenmon> daotaochuyenmons, Set<Lichsucongtac> lichsucongtacs, Set<CanboBan> canboBans,
			Set<CanboGiadinhDoitac> canboGiadinhDoitacs, Set<Khenthuong> khenthuongs, Set<Kyluat> kyluats,
			Set<Dacdienlichsubanthan> dacdienlichsubanthans, Set<Lylich> lylichesForNguoixacnhan,
			Lylich lylichByMaCanBo) {
		this.maCanBo = maCanBo;
		this.trangThai = trangThai;
		this.canboDonvis = canboDonvis;
		//this.taikhoan = taikhoan;
		this.chuyencongtacsForNguoiXacNhan = chuyencongtacsForNguoiXacNhan;
		this.chuyencongtacsForMaCanBoDuocChuyen = chuyencongtacsForMaCanBoDuocChuyen;
		this.canboGiadinhBanthans = canboGiadinhBanthans;
		this.danhgiacanbosForMaNguoiDanhGia = danhgiacanbosForMaNguoiDanhGia;
		this.congtacnuocngoais = congtacnuocngoais;
		this.danhgiacanbosForMaCanBoDuocDanhGia = danhgiacanbosForMaCanBoDuocDanhGia;
		this.daotaochuyenmons = daotaochuyenmons;
		this.lichsucongtacs = lichsucongtacs;
		this.canboBans = canboBans;
		this.canboGiadinhDoitacs = canboGiadinhDoitacs;
		this.khenthuongs = khenthuongs;
		this.kyluats = kyluats;
		this.dacdienlichsubanthans = dacdienlichsubanthans;
		this.lylichesForNguoixacnhan = lylichesForNguoixacnhan;
		this.lylichByMaCanBo = lylichByMaCanBo;
	}

	@Id

	@Column(name = "MaCanBo", unique = true, nullable = false)
	public int getMaCanBo() {
		return this.maCanBo;
	}

	public void setMaCanBo(int maCanBo) {
		this.maCanBo = maCanBo;
	}

	@Column(name = "TrangThai")
	public Boolean getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(Boolean trangThai) {
		this.trangThai = trangThai;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "canbo")
	public Set<CanboDonvi> getCanboDonvis() {
		return this.canboDonvis;
	}

	public void setCanboDonvis(Set<CanboDonvi> canboDonvis) {
		this.canboDonvis = canboDonvis;
	}

//	@OneToOne(fetch = FetchType.LAZY, mappedBy = "canbo")
//	public Taikhoan getTaikhoan() {
//		return this.taikhoan;
//	}
//
//	public void setTaikhoan(Taikhoan taikhoan) {
//		this.taikhoan = taikhoan;
//	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "canboByNguoiXacNhan")
	public Set<Chuyencongtac> getChuyencongtacsForNguoiXacNhan() {
		return this.chuyencongtacsForNguoiXacNhan;
	}

	public void setChuyencongtacsForNguoiXacNhan(Set<Chuyencongtac> chuyencongtacsForNguoiXacNhan) {
		this.chuyencongtacsForNguoiXacNhan = chuyencongtacsForNguoiXacNhan;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "canboByMaCanBoDuocChuyen")
	public Set<Chuyencongtac> getChuyencongtacsForMaCanBoDuocChuyen() {
		return this.chuyencongtacsForMaCanBoDuocChuyen;
	}

	public void setChuyencongtacsForMaCanBoDuocChuyen(Set<Chuyencongtac> chuyencongtacsForMaCanBoDuocChuyen) {
		this.chuyencongtacsForMaCanBoDuocChuyen = chuyencongtacsForMaCanBoDuocChuyen;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "canbo")
	public Set<CanboGiadinhBanthan> getCanboGiadinhBanthans() {
		return this.canboGiadinhBanthans;
	}

	public void setCanboGiadinhBanthans(Set<CanboGiadinhBanthan> canboGiadinhBanthans) {
		this.canboGiadinhBanthans = canboGiadinhBanthans;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "canboByMaNguoiDanhGia")
	public Set<Danhgiacanbo> getDanhgiacanbosForMaNguoiDanhGia() {
		return this.danhgiacanbosForMaNguoiDanhGia;
	}

	public void setDanhgiacanbosForMaNguoiDanhGia(Set<Danhgiacanbo> danhgiacanbosForMaNguoiDanhGia) {
		this.danhgiacanbosForMaNguoiDanhGia = danhgiacanbosForMaNguoiDanhGia;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "canbo")
	public Set<Congtacnuocngoai> getCongtacnuocngoais() {
		return this.congtacnuocngoais;
	}

	public void setCongtacnuocngoais(Set<Congtacnuocngoai> congtacnuocngoais) {
		this.congtacnuocngoais = congtacnuocngoais;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "canboByMaCanBoDuocDanhGia")
	public Set<Danhgiacanbo> getDanhgiacanbosForMaCanBoDuocDanhGia() {
		return this.danhgiacanbosForMaCanBoDuocDanhGia;
	}

	public void setDanhgiacanbosForMaCanBoDuocDanhGia(Set<Danhgiacanbo> danhgiacanbosForMaCanBoDuocDanhGia) {
		this.danhgiacanbosForMaCanBoDuocDanhGia = danhgiacanbosForMaCanBoDuocDanhGia;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "canbo")
	public Set<Daotaochuyenmon> getDaotaochuyenmons() {
		return this.daotaochuyenmons;
	}

	public void setDaotaochuyenmons(Set<Daotaochuyenmon> daotaochuyenmons) {
		this.daotaochuyenmons = daotaochuyenmons;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "canbo")
	public Set<Lichsucongtac> getLichsucongtacs() {
		return this.lichsucongtacs;
	}

	public void setLichsucongtacs(Set<Lichsucongtac> lichsucongtacs) {
		this.lichsucongtacs = lichsucongtacs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "canbo")
	public Set<CanboBan> getCanboBans() {
		return this.canboBans;
	}

	public void setCanboBans(Set<CanboBan> canboBans) {
		this.canboBans = canboBans;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "canbo")
	public Set<CanboGiadinhDoitac> getCanboGiadinhDoitacs() {
		return this.canboGiadinhDoitacs;
	}

	public void setCanboGiadinhDoitacs(Set<CanboGiadinhDoitac> canboGiadinhDoitacs) {
		this.canboGiadinhDoitacs = canboGiadinhDoitacs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "canbo")
	public Set<Khenthuong> getKhenthuongs() {
		return this.khenthuongs;
	}

	public void setKhenthuongs(Set<Khenthuong> khenthuongs) {
		this.khenthuongs = khenthuongs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "canbo")
	public Set<Kyluat> getKyluats() {
		return this.kyluats;
	}

	public void setKyluats(Set<Kyluat> kyluats) {
		this.kyluats = kyluats;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "canbo")
	public Set<Dacdienlichsubanthan> getDacdienlichsubanthans() {
		return this.dacdienlichsubanthans;
	}

	public void setDacdienlichsubanthans(Set<Dacdienlichsubanthan> dacdienlichsubanthans) {
		this.dacdienlichsubanthans = dacdienlichsubanthans;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "canboByNguoixacnhan")
	public Set<Lylich> getLylichesForNguoixacnhan() {
		return this.lylichesForNguoixacnhan;
	}

	public void setLylichesForNguoixacnhan(Set<Lylich> lylichesForNguoixacnhan) {
		this.lylichesForNguoixacnhan = lylichesForNguoixacnhan;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "canboByMaCanBo")
	public Lylich getLylichByMaCanBo() {
		return this.lylichByMaCanBo;
	}

	public void setLylichByMaCanBo(Lylich lylichByMaCanBo) {
		this.lylichByMaCanBo = lylichByMaCanBo;
	}

}
