package com.ssin.control;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssin.qna.QnaDTO;

@Controller
@RequestMapping(value = "/qna/*") //공통적인 루트주소
public class QnaController {

	@RequestMapping(value="qnaWrite", method= RequestMethod.POST)
	public String write(QnaDTO qnaDTO, String title){
		
			for(String s : qnaDTO.getName()){
				System.out.println(s);
			}
			System.out.println("DTO : "+qnaDTO.getTitle());
			System.out.println("title : "+title);
			System.out.println(qnaDTO.getWriter());
			System.out.println(qnaDTO.getAge());
		return "redirect:./qnaList?curPage=5";
	}
	
	
//	@RequestMapping(value = "qnaWrite", method = RequestMethod.POST)
//	public String write(@RequestParam(value = "title")String subject, String writer, @RequestParam(required = false)int age, String [] name) {
//		QnaDTO qnaDTO = new QnaDTO();
//		qnaDTO.setTitle(subject);
//		qnaDTO.setWriter(writer);
//		qnaDTO.setAge(age);
//		qnaDTO.setName(name);
//	
//		for(String s : qnaDTO.getName()) {
//			System.out.println(s);
//		}
//		System.out.println(qnaDTO.getTitle());
//		System.out.println(qnaDTO.getWriter());
//		System.out.println(qnaDTO.getAge());
//
//		return "qna/qnaList";
//	}

	@RequestMapping(value = "/qnaWrite", method = RequestMethod.GET)
	public void write() { }

//	@RequestMapping(value = "/qna/qnaWrite")
//	public String write() {
//		
//		return "qna/qnaWrite";
//	}

	@RequestMapping(value = "qnaView")
	public String view(Model model) {
		QnaDTO qnaDTO = new QnaDTO();
		qnaDTO.setTitle("qna");
		qnaDTO.setWriter("ssin");
		qnaDTO.setAge(23);
		model.addAttribute("view", qnaDTO)
	     .addAttribute("board", "Qna");
		return "qna/qnaView";
	}
	
//	@RequestMapping(value = "qnaView")
//	public String view(HttpServletRequest request) {
//		QnaDTO qnaDTO = new QnaDTO();
//		qnaDTO.setTitle("qna");
//		qnaDTO.setWriter("ssin");
//		qnaDTO.setAge(20);
//		request.setAttribute("view", qnaDTO);
//		return "qna/qnaView";
//	}

	@RequestMapping(value = "qnaList", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView list(ModelAndView mv, @RequestParam(defaultValue = "0", required = false)int curPage) {
		QnaDTO qnaDTO = new QnaDTO();
		qnaDTO.setTitle("qna");
		qnaDTO.setWriter("min");
		qnaDTO.setAge(21);
		mv.addObject("view", qnaDTO);
		mv.setViewName("qna/qnaList");
		System.out.println(curPage);
		return mv;
	}
	
}
