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
import com.springmvc.qlcb.model.Dacdienlichsubanthan;
import com.springmvc.qlcb.model.Daotaochuyenmon;
import com.springmvc.qlcb.model.Dienbienluong;
import com.springmvc.qlcb.model.Lichsucongtac;
import com.springmvc.qlcb.model.Lylich;
import com.springmvc.qlcb.model.Taikhoan;

@Service
public class LyLichServiceImpl extends HibernateUtils implements LyLichService {

	private static final Logger logger = LoggerFactory.getLogger(LyLichServiceImpl.class);
	
	@Autowired
	private LyLichDAO lyLichDAO;
	
	@Autowired
	private DaoTaoChuyenMonDAO daoTaoChuyenMonDAO; 
	
	@Autowired
	private DienBienLuongDAO dienBienLuongDAO;
	
	@Autowired
	private CanBoDAO canBoDAO;
	
	@Autowired
	private LichSuCongTacDAO lichSuCongTacDAO;
	
	@Autowired
	private CanBoGiaDinhBanThanDAO canBoGiaDinhBanThanDAO;
	
	@Autowired
	private CanBoGiaDinhDoiTacDAO canBoGiaDinhDoiTacDAO;
	
	@Autowired
	private TonGiaoDAO tonGiaoDAO;
	
	@Autowired
	private UserDAO taikhoanDAO;
	
	@Autowired
	private DanTocDAO danTocDAO;
	
	@Autowired
	private NgoaiNguDAO ngoaiNguDAO;
	
	@Autowired
	private DacDiemLichSuBanThanDAO dacDiemLichSuBanThanDAO;
	
	@Autowired
	private CanboDonviDAO canboDonviDAO;
	
	@Autowired
	private DonViDAO donViDAO;
	
	@Autowired
	private ChucvuDonviDAO chucvuDonviDAO;
	
	@Autowired
	private CanboBanDAO anboBanDAO;
	
	@Autowired
	private BanDAO banDAO;
	
	@Autowired
	private ChucvuBanDAO chucvuBanDAO;
	
	//------------
	private int genereteIDCanBoGiaDinhDoiTac(ArrayList<Integer> lint)
	{
		int thisid=0; 
		// generate id
		if(canBoGiaDinhDoiTacDAO.listcanboGiadinhDoitac() !=null)
		{
			thisid = canBoGiaDinhDoiTacDAO.listcanboGiadinhDoitac().size();
		} 
		while( canBoGiaDinhDoiTacDAO.getCanboGiadinhDoitacId(thisid)!=null  )
		{
			thisid++;
		}
		if(lint!= null)
		{
			while(lint.contains(new Integer(thisid)))
			{
				thisid++;
				while( canBoGiaDinhDoiTacDAO.getCanboGiadinhDoitacId(thisid)!=null  )
				{
					thisid++;
				}
			}
		}
		return thisid;
	}
	
	private ArrayList<Integer> _getListIDForCanBoGiaDinhDoiTac(Lylich lylich)
	{
		ArrayList<Integer> res = new ArrayList<Integer>();
		int count = lylich.getLqhdt().size();
		int index=0;
		while(index <count)
		{
			res.add( genereteIDCanBoGiaDinhDoiTac(res));
			index++;
		} 
		return res;
	}
	
	private int _saveCanBoGiaDinhDoiTac(Lylich lylich)
	{
		ArrayList<CanboGiadinhDoitac> arr = lylich.getLqhdt();
		ArrayList<Integer> a = _getListIDForCanBoGiaDinhDoiTac(lylich);
		if(arr!=null)
		{
			for(int i=0; i< arr.size(); i++)
			{ 
				arr.get(i).setCanbo(lylich.getCanboByMaCanBo()); 
				arr.get(i).setId(a.get(i));
				canBoGiaDinhDoiTacDAO.save(arr.get(i));
			}
		}
		return 0;
	}
	//------------
	
	//------------
	private int genereteIDCanBoGiaDinhBanThan(ArrayList<Integer> lint)
	{
		int thisid=0; 
		// generate id
		if(canBoGiaDinhBanThanDAO.listCanboGiadinhBanthan() !=null)
		{
			thisid = canBoGiaDinhBanThanDAO.listCanboGiadinhBanthan().size();
		} 
		while( canBoGiaDinhBanThanDAO.getCanboGiadinhBanthanById(thisid)!=null  )
		{
			thisid++;
		}
		if(lint!= null)
		{
			while(lint.contains(new Integer(thisid)))
			{
				thisid++;
				while( canBoGiaDinhBanThanDAO.getCanboGiadinhBanthanById(thisid)!=null  )
				{
					thisid++;
				}
			}
		}
		return thisid;
	}
	
