package jp.co.internous.angular.controller;

import java.util.List;

import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.internous.angular.model.domain.dto.PurchaseHistoryDto;
import jp.co.internous.angular.model.mapper.TblPurchaseHistoryMapper;
import jp.co.internous.angular.model.session.LoginSession;

@Controller
@RequestMapping("/angular/history")
public class PurchaseHistoryController {

	@Autowired
	TblPurchaseHistoryMapper tblPurchaseHistoryMapper;
	
	@Autowired
	protected LoginSession loginSession;
	
	@RequestMapping("/")
	public String index(Model m) {		
		int userId = loginSession.getUserId();
		List<PurchaseHistoryDto> historyList = tblPurchaseHistoryMapper.findByUserId(userId);

		if (historyList != null && historyList.size() > 0) {
			m.addAttribute("histories", historyList);
		}
		m.addAttribute("loginSession", loginSession); 
		
		return "purchase_history";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String update() {
		int userId = loginSession.getUserId();
		tblPurchaseHistoryMapper.updateStatusByUserId(userId);
		
		return "redirect:/angular/history/";
	}
}
