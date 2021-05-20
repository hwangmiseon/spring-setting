package com.study.data.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.data.service.IDataBoardDao;
import com.study.data.vo.DataBoardVO;

// 빈 등록 애노테이션 스프링 : @Component ( @Service, @Repository, @Controller )
// JSR 표준 : @Bean 

@Controller
public class DataController {
	
	/* (IDataBoardDao 로 관련된것 boardDao로 세팅) */
	@Inject 
	private IDataBoardDao boardDao;
	
	@RequestMapping("/data/list.wow")
	public void list(HttpServletRequest req, Model model) {
		System.out.println("ip: " + req.getRemoteAddr());
		List<DataBoardVO> mks = boardDao.getBoardList(null);
		model.addAttribute("results", mks);
		
	}

	// @애노테이션의 기본값 설정 value인데, 의미가 불명확 path에 별칭으로 매핑(경로)
	@RequestMapping(path = "/data/view.wow", params = "boNo") // boNo라는 parameter가 있을때만 매핑
	public void view(int boNo, HttpServletResponse resp) throws IOException {
		// 한글 인코딩!
		resp.setContentType("text/html; charset=UTF-8");
		resp.setCharacterEncoding("utf-8");
		
		PrintWriter out = resp.getWriter();
		
		out.print("<h2>BitCoin 폭락</h2>");
		System.out.println("boNo=" + boNo);
	}
}