	private ArrayList<Integer> _getListIDForCanBoGiaDinhBanThan(Lylich lylich)
	{
		ArrayList<Integer> res = new ArrayList<Integer>();
		int count = lylich.getLqhbt().size();
		int index=0;
		while(index <count)
		{
			res.add( genereteIDCanBoGiaDinhBanThan(res));
			index++;
		} 
		return res;
	}
	
	private int _saveCanBoGiaDinhBanThan(Lylich lylich)
	{
		ArrayList<CanboGiadinhBanthan> arr = lylich.getLqhbt();
		ArrayList<Integer> a = _getListIDForCanBoGiaDinhBanThan(lylich);
		if(arr!=null)
		{
			for(int i=0; i< arr.size(); i++)
			{ 
				arr.get(i).setCanbo(lylich.getCanboByMaCanBo()); 
				arr.get(i).setId(a.get(i));
				canBoGiaDinhBanThanDAO.save(arr.get(i));
			}
		}
		return 0;
	}
	//------------
	
	//------------
	private int genereteIDDienbienluong(ArrayList<Integer> lint)
	{
		int thisid=0; 
		// generate id
		if(dienBienLuongDAO.listDienBienLuong() !=null)
		{
			thisid = dienBienLuongDAO.listDienBienLuong().size();
		} 
		while( dienBienLuongDAO.getDienbienluongById(thisid)!=null  )
		{
			thisid++;
		}
		if(lint!= null)
		{
			while(lint.contains(new Integer(thisid)))
			{
				thisid++;
				while( dienBienLuongDAO.getDienbienluongById(thisid)!=null  )
				{
					thisid++;
				}
			}
		}
		return thisid;
	}
	
	private ArrayList<Integer> _getListIDForDienbienluong(Lylich lylich)
	{
		ArrayList<Integer> res = new ArrayList<Integer>();
		int count = lylich.getLdbl().size();
		int index=0;
		while(index <count)
		{
			res.add( genereteIDDienbienluong(res));
			index++;
		} 
		return res;
	}
	
	private int _saveDienbienluong(Lylich lylich)
	{
		ArrayList<Dienbienluong> arr = lylich.getLdbl();
		ArrayList<Integer> a = _getListIDForDienbienluong(lylich);
		if(arr!=null)
		{
			for(int i=0; i< arr.size(); i++)
			{ 
				arr.get(i).setLylich(lylich); 
				arr.get(i).setId(a.get(i));
				dienBienLuongDAO.save(arr.get(i));
			}
		}
		return 0;
	}
	//------------
	
	//------------
	private int genereteIDDaoTaoChuyenMon(ArrayList<Integer> lint)
	{
		int thisid=0; 
		// generate id
		if(daoTaoChuyenMonDAO.listDaoTaoChuyenMon() !=null)
		{
			thisid = daoTaoChuyenMonDAO.listDaoTaoChuyenMon().size();
		} 
		while( daoTaoChuyenMonDAO.getDaoTaoChuyenMonById(thisid)!=null  )
		{
			thisid++;
		}
		if(lint!= null)
		{
			while(lint.contains(new Integer(thisid)))
			{
				thisid++;
				while( daoTaoChuyenMonDAO.getDaoTaoChuyenMonById(thisid)!=null  )
				{
					thisid++;
				}
			}
		}
		return thisid;
	}
	
	private ArrayList<Integer> _getListIDForDaoTaoChuyenMon(Lylich lylich)
	{
		ArrayList<Integer> res = new ArrayList<Integer>();
		int count = lylich.getLdtcm().size();
		int index=0;
		while(index <count)
		{
			res.add( genereteIDDaoTaoChuyenMon(res));
			index++;
		} 
		return res;
	}
	
	private int _saveDaoTaoChuyenMon(Lylich lylich)
	{
		ArrayList<Daotaochuyenmon> arr = lylich.getLdtcm();
		ArrayList<Integer> a = _getListIDForDaoTaoChuyenMon(lylich);
		if(arr!=null)
		{
			for(int i=0; i< arr.size(); i++)
			{ 
				arr.get(i).setCanbo(lylich.getCanboByMaCanBo());
				arr.get(i).setMaDaoTao(a.get(i));
				daoTaoChuyenMonDAO.save(arr.get(i));
			}
		}
		return 0;
	}
	//------------
	
