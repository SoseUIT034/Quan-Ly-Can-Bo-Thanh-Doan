package com.springmvc.qlcb.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.helpers.DateTimeDateFormat;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.qlcb.dao.BanDAO;
import com.springmvc.qlcb.dao.CanBoDAO;
import com.springmvc.qlcb.dao.CanBoGiaDinhBanThanDAO;
import com.springmvc.qlcb.dao.CanBoGiaDinhDoiTacDAO;
import com.springmvc.qlcb.dao.CanboBanDAO;
import com.springmvc.qlcb.dao.CanboDonviDAO;
import com.springmvc.qlcb.dao.ChucvuBanDAO;
import com.springmvc.qlcb.dao.ChucvuDonviDAO;
import com.springmvc.qlcb.dao.DacDiemLichSuBanThanDAO;
import com.springmvc.qlcb.dao.DanTocDAO;
import com.springmvc.qlcb.dao.DaoTaoChuyenMonDAO;
import com.springmvc.qlcb.dao.DienBienLuongDAO;
import com.springmvc.qlcb.dao.DonViDAO;
import com.springmvc.qlcb.dao.HibernateUtils;
import com.springmvc.qlcb.dao.KhoiDAO;
import com.springmvc.qlcb.dao.LichSuCongTacDAO;
import com.springmvc.qlcb.dao.LyLichDAO;
import com.springmvc.qlcb.dao.NgoaiNguDAO;
import com.springmvc.qlcb.dao.TonGiaoDAO;
import com.springmvc.qlcb.dao.TrinhDoChinhTriDAO;
import com.springmvc.qlcb.dao.TrinhDoChuyenMonDAO;
import com.springmvc.qlcb.dao.UserDAO;
import com.springmvc.qlcb.model.Canbo;
import com.springmvc.qlcb.model.CanboGiadinhBanthan;
import com.springmvc.qlcb.model.CanboGiadinhDoitac;
import com.springmvc.qlcb.model.Dantoc;
import com.springmvc.qlcb.model.Daotaochuyenmon;
import com.springmvc.qlcb.model.Dienbienluong;
import com.springmvc.qlcb.model.Donvi;
import com.springmvc.qlcb.model.Khoi;
import com.springmvc.qlcb.model.Lichsucongtac;
import com.springmvc.qlcb.model.Lylich;
import com.springmvc.qlcb.model.Taikhoan;

@Service
public class DonViServiceImp extends HibernateUtils implements DonViService {

	 
	@Autowired
	private DonViDAO donviDao;
	@Autowired
	private KhoiDAO khoiDAO;

	@Override
	@Transactional
	public Object save(Donvi donvi) {
		int thisid=0; 
		// generate id
		if(donviDao.listDonVi() !=null)
		{
			thisid =donviDao.listDonVi().size();
		} 
		while( donviDao.getDonViById(thisid)!=null  )
		{
			thisid++;
		} 
		
		int t=donvi.getMaKhoi();
		Khoi k = khoiDAO.getKhoiById(t); 
		donvi.setKhoi(k);
		donvi.setMaDonVi(thisid);  
		Date d = new  Date(2001, 1, 1);
		donvi.setNgayThanhLap(d);
		return donviDao.save(donvi);
	}

	@Override
	@Transactional
	public Donvi getDonViById(int id) {
		return donviDao.getDonViById(id);
	}

	@Override
	@Transactional
	public void update(Donvi donvi) {
		
		donvi.setKhoi(khoiDAO.getKhoiById(donvi.getMaKhoi())); 
		Date d = new  Date(2001, 1, 1);
		donvi.setNgayThanhLap(d);
		donviDao.update(donvi); 
	}

	@Override
	@Transactional
	public void delete(int id) { 
		
	}

	@Override
	@Transactional
	public List<Donvi> listDonVi() {
		return donviDao.listDonVi();
	}
	 
	 

}