	//-------------
	private int genereteIDLichSuCongTac(ArrayList<Integer> lint)
	{
		int thisid=0; 
		// generate id
		if(lichSuCongTacDAO.listLichSuCongTac()!=null)
		{
			thisid = lichSuCongTacDAO.listLichSuCongTac().size();
		} 
		while( lichSuCongTacDAO.getLichSuCongTacById(thisid)!=null  )
		{
			thisid++;
		}
		if(lint!= null)
		{
			while(lint.contains(new Integer(thisid)))
			{
				
				thisid++;
				while( lichSuCongTacDAO.getLichSuCongTacById(thisid)!=null  )
				{
					thisid++;
				}
			}
		}
 
		return thisid;
	}
	
	private ArrayList<Integer> _getListIDForLichSuCongTac(Lylich lylich)
	{
		ArrayList<Integer> res = new ArrayList<Integer>();
		int count = lylich.getLsct().size();
		int index=0;
		while(index <count)
		{
			res.add( genereteIDLichSuCongTac(res));
			index++;
		} 
		return res;
	}
	
	private int _saveLichSuCongTac(Lylich lylich)
	{
		ArrayList<Lichsucongtac> arr = lylich.getLsct();
		ArrayList<Integer> a = _getListIDForLichSuCongTac(lylich);
		if(arr!=null)
		{
			for(int i=0; i< arr.size(); i++)
			{ 
				arr.get(i).setCanbo(lylich.getCanboByMaCanBo());
				arr.get(i).setMaLsct(a.get(i));
				lichSuCongTacDAO.save(arr.get(i));
			}
		}
		return 0;
	}
	//--------------
	
	//-------------
	private int genereteIDLichSuBanThan()
		{
			int thisid=0; 
			// generate id
			if(dacDiemLichSuBanThanDAO.listDacDiemLichSuBanThan()!=null)
			{
				thisid = dacDiemLichSuBanThanDAO.listDacDiemLichSuBanThan().size();
			} 
			while( dacDiemLichSuBanThanDAO.getDacDiemLichSuBanThanById(thisid)!=null  )
			{
				thisid++;
			}
	 
			return thisid;
		}
 
	
	private int _saveLichSuBanThan(Lylich lylich)
	{
		int id = genereteIDLichSuBanThan();
		 
		Dacdienlichsubanthan d = new Dacdienlichsubanthan();
		d.setCanbo(lylich.getCanboByMaCanBo() );
		d.setMaDdls(id);
		d.setNoidung1(lylich.getLsbt().getNoidung1());
		d.setNoidung2(lylich.getLsbt().getNoidung2());
		d.setNoiDung3(lylich.getLsbt().getNoiDung3());
		dacDiemLichSuBanThanDAO.save(d);
			 
		return 0;
	}
	//--------------
	
	//-------------
		private int genereteIDlylich()
			{
				int thisid=0; 
				// generate id
				if(lyLichDAO.listLyLich()!=null)
				{
					thisid = lyLichDAO.listLyLich().size();
				} 
				while( lyLichDAO.getLyLichById(thisid)!=null  )
				{
					thisid++;
				}
		 
				return thisid;
			}
	//-----------------
	
	private int _saveDate(Lylich lylich)
	{
		try {
			lylich.setNgaySinh( new SimpleDateFormat("d-MMM-yyyy,HH:mm:ss aaa").parse(lylich.getLngaySinh()) );
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			lylich.setNgayTuyenDung( new SimpleDateFormat("d-MMM-yyyy,HH:mm:ss aaa").parse(lylich.getLngayTuyenDung()) );
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			lylich.setNgayHuong( new SimpleDateFormat("d-MMM-yyyy,HH:mm:ss aaa").parse(lylich.getLngayHuong()) );
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			lylich.setNgayVaoDang( new SimpleDateFormat("d-MMM-yyyy,HH:mm:ss aaa").parse(lylich.getLngayVaoDang()) );
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			lylich.setNgayChinhThuc( new SimpleDateFormat("d-MMM-yyyy,HH:mm:ss aaa").parse(lylich.getLngayChinhThuc()) );
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			lylich.setNgayNhapNgu ( new SimpleDateFormat("d-MMM-yyyy,HH:mm:ss aaa").parse(lylich.getLngayNhapNgu()) );
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			lylich.setNgayXuatNgu( new SimpleDateFormat("d-MMM-yyyy,HH:mm:ss aaa").parse(lylich.getLngayXuatNgu()) );
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			lylich.setNgayCap( new SimpleDateFormat("d-MMM-yyyy,HH:mm:ss aaa").parse(lylich.getLngayCap()) );
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return 0;
	}
	
	private int _saveLyLich(Lylich lylich)
	{
		int thisid=0; 
		// generate id
		if(lyLichDAO.listLyLich()!=null)
		{
			thisid = lyLichDAO.listLyLich().size();
		} 
		while( lyLichDAO.getLyLichById(thisid)!=null  )
		{
			thisid++;
		}
		lylich.setMacanbo(thisid);
		Canbo cb = new Canbo();
		cb.setMaCanBo(thisid);
		cb.setTrangThai(true);
		lylich.setCanboByMaCanBo(cb);
		
		// part and  save date
		//_saveDate(  lylich);
		
		// save can bo 
		canBoDAO.save(cb);
		
		// save lylich
		lyLichDAO.save(lylich);
		
		
		
		// save tai khoan
		Taikhoan t = new Taikhoan();
		t.setMaCanBo (thisid); 
		t.setTenDangNhap( (new Integer(thisid)).toString() );
		t.setMatKhau("88888888"); 
		t.setCanbo(cb);
		taikhoanDAO.saveUser(t);
		
		// save lsbt
		_saveLichSuBanThan(  lylich);
		
		 // save lsct
		if(lylich.getLsct()!=null)
			if(lylich.getLsct().size()>0)
					_saveLichSuCongTac(lylich);
		
		// save dao tao chuyen mon
		if(lylich.getLdtcm()!=null)
			if(lylich.getLdtcm().size()>0)
					_saveDaoTaoChuyenMon(lylich);
		
		// save dien bien luong(xu ly them )
		if(lylich.getLdbl()!=null)
			if(lylich.getLdbl().size()>0)
					_saveDienbienluong(lylich);
		
		// save quan he gia dinh ban than 
		if(lylich.getLqhbt()!=null)
			if(lylich.getLqhbt().size()>0)
					_saveCanBoGiaDinhBanThan(lylich);
		
		// save quan he gia dinh doi tac
		if(lylich.getLqhdt()!=null)
			if(lylich.getLqhdt().size()>0)
					_saveCanBoGiaDinhDoiTac(lylich);
		
		
		return 0;
	}
	
	
	
	@Transactional
	@Override 
	public boolean save(Lylich lylich) {
		boolean result = false;
		
		 
		
		Transaction tx = null;
		try{
			tx = getSession().beginTransaction();
			
			
			 
			_saveLyLich( lylich);
			
			result = true;
		}catch(Exception ex){
			if(tx != null){
				tx.rollback();
			}
			logger.error("Error", ex);
		}
		return result;
	}

	@Override
	@Transactional
	public Lylich getLyLichById(int id) {
		
		Lylich  lylich = new Lylich(); 
		lylich =lyLichDAO.getLyLichById(id);
		ArrayList<Daotaochuyenmon> listDaoTaoChuyenMons =  new ArrayList<Daotaochuyenmon>( lylich.getCanboByMaCanBo().getDaotaochuyenmons());
		ArrayList<Lichsucongtac> listLichsucongtacs =  new ArrayList<Lichsucongtac>( lylich.getCanboByMaCanBo().getLichsucongtacs());
		ArrayList<CanboGiadinhBanthan> listcanboGiadinhBanthans =  new ArrayList<CanboGiadinhBanthan>( lylich.getCanboByMaCanBo().getCanboGiadinhBanthans());
		ArrayList<CanboGiadinhDoitac> listcanboGiadinhDoitacs =  new ArrayList<CanboGiadinhDoitac>( lylich.getCanboByMaCanBo().getCanboGiadinhDoitacs());
		ArrayList<Dienbienluong> listdienbienluongs =  new ArrayList<Dienbienluong>( lylich.getDienbienluongs());
		Dacdienlichsubanthan dacdienlichsubanthans;
		if(new ArrayList<Dacdienlichsubanthan>(lylich.getCanboByMaCanBo().getDacdienlichsubanthans())!=null){
		  dacdienlichsubanthans =    new ArrayList<Dacdienlichsubanthan>(lylich.getCanboByMaCanBo().getDacdienlichsubanthans()).get(0);}
		dacdienlichsubanthans = new Dacdienlichsubanthan();
		lylich.setLdtcm(listDaoTaoChuyenMons); 
		lylich.setLsct(listLichsucongtacs); 
		lylich.setLqhbt(listcanboGiadinhBanthans); 
		lylich.setLqhdt(listcanboGiadinhDoitacs); 
		lylich.setLdbl(listdienbienluongs); 
		lylich.setLsbt(dacdienlichsubanthans); 
		
		return lylich;
	}

	@Override
	@Transactional
	public void update(Lylich lylich) {
		
	}

	@Override
	@Transactional
	public void delete(int id) {
		
	}

	@Override
	@Transactional
	public List<Lylich> listLyLich() {
		return null;
	}

}